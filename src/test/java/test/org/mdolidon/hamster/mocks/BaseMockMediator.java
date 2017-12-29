package test.org.mdolidon.hamster.mocks;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.List;

import org.apache.http.client.protocol.HttpClientContext;
import org.mdolidon.hamster.core.Content;
import org.mdolidon.hamster.core.IMediator;
import org.mdolidon.hamster.core.Link;

public class BaseMockMediator implements IMediator {

	public Deque<Link> linksToProvideForDownloading = new ArrayDeque<>();
	public Deque<Content> contentsToProvideForProcessing = new ArrayDeque<>();

	public List<Content> downloadedContent = new ArrayList<>();
	public List<Content> processedContent = new ArrayList<>();
	public List<Link> acceptedLinks = new ArrayList<>();

	@Override
	public void registerWorker(Thread worker) {
		// TODO Auto-generated method stub

	}

	@Override
	public synchronized Link provideLinkToDownload() throws InterruptedException {
		if (linksToProvideForDownloading.isEmpty()) {
			for (;;) {
					this.wait();
			} // this is only a mock !!! we expect the list to be filled before consumption ;
				// Once empty, we never give anything back again.
		}
		return linksToProvideForDownloading.removeFirst();
	}

	@Override
	public HttpClientContext getAuthContext(Link link) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setAuthContext(Link link, HttpClientContext context) {
		// TODO Auto-generated method stub

	}

	@Override
	public synchronized void acceptDownloadedContent(Content content) throws InterruptedException {
		downloadedContent.add(content);
	}

	@Override
	public synchronized void acceptDownloadError(Link link, boolean retriable, String message) throws InterruptedException {
		// TODO Auto-generated method stub

	}


	@Override
	public synchronized Content provideContentToProcess() throws InterruptedException {
		if (contentsToProvideForProcessing.isEmpty()) {
			for (;;) {
					this.wait();
			} // this is only a mock !!! we expect the list to be filled before consumption ;
				// Once empty, we never give anything back again.
		}
		return contentsToProvideForProcessing.removeFirst();
	}

	@Override
	public synchronized void  acceptProcessedContent(Content content) throws InterruptedException {
		processedContent.add(content);

	}

	@Override
	public synchronized void  acceptProcessingError(Content content, String message) throws InterruptedException {
		// TODO Auto-generated method stub

	}

	@Override
	public synchronized void  acceptNewLink(Link link) throws InterruptedException {
		acceptedLinks.add(link);

	}

	@Override
	public synchronized void  acceptAllNewLinks(Collection<Link> incomingLinks) throws InterruptedException {
		acceptedLinks.addAll(incomingLinks);
	}

	@Override
	public Content provideContentToStore() throws InterruptedException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void doneStoringOneContent(Content content) throws InterruptedException {
		// TODO Auto-generated method stub

	}

	@Override
	public void acceptStorageError(Content content, String message) throws InterruptedException {
		// TODO Auto-generated method stub

	}

	@Override
	public int getNumberOfTrackedActivities() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getNumberOfFilesSaved() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isCriticallyLoaded() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Serializable getMemento() throws InterruptedException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void resetFromMemento(Serializable memento) {
		// TODO Auto-generated method stub

	}

	@Override
	public void recycleRetriableLinks() {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Link> getRetriableLinks() {
		// TODO Auto-generated method stub
		return null;
	}

}
