package org.mdolidon.hamster.core;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * This worker, meant to be ran in its own thread, receives downloaded documents
 * from the mediator, rewrites them into an offline-friendly form. Any links
 * that are discovered within the documents are checked against the
 * configuration, and if they are meant to be downloaded, then they are sent to
 * the mediator.
 */

public class ProcessingWorker implements Runnable {

	private static Logger logger = LogManager.getLogger();

	private IMediator mediator;
	private IConfiguration configuration;

	public ProcessingWorker(IMediator mediator, IConfiguration configuration) {
		this.mediator = mediator;
		this.configuration = configuration;
	}

	@Override
	public void run() {
		logger.trace("Starting a processing worker");

		while (true) {
			try {
				Content content = mediator.provideContentToProcess();
				Link sourceLink = content.getSourceLink();
				URL baseUrl = content.getEffectiveLocation(); // may be mutated if a <base> element is found
																// in the contents

				logger.trace("Processing worker got document for {}", baseUrl);

				boolean success = processCurrentContent(content, sourceLink, baseUrl);

				if (success) {
					mediator.acceptProcessedContent(content);
				}
			} catch (InterruptedException e) {
				return;
			}
		}
	}

	// returns true on success
	private boolean processCurrentContent(Content content, Link sourceLink, URL baseUrl) throws InterruptedException {
		InputStream is = new ByteArrayInputStream(content.getBytes());
		Document dom;
		List<Link> linksToDownload = new ArrayList<>(20);
		try {
			dom = Jsoup.parse(is, null, content.getEffectiveLocation().toString());

		} catch (IOException e) {
			mediator.acceptProcessingError(content, "Error while trying to parse HTML content");
			return false;
		}

		try {
			baseUrl = getNewBaseUrl_IfBaseElement(baseUrl, dom);
		} catch (Exception e) {
			mediator.acceptProcessingError(content, e.getMessage());
			return false;
		}

		Elements linkElements = selectLinkElements(dom);
		for (Element el : linkElements) {
			processLinkElement(el, sourceLink, baseUrl, linksToDownload);
		}
		mediator.acceptAllNewLinks(linksToDownload);

		String processedHtml = dom.outerHtml();
		content.setBytes(processedHtml.getBytes(dom.outputSettings().charset()));
		return true;
	}

	private Elements selectLinkElements(Document dom) {
		return dom.select("[href],[src]");
	}

	private void processLinkElement(Element el, Link sourceLink, URL baseUrl, List<Link> linksToDownload)
			throws InterruptedException {
		if (el.hasAttr("href")) {
			processLinkElement(el, "href", sourceLink, baseUrl, linksToDownload);
		} else if (el.hasAttr("src")) {
			processLinkElement(el, "src", sourceLink, baseUrl, linksToDownload);
		}
	}

	private void processLinkElement(Element el, String attributeKey, Link sourceLink, URL baseUrl,
			List<Link> linksToDownload) throws InterruptedException {

		String refStr = el.attr(attributeKey);
		try {
			String storageHref;
			Link link = new Link(new URL(baseUrl, refStr), sourceLink.getJumpsFromStartingURL() + 1, configuration);
			if (el.tagName() == "img") {
				link.setFlag_image();
			}

			link.bindSourceElement(el);
			boolean isPartOfTargetSet = link.isPartOfTargetSet();
			boolean needsDownload = link.needsDownload();
			link.unbindSourceElement();

			if (isPartOfTargetSet) {
				storageHref = getRelativeHref(sourceLink.getStorageFile(), link.getStorageFile()) + link.getUrlHash();
				if (needsDownload) {
					linksToDownload.add(link);
				}
			} else {
				// if we won't download the target, make sure we leave an absolute href
				// in the stored page, to go back online to the right place
				storageHref = link.getTargetAsString();
			}
			el.attr(attributeKey, storageHref);
		} catch (MalformedURLException e) {
			logger.info("Ignoring malformed URL : {}, found in {}", refStr, sourceLink.getTargetAsString());
		}

	}

	private String getRelativeHref(File from, File to) {
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

	private String pathToHref(Path path) {
		if (File.pathSeparatorChar == '/') {
			return path.toString();
		} else {
			return path.toString().replace(File.pathSeparatorChar, '/');
		}

	}

	private URL getNewBaseUrl_IfBaseElement(URL baseUrl, Document dom) throws Exception {
		Elements baseElems = dom.select("base");
		if (baseElems.isEmpty()) {
			return baseUrl;
		}
		if (baseElems.size() > 1) {
			throw new Exception(
					"Several <base> elements in the document. This is invalid HTML, and I don't know which one to use.");
		}
		Element base = baseElems.first();
		if (base.hasAttr("href")) {
			try {
				// the href SHOULD be absolute, but I'm sure people WILL put relative URLs...
				return new URL(baseUrl, base.attr("href"));
			} catch (MalformedURLException e) {
				throw new Exception("<base> element has a malformed URL : " + base.attr("href"));
			}
		}
		return baseUrl;
	}
}
