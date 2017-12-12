package org.mdolidon.hamster.configuration;

import java.io.File;

import org.mdolidon.hamster.core.IMatcher;
import org.mdolidon.hamster.core.Link;

/**
 * Storage resolvers can map an URL to a local file path for offline storage.
 *
 */
public interface IStorageResolver extends IMatcher {

	/**
	 * Associate the link to an offline location determined by this particular
	 * resolver's policy.
	 * 
	 * @param link
	 */
	public File getStorageFile(Link link);

}
