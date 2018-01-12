package org.mdolidon.hamster.core;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.charset.StandardCharsets;

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
}
