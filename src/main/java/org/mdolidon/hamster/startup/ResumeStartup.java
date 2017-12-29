package org.mdolidon.hamster.startup;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.mdolidon.hamster.core.IConfiguration;

public class ResumeStartup extends NormalStartup {

	private static Logger logger = LogManager.getLogger();
	private File file;

	public ResumeStartup(IConfiguration configuration, File file) {
		super(configuration);
		this.file = file;
	}

	@Override
	public void run() {
		try {
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);

			try {
				logger.info("Reading snapshot file");
				Serializable memento = (Serializable) ois.readObject();

				logger.trace("Injecting memento into mediator");
				mediator.resetFromMemento(memento);
			} catch (ClassNotFoundException e) {
				noteError("Can not deserialize the snapshot : class not found exception.");

				return;
			} catch (InterruptedException e) {
			} finally {
				ois.close();
			}
		} catch (FileNotFoundException e) {
			noteError("Could not find file to resume from : " + file);
			return;
		} catch (IOException e) {
			noteError("Can not read file " + file);
			return;
		}

		super.run();
	}
}
