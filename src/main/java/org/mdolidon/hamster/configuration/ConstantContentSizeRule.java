package org.mdolidon.hamster.configuration;

import org.mdolidon.hamster.core.IMatcher;
import org.mdolidon.hamster.core.Link;

public class ConstantContentSizeRule implements IContentSizeRule {

	private long maxSize;
	private IMatcher matcher;

	public ConstantContentSizeRule(long maxSize, IMatcher matcher) {
		this.maxSize = maxSize;
		this.matcher = matcher;
	}

	@Override
	public boolean matches(Link link) {
		return matcher.matches(link);
	}

	@Override
	public String getDescription() {
		return "description is deprecated... will disappear soon";
	}

	@Override
	public boolean isAcceptableContentSize(Link link, long size) {
		return size <= maxSize;
	}
}
