package org.mdolidon.hamster.configuration;

import java.io.File;

import org.mdolidon.hamster.core.Link;
import org.mdolidon.hamster.matchers.URLs;

/**
 * An IStorageResolver implementation that lets the user define accurate mappings
 * between URLs and offline files, by capturing groups in regular expressions.
 *
 */
public class RegexStorageResolver implements IStorageResolver {

	private URLs matcher;
	private String template;

	public RegexStorageResolver(URLs urlMatcher, String replacementTemplate) {
		// TODO validate input !
		matcher = urlMatcher;
		template = replacementTemplate;
	}

	@Override
	public boolean matches(Link link) {
		return matcher.matches(link);
	}

	@Override
	public File getStorageFile(Link link) {
		URLs.MatchDetails md = matcher.matchWithDetails(link);
		if (!md.isMatch()) {
			throw new RuntimeException("RegexStorageResolver asked to resolve a link it did not match");
		}
		String path = md.runTemplate(template);
		String[] pathElements = path.split("/");

		File file = new File(pathElements[0]);
		for (int i = 1; i < pathElements.length; i++) {
			file = new File(file, pathElements[i]);
		}
		return file;
	}

}
