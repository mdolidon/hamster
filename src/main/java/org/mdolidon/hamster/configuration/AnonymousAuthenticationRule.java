package org.mdolidon.hamster.configuration;

import org.apache.http.client.protocol.HttpClientContext;
import org.mdolidon.hamster.core.IMatcher;
import org.mdolidon.hamster.core.Link;

/**
 * An IAuthenticationRule that does nothing.
 *
 */

public class AnonymousAuthenticationRule implements IAuthenticationRule {

	
	private IMatcher matcher;
	
	public AnonymousAuthenticationRule(IMatcher matcher) {
		this.matcher = matcher;
		
	}
	
	@Override
	public String getDescription() {
		return "Anonymous authentication on " + matcher.getDescription();
	}

	@Override
	public boolean matches(Link link) {
		return matcher.matches(link);
	}

	@Override
	public void applyToHttpContext(HttpClientContext context) {
		// noop here		
	}

}
