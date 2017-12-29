package org.mdolidon.hamster.startup;

import java.net.URL;

import org.apache.http.client.protocol.HttpClientContext;
import org.mdolidon.hamster.core.DownloadWorker;
import org.mdolidon.hamster.core.ErrorsBoard;
import org.mdolidon.hamster.core.IConfiguration;
import org.mdolidon.hamster.core.IMediator;
import org.mdolidon.hamster.core.Link;
import org.mdolidon.hamster.core.Mediator;
import org.mdolidon.hamster.core.ProcessingWorker;
import org.mdolidon.hamster.core.MementoWorker;
import org.mdolidon.hamster.core.StorageWorker;
import org.mdolidon.hamster.core.Utils;

/**
 * Startup includes stuff like : - finalizing configuration - intanciating a
 * mediator - starting worker threads and injecting them into the mediator -
 * feeding the mediator with the start URL. This abstract class offers a skeleton utility methods
 * to do all this. Subclasses need to implement the run() method, that does the actual
 * startup.
 */
public abstract class AbstractStartup implements IHamsterStartup {

	protected static int MEMENTO_INTERVAL_IN_SECONDS = 15;
	
	private ErrorsBoard errors = new ErrorsBoard();
	protected IConfiguration configuration;
	protected IMediator mediator;


	public AbstractStartup(IConfiguration configuration) {
		if (!configuration.isValid()) {
			throw new RuntimeException("BUG : attempted to start up in spite of an invalid configuration.");
		}
		this.configuration = configuration;
		mediator = new Mediator(configuration);
	}

	@Override
	abstract public void run();

	@Override
	public IMediator getMediator() {
		return mediator;
	}
	
	@Override
	public boolean hasErrors() {
		return errors.hasErrors();
	}
	
	@Override
	public String getErrorMessage() {
		return errors.getErrorMessage();
	}
	
	protected void noteError(String msg) {
		errors.note(msg);
	}

	protected void correctStartUrl() throws Exception {
		URL configuredStartUrl = configuration.getStartUrl();
		HttpClientContext context = mediator.getAuthContext(new Link(configuredStartUrl, 0, configuration));
		URL correctedStartUrl = Utils.fetchEffectiveURL(configuredStartUrl, context);
		if (!correctedStartUrl.toString().equals(configuration.getStartUrl().toString())) {
			configuration.correctStartUrl(correctedStartUrl);
		}
	}

	protected void startDownloadWorkers() {
		for (int i = 0; i < configuration.getMaxConcurrentRequests(); i++) {
			startAndRegisterWorker(new DownloadWorker(mediator, configuration));
		}
	}

	protected void startProcessingWorkers() {
		int cores = Runtime.getRuntime().availableProcessors();
		for (int i = 0; i < cores; i++) {
			startAndRegisterWorker(new ProcessingWorker(mediator, configuration));
		}
	}

	protected void startStorageWorkers() {
		startAndRegisterWorker(new StorageWorker(mediator));
	}
	
	protected void startSnapshotWorker() {
		startAndRegisterWorker(new MementoWorker(mediator, ONGOING_MEMENTO_FILE, MEMENTO_INTERVAL_IN_SECONDS));
	}

	protected void startAndRegisterWorker(Runnable worker) {
		Runnable wrapper = new FailFastThreadWrapper(worker);
		Thread t = new Thread(wrapper);
		t.setDaemon(true);
		t.start();
		mediator.registerWorker(t);
	}

}
