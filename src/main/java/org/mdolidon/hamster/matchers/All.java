package org.mdolidon.hamster.matchers;

import org.mdolidon.hamster.core.IMatcher;
import org.mdolidon.hamster.core.Link;

/**
 * Always matches.
 *
 */
public class All implements IMatcher {

	@Override
	public boolean matches(Link link) {
    	return true;
	}

	@Override
	public String getDescription() {
		return "'all' matcher";
	}
	
}
