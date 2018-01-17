package org.mdolidon.hamster.configuration;

import java.io.File;

import org.mdolidon.hamster.core.IConfiguration;
import org.mdolidon.hamster.core.IMatcher;
import org.mdolidon.hamster.core.Link;
import org.mdolidon.hamster.core.Utils;

/**
 * An IStorageResolver implementation where all downloaded files end up into the
 * same directory, with long names that attempt to resolve ambiguities, apart of
 * the starting URL that is stored as "index.html".
 *
 */
public class FlatStorageResolver implements IStorageResolver {

	private IConfiguration configuration;
	private IMatcher matcher;
	private File underFolder;
	private String startUrlStr;

	public FlatStorageResolver(IMatcher matcher, IConfiguration configuration, String underFolderStr) {
		this.configuration = configuration;
		this.matcher = matcher;
		if (underFolderStr == null) {
			underFolder = new File("hamstered_flat");
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
		cacheStartUrlStr();
		String urlStr = link.getTargetAsStringWithoutHash();
		if (urlStr.equals(startUrlStr)) {
			return new File("index.html");
		}

		String fileNameStr = Utils.flattenSpecialChars(urlStr);
		return new File(underFolder, fileNameStr);
	}

	private void cacheStartUrlStr() {
		if (startUrlStr == null) {
			startUrlStr = Utils.getBeforeHash(configuration.getStartUrlAsString());
		}
	}
}
