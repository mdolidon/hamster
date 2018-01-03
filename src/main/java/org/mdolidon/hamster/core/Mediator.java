package org.mdolidon.hamster.core;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;

import org.apache.http.client.protocol.HttpClientContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.mdolidon.hamster.matchers.All;

/**
 * This is IMediator's regular implementation.
 *
 */
public class Mediator implements IMediator {

	private static Logger logger = LogManager.getLogger();

	private final static int MAX_WORKERS = 50;
	private final static int LINKS_QUEUE_INITIAL_CAP = 10000;
	private final static int LINKS_QUEUE_MAX_CAP = 200000;
	private final static int LARGE_OBJECTS_QUEUES_CAP = 15;
	private final static int URLS_SEEN_INITIAL_CAP = 20000;

	private IConfiguration configuration;

	private Semaphore pauseSemaphore = new Semaphore(MAX_WORKERS, true); // true is fair ;-)

	//
	//
	// Keep track of the work that's been dispatched to workers.
	// This lets us see what's not visible in the queues, yet
	// not saved on the disk yet.
	//
	//

	private Set<Link> activeDownloads = ConcurrentHashMap.newKeySet(20);
	private Set<Content> activeProcessings = ConcurrentHashMap.newKeySet(20);
	private Set<Content> activeStoring = ConcurrentHashMap.newKeySet(20);

	//
	//
	// The queues between the workers.
	//
	//

	private PausableBlockingQueue<Link> linksToDownload = new PausableBlockingQueue<>(pauseSemaphore,
			LINKS_QUEUE_INITIAL_CAP, LINKS_QUEUE_MAX_CAP);

	// Other buffers that can absorb temporary speed variations between the workers.
	// but should slow down overly fast producers if necessary.
	private PausableBlockingQueue<Content> contentsToBeProcessed = new PausableBlockingQueue<>(pauseSemaphore,
			LARGE_OBJECTS_QUEUES_CAP, LARGE_OBJECTS_QUEUES_CAP);
	private PausableBlockingQueue<Content> contentsToBeStored = new PausableBlockingQueue<>(pauseSemaphore,
			LARGE_OBJECTS_QUEUES_CAP, LARGE_OBJECTS_QUEUES_CAP);

	//
	//
	// Other state trackers
	//
	//

	private Set<String> urlsAlreadySeen = ConcurrentHashMap.newKeySet(URLS_SEEN_INITIAL_CAP);
	private List<Thread> workerThreads = new ArrayList<>(MAX_WORKERS);
	private MatcherDrivenList<AuthContextHolder> authContextHolders = new MatcherDrivenList<>();
	private List<Link> retriableLinks = new ArrayList<>();
	private AtomicInteger filesSaved = new AtomicInteger(0);
	private boolean terminatingFlag = false;

	public Mediator(IConfiguration configuration) {
		this.configuration = configuration;
		authContextHolders.setDefault(new AuthContextHolder(new All(), configuration));
		for (IMatcher authMatcher : configuration.listAuthContextMatchers()) {
			authContextHolders.add(new AuthContextHolder(authMatcher, configuration));
		}
	}

	public void registerWorker(Thread worker) {
		if (workerThreads.size() == MAX_WORKERS) {
			throw new RuntimeException("Exceeded the maximum number of worker threads on the mediator.");
		}
		workerThreads.add(worker);
	}

	//
	// ---------- Dealing with persisting and restoring state
	//

	/**
	 * Pauses all queues, allowing to make a consistent snapshot of the whole state.
	 * Made public for testing, but better call getMemento directly.
	 * 
	 * @throws InterruptedException
	 */
	public void pause() throws InterruptedException {
		pauseSemaphore.acquire(MAX_WORKERS);
	}

	/**
	 * Allows queues to continue their activity.
	 */
	public void unpause() {
		pauseSemaphore.release(MAX_WORKERS);
	}

	public Serializable getMemento() throws InterruptedException {
		pause();

		MediatorMemento memento = new MediatorMemento();

		// copy*InNewList : aggregates set and queue contents in a list
		memento.contentToProcess = copyContentsInNewList(activeProcessings, contentsToBeProcessed);
		memento.contentToStore = copyContentsInNewList(activeStoring, contentsToBeStored);
		memento.linksToDownload = copyLinksInNewList(activeDownloads, linksToDownload);

		memento.retriableLinks = new ArrayList<Link>(retriableLinks);
		memento.urlsAlreadySeen = new ArrayList<String>(urlsAlreadySeen);
		memento.filesSaved = filesSaved.get();

		unpause();
		return memento;
	}

	public void resetFromMemento(Serializable input) throws InterruptedException {
		if (getNumberOfTrackedActivities() > 0 || getNumberOfFilesSaved() > 0) {
			throw new RuntimeException(
					"BUG : resetFromMemento is not meant to be called on a mediator that has already started to work.");
		}
		MediatorMemento memento = (MediatorMemento) input;

		// setAllConfigurationsOn* is a gimmick that's made necessary by
		// the fact that links don't serialize their attached configuration along.
		// They expected us to reinject it after deserializing.

		setAllConfigurationsOnContents(memento.contentToProcess);
		contentsToBeProcessed.addAll(memento.contentToProcess);

		setAllConfigurationsOnContents(memento.contentToStore);
		contentsToBeStored.addAll(memento.contentToStore);

		setAllConfigurationsOnLinks(memento.linksToDownload);
		linksToDownload.addAll(memento.linksToDownload);

		setAllConfigurationsOnLinks(memento.retriableLinks);
		retriableLinks.addAll(memento.retriableLinks);

		urlsAlreadySeen.addAll(memento.urlsAlreadySeen);
		filesSaved.set(memento.filesSaved);
	}

	@Override
	public void recycleRetriableLinks() {
		logger.trace("Recycling the retriable links");
		try {
			linksToDownload.addAll(retriableLinks);
			retriableLinks.clear();
		} catch (InterruptedException e) {
			logger.error("Interrupted while recycling retriable links.");
		}
	}

	@Override
	public List<Link> getRetriableLinks() {
		return retriableLinks;
	}

	// The following method duplications look pretty absurd to me, but
	// it was eventually less of a pain to go with this Go-lang style repetition
	// than trying to get around the mess of using of .clone on a generic type
	// parameter.

	private void setAllConfigurationsOnLinks(Iterable<Link> list) {
		for (Link l : list) {
			l.setConfiguration_afterDeserialization(configuration);
		}
	}

	private void setAllConfigurationsOnContents(Iterable<Content> list) {
		for (Content c : list) {
			c.setConfiguration_afterDeserialization(configuration);
		}
	}

	private List<Content> copyContentsInNewList(Set<Content> active, PausableBlockingQueue<Content> queue) {
		List<Content> list = new ArrayList<>(active.size() + queue.size());
		try {
			for (Content element : active) {
				list.add((Content) element.clone());
			}
			for (Content element : queue) {
				list.add((Content) element.clone());
			}
		} catch (Exception e) {
			logger.error("Exception thrown while attempting to create mediator memento : {}", e);
		}
		return list;
	}

	private List<Link> copyLinksInNewList(Set<Link> active, PausableBlockingQueue<Link> queue) {
		List<Link> list = new ArrayList<>(active.size() + queue.size());
		try {
			for (Link element : active) {
				list.add((Link) element.clone());
			}
			for (Link element : queue) {
				list.add((Link) element.clone());
			}
		} catch (Exception e) {
			logger.error("Exception thrown while attempting to create mediator memento : {}", e);
		}
		return list;
	}

	//
	// --------- Interaction with the download workers
	//

	@Override
	public Link provideLinkToDownload() throws InterruptedException {
		if (terminatingFlag) {
			throw new InterruptedException();
		}
		Link link = linksToDownload.take();
		activeDownloads.add(link);
		return link;
	}

	@Override
	public HttpClientContext getAuthContext(Link link) {
		AuthContextHolder contextHolder = authContextHolders.getFirstMatch(link);
		return contextHolder.getThreadContext(link);
	}

	@Override
	public void setAuthContext(Link link, HttpClientContext context) {
		AuthContextHolder contextHolder = authContextHolders.getFirstMatch(link);
		contextHolder.setThreadContext(context);
	}

	@Override
	public void acceptDownloadedContent(Content content) throws InterruptedException {
		if (content.isHtml()) {
			contentsToBeProcessed.put(content);
		} else {
			if (content.getSourceLink().isPartOfTargetSet()) {
				contentsToBeStored.put(content);
			}
		}
		activeDownloads.remove(content.getSourceLink());
	}

	@Override
	public void acceptDownloadError(Link link, boolean retriable, String message) throws InterruptedException {
		activeDownloads.remove(link);
		if (retriable) {
			retriableLinks.add(link);
			logger.warn("Downloading error, stashed for retrying : {} (for {})", message, link);
		} else {
			logger.warn("Downloading error, dropping link : {} (for {})", message, link);
		}
	}

	//
	// -------- Interaction with processing workers
	// Processing means : analyzing HTML, extracting links, transforming for
	// storage.
	//

	@Override
	public Content provideContentToProcess() throws InterruptedException {
		if (terminatingFlag) {
			throw new InterruptedException();
		}
		Content content = contentsToBeProcessed.take();
		activeProcessings.add(content);
		return content;
	}

	@Override
	public void acceptProcessedContent(Content content) throws InterruptedException {
		if (content.getSourceLink().isPartOfTargetSet()) {
			contentsToBeStored.put(content);
		}
		activeProcessings.remove(content);
	}

	@Override
	public void acceptProcessingError(Content content, String message) throws InterruptedException {
		logger.error("Processing error. The content will be stored anyway but its links may be broken. {} (for {})", message, content.getSourceLink());
		acceptProcessedContent(content);
	}

	@Override
	public void acceptNewLink(Link link) throws InterruptedException {
		List<Link> oneLink = new ArrayList<>(1);
		oneLink.add(link);
		acceptAllNewLinks(oneLink);
	}

	@Override
	public void acceptAllNewLinks(Collection<Link> incomingLinks) throws InterruptedException {
		for (Link link : incomingLinks) {
			link.unbindSourceElement();
		}
		List<Link> acceptableLinks = new ArrayList<>(incomingLinks.size());
		synchronized (urlsAlreadySeen) {
			for (Link link : incomingLinks) {
				String memoizableTarget = link.getTargetAsStringWithoutHash();
				if (urlsAlreadySeen.contains(memoizableTarget)) {
					logger.debug("Rejecting URL as already seen : {}", link.getTargetAsString());
				} else {
					urlsAlreadySeen.add(memoizableTarget);
					acceptableLinks.add(link);
				}
			}
		}
		logger.debug("Forwarding {} URLs to downloads queue", acceptableLinks.size());
		linksToDownload.addAll(acceptableLinks); // If we get blocked here, it means we're utterly saturated !
		// There's probably no clean way out.
	}

	//
	// Interaction with storage worker
	//

	@Override
	public Content provideContentToStore() throws InterruptedException {
		if (terminatingFlag) {
			throw new InterruptedException();
		}
		Content content = contentsToBeStored.take();
		activeStoring.add(content);
		return content;
	}

	@Override
	public void doneStoringOneContent(Content content) throws InterruptedException {
		filesSaved.incrementAndGet();
		activeStoring.remove(content);
	}

	@Override
	public void acceptStorageError(Content content, String message) throws InterruptedException {
		logger.error("Storage error : {} (for {})", message, content.getSourceLink());
		activeStoring.remove(content);
	}

	//
	// Interaction with supervisor
	//

	@Override
	public int getNumberOfTrackedActivities() {
		// We do not synchronize here.
		// It's OK if we're off by one or two : we do not use the result to take
		// immediate decisions, only to show the user if there's much left to do or not.
		// However, repeatedly getting 0 should mean that we're done.
		return linksToDownload.size() + contentsToBeProcessed.size() + contentsToBeStored.size()
				+ activeDownloads.size() + activeProcessings.size() + activeStoring.size();
	}

	@Override
	public int getNumberOfFilesSaved() {
		return filesSaved.get();
	}

	@Override
	public boolean isCriticallyLoaded() {
		return (linksToDownload.remainingCapacity() < 0.05 * LINKS_QUEUE_MAX_CAP);
	}
}
