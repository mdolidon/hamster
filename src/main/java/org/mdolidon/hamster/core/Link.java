package org.mdolidon.hamster.core;

import java.io.File;
import java.io.Serializable;
import java.net.URL;

import org.jsoup.nodes.Element;

/**
 * This is the basic data structure to store a reference to an online target,
 * add some relevant information about it, and let components communicate about
 * that target. Links are nearly fully passive records.
 */
public class Link implements Serializable, Cloneable {

	private static final long serialVersionUID = 1L;

	// can not be null, and read only
	private URL target;
	private int jumpsFromStartingURL = 0;
	private transient IConfiguration configuration;
	private String urlHash; // "" if no hash, "#stuff" if stuff is the hash

	// may be null, can be mutated
	private File storageFile;
	private transient Element sourceElement;
	private TargetProfile targetProfile;

	private boolean flag_image = false;

	/**
	 * @param target
	 *            The URL of the target (resource, document, whatever...) that this
	 *            link is about.
	 * @param jumpsFromStartingURL
	 *            The number of vertices in the exploration graph between the
	 *            starting url and this target.
	 */
	public Link(URL target, int jumpsFromStartingURL, IConfiguration configuration) {
		if (target == null || configuration == null) {
			throw new NullPointerException();
		}
		this.target = target;
		this.jumpsFromStartingURL = jumpsFromStartingURL;
		this.configuration = configuration;

		String ref = target.getRef();
		if (ref == null) {
			urlHash = "";
		} else {
			urlHash = "#" + ref;
		}
	}

	@Override
	public int hashCode() {
		return getTargetAsStringWithoutHash().hashCode();
	}

	@Override
	public String toString() {
		return getTargetAsString();
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	/**
	 * Set the configuration that the link refers to. This is needed after
	 * deserializing, to make objects fully operational again.
	 * 
	 * @param configuration
	 */
	public void setConfiguration_afterDeserialization(IConfiguration configuration) {
		this.configuration = configuration;
	}

	/**
	 * Get the # part of the URL. If none, this returns the empty string. Otherwise,
	 * this returns a string that starts with #.
	 * 
	 * @return
	 */
	public String getUrlHash() {
		return urlHash;
	}

	/**
	 * This link's target URL.
	 * 
	 * @return
	 */
	public URL getTarget() {
		return target;
	}

	/**
	 * This link's target URL's string representation.
	 * 
	 * @return
	 */
	public String getTargetAsString() {
		return target.toString();
	}

	/**
	 * This link's target URL's string representation, stripped from its # part if
	 * there was any.
	 * 
	 * @return
	 */
	public String getTargetAsStringWithoutHash() {
		if (!getUrlHash().isEmpty()) {
			return Utils.getBeforeHash(getTargetAsString());
		} else {
			return getTargetAsString();
		}
	}
	
	/**
	 * This link's target URL's domain.
	 */
	public String getTargetDomain() {
		return target.getHost();
	}

	/**
	 * Whether this link's target is part of the overall set of content that we want
	 * to own locally.
	 * 
	 * @return
	 */

	public boolean isPartOfTargetSet() {
		if (targetProfile == null) {
			targetProfile = configuration.getTargetProfile(this);
		}
		return targetProfile.isPartOfTargetSet();
	}

	/**
	 * Whether this link's target needs to be downloaded.
	 * 
	 * @return
	 */

	public boolean needsDownload() {
		if (targetProfile == null) {
			targetProfile = configuration.getTargetProfile(this);
		}
		return targetProfile.needsDownload();
	}

	/**
	 * The offline storage file associated to this link, if anybody has set it.
	 * Otherwise returns null.
	 * 
	 * @return
	 */
	public File getStorageFile() {
		if (storageFile == null) {
			storageFile = configuration.getStorageFile(this);
		}
		return storageFile;
	}

	/**
	 * The number of vertices in the exploration graph between the starting url and
	 * this target, as given to the constructor.
	 * 
	 * @return
	 */
	public int getJumpsFromStartingURL() {
		return jumpsFromStartingURL;
	}

	/**
	 * Associate this link to the JSOUP HTML Element in which it was discovered.
	 * This association can help resolve some matchers (CSS matcher). However, links
	 * have a comparatively long lifetime within this application, and leaving the
	 * source element bound here, with most likely all its surrounding document
	 * attached, would cause a massive demand on memory.
	 * 
	 * @param e
	 */
	public void bindSourceElement(Element e) {
		sourceElement = e;
	}

	/**
	 * Retrieve the source element that was bound to this link, to perform checks on
	 * it. Throws a NullPointerException if no element is currently associated.
	 * 
	 * @return
	 */
	public Element getSourceElement() {
		if (sourceElement == null) {
			throw new NullPointerException("Link.getSourceElement called while the source element was not bound");
		}
		return sourceElement;
	}

	/**
	 * Remove the reference to the associated source element, to let the garbage
	 * collector claim the source document.
	 */
	public void unbindSourceElement() {
		sourceElement = null;
	}

	/**
	 * Check if the "image" flag is set. The link's creator, or any of its handlers,
	 * can set this flag if it recognized that this link's target is an image, even
	 * though the URL does not look like an image URL.
	 * 
	 * @return
	 */
	public boolean isFlag_image() {
		return flag_image;
	}

	/**
	 * Set the "image" flag.
	 */
	public void setFlag_image() {
		flag_image = true;
	}
}
