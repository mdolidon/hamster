package org.mdolidon.hamster.core;

import java.io.File;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MementoWorker implements Runnable {

	private static Logger logger = LogManager.getLogger();

	private IMediator mediator;

	private File file;

	private int intervalInSeconds;

	public MementoWorker(IMediator mediator, File file, int intervalInSeconds) {
		super();
		this.mediator = mediator;
		this.file = file;
		this.intervalInSeconds = intervalInSeconds;
	}

	@Override
	public void run() {
		logger.trace("Starting a memento worker");
		for (;;) {
			try {
				Thread.sleep(intervalInSeconds * 1000);
				Utils.writeMementoFile(mediator, file);
			} catch (InterruptedException e) {
				return;
			}

		}
	}
}
