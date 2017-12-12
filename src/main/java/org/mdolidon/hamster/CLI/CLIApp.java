package org.mdolidon.hamster.CLI;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.util.Properties;

import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.mdolidon.hamster.configuration.TextConfiguration;
import org.mdolidon.hamster.core.IConfiguration;
import org.mdolidon.hamster.core.IMediator;
import org.mdolidon.hamster.startup.IHamsterStartup;
import org.mdolidon.hamster.startup.NormalStartup;
import org.mdolidon.hamster.startup.ResumeStartup;

import java.nio.charset.StandardCharsets;

/**
 * 
 * A very simple command-line front-end.
 *
 */
public class CLIApp {

	private static Logger logger = LogManager.getLogger();
	private static String[] waiterSequence = { "o.......", " o......", "  o.....", "   o....", "    o...", "     o..",
			"      o.", "       o" };

	private int waiterSequenceStep = 0;

	private IConfiguration configuration;
	private IMediator mediator;

	private File configFile = new File("mission_for_the_hamster.txt");

	public static void main(String[] args) {
		Properties props = System.getProperties();
		props.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.NoOpLog");

		new CLIApp(args);
	}

	// Any method named task_* should kill the JVM when finished

	public CLIApp(String[] args) {
		logger.trace("Starting command line application");

		CommandLine commandLine = CommandLine.parse(args);
		if (commandLine.isHelpAsked() || commandLine.isConfigurationTopicAsked()) {
			Help.show(commandLine);
			return;
		}

		if (commandLine.isDebug()) {
			org.apache.logging.log4j.core.config.Configurator.setRootLevel(org.apache.logging.log4j.Level.TRACE);
		}

		if (commandLine.isInit()) {
			task_init();
			return;
		}

		if (commandLine.isResume()) {
			task_resume();
			return;
		}

		task_runMainJob();
	}

	private void task_init() {
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

	private void task_runMainJob() {
		if (IHamsterStartup.MEMENTO_FILE.exists()) {
			System.out.println(
					"\nA " + IHamsterStartup.MEMENTO_FILE + " exists. It would let you resume an interrupted job.\n"
							+ "If you're sure that you want to start from scratch, delete that file and relaunch hamster.\n"
							+ "If you want to resume the job that was interrupted, launch :\n     hamster resume\n");
			System.exit(1);
		}

		loadConfiguration();
		System.out.println("\nThe exploration starts at " + configuration.getStartUrl());
		IHamsterStartup startSequence = new NormalStartup(configuration);
		startAndEnterMainLoop(startSequence);
	}

	private void task_resume() {
		if (!IHamsterStartup.MEMENTO_FILE.exists()) {
			System.out.println(
					"\nNo '" + IHamsterStartup.MEMENTO_FILE + "' file found. Don't know where to resume from.\n");
			System.exit(1);
		}
		loadConfiguration();
		System.out.println("\nResuming a job that had started at " + configuration.getStartUrl());
		IHamsterStartup startSequence = new ResumeStartup(configuration);
		startAndEnterMainLoop(startSequence);
	}

	private void startAndEnterMainLoop(IHamsterStartup startSequence) {
		startSequence.run();
		if (startSequence.hasErrors()) {
			System.out.println(startSequence.getErrorMessage());
			System.exit(1);
		}
		mediator = startSequence.getMediator();

		// We check for the mediator to say there's no jobs left to be done.
		// However, to avoid false positives due to the easy-going approach to
		// counting
		// jobs,
		// we wait to have seen 0 jobs several times before shutting down.
		int timesISawZeroJobsLeft = 0;
		try {
			while (timesISawZeroJobsLeft < 3) {
				if (mediator.getJobsLeftCount() == 0) {
					timesISawZeroJobsLeft++;
				} else {
					timesISawZeroJobsLeft = 0;
				}
				updateStatusLine();
				Thread.sleep(300);
			}

			if (IHamsterStartup.MEMENTO_FILE.exists()) {
				IHamsterStartup.MEMENTO_FILE.delete();
			}
		} catch (InterruptedException e) {

		}

		// TODO : tell the user if there were any warnings, and direct him to
		// the log
		// file

		System.out.println("\nDone.\n");
	}

	private void loadConfiguration() {
		try {
			byte[] encoded = Files.readAllBytes(configFile.toPath());
			String configString = new String(encoded, StandardCharsets.UTF_8);
			configuration = new TextConfiguration(configString);

		} catch (IOException e) {
			System.out.println("Can't read file as Hamster configuration : " + configFile.getPath());
			System.out.println("You can create one with :");
			System.out.println("   hamster init");
			System.exit(1);
		} catch (Exception e) {
			logger.error("Exception while intializing configuration", e);
			System.exit(1);
		}

		if (!configuration.isValid()) {
			System.out.println("Your " + configFile + " has errors :");
			System.out.println(configuration.getErrorMessage());
			System.exit(1);
		}
	}

	private void updateStatusLine() {
		waiterSequenceStep++;
		waiterSequenceStep = waiterSequenceStep % waiterSequence.length;

		int jobsCount = mediator.getJobsLeftCount();
		int savedCount = mediator.getNumberOfFilesSaved();
		System.out.print("  " + jobsCount + " --> " + savedCount + "       " + waiterSequence[waiterSequenceStep]
				+ "                \r");
	}
}
