package org.mdolidon.hamster.matchers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

import org.mdolidon.hamster.core.IMatcher;
import org.mdolidon.hamster.core.Link;

/**
 * Matches if the link's URL matches a regular expression passed in the
 * constructor.
 *
 */
public class URLs implements IMatcher {

	private Pattern pattern;

	public class MatchDetails {

		private boolean isMatch;
		private Matcher regexMatcher;

		public MatchDetails(Link link) {
			String urlStr = link.getTargetAsStringWithoutHash();
			regexMatcher = pattern.matcher(urlStr);
			isMatch = regexMatcher.matches();
		}

		public boolean isMatch() {
			return isMatch;
		}


		public String runTemplate(String template) {
			return regexMatcher.replaceFirst(template);
		}
	}

	// Main public constructor
	public URLs(String patternString) throws Exception {
		this(patternString, false);
	}

	// More specialized constructor for knowledgeable clients
	public URLs(String patternString, boolean ignoreCase) throws Exception {
		try {
			int flags = 0;
			if(ignoreCase) {
				flags = Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE;
			}
			pattern = Pattern.compile(patternString, flags);
		} catch (PatternSyntaxException e) {
			throw new Exception(patternString + " : invalid URL regex pattern.");
		}
	}

	@Override
	public boolean matches(Link link) {
		MatchDetails md = new MatchDetails(link);
		return md.isMatch();
	}

	public MatchDetails matchWithDetails(Link link) {
		return new MatchDetails(link);
	}
}
