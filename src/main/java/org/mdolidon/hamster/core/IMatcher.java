package org.mdolidon.hamster.core;


/**
 * Matchers are the fundamental building-block to decide what to do
 * with each link that's discovered. Most configuration rules are parametrized
 * by matchers. When given a link, a matcher simply tells whether it applies to this
 * link or not. 
 */
public interface IMatcher {

	/**
	 * Tells whether a link is within this object's scope of action, or not.
	 * @param link
	 * @return
	 */
	public boolean matches(Link link);
	
	/**
	 * Give a friendly description of the object (mostly for debugging purposes).
	 * @return
	 */
	public String getDescription();
	

}
