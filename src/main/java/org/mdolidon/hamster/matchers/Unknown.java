package org.mdolidon.hamster.matchers;

import org.mdolidon.hamster.core.IMatcher;
import org.mdolidon.hamster.core.Link;

/**
 * Matches if the child matcher matches and the offline storage file does not
 * yet exist.
 *
 */
public class Unknown implements IMatcher {

	private IMatcher childMatcher;

	public Unknown(IMatcher childMatcher) {
		this.childMatcher = childMatcher;
	}

	@Override
	public boolean matches(Link link) {
		if (!childMatcher.matches(link)) {
			return false;
		}
		if (link.getStorageFile().exists()) {
			return false;
		}
		return true;
	}
}
