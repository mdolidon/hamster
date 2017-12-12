package org.mdolidon.hamster.core;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MementoWorker implements Runnable {

	private static Logger logger = LogManager.getLogger();

	private IMediator mediator;

	private File fileName;

	private int intervalInSeconds;

	public MementoWorker(IMediator mediator, File fileName, int intervalInSeconds) {
		super();
		this.mediator = mediator;
		this.fileName = fileName;
		this.intervalInSeconds = intervalInSeconds;
	}

	@Override
	public void run() {
		logger.trace("Starting a memento worker");
		FileOutputStream fos;
		ObjectOutputStream oos;
		Serializable memento;
		while (true) {

			// There must be a nicer way than this cascade of try/catch...

			
			try {
				Thread.sleep(intervalInSeconds * 1000);
				logger.trace("Requesting memento");
				memento = mediator.getMemento();
				logger.trace("Got memento");
			} catch (InterruptedException e) {
				return;
			}

			try {
				fos = new FileOutputStream(fileName);
			} catch (IOException e) {
				logger.error("Could open file stream to {}", fileName);
				continue;
			}
			
			try {
				oos = new ObjectOutputStream(fos);
			} catch (IOException e) {
				logger.error("Could not open object stream to {}", fileName);
				try {
					fos.close();
				} catch (IOException inner_e) {
				}
				continue;
			}
			
			try {
				oos.writeObject(memento);
				oos.close();
				logger.info("Memento successfully written to {}", fileName);
			} catch (IOException e) {
				try {
					oos.close();
				} catch (IOException inner_e) {
				}
				logger.error("Could not write file {} ; cause : {}", fileName, e);
			}
		}
	}
}
