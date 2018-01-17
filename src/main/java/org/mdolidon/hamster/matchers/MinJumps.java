package org.mdolidon.hamster.matchers;

import org.mdolidon.hamster.core.IMatcher;
import org.mdolidon.hamster.core.Link;

/**
 * Matches if the link is N vertices away or more from the starting point
 * in the exploration graph.
 *
 */

public class MinJumps implements IMatcher {

	private int minJumps;

	public MinJumps(int minJumps) {
		this.minJumps = minJumps;
	}

	@Override
	public boolean matches(Link link) {
		return link.getJumpsFromStartingURL() >= minJumps;
	}
}
