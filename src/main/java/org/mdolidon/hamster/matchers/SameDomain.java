package org.mdolidon.hamster.matchers;

import org.mdolidon.hamster.configuration.BaseConfiguration;
import org.mdolidon.hamster.core.IMatcher;
import org.mdolidon.hamster.core.Link;

/**
 * Matches if a link's domain is the same as the configuration's start URL.
 *
 */
public class SameDomain implements IMatcher {

	private String startDomain = null;
	private BaseConfiguration configuration;

	public SameDomain(BaseConfiguration configuration) {
		this.configuration = configuration;

	}

	private void cacheStartDomain() {
		if (startDomain != null) {
			return;
		}
		startDomain = configuration.getStartUrl().getAuthority();
	}

	@Override
	public boolean matches(Link link) {
		// will match if the link is on the same domain as the job's starting URL
		cacheStartDomain();

		// getAuthority can return null
		if (startDomain.equals(link.getTarget().getAuthority())) {
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
