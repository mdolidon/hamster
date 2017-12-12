package org.mdolidon.hamster.startup;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * 
 * Embeds a child runnable. If the child throws a RuntimeException,
 * the exception is logged and the whole JVM is killed.
 *
 */
public class FailFastThreadWrapper implements Runnable {
	
	private Logger logger = LogManager.getLogger();
	private Runnable child;

	public FailFastThreadWrapper(Runnable child) {
		this.child = child;
	}

	@Override
	public void run() {
		try {
			if (child != null) {
				child.run();
			}
		} catch (RuntimeException e) {
			logger.error(
					"A worker thread died from an uncaught exception. Aborting. Please report this as a bug at https://github.com/mdolidon/hamster/issues",
					e);
			System.exit(1);
		}
	}
}