package org.mdolidon.hamster.CLI;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.mdolidon.hamster.configuration.TextConfiguration;
import org.mdolidon.hamster.core.IConfiguration;
import org.mdolidon.hamster.core.IMediator;
import org.mdolidon.hamster.core.Link;
import org.mdolidon.hamster.core.Mediator;
import org.mdolidon.hamster.core.Utils;
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

		if (commandLine.isRetry() && commandLine.isInfoRequest()) {
			task_retry_info();
			return;
		}
		
		if (commandLine.isRetry() && commandLine.isDontFlag()) {
			task_dont_retry();
			return;
		}
		

		if (commandLine.isRetry()) {
			task_retry();
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

	private void task_resume() {
		if (!IHamsterStartup.ONGOING_MEMENTO_FILE.exists()) {
			System.out.println("\nNo '" + IHamsterStartup.ONGOING_MEMENTO_FILE
					+ "' file found. Don't know where to resume from.\n");
			return;
		}
		loadConfiguration();
		System.out.println("\nResuming a job that had started at " + configuration.getStartUrl());
		IHamsterStartup startSequence = new ResumeStartup(configuration, IHamsterStartup.ONGOING_MEMENTO_FILE);
		startAndEnterMainLoop(startSequence, false);
	}

	private void task_retry() {
		if (!IHamsterStartup.FINAL_MEMENTO_FILE.exists()) {
			System.out.println(
					"\nNo '" + IHamsterStartup.FINAL_MEMENTO_FILE + "' file found. Don't know what to retry.\n");
			return;
		}
		loadConfiguration();
		System.out.println("\nRetrying URLs on a job that had started at " + configuration.getStartUrl());
		IHamsterStartup startSequence = new ResumeStartup(configuration, IHamsterStartup.FINAL_MEMENTO_FILE);
		startAndEnterMainLoop(startSequence, true);
	}
	
	private void task_dont_retry() {
		File file = IHamsterStartup.FINAL_MEMENTO_FILE;
		if (file.exists()) {
			if(file.delete()) {
				System.out.println("\nThe faulty targets won't be tried anymore.\n");
			} else {
				System.out.println("\nCould not delete " + file + "\nPlease do it manually.");
			}
		}
	}

	private void task_retry_info() {
		loadConfiguration();
		mediator = new Mediator(configuration);
		loadRetryFileAndInjectForInfoPrint();
		List<Link> retriableLinks = mediator.getRetriableLinks();

		if (retriableLinks.isEmpty()) {
			System.out.println("It seems that nothing needs to be retried.");
			return;
		}

		Map<String, Integer> countByDomain = new HashMap<>();
		for (Link l : retriableLinks) {
			String domain = l.getTargetDomain();
			if (countByDomain.containsKey(domain)) {
				Integer count = countByDomain.get(domain);
				count = new Integer(count.intValue() + 1);
				countByDomain.put(domain, count);
			} else {
				countByDomain.put(domain, new Integer(1));
			}
		}
		System.out.println("\nThe following failed downloads could be worth retrying :");
		for(String domain:countByDomain.keySet()) {
			System.out.println("- " + countByDomain.get(domain) + " on " + domain);
		}
		System.out.println("");
	}

	private void startAndEnterMainLoop(IHamsterStartup startSequence, boolean isRetry) {
		startSequence.run();
		if (startSequence.hasErrors()) {
			System.out.println(startSequence.getErrorMessage());
			System.exit(1);
		}
		mediator = startSequence.getMediator();
		if (isRetry) {
			mediator.recycleRetriableLinks();
		}

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

			if (IHamsterStartup.ONGOING_MEMENTO_FILE.exists()) {
				IHamsterStartup.ONGOING_MEMENTO_FILE.delete();
			}
			List<Link> retriableLinks = mediator.getRetriableLinks();
			if (!retriableLinks.isEmpty()) {
				Utils.writeMementoFile(mediator, IHamsterStartup.FINAL_MEMENTO_FILE);
				System.out.println("\n" + retriableLinks.size()
						+ " targets failed being downloaded due to what could be intermittent errors.\n"
						+ "hamster retry info : more details\n"
						+ "hamster retry      : make a new attempt on those targets\n"
						+ "hamster dont retry : forget about it\n");
			} else {
				System.out.println("\nDone.\n");
			}
		} catch (InterruptedException e) {
		}
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

	private void loadRetryFileAndInjectForInfoPrint() {
		try {
			FileInputStream fis = new FileInputStream(IHamsterStartup.FINAL_MEMENTO_FILE);
			ObjectInputStream ois = new ObjectInputStream(fis);
			try {
				logger.info("Reading snapshot file");
				Serializable memento = (Serializable) ois.readObject();

				logger.trace("Injecting memento into mediator");
				mediator.resetFromMemento(memento);
			} catch (ClassNotFoundException e) {
				logger.error("Could not understand the contents of the retry file : {}",
						IHamsterStartup.FINAL_MEMENTO_FILE);
				System.exit(1);
			} catch (InterruptedException e) {
			} finally {
				ois.close();
			}
		} catch (FileNotFoundException e) {
			System.out.println("\nIt seems that nothing needs to be retried.\n");
			System.exit(1);
		} catch (IOException e) {
			logger.error("Can not read file : {}", IHamsterStartup.FINAL_MEMENTO_FILE);
			System.exit(1);
		}
	}
}
