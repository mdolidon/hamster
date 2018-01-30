package org.mdolidon.hamster.configuration;

import java.io.File;
import java.net.URL;

import org.mdolidon.hamster.core.IMatcher;
import org.mdolidon.hamster.core.Link;
import org.mdolidon.hamster.core.Utils;

/**
 * An IStorageResolver implementation where all downloaded files end up into the
 * same directory, with short names that match the URL path's last part. Name
 * collisions are very likely if used improperly.
 */
public class BasenameStorageResolver implements IStorageResolver {

	private IMatcher matcher;
	private File underFolder;

	public BasenameStorageResolver(IMatcher matcher, String underFolderStr) {
		this.matcher = matcher;
		if (underFolderStr == null) {
			underFolder = new File("slugs");
		} else {
			underFolder = new File(underFolderStr.replace('/', File.pathSeparatorChar));
		}
	}

	@Override
	public boolean matches(Link link) {
		return matcher.matches(link);
	}

	@Override
	public File getStorageFile(Link link) {
		URL url = link.getTarget();
		String[] parts = url.getPath().split("/");
		String lastPart = parts[parts.length - 1];
		String fileNameStr = Utils.flattenSpecialChars(lastPart);
		return new File(underFolder, fileNameStr);
	}
}
