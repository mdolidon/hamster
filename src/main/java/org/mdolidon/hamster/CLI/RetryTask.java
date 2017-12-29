package org.mdolidon.hamster.CLI;

import org.mdolidon.hamster.startup.IHamsterStartup;
import org.mdolidon.hamster.startup.ResumeStartup;

public class RetryTask extends AbstractTask {
	
	public RetryTask() {
		if (!IHamsterStartup.FINAL_MEMENTO_FILE.exists()) {
			System.out.println(
					"\nNo '" + IHamsterStartup.FINAL_MEMENTO_FILE + "' file found. Don't know what to retry.\n");
			return;
		}
		loadConfiguration();
		System.out.println("\nRetrying URLs on a job that had started at " + configuration.getStartUrl());
		IHamsterStartup startSequence = new ResumeStartup(configuration, IHamsterStartup.FINAL_MEMENTO_FILE);
		startAndEnterMainLoop(startSequence, true);
	}
}
