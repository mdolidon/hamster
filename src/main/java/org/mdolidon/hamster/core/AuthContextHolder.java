package org.mdolidon.hamster.core;

import org.apache.http.client.protocol.HttpClientContext;



/**
 * 
 * A place to store an HTTP Context. The context typically contains
 * authentication information, which can be persisted across requests
 * to prevent going through an authentication process for every request.
 * 
 * The context is thread-local.
 * 
 * AuthContextHolders implement the IMatcher interface, and will thus
 * be associated to a user-defined scope.
 *
 */
public class AuthContextHolder implements IMatcher {
	
	private IMatcher matcher;
	private IConfiguration configuration;
	private ThreadLocal<HttpClientContext> threadContext = new ThreadLocal<>();

	public AuthContextHolder(IMatcher matcher, IConfiguration configuration) {
		this.matcher = matcher;
		this.configuration = configuration;
	}


	@Override
	public boolean matches(Link link) {
		return matcher.matches(link);
	}


	/**
	 * Get this thread's context, as stored within this holder.
	 * When first called, the holder will refer to the IConfiguration object
	 * to create the applicable initial context for this link (e.g. to insert the proper
	 * user and password, cookies...).
	 */
	public HttpClientContext getThreadContext(Link link) {
		if(!matches(link)) {
			throw new RuntimeException("BUG : an AuthContextHolder was requested for a link that's outside of its scope.");
		}
		HttpClientContext context = threadContext.get();
		if (context != null) {
			return context;
		}

		context = configuration.makeHttpContext(link);
		return context;
	}
	
	/**
	 * Store back a context after requests were done.
	 */
	public void setThreadContext(HttpClientContext context) {
		threadContext.set(context);
	}
}
