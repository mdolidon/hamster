package org.mdolidon.hamster.matchers;

import org.mdolidon.hamster.core.IMatcher;
import org.mdolidon.hamster.core.Link;

/**
 * Matches if the link is N vertices away or less from the starting point
 * in the exploration graph.
 *
 */
public class MaxJumps implements IMatcher {

	private int maxJumps;

	public MaxJumps(int maxJumps) {
		this.maxJumps = maxJumps;
	}

	@Override
	public boolean matches(Link link) {
		return link.getJumpsFromStartingURL() <= maxJumps;
	}

	@Override
	public String getDescription() {
		return "'" + maxJumps + " jumps and less' matcher";
	}
}
