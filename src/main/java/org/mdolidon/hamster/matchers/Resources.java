package org.mdolidon.hamster.matchers;

import org.mdolidon.hamster.core.IMatcher;
import org.mdolidon.hamster.core.Link;

/**
 * Matches if the link's target appears to be a useful resource,
 * such as CSS, Javascript, an image, a video, a sound file, a text file, a Flash app...
 *
 */
public class Resources implements IMatcher {

	private URLs extensionsMatcher;
	private Images imagesMatcher = new Images();

	public Resources() {
		try {
			extensionsMatcher = new URLs(
					".*\\.css|.*\\.js|.*\\.mp3|.*\\.ogg|.*\\.swf|.*\\.mov|.*\\.aif|.*\\.aiff|.*\\.aifc|.*\\.avi|.*\\.wav|.*\\.txt");
		} catch (Exception e) {
			System.err.println("!! bug : Resources matcher uses an invalid regex.");
		}
	}

	@Override
	public boolean matches(Link link) {
		return imagesMatcher.matches(link) || extensionsMatcher.matches(link);
	}
	
	@Override
	public String getDescription() {
		return "'resources' matcher";
	}
}
