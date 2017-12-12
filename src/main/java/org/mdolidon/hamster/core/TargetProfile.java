package org.mdolidon.hamster.core;

import java.io.Serializable;

public class TargetProfile implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private boolean isPartOfTargetSet;
	private boolean needsDownload;

	public TargetProfile(boolean isPartOfTargetSet, boolean needsDownload) {
		super();
		this.isPartOfTargetSet = isPartOfTargetSet;
		this.needsDownload = needsDownload;
	}

	public boolean isPartOfTargetSet() {
		return isPartOfTargetSet;
	}

	public boolean needsDownload() {
		return needsDownload;
	}

}
