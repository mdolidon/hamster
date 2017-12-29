package org.mdolidon.hamster.configuration;

import org.mdolidon.hamster.core.IMatcher;
import org.mdolidon.hamster.core.TargetProfile;

/**
 * An IDownloadRule which fully includes all links passed to it (part of target
 * set, and need to download).
 */

public class GetRule extends AbstractDownloadRule {

	public GetRule(IMatcher matcher) {
		super(matcher, "'get' rule", new TargetProfile(true, true));
	}
}
