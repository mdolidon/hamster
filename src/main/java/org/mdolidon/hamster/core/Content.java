package org.mdolidon.hamster.core;

import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

import org.mdolidon.hamster.matchers.URLExtensions;

/**
 * 
 * Content objects will contain whatever data was downloaded from a given source
 * : HTML pages, images, CSS...
 *
 * 
 */
public class Content implements IMementoElement {

	private static final long serialVersionUID = 1L;

	private static String[] cssExtStr = { "css" };
	private static IMatcher cssExt = new URLExtensions(cssExtStr);

	private Link sourceLink;
	private String mimeType;
	private byte[] bytes;
	private URL effectiveLocation;

	private static String bigHtmlOpener = "<HTML";
	private static String smallHtmlOpener = "<html";

	public Content(Link link) {
		if (link == null) {
			throw new NullPointerException();
		}
		sourceLink = link;
	}

	@Override
	public int hashCode() {
		return sourceLink.hashCode();
	}

	@Override
	public Content cryogenize() {
		Content copy = new Content((Link) sourceLink.cryogenize());
		copy.setBytes(bytes.clone());
		try {
			if (effectiveLocation != null) {
				copy.setEffectiveLocation(new URL(effectiveLocation.toString()));
			}
		} catch (MalformedURLException e) {
			// no way ; I just do this to go around URL's lack of .clone method
		}
		copy.setMimeType(mimeType);
		return copy;
	}

	/**
	 * Set the configuration that the embedded link refers to. This is needed after
	 * deserializing, to make objects fully operational again.
	 * 
	 * @param configuration
	 */
	public void setConfiguration_afterDeserialization(IConfiguration configuration) {
		sourceLink.setConfiguration_afterDeserialization(configuration);
	}

	/**
	 * 
	 * @return the link from which this content was created
	 */

	public Link getSourceLink() {
		return sourceLink;
	}

	/**
	 * @return the MIME type string for this content. May be null.
	 */
	public String getMimeType() {
		return mimeType;
	}

	/**
	 * Indicate this content's MIME type string.
	 * 
	 * @param mimeType
	 */
	public void setMimeType(String mimeType) {
		this.mimeType = mimeType;
	}

	/**
	 * 
	 * @return the content's raw data.
	 */
	public byte[] getBytes() {
		return bytes;
	}

	/**
	 * Change the content's raw data. This can be used when rewriting content for
	 * offline usage.
	 * 
	 * @param content
	 *            The new data.
	 */
	public void setBytes(byte[] content) {
		this.bytes = content;
	}

	/**
	 * 
	 * @return The content's actual URL, after redirections occurred. May be null if
	 *         the content creator did not bother to provide it.
	 */
	public URL getEffectiveLocation() {
		return effectiveLocation;
	}

	/**
	 * Tell this content where it actually comes from, after redirections occured.
	 * 
	 * @param effectiveLocation
	 */
	public void setEffectiveLocation(URL effectiveLocation) {
		this.effectiveLocation = effectiveLocation;
	}

	/**
	 * 
	 * @return true if this content is likely HTML, according to MIME type or actual
	 *         data
	 */
	public boolean isHtml() {
		if (bytes.length < 27) { // more or less the smallest possible html
			return false;
		}
		if (mimeType != null && !mimeType.isEmpty()) {
			return mimeType.startsWith("text/html") || mimeType.startsWith("application/xhtml+xml");
		}

		// now we have no mime type to rely on, we peek at the beginning of the contents
		// and
		// see if it looks like HTML.

		// 225 because xhtml has a very long header
		byte[] contentStartBytes = Arrays.copyOfRange(bytes, 0, Math.max(bytes.length, 225));

		// we decode as a single byte encoding ; this avoids decoding errors with
		// invalid utf 8,
		// and all we're concerned about is <ascii 127 anyway
		String contentStart = new String(contentStartBytes, StandardCharsets.ISO_8859_1);
		return (contentStart.contains(smallHtmlOpener) || contentStart.contains(bigHtmlOpener));
	}

	/**
	 * 
	 * @return true if this content is likely CSS, according to MIME type or URL
	 */
	public boolean isCss() {
		if (mimeType != null && !mimeType.isEmpty() && mimeType.startsWith("text/css")) {
			return true;
		}
		return cssExt.matches(getSourceLink());
	}

}
