package org.mdolidon.hamster.matchers;

import org.jsoup.nodes.Element;
import org.mdolidon.hamster.core.IMatcher;
import org.mdolidon.hamster.core.Link;

/**
 * Matches if a link's source element corresponds to a CSS selector.
 *
 */
public class Css implements IMatcher {

	String selector;

	public Css(String selector) {
		this.selector = selector;
	}

	@Override
	public boolean matches(Link link) {
		Element sourceElement = link.getSourceElement();
		if(sourceElement==null) {
			
			// we don't want this matcher to raise an exception if called without a
			// JSOUP element. We may run a whole array of matchers on links that
			// were not extracted from HTML in the first place (CSS import for example)
			// and one or several CSS matchers may be among them.
			return false; 
		}
		return sourceElement.is(selector);
	}
}
