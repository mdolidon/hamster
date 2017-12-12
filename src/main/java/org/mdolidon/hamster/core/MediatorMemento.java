package org.mdolidon.hamster.core;

import java.io.Serializable;
import java.util.List;

public class MediatorMemento implements Serializable {

	private static final long serialVersionUID = 1L;

	public List<String> urlsAlreadySeen;
	public List<Link> linksToDownload;
	public List<Content> contentToProcess;
	public List<Content> contentToStore;
	public int filesSaved;
	
}
