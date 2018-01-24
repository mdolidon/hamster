package org.mdolidon.hamster.startup;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.mdolidon.hamster.core.CSSProcessingWorker;
import org.mdolidon.hamster.core.DownloadWorker;
import org.mdolidon.hamster.core.ErrorsBoard;
import org.mdolidon.hamster.core.IConfiguration;
import org.mdolidon.hamster.core.IMediator;
import org.mdolidon.hamster.core.Mediator;
import org.mdolidon.hamster.core.MementoWorker;
import org.mdolidon.hamster.core.HTMLProcessingWorker;
import org.mdolidon.hamster.core.StorageWorker;
import org.mdolidon.hamster.core.Utils;

/**
 * Startup : - intanciating a mediator - starting worker threads and injecting
 * them into the mediator
 */
public class NormalStartup implements IHamsterStartup {

	private static Logger logger = LogManager.getLogger();

	protected static int MEMENTO_INTERVAL_IN_SECONDS = 15;

	private ErrorsBoard errors = new ErrorsBoard();
	protected IConfiguration configuration;
	protected IMediator mediator;

	public NormalStartup(IConfiguration configuration) {
		if (!configuration.isValid()) {
			throw new RuntimeException("BUG : attempted to start up in spite of an invalid configuration.");
		}
		this.configuration = configuration;
		mediator = new Mediator(configuration);
	}

	@Override
	public void run() {
		try {
			startDownloadWorkers();
			startHTMLProcessingWorkers();
			startCSSProcessingWorkers();
			startStorageWorkers();
			startMementoWorker();

		} catch (Exception e) {
			noteError(e.getMessage());
		}
	};

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

	protected void startDownloadWorkers() {
		logger.trace("Starting download workers");
		for (int i = 0; i < configuration.getMaxConcurrentRequests(); i++) {
			startAndRegisterWorker(new DownloadWorker(mediator, configuration));
		}
	}

	protected void startHTMLProcessingWorkers() {
		int cores = Runtime.getRuntime().availableProcessors();
		logger.trace("Starting HTML processing workers");
		for (int i = 0; i < cores; i++) {
			startAndRegisterWorker(new HTMLProcessingWorker(mediator, configuration));
		}
	}
	
	protected void startCSSProcessingWorkers() {
		int cores = Runtime.getRuntime().availableProcessors();
		logger.trace("Starting CSS processing worker");
		startAndRegisterWorker(new CSSProcessingWorker(mediator, configuration));
	}

	protected void startStorageWorkers() {
		logger.trace("Starting storage worker");
		startAndRegisterWorker(new StorageWorker(mediator));
	}

	protected void startMementoWorker() {
		logger.trace("Starting memento worker");
		startAndRegisterWorker(new MementoWorker(mediator, Utils.ONGOING_MEMENTO_FILE, MEMENTO_INTERVAL_IN_SECONDS));
	}

	protected void startAndRegisterWorker(Runnable worker) {
		Runnable wrapper = new FailFastThreadWrapper(worker);
		Thread t = new Thread(wrapper);
		t.setDaemon(true);
		t.start();
		mediator.registerWorker(t);
	}

}
