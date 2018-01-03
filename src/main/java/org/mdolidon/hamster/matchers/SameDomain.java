package org.mdolidon.hamster.matchers;

import org.mdolidon.hamster.core.IConfiguration;
import org.mdolidon.hamster.core.IMatcher;
import org.mdolidon.hamster.core.Link;

/**
 * Matches if a link's domain is the same as the configuration's start URL.
 * Matches provided the main domain is the same. Protocol and port can differ.
 * The subdomain can not be different (it would be too easy to get fooled by
 * faked domains).
 *
 */
public class SameDomain implements IMatcher {

	private String startDomain = null;
	private IConfiguration configuration;

	public SameDomain(IConfiguration configuration) {
		this.configuration = configuration;
	}


	private String getStartDomain() {
		if (startDomain == null) {
			startDomain = configuration.getStartUrl().getHost();
		}
		return startDomain;
	}

	@Override
	public boolean matches(Link link) {
		// getHost can return null
		if (getStartDomain().equals(link.getTargetDomain())) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String getDescription() {
		return "'domain' matcher";
	}
}
