package org.mdolidon.hamster.CLI;

import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.mdolidon.hamster.core.Utils;

/**
 * 
 * A very simple command-line front-end.
 *
 */
public class CLIApp {

	private static Logger logger = LogManager.getLogger();

	public static void main(String[] args) {

		logger.trace("Starting command line application");

		Properties props = System.getProperties();
		props.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.NoOpLog");

		CommandLine commandLine;
		try {
		    commandLine = CommandLine.parse(args);
		} catch(Exception e) {
			System.out.println("Invalid command line. Please see : hamster help");
			return;
		}
		
		if(commandLine.isVersionAsked()) {
			showVersion();
			return;
		}
		
		if (commandLine.isHelpAsked() || commandLine.isConfigurationTopicAsked()) {
			Help.show(commandLine);
			return;
		}

		if (commandLine.isDebug()) {
			org.apache.logging.log4j.core.config.Configurator.setRootLevel(org.apache.logging.log4j.Level.TRACE);
		}

		if (commandLine.isInit()) {
			new InitTask();
		} else if (commandLine.isResume()) {
			new ResumeTask();
		} else if (commandLine.isRetry() && commandLine.isInfoRequest()) {
			new RetryInfoTask();
		} else if (commandLine.isRetry() && commandLine.isDontFlag()) {
			new DontRetryTask();
		} else if (commandLine.isRetry()) {
			new RetryTask();
		} else {
			new MainTask();
		}
		
		logger.trace("The task returned. Time to say good bye.");
	}
	
	public static void showVersion() {
		String version = Utils.getVersion();
		System.out.println("Hamster version : " + version);
		System.out.println("Author          : Mathias Dolidon");
		System.out.println("License         : Apache 2.0");
		System.out.println("Home            : https://github.com/mdolidon/hamster");
	}
}
