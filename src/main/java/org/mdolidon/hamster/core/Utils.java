package org.mdolidon.hamster.core;

import java.io.IOException;
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


/**
 * A collection of small static helpers.
 *
 */
public class Utils {

	/**
	 * Get a reference version number, stored as /version.txt resource.
	 * @return
	 */
	public static String getVersion() {
		try {
			String version = IOUtils.resourceToString("/version.txt", StandardCharsets.UTF_8);
			return version;
		} catch (IOException e) {
			return "(could not read version info)";
		}
	}

	/**
	 * Get a license text, stored as /license.txt resource.
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
	 * Query a server, follow http redirections, and return the final place we ended up in.
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
	 * Return a transformed string, where all characters that are even half exotic are
	 * replaced by an underscore. Currently leaves only a to z, A to Z, 0 to 9 as well as dots. 
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

	private static URL getEffectiveURL(HttpRequestBase request, HttpClientContext context) throws Exception {
		URI effectiveUri = request.getURI();
		List<URI> locations = context.getRedirectLocations();
		if (locations != null) {
			effectiveUri = locations.get(locations.size() - 1);
		}

		return effectiveUri.toURL();
	}
}
