package org.mdolidon.hamster.matchers;

import java.net.URL;

import org.mdolidon.hamster.configuration.BaseConfiguration;
import org.mdolidon.hamster.core.IMatcher;
import org.mdolidon.hamster.core.Link;

import java.net.URI;
import java.net.URISyntaxException;

/**
 * Matches if a link's URL is a child path of the configuration's start URL.
 *
 */
public class Subpaths implements IMatcher {

	private URI startURI = null;
	private BaseConfiguration configuration;

	public Subpaths(BaseConfiguration configuration) {
		this.configuration = configuration;

	}

	private void cacheStartURI() {
		if (startURI != null) {
			return;
		}
		URL startURL = configuration.getStartUrl();
		try {
			startURI = startURL.toURI();
		} catch (URISyntaxException e) {
		}
	}

	@Override
	public boolean matches(Link link) {
		// will match if the link is a subpath of the job's starting URL

		cacheStartURI();
		try {
			URI linkURI = link.getTarget().toURI();
			URI relativeLinkURI = startURI.relativize(linkURI);
			if (relativeLinkURI.toString().equals(linkURI.toString())) {
				// If the returned relative uri is similar to the link initially given, it means
				// that it could not be put in relative form ; relativize does never return
				// links starting with "../". Therefore it means that the link is not a subpath 
				// of the starting url.
				return false;
			} else {
				return true;
			}
		} catch (URISyntaxException e) {
			return false;
		}
	}

	@Override
	public String getDescription() {
		return "'subpaths' matcher";
	}

}
