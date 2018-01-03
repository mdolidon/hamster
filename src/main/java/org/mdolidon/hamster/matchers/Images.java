package org.mdolidon.hamster.matchers;

import org.mdolidon.hamster.core.IMatcher;
import org.mdolidon.hamster.core.Link;

/**
 * Matches images, as per resource extension as well as the link's image flag.
 *
 */
public class Images implements IMatcher {

	private URLs extensionsMatcher;

	public Images() {
		try {

			extensionsMatcher = new URLs(".*\\.jpg|.*\\.jpeg|.*\\.gif|.*\\.png", true); // true : ignore case

		} catch (Exception e) {
			System.err.println("!! bug : Images matcher uses an invalid regex.");
		}
	}

	@Override
	public boolean matches(Link link) {
		return link.isFlag_image() || extensionsMatcher.matches(link);
	}

	@Override
	public String getDescription() {
		return "'images' matcher";
	}
}
