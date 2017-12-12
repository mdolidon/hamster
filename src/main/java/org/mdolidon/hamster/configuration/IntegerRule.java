package org.mdolidon.hamster.configuration;

import org.mdolidon.hamster.core.IMatcher;
import org.mdolidon.hamster.core.Link;


/**
 * A class with an IMatcher interface and an int payload.
 *
 */
public class IntegerRule implements IMatcher {

	private IMatcher matcher;
	private int value;

	public IntegerRule(IMatcher matcher, int value) {
		this.value = value;
		this.matcher = matcher;
	}

	public int intValue() {
		return value;
	}
	
	@Override
	public boolean matches(Link link) {
		return matcher.matches(link);
	}

	@Override
	public String getDescription() {
		return "number " + value + " on " + matcher.getDescription();
	}

}
