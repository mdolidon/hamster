package org.mdolidon.hamster.configuration;

import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.mdolidon.hamster.core.IMatcher;
import org.mdolidon.hamster.core.Link;

/**
 * An IAuthenticationRule that provides Apache http credentials
 * with a user and a password.
 *
 */

public class SimpleAuthenticationRule implements IAuthenticationRule {

	private String user;
	private String password;
	private IMatcher matcher;


	public SimpleAuthenticationRule(String user, String password, IMatcher matcher) {
		this.matcher=matcher;
		this.user = user;
		this.password=password;
	}

	@Override
	public boolean matches(Link link) {
		return matcher.matches(link);
	}


	@Override
	public void applyToHttpContext(HttpClientContext context) {
		CredentialsProvider cp = new BasicCredentialsProvider();
		cp.setCredentials(AuthScope.ANY, new UsernamePasswordCredentials(user, password));
		context.setCredentialsProvider(cp);
	}
}
