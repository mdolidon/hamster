package org.mdolidon.hamster.configuration;

import java.io.File;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.mdolidon.hamster.core.IMatcher;
import org.mdolidon.hamster.core.Link;
import org.mdolidon.hamster.core.Utils;

/**
 * This IStorageResolver implementation maps URLs to a file tree structure that
 * attempts to mirror the content's online location, while doing best efforts to
 * prevent name conflicts between files and directories.
 *
 */
public class TreeStorageResolver implements IStorageResolver {

	private IMatcher matcher;
	private File underFolder;

	// matches file.groovy / index.html / main.c / macro.m4
	// does not match .hidden / folder / 1.4.2
	private Pattern hasExtensionPattern = Pattern.compile(".+\\.[a-zA-Z][a-zA-Z0-9]{0,5}$");

	// Any final path part with the following extension will be added an .html
	// extension.
	// This list is somewhat dangerous. Put as few extensions in it as possible, to
	// keep
	// files' nature recognizable.
	// PHP dudes often do this :
	// have an index.php, and also use index.php/stuff instead of index.php?stuff=1
	// They're crazy. ;)
	private String[] forceHtmlExtension = { ".php" };

	public TreeStorageResolver(IMatcher matcher, String underFolderStr) {
		this.matcher = matcher;
		if (underFolderStr == null) {
			underFolder = new File(".");
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
		String urlStr = link.getTargetAsStringWithoutHash();
		return getUrlPathAsFile(urlStr);
	}

	/*
	 * This mapping policy is rather complex. You can look at the unit tests to
	 * understand it by examples.
	 */

	private File getUrlPathAsFile(String urlStr) {
		urlStr = urlStr.replace("://", "_"); // for the final split, we can keep protocol and domain together
		urlStr = urlStr.replaceAll("/+", "/"); // sanitize
		String[] parts = urlStr.split("/"); // remember, trailing empty strings are discarded by split

		parts[0] = parts[0].replace('.', '_'); // domain names always have extensions ; get rid of them

		/*
		 * We don't remove the dots on the intermediate names. We risk a name collision
		 * between a file and a folder, but if we did remove dots we'd break
		 * compatibility on some frequent path hierarchies, such as when hamstering a
		 * Maven repository.
		 */

		File targetFile = underFolder;
		for (int i = 0; i < parts.length; i++) {
			// walk on top of the previous position of targetFile, and descend into the
			// final directory
			targetFile = new File(targetFile, Utils.flattenSpecialChars(parts[i]));
		}

		/*
		 * The trap we're attempting to avoid is a similar name being both a file and a
		 * folder. Example : github.com/mdolidon and github.com/mdolidon/hamster : is
		 * mdolidon meant to be mapped to a file or to a directory ?
		 * 
		 */

		String finalPart = parts[parts.length - 1];
		if (mayCollideWithDirectoryName(finalPart)) {
			targetFile = new File(targetFile, "index.html");
		}

		return targetFile;
	}

	private boolean mayCollideWithDirectoryName(String name) {
		if (hasForcedHtmlExtension(name)) {
			return true;
		} else {
			Matcher m = hasExtensionPattern.matcher(name);
			if (!m.matches()) {
				return true;
			}
		}
		return false;
	}

	private boolean hasForcedHtmlExtension(String name) {
		for (int i = 0; i < forceHtmlExtension.length; i++) {
			if (name.endsWith(forceHtmlExtension[i])) {
				return true;
			}
		}
		return false;
	}
}
