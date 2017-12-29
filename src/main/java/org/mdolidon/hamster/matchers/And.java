package org.mdolidon.hamster.matchers;

import org.mdolidon.hamster.core.IMatcher;
import org.mdolidon.hamster.core.Link;

/**
 * Matches a link if two other matchers both match that link.
 *
 */
public class And implements IMatcher {

	private IMatcher m1;
	private IMatcher m2;

	public And(IMatcher m1, IMatcher m2) {
		if (m1 == null || m2 == null) {
			throw new NullPointerException("Tried to build an And matcher object with a null child matcher");
		}
		this.m1 = m1;
		this.m2 = m2;
	}

	@Override
	public boolean matches(Link link) {
		return m1.matches(link) && m2.matches(link);
	}

	@Override
	public String getDescription() {
		return "(" + m1.getDescription() + " AND " + m2.getDescription() + ")";
	}
}
