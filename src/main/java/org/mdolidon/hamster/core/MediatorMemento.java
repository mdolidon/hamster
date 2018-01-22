package org.mdolidon.hamster.core;

import java.io.Serializable;
import java.net.URL;
import java.util.List;

public class MediatorMemento implements Serializable {

	private static final long serialVersionUID = 1L;

	public List<String> urlsAlreadySeen;
	public List<Link> linksToDownload;
	public List<Content> htmlContentToProcess;
	public List<Content> cssContentToProcess;
	public List<Content> contentToStore;
	public List<Link> retriableLinks;
	public int filesSaved;
	public URL effectiveStartUrl;
	
}
