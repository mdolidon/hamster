package org.mdolidon.hamster.matchers;

import org.mdolidon.hamster.core.IMatcher;
import org.mdolidon.hamster.core.Link;

/**
 * Matches if the link's target appears to be a useful resource, such as CSS,
 * Javascript, an image, a video, a sound file, a text file, a Flash app...
 *
 */
public class Resources implements IMatcher {
	private String[] extensions = {"css","js","mp3","ogg","swf","mov","aif","aiff","aifc","avi","wav","txt"};
	private IMatcher extensionsMatcher= new URLExtensions(extensions);
	private IMatcher imagesMatcher = new Images();

	@Override
	public boolean matches(Link link) {
		return imagesMatcher.matches(link) || extensionsMatcher.matches(link);
	}
}
