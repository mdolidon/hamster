package org.mdolidon.hamster.CLI;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.mdolidon.hamster.configuration.TextConfiguration;
import org.mdolidon.hamster.core.IConfiguration;
import org.mdolidon.hamster.core.IMediator;
import org.mdolidon.hamster.core.Link;
import org.mdolidon.hamster.core.Utils;
import org.mdolidon.hamster.startup.IHamsterStartup;

/**
 * 
 * This abstract class offers a template of members and utility methods that its
 * subclasses may want to use to run a command line task.
 * 
 *
 */
public abstract class AbstractTask {

	private static Logger logger = LogManager.getLogger();

	private static String[] waiterSequence = { "o.......", " o......", "  o.....", "   o....", "    o...", "     o..",
			"      o.", "       o" };

	private int waiterSequenceStep = 0;

	protected File configFile = new File("mission_for_the_hamster.txt");

	protected IConfiguration configuration;
	protected IMediator mediator;

	protected void startAndEnterMainLoop(IHamsterStartup startSequence, boolean isRetry) {
		logger.trace("Calling core startup");
		startSequence.run();
		if (startSequence.hasErrors()) {
			System.out.println(startSequence.getErrorMessage());
			System.exit(1);
		}
		mediator = startSequence.getMediator();
		if (isRetry) {
			mediator.recycleRetriableLinks();
		}

		// We check for the mediator to say there's no activities left to be done.
		// However, to avoid false positives due to the easy-going approach to
		// counting activities, we wait to have seen 0 jobs several times before shutting down.
		int timesISawZeroJobsLeft = 0;
		try {
			do  {
				updateStatusLine();
				Thread.sleep(300);
				if (mediator.getNumberOfTrackedActivities() == 0) {
					timesISawZeroJobsLeft++;
				} else {
					timesISawZeroJobsLeft = 0;
				}
			} while (timesISawZeroJobsLeft < 2);

			if (IHamsterStartup.ONGOING_MEMENTO_FILE.exists()) {
				IHamsterStartup.ONGOING_MEMENTO_FILE.delete();
			}
			List<Link> retriableLinks = mediator.getRetriableLinks();
			if (!retriableLinks.isEmpty()) {
				Utils.writeMementoFile(mediator, IHamsterStartup.FINAL_MEMENTO_FILE);
				System.out.println("\n" + retriableLinks.size()
						+ " targets failed being downloaded due to what could be intermittent errors.\n"
						+ "    hamster retry info : more details\n"
						+ "    hamster retry      : make a new attempt on those targets\n"
						+ "    hamster dont retry : forget about it\n");
			} else {
				System.out.println("\nDone.\n");
			}
		} catch (InterruptedException e) {
		}
	}

	protected void loadConfiguration() {
		try {
			logger.trace("Reading configuration file");
			byte[] encoded = Files.readAllBytes(configFile.toPath());
			String configString = new String(encoded, StandardCharsets.UTF_8);

			configuration = new TextConfiguration(configString);
			logger.trace("Configuration successfully loaded");

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

	protected void updateStatusLine() {
		waiterSequenceStep++;
		waiterSequenceStep = waiterSequenceStep % waiterSequence.length;

		int jobsCount = mediator.getNumberOfTrackedActivities();
		int savedCount = mediator.getNumberOfFilesSaved();

		StringBuffer sb = new StringBuffer(80);
		sb.append("   ");
		if (mediator.isCriticallyLoaded()) {
			sb.append("TOO MUCH ! ");
		}
		sb.append(jobsCount);
		sb.append(" --> ");
		sb.append(savedCount);
		sb.append("       ");
		sb.append(waiterSequence[waiterSequenceStep]);

		sb.append("                                                                                ", 0,
				75 - sb.length());
		sb.append('\r');
		System.out.print(sb.toString());
	}

}
