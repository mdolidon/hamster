package org.mdolidon.hamster.core;

import java.io.Serializable;

/**
 * This record defines what should be done about a particular target (link,
 * URL...). It is an immutable record with two boolean properties :
 * isPartOfTargetSet, and needsDownload. The two properties are fully
 * independent in their meaning, and all four combinations of values are
 * possible, although the hamster currently uses only three.
 *
 */
public class TargetProfile implements Serializable {

	private static final long serialVersionUID = 1L;

	private boolean isPartOfTargetSet;
	private boolean needsDownload;

	public TargetProfile(boolean isPartOfTargetSet, boolean needsDownload) {
		super();
		this.isPartOfTargetSet = isPartOfTargetSet;
		this.needsDownload = needsDownload;
	}

	/**
	 * A target being part of the target set means that we want to have it within
	 * our local copy of the remote site. It does not mean that we need to download
	 * it every time : the local copy of that particular resource may have been
	 * downloaded on a previous hamster's run, and we may not always need to refresh
	 * it, depending on the job's configuration.
	 * 
	 * In any case, a target that's part of the target set will be stored if it is
	 * downloaded.
	 * 
	 * @return
	 */
	public boolean isPartOfTargetSet() {
		return isPartOfTargetSet;
	}

	/**
	 * A target needing download is just this : it needs to be downloaded. We could
	 * imagine however that we won't store it.
	 */
	public boolean needsDownload() {
		return needsDownload;
	}

}
