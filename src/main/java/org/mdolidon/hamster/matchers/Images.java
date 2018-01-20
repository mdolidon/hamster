package org.mdolidon.hamster.matchers;

import org.mdolidon.hamster.core.IMatcher;
import org.mdolidon.hamster.core.Link;

/**
 * Matches images, as per resource extension as well as the link's image flag.
 *
 */
public class Images implements IMatcher {
	
	private String[] extensions = {"jpg","jpeg","gif","png"};
	private IMatcher extensionsMatcher = new URLExtensions(extensions);


	@Override
	public boolean matches(Link link) {
		return link.isFlag_image() || extensionsMatcher.matches(link);
	}
}
