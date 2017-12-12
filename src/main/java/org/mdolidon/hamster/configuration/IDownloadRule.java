package org.mdolidon.hamster.configuration;

import org.mdolidon.hamster.core.IMatcher;
import org.mdolidon.hamster.core.Link;
import org.mdolidon.hamster.core.TargetProfile;

/**
 * When a new link is discovered, the configuration object finds which the first
 * matching IDownloadRule. That rule decides whether the link should be queued
 * for download, or discarded.
 *
 */
public interface IDownloadRule extends IMatcher {

	public TargetProfile getTargetProfile(Link link);

}
