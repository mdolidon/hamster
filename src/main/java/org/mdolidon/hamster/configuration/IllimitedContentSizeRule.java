package org.mdolidon.hamster.configuration;

import org.mdolidon.hamster.core.IMatcher;
import org.mdolidon.hamster.core.Link;

public class IllimitedContentSizeRule implements IContentSizeRule {


	private IMatcher matcher;

	public IllimitedContentSizeRule(IMatcher matcher) {
		this.matcher = matcher;
	}

	@Override
	public boolean matches(Link link) {
		return matcher.matches(link);
	}


	@Override
	public String getDescription() {
		return "description will be deprecated...";
	}

	@Override
	public boolean isAcceptableContentSize(Link link, long size) {
		return true;
	}

}
