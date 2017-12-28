package test.org.mdolidon.hamster.mocks;

import java.io.Serializable;
import java.util.Collection;

import org.apache.http.client.protocol.HttpClientContext;
import org.mdolidon.hamster.core.Content;
import org.mdolidon.hamster.core.IMediator;
import org.mdolidon.hamster.core.Link;

public class BaseMediatorMock implements IMediator {

	@Override
	public void registerWorker(Thread worker) {
		// TODO Auto-generated method stub

	}

	@Override
	public Link provideLinkToDownload() throws InterruptedException {
		// TODO Auto-generated method stub
		return null;
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
	public void acceptDownloadedContent(Content content) throws InterruptedException {
		// TODO Auto-generated method stub

	}

	@Override
	public void acceptDownloadError(Link link, String message) throws InterruptedException {
		// TODO Auto-generated method stub

	}

	@Override
	public Content provideContentToProcess() throws InterruptedException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void acceptProcessedContent(Content content) throws InterruptedException {
		// TODO Auto-generated method stub

	}

	@Override
	public void acceptProcessingError(Content content, String message) throws InterruptedException {
		// TODO Auto-generated method stub

	}

	@Override
	public void acceptNewLink(Link link) throws InterruptedException {
		// TODO Auto-generated method stub

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
	public int getJobsLeftCount() {
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
	public void acceptAllNewLinks(Collection<Link> incomingLinks) throws InterruptedException {
		// TODO Auto-generated method stub
		
	}

}
