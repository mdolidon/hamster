package org.mdolidon.hamster.CLI;

import java.io.Serializable;

import org.mdolidon.hamster.core.Utils;
import org.mdolidon.hamster.startup.IHamsterStartup;
import org.mdolidon.hamster.startup.NormalStartup;

public class RetryTask extends AbstractTask {
	
	public RetryTask() {
		if (Utils.ONGOING_MEMENTO_FILE.exists()) {
			System.out.println("\nFound a file named " + Utils.ONGOING_MEMENTO_FILE
					+ "\nDid you mean : hamster resume ?\n");
			return;
		}
		if (!Utils.FINAL_MEMENTO_FILE.exists()) {
			System.out.println(
					"\nNo '" + Utils.FINAL_MEMENTO_FILE + "' file found. Don't know what to retry.\n");
			return;
		}
		
		IHamsterStartup startSequence;
		
		
		try {
			loadConfiguration();
			System.out.println("\nRetrying URLs on a job that had started at " + configuration.getStartUrl());

			startSequence = new NormalStartup(configuration);
			mediator = startSequence.getMediator();

			Serializable memento = Utils.loadSerializedObject(Utils.FINAL_MEMENTO_FILE,
					"Could not find file to resume from : " + Utils.FINAL_MEMENTO_FILE);
			mediator.resetFromMemento(memento);
			mediator.recycleRetriableLinks();
			
		} catch (Exception e) {
			System.out.println("Failure at start up : " + e);
			return;
		}
		
		startAndEnterMainLoop(startSequence);
	}
}
