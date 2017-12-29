package org.mdolidon.hamster.core;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.URI;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.List;

import org.apache.commons.io.IOUtils;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
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
	public static String getVersion() {
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
	public static String getLicense() {
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
	 * Query a server, follow http redirections, and return the final place we ended
	 * up in.
	 * 
	 * @param target
	 * @param context
	 * @return
	 * @throws Exception
	 */
	public static URL fetchEffectiveURL(URL target, HttpClientContext context) throws Exception {
		try {
			CloseableHttpClient httpclient = HttpClients.createDefault();
			HttpGet httpGet = new HttpGet(target.toURI());
			CloseableHttpResponse response = httpclient.execute(httpGet, context);

			try {
				int code = response.getStatusLine().getStatusCode();
				if (code >= 300) {
					throw new Exception("Got status " + code + " when checking effective location of " + target);
				}
				return getEffectiveURL(httpGet, context);
			} finally {
				response.close();
			}
		} catch (Exception e) {
			throw new Exception(e.getMessage());
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

	
	
	public static void loadMementoFile(IMediator mediator, File file, String messageIfNoFileFound) throws Exception {
		try {
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);

			try {
				logger.info("Reading snapshot file");
				Serializable memento = (Serializable) ois.readObject();

				logger.trace("Injecting memento into mediator");
				mediator.resetFromMemento(memento);
			} catch (ClassNotFoundException e) {
				throw new Exception("Can not deserialize the snapshot : class not found exception.");
			} catch (InterruptedException e) {
			} finally {
				ois.close();
			}
		} catch (FileNotFoundException e) {
			throw new Exception(messageIfNoFileFound);
		} catch (IOException e) {
			throw new Exception("Can not read file " + file);
		}
	}
	
	
	/**
	 * Asks a mediator for its memento, and streams it to a file as a Java
	 * serialized object. The method takes care of opening and closing the file.
	 * 
	 * @param mediator
	 * @param file
	 */
	public static void writeMementoFile(IMediator mediator, File file) {
		// There must be a nicer way than this horrible cascade of try/catch...

		FileOutputStream fos;
		ObjectOutputStream oos;
		Serializable memento;
		try {

			logger.trace("Requesting memento");
			memento = mediator.getMemento();
			logger.trace("Got memento");
		} catch (InterruptedException e) {
			return;
		}

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

	private static URL getEffectiveURL(HttpRequestBase request, HttpClientContext context) throws Exception {
		URI effectiveUri = request.getURI();
		List<URI> locations = context.getRedirectLocations();
		if (locations != null) {
			effectiveUri = locations.get(locations.size() - 1);
		}

		return effectiveUri.toURL();
	}
}
