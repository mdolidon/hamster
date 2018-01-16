package org.mdolidon.hamster.core;

import java.io.File;
import java.net.URL;
import java.util.List;

import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.protocol.HttpClientContext;

/**
 * Defines a Hamster's job configuration. Configuration objects are intended to
 * be passive : they answer questions, but they don't take any initiative.
 * Everything here has to be thread-safe.
 * 
 */
public interface IConfiguration {

	/**
	 * Tells whether this configuration object can be used to run a job.
	 * 
	 * @return
	 */
	public boolean isValid();

	/**
	 * If the configuration is not valid, this should inform the user why.
	 * 
	 * @return
	 */
	public String getErrorMessage();

	/**
	 * Get the exploration's starting URL.
	 * 
	 * @return
	 */
	public URL getStartUrl();

	/**
	 * Get the exploration's starting URL as a readable String.
	 * 
	 * @return
	 */
	public String getStartUrlAsString();

	/**
	 * Ask the configuration to refer to a different starting URL. The intent of the
	 * method is to let a configuration be informed of the effective location of a
	 * starting page, after some active component went to check it.
	 * 
	 * @param url
	 */
	public void correctStartUrl(URL url);

	/**
	 * How many concurrent HTTP requests are allowed by this configuration.
	 * 
	 * @return
	 */
	public int getMaxConcurrentRequests();

	/**
	 * When given a Link object, this method responds whether that link's target is
	 * part of the overall target set (whatever distant stuff we'd like to replicate
	 * locally), and whether it should be downloaded. Both can be different for
	 * example in the case of an 'unknown ' rule. In normal use, this is meant
	 * to be called by link objects ; they cache the result.
	 * 
	 * @param link
	 * @return
	 */
	public TargetProfile getTargetProfile(Link link);

	/**
	 * Associates an offline location to a link. Two links with the same target URL
	 * must always end up being stored in the same file. In normal use, this method is 
	 * meant to be called by link objects ; they cache the result.
	 * 
	 * @param link
	 */
	public File getStorageFile(Link link);

	/**
	 * Whether the expected content size fits within our download rules.
	 * 
	 * @param link
	 * @return
	 */
	public boolean isAcceptableContentSize(Link link, long size);

	/**
	 * Return the list of matchers used to define authentication scopes. This list
	 * is intended to be used by active components that need to instanciate
	 * auth-scope-related components, such as AuthContextHolder.
	 * 
	 * @return
	 */
	public List<IMatcher> listAuthContextMatchers();

	/**
	 * Make an new HTTP context, inserting relevant authentication information into
	 * it, for a scope that's selected by the provided link.
	 * @param link
	 * 
	 * @return TODO
	 */
	public HttpClientContext makeHttpContext(Link link);

	/**
	 * Get a list of POST requests to be performed before any exploration. Those
	 * requests are likely to set up session cookies in the context used on
	 * exploration requests.
	 */
	public List<HttpPost> getCheckinPostRequests();
}
