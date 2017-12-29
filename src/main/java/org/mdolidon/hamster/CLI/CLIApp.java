package org.mdolidon.hamster.CLI;

import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

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

		CommandLine commandLine = CommandLine.parse(args);
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
}
