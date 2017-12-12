package org.mdolidon.hamster.core;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * This worker receives Content objects from the mediator, that are ready for
 * storage. It simply writes them into files provided by the Content's source
 * link object.
 */
public class StorageWorker implements Runnable {

	private static Logger logger = LogManager.getLogger();

	private IMediator mediator;

	public StorageWorker(IMediator mediator) {
		this.mediator = mediator;
	}

	@Override
	public void run() {
		logger.trace("Starting a storage worker");
		while (true) {
			try {
				Content content = mediator.provideContentToStore();
				Link link = content.getSourceLink();
				logger.trace("Got content to store for {}", link.getTargetAsString());

				File file = link.getStorageFile();
				if (file == null) {
					mediator.acceptStorageError(content,
							"Storage worker received a document without a resolved storage location for {}. Resolving...");
					continue;
				}

				File parent = file.getParentFile();
				if (parent != null && !parent.exists() && !parent.mkdirs()) {
					mediator.acceptStorageError(content, "Could not create folder : " + parent);
					continue;
				}

				try {
					FileUtils.writeByteArrayToFile(file, content.getBytes());
					logger.trace("Stored {}", file);
					mediator.doneStoringOneContent(content);
				} catch (IOException e) {
					mediator.acceptStorageError(content, e.getMessage());
				}
			} catch (InterruptedException e) {
				return;
			}
		}
	}

}
