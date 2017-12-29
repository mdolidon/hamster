package org.mdolidon.hamster.startup;

import java.io.File;

import org.mdolidon.hamster.core.IMediator;

public interface IHamsterStartup extends Runnable {

	// UI components may want to refer to the snapshot file
	// This is a bit simple and brutal, but if one day we want a variable name, the
	// change is easy enough to make.
	public static File ONGOING_MEMENTO_FILE = new File("hamster.memento");

	public static File FINAL_MEMENTO_FILE = new File("hamster.retry");

	public IMediator getMediator();

	public boolean hasErrors();

	public String getErrorMessage();

}
