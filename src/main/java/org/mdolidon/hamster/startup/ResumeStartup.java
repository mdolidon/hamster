package org.mdolidon.hamster.startup;

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

	public ResumeStartup(IConfiguration configuration) {
		super(configuration);
	}

	@Override
	public void run() {
		try {
			FileInputStream fis = new FileInputStream(MEMENTO_FILE);
			ObjectInputStream ois = new ObjectInputStream(fis);

			try {
				logger.info("Reading snapshot file");
				Serializable memento = (Serializable) ois.readObject();
				
				logger.trace("Injecting memento into mediator");
				mediator.resetFromMemento(memento);
			} catch (ClassNotFoundException e) {
				noteError("Can not deserialize the snapshot : class not found exception.");

				return;
			} catch(InterruptedException e) {
			} finally {
				ois.close();
			}
		} catch (FileNotFoundException e) {
			noteError("Could not find file to resume from : " +  MEMENTO_FILE);
			return;
		} catch (IOException e) {
			noteError("Can not read file " + MEMENTO_FILE);
			return;
		}

		super.run();
	}
}
