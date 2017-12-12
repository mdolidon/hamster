package org.mdolidon.hamster.matchers;

import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

import org.mdolidon.hamster.core.IMatcher;
import org.mdolidon.hamster.core.Link;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;

/**
 * Matches if the link's URL matches a regular expression passed in the constructor.
 *
 */
public class URLs implements IMatcher {

	private Pattern pattern;
	private String patternString;

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

		public List<String> getGroups() {
			List<String> groups = new ArrayList<>(3);
			groups.add("");
			if (isMatch) {
				int groupCount = regexMatcher.groupCount(); // ditch group 0 (full match)
				for (int i = 1; i <= groupCount; i++) {
					groups.add(regexMatcher.group(i));
				}
			}
			return groups;
		}
		
		public String runTemplate(String template) {
			return regexMatcher.replaceFirst(template);
		}
	}

	public URLs(String patternString) throws Exception {
		this.patternString = patternString;
		try {
			pattern = Pattern.compile(patternString);
		} catch (PatternSyntaxException e) {
			throw new Exception(patternString + " : invalid URL regex pattern.");
		}
	}

	@Override
	public boolean matches(Link link) {
		MatchDetails md = new MatchDetails(link);
		return md.isMatch();
	}

	@Override
	public String getDescription() {
		return "'urls' matcher on \"" + patternString + "\"";
	}

	public MatchDetails matchWithDetails(Link link) {
		return new MatchDetails(link);
	}
}
