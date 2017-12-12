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
			throw new RuntimeException("Tried to use a CSS matcher while the link was not bound to its source element.");
		}
		return sourceElement.is(selector);
	}

	@Override
	public String getDescription() {
		return "'css' matcher, looking for '" + selector + "'";
	}
}
