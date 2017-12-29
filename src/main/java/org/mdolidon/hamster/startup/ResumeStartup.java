package org.mdolidon.hamster.startup;

import java.io.File;

import org.mdolidon.hamster.core.IConfiguration;
import org.mdolidon.hamster.core.Utils;

public class ResumeStartup extends NormalStartup {

	private File file;

	public ResumeStartup(IConfiguration configuration, File file) {
		super(configuration);
		this.file = file;
	}

	@Override
	public void run() {
		try {
			Utils.loadMementoFile(mediator, file, "Could not find file to resume from : " + file);
		} catch (Exception e) {
			noteError(e.getMessage());
		}
		super.run();
	}
}
