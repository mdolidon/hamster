package org.mdolidon.hamster.matchers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.mdolidon.hamster.core.IMatcher;
import org.mdolidon.hamster.core.Link;

/**
 * Matches on an array of file name extensions. I have chosen not to make this
 * matcher accessible through the configuration language yet, though this may
 * change in the future if it turns out to be useful. For now it is used as a
 * slave by other master matchers.
 *
 *
 */
public class URLExtensions implements IMatcher {
	private static Logger logger = LogManager.getLogger();

	private IMatcher innerMatcher;

	/**
	 * Extensions is the array of extensions to match, without the leading dot, and
	 * without caring about upper or lower case.
	 * 
	 */
	public URLExtensions(String[] extensions) {
		String[] regexParts = new String[extensions.length];
		for (int i = 0; i < extensions.length; i++) {
			regexParts[i] = "\\." + extensions[i];
		}
		String regexStr = ".*(?:" + String.join("|", regexParts) + ")(?:\\?.*)?";
		try {
			innerMatcher = new URLs(regexStr, true);
		} catch (Exception e) {
			logger.error("Error while constructing inner URLs matcher : {}", e);
		}
	}

	@Override
	public boolean matches(Link link) {
		if (innerMatcher == null) {
			return false;
		}
		return innerMatcher.matches(link);
	}

}
