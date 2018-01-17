package org.mdolidon.hamster.CLI;

import org.mdolidon.hamster.core.Link;
import org.mdolidon.hamster.core.Utils;
import org.mdolidon.hamster.startup.IHamsterStartup;
import org.mdolidon.hamster.startup.NormalStartup;

public class MainTask extends AbstractTask {

	public MainTask() {
		if (Utils.ONGOING_MEMENTO_FILE.exists()) {
			System.out.println("\nFound a file named " + Utils.ONGOING_MEMENTO_FILE
					+ ". It would let you resume an interrupted job.\n\n"
					+ "If you're sure that you want to start from scratch, launch :\n     hamster dont resume\n\n"
					+ "If you want to resume the job that was interrupted, launch :\n     hamster resume\n");
			return;
		}
		if (Utils.FINAL_MEMENTO_FILE.exists()) {
			System.out.println("\nFound a file named " + Utils.FINAL_MEMENTO_FILE
					+ ". It would let you retry to download targets that failed\n"
					+ "due to what may be intermittent failures (loss of connectivity, server errors...) during the last job.\n\n"
					+ "For more information:\n    hamster retry info\n\n"
					+ "If you're sure that you want to start from scratch :\n    hamster dont retry\n\n"
					+ "If you want to retry on those URLs, launch :\n    hamster retry\n");
			return;
		}

		IHamsterStartup startSequence;
		
		try {
			loadConfiguration();
			System.out.println("\nThe exploration starts at " + configuration.getStartUrl());
			startSequence = new NormalStartup(configuration);
			mediator = startSequence.getMediator();		
			
			mediator.acceptNewLink(new Link(configuration.getStartUrl(), 0, configuration));

		} catch (Exception e) {
			System.out.println("Failure at start up : " + e);
			return;
		}

		startAndEnterMainLoop(startSequence);
	}
}
