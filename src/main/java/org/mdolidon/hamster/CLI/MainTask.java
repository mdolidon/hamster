package org.mdolidon.hamster.CLI;

import org.mdolidon.hamster.startup.IHamsterStartup;
import org.mdolidon.hamster.startup.NormalStartup;

public class MainTask extends AbstractTask {

	public MainTask() {
		if (IHamsterStartup.ONGOING_MEMENTO_FILE.exists()) {
			System.out.println("\nFound a file named " + IHamsterStartup.ONGOING_MEMENTO_FILE
					+ ". It would let you resume an interrupted job.\n"
					+ "If you're sure that you want to start from scratch, delete that file and relaunch hamster.\n"
					+ "If you want to resume the job that was interrupted, launch :\n     hamster resume\n");
			return;
		}
		if (IHamsterStartup.FINAL_MEMENTO_FILE.exists()) {
			System.out.println("\nFound a file named " + IHamsterStartup.FINAL_MEMENTO_FILE
					+ ". It would let you retry to download targets that failed\n"
					+ "due to what may be intermittent failures (loss of connectivity, server errors...) during the last job.\n\n"
					+ "For more information:\n    hamster retry info\n\n"
					+ "If you're sure that you want to start from scratch :\n    hamster dont retry\n\n"
					+ "If you want to retry on those URLs, launch :\n    hamster retry\n");
			return;
		}

		loadConfiguration();
		System.out.println("\nThe exploration starts at " + configuration.getStartUrl());
		IHamsterStartup startSequence = new NormalStartup(configuration);
		startAndEnterMainLoop(startSequence, false);
	}
}
