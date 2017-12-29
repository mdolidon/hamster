package org.mdolidon.hamster.CLI;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.commons.io.IOUtils;

public class InitTask extends AbstractTask {

	public InitTask() {
		if (configFile.exists()) {
			System.out.println("\nA file named " + configFile.getName() + " already exists.\n");
			return;
		}

		InputStream defaultConfig = getClass().getResourceAsStream("/default_hamster_config.txt");
		OutputStream fos = null;
		try {
			fos = new FileOutputStream(configFile);
			IOUtils.copy(defaultConfig, fos);
			fos.close();
			defaultConfig.close();
			System.out.println("\nCreated file : " + configFile.getName() + "\n");
			return;
		} catch (IOException e) {
			try {
				if (fos != null) {
					fos.close();
				}
				defaultConfig.close();
			} catch (Exception e2) {

			}
			System.out.println("\nCould not write file : " + configFile.getName() + "\n");
			System.exit(1);
		}
	}
}
