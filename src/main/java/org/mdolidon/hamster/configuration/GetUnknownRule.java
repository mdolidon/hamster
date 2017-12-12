package org.mdolidon.hamster.configuration;

import org.mdolidon.hamster.core.IMatcher;
import org.mdolidon.hamster.core.Link;
import org.mdolidon.hamster.core.TargetProfile;

/**
 * An IDownloadRule which fully includes all links passed to it (part of target
 * set, and need to download).
 */

public class GetUnknownRule extends AbstractDownloadRule {

	IMatcher matcher;
	TargetProfile profile_unknownTarget = new TargetProfile(true, true);
	TargetProfile profile_knownTarget = new TargetProfile(true, false);

	public GetUnknownRule(IMatcher matcher) {
		super(matcher, "'get unknown' rule", null);
	}
	
	@Override
	public TargetProfile getTargetProfile(Link link) {
		if(link.getStorageFile().exists()) {
			return profile_knownTarget;
		} else {
			return profile_unknownTarget;
		}
	}
}
