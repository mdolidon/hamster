package org.mdolidon.hamster.core;

import java.io.File;
import org.apache.commons.io.FileUtils;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;

import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * A collection of small static helpers.
 *
 */
public class Utils {

	private static Logger logger = LogManager.getLogger();

	/**
	 * Get a reference version number, stored as /version.txt resource.
	 * 
	 * @return
	 */
	public static String getHamsterVersion() {
		try {
			String version = IOUtils.resourceToString("/version.txt", StandardCharsets.UTF_8);
			return version;
		} catch (IOException e) {
			return "(could not read version info ; may be a development version)";
		}
	}

	/**
	 * Get a license text, stored as /license.txt resource.
	 * 
	 * @return
	 */
	public static String getHamsterLicense() {
		try {
			String version = IOUtils.resourceToString("/license.txt", StandardCharsets.UTF_8);
			return version;
		} catch (IOException e) {
			return "(could not read license info)";
		}
	}

	/**
	 * Read a file as a string or return null if any error occured.
	 */
	public static String slurpFileOrNull(String fileName) {
		File file = new File(fileName);
		try {
			return FileUtils.readFileToString(file, StandardCharsets.UTF_8);
		} catch (Exception e) {
			logger.warn("An error occured while trying to read {} : {}", fileName, e.toString());
			return null;
		}
	}

	/**
	 * Removes the first # in a string, and anything that follows.
	 * 
	 * @param str
	 * @return
	 */
	public static String getBeforeHash(String str) {
		int i = str.indexOf('#');

		if (i < 0) {
			return str;
		} else {
			return str.substring(0, i);
		}
	}

	/**
	 * Return a transformed string, where all characters that are even half exotic
	 * are replaced by an underscore. Currently leaves only a to z, A to Z, 0 to 9
	 * as well as dots.
	 * 
	 * @param in
	 * @return
	 */
	public static String flattenSpecialChars(String in) {
		byte[] b = in.getBytes();
		for (int i = 0; i < b.length; i++) {
			if (!((b[i] >= 'A' && b[i] <= 'Z') || (b[i] >= 'a' && b[i] <= 'z') || (b[i] >= '0' && b[i] <= '9')
					|| b[i] == '.' || b[i] == '-')) {
				b[i] = '_';
			}
		}
		return new String(b);
	}

	public static Serializable loadSerializedObject(File file, String messageIfNoFileFound) throws Exception {
		try {
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);

			try {
				logger.info("Reading snapshot file");
				Serializable liveObject = (Serializable) ois.readObject();
				return liveObject;

			} catch (ClassNotFoundException e) {
				throw new Exception("Can not deserialize the snapshot : class not found exception.");
			} finally {
				ois.close();
			}
		} catch (FileNotFoundException e) {
			throw new Exception(messageIfNoFileFound);
		} catch (IOException e) {
			throw new Exception("Can not read file " + file);
		}
	}

	public static void persistSerializableObject(Serializable memento, File file) {
		// There must be a nicer way than this horrible cascade of try/catch...

		FileOutputStream fos;
		ObjectOutputStream oos;

		try {
			fos = new FileOutputStream(file);
		} catch (IOException e) {
			logger.error("Could open file stream to {}", file);
			return;
		}

		try {
			oos = new ObjectOutputStream(fos);
		} catch (IOException e) {
			logger.error("Could not open object stream to {}", file);
			try {
				fos.close();
			} catch (IOException inner_e) {
			}
			return;
		}

		try {
			oos.writeObject(memento);
			oos.close();
			logger.info("Memento successfully written to {}", file);
		} catch (IOException e) {
			try {
				oos.close();
			} catch (IOException inner_e) {
			}
			logger.error("Could not write file {} ; cause : {}", file, e);
		}
	}

	// UI components may want to refer to the snapshot file
	// This is a bit simple and brutal, but if one day we want a variable name, the
	// change is easy enough to make.
	public static final File ONGOING_MEMENTO_FILE = new File("hamster.memento");
	public static final File FINAL_MEMENTO_FILE = new File("hamster.retry");

	/**
	 * Get a relative href for "to" as seen from "from". The arguments are intended
	 * to be files for offline storage, whose relative location needs to be
	 * expressed as URLs in href / src attributes.
	 */
	public static String getRelativeHref(File from, File to) {
		Path p1 = from.toPath();
		Path p2 = to.toPath();
		Path pp1 = p1.getParent();

		if (pp1 == null) {
			return pathToHref(p2);
		} else {
			try {
				return pathToHref(pp1.relativize(p2));
			} catch (IllegalArgumentException e) {
				logger.warn("Could not find relative path from {} to {}", p1, p2);
				return pathToHref(p2);
			}
		}

	}

	private static String pathToHref(Path path) {
		// Testing File.pathSeparatorChar was apparently not enough to prevent
		// a Windows-running instance to put antislashes in the resulting html.
		// Therefore I take this more brutal approach.
		// It should not result in any other bugs, since antislashes are not a
		// valid character in URLs.

		return path.toString().replace('\\', '/');

	}

}
