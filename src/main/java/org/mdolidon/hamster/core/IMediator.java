package org.mdolidon.hamster.core;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import org.apache.http.client.protocol.HttpClientContext;

/**
 * The mediator is the central coordinator of the Hamster's job. It is
 * essentially a bunch of queues between worker threads, with a capability to
 * pause the whole stuff to take a reliable snapshot for possible later
 * crash-recovery, and then carry on. Its concern is to handle the dynamic state
 * of the application.
 */

public interface IMediator {

	/**
	 * Attach a worker thread to this mediator. Thus the worker thread won't be
	 * garbage-collected as long as the mediator references it.
	 * 
	 * @param worker
	 */
	public void registerWorker(Thread worker);

	/**
	 * Ask the mediator for a link that needs to be downloaded. The caller becomes
	 * responsible for this link.
	 * 
	 * @return
	 * @throws InterruptedException
	 */
	public Link provideLinkToDownload() throws InterruptedException;

	/**
	 * Get the HTTP context that's relevant to this link. Thread local.
	 * 
	 * @param link
	 */
	public HttpClientContext getAuthContext(Link link);

	/**
	 * Store back the HTTP context that's relevant to this link. Thread local.
	 * 
	 * @param link
	 */
	public void setAuthContext(Link link, HttpClientContext context);

	/**
	 * Give to the mediator some newly downloaded raw content. The mediator will
	 * forward it to the relevant processing and storage components. The Content
	 * object should carry as much information as possible (MIME type, effective
	 * location...)
	 * 
	 * @param content
	 * @throws InterruptedException
	 */
	public void acceptDownloadedContent(Content content) throws InterruptedException;

	/**
	 * Inform the mediator of an error that occurred while trying to download a
	 * link's target.
	 * 
	 * @param link
	 * @param retriable
	 * @param message
	 * @throws InterruptedException
	 */
	public void acceptDownloadError(Link link, boolean retriable, String message) throws InterruptedException;

	/**
	 * Ask the mediator for a Content that needs to be rewritten for offline usage.
	 * The caller becomes responsible for this content.
	 * 
	 * @throws InterruptedException
	 */
	public Content provideContentToProcess() throws InterruptedException;

	/**
	 * Give the mediator some content that's been rewritten for local usage, and
	 * should be ready for storage.
	 * 
	 * @param content
	 * @throws InterruptedException
	 */
	public void acceptProcessedContent(Content content) throws InterruptedException;

	/**
	 * Inform the mediator that some content could not be correctly reworked for
	 * offline storage.
	 * 
	 * @param link
	 * @param message
	 * @throws InterruptedException
	 */
	public void acceptProcessingError(Content content, String message) throws InterruptedException;

	/**
	 * Notify the mediator about a new link that has been discovered and checked.
	 * The mediator will queue this link for later download, provided it has never
	 * been seen before. It is the caller's responsibility to check whether the
	 * configuration asks for this link to be downloaded or not.
	 * 
	 * @param link
	 * @throws InterruptedException
	 */
	public void acceptNewLink(Link link) throws InterruptedException;

	/**
	 * Notify the mediator about a collection of new links that have been discovered
	 * and checked. The mediator will queue each of these links that have never been
	 * seen before for later download. It is the caller's responsibility to check
	 * whether the configuration asks for each link to be downloaded or not.
	 * 
	 * @param link
	 * @throws InterruptedException
	 */
	public void acceptAllNewLinks(Collection<Link> incomingLinks) throws InterruptedException;

	/**
	 * Ask the mediator for a Content that needs to be stored. The content's source
	 * link should have been resolved to an offline file, that marks the wanted
	 * destination.
	 * 
	 * @return
	 * @throws InterruptedException
	 */
	public Content provideContentToStore() throws InterruptedException;

	/**
	 * Inform the mediator that one content has been successfully stored. U
	 * 
	 * @throws InterruptedException
	 */
	public void doneStoringOneContent(Content content) throws InterruptedException;

	/**
	 * Inform the mediator that a content could not be stored.
	 * 
	 * @param link
	 * @param message
	 * @throws InterruptedException
	 */
	public void acceptStorageError(Content content, String message) throws InterruptedException;

	/**
	 * Estimates how many jobs are currently going on or queued. When this value
	 * reaches 0, the total job can be considered done. The value is allowed to rely
	 * on unsynchronized counters, and a spurious 0 is allowed. Before quitting, the
	 * supervisor should check with a second slightly delayed call that the value is
	 * still 0.
	 * 
	 * @return
	 */
	public int getJobsLeftCount();

	/**
	 * How many content files have been saved on this job.
	 * 
	 * @return
	 */
	public int getNumberOfFilesSaved();

	/**
	 * Tells whether the mediator's queues are getting critically full. The mediator
	 * has to do a best effort to slow down some workers if needed. When this method
	 * responds with true, the supervisor can expect the mediator to become unstable
	 * or even to deadlock itself.
	 * 
	 * @return
	 */
	public boolean isCriticallyLoaded();

	/**
	 * Provides a serializable object that can be use to restore the mediator's
	 * state (resume a job).
	 * 
	 */
	public Serializable getMemento() throws InterruptedException;

	/**
	 * Puts this mediator in the same state as the mediator (of the same class) that
	 * produced the given memento object. Links and Contents that were out in
	 * workers hands at the time the memento was produced are put back in the queues
	 * to be worked on again from the top. This method should only be called on a
	 * mediator that has not done any work yet, and will throw a RuntimeException if
	 * this condition is not respected.
	 * 
	 * @param memento
	 * @throws InterruptedException
	 */
	public void resetFromMemento(Serializable memento) throws InterruptedException;

	/**
	 * Queues the retriable links for a new download attempt. Retriable links are
	 * links that could not be downloaded due to a failure that could be of
	 * intermittent nature (loss of connectivity, server error...)
	 *
	 */
	public void recycleRetriableLinks();

	/**
	 * List the links that were queued for retry. This is meant to provide
	 * information to the end-user. Retriable links are links that could not be
	 * downloaded due to a failure that could be of intermittent nature (loss of
	 * connectivity, server error...)
	 */
	public List<Link> getRetriableLinks();
}
