package org.mdolidon.hamster.CLI;

import java.io.File;

import org.mdolidon.hamster.core.Utils;

public class DontResumeTask extends AbstractTask {

	public DontResumeTask() {
		File file = Utils.ONGOING_MEMENTO_FILE;
		if (file.exists()) {
			if (file.delete()) {
				System.out.println("\nThe job's status has been reset. The next launch will start from scratch.\n");
			} else {
				System.out.println("\nCould not delete " + file + "\nPlease do it manually.");
			}
		} else {
			System.out.println("\nThere was already nothing to resume.\n");
		}
	}
}
