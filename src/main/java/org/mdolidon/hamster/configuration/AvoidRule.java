package org.mdolidon.hamster.configuration;

import org.mdolidon.hamster.core.IMatcher;
import org.mdolidon.hamster.core.TargetProfile;

/**
 * An IDownloadRule which excludes all links passed to it.
 *
 */
public class AvoidRule extends AbstractDownloadRule {

	IMatcher matcher;

	public AvoidRule(IMatcher matcher) {
		super(matcher, "'avoid' rule", new TargetProfile(false, false));
	}

}
