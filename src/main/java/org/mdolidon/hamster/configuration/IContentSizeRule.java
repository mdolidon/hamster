package org.mdolidon.hamster.configuration;

import org.mdolidon.hamster.core.IMatcher;
import org.mdolidon.hamster.core.Link;

public interface IContentSizeRule extends IMatcher {

	public boolean isAcceptableContentSize(Link link, long size);

}
