package org.mdolidon.hamster.matchers;

import org.mdolidon.hamster.core.IMatcher;
import org.mdolidon.hamster.core.Link;

/**
 * Matches if its child matcher does not much, and the opposite.
 *
 */
public class Not implements IMatcher {

	private IMatcher matcher;

	public Not(IMatcher matcher) {
		if (matcher == null) {
			throw new NullPointerException("Tried to build a Not matcher object with a null child matcher");
		}
		this.matcher = matcher;
	}

	@Override
	public boolean matches(Link link) {
		return !matcher.matches(link);
	}
}
