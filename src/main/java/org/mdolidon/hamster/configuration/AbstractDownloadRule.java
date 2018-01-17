package org.mdolidon.hamster.configuration;

import org.mdolidon.hamster.core.IMatcher;
import org.mdolidon.hamster.core.Link;
import org.mdolidon.hamster.core.TargetProfile;

public abstract class AbstractDownloadRule implements IDownloadRule {

	IMatcher matcher;
	TargetProfile constantTargetProfile;
	String name;

	public AbstractDownloadRule(IMatcher matcher, String name, TargetProfile constantTargetProfile) {
		this.matcher = matcher;
		this.name = name;
		this.constantTargetProfile = constantTargetProfile;
	}

	@Override
	public boolean matches(Link link) {
		return matcher.matches(link);
	}

	@Override
	public TargetProfile getTargetProfile(Link link) {
		return constantTargetProfile;
	}
}
