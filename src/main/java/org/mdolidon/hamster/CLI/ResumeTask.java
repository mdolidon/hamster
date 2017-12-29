package org.mdolidon.hamster.CLI;

import org.mdolidon.hamster.startup.IHamsterStartup;
import org.mdolidon.hamster.startup.ResumeStartup;

public class ResumeTask extends AbstractTask {

	public ResumeTask() {
		if (!IHamsterStartup.ONGOING_MEMENTO_FILE.exists()) {
			System.out.println("\nNo '" + IHamsterStartup.ONGOING_MEMENTO_FILE
					+ "' file found. Don't know where to resume from.\n");
			return;
		}
		loadConfiguration();
		System.out.println("\nResuming a job that had started at " + configuration.getStartUrl());
		IHamsterStartup startSequence = new ResumeStartup(configuration, IHamsterStartup.ONGOING_MEMENTO_FILE);
		startAndEnterMainLoop(startSequence, false);
	}

}
