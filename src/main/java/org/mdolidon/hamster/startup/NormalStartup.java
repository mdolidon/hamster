package org.mdolidon.hamster.startup;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.mdolidon.hamster.core.IConfiguration;
import org.mdolidon.hamster.core.Link;

/**
 * Implements the start up sequence for a normal new job.
 *
 */
public class NormalStartup extends AbstractStartup {
	private static Logger logger = LogManager.getLogger();

	public NormalStartup(IConfiguration configuration) {
		super(configuration);
	}

	@Override
	public void run() {
		try {
			correctStartUrl();

			startDownloadWorkers();
			startProcessingWorkers();
			startStorageWorkers();
			startMementoWorker();

			mediator.acceptNewLink(new Link(configuration.getStartUrl(), 0, configuration));

		} catch (Exception e) {
			logger.error(e);
			noteError(e.toString());
		}
	}

}
