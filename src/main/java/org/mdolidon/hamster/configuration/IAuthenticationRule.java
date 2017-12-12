package org.mdolidon.hamster.configuration;

import org.apache.http.client.protocol.HttpClientContext;
import org.mdolidon.hamster.core.IMatcher;


/**
 * Authentication rules can alter an HTTP context to fill it with
 * the adequate credentials (cookie, credential for http authentication,
 * IWA or anything else)
 */
public interface IAuthenticationRule extends IMatcher {
	
	/**
	 * Mutate the HTTP context that's passed, to fill it with
	 * the credentials that are carried by this particular rule.
	 * @param context
	 */
	public void applyToHttpContext(HttpClientContext context);

}
