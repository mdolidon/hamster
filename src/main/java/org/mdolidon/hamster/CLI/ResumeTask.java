package org.mdolidon.hamster.CLI;

import java.io.Serializable;

import org.mdolidon.hamster.core.Utils;
import org.mdolidon.hamster.startup.IHamsterStartup;
import org.mdolidon.hamster.startup.NormalStartup;

public class ResumeTask extends AbstractTask {

	public ResumeTask() {
		if (!Utils.ONGOING_MEMENTO_FILE.exists()) {
			System.out.println(
					"\nNo '" + Utils.ONGOING_MEMENTO_FILE + "' file found. Don't know where to resume from.\n");
			return;
		}

		IHamsterStartup startSequence;
		
		
		//
		// RetryTask and ResumeTask are pretty much the same here.
		// It'll be worth factoring them together.
		//
		
		try {
			loadConfiguration();
			System.out.println("\nResuming a job that had started at " + configuration.getStartUrl());
			startSequence = new NormalStartup(configuration);
			mediator = startSequence.getMediator();
			correctStartUrl();

			Serializable memento = Utils.loadSerializedObject(Utils.ONGOING_MEMENTO_FILE,
					"Could not find file to resume from : " + Utils.ONGOING_MEMENTO_FILE);
			mediator.resetFromMemento(memento);
			
		} catch (Exception e) {
			System.out.println("Failure at start up : " + e);
			return;
		}

		startAndEnterMainLoop(startSequence);
	}

}
