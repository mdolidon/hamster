package org.mdolidon.hamster.CLI;

import java.io.File;

import org.mdolidon.hamster.startup.IHamsterStartup;

public class DontRetryTask extends AbstractTask {
	
	public DontRetryTask() {
		File file = IHamsterStartup.FINAL_MEMENTO_FILE;
		if (file.exists()) {
			if (file.delete()) {
				System.out.println("\nThe faulty targets won't be tried anymore.\n");
			} else {
				System.out.println("\nCould not delete " + file + "\nPlease do it manually.");
			}
		} else {
			System.out.println("\nThere was already nothing to retry.\n");
		}
	}
}
