package org.mdolidon.hamster.core;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
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

public class HTMLProcessingWorker implements Runnable {

	// I could have listed acceptable protocols, but I do the opposite instead.
	// This lets us be easily tolerant with the way http(s) urls are written.
	private static String[] ignore_ProtocolPrefixes = { "mailto:", "telnet:", "nntp:", "gopher:", "news:", "file:",
			"ftp:", "chrome:" };

	private class ProcessingException extends Exception {
		private static final long serialVersionUID = 1L;

		ProcessingException(String message) {
			super(message);
		}
	}

	private static Logger logger = LogManager.getLogger();

	private IMediator mediator;
	private IConfiguration configuration;

	public HTMLProcessingWorker(IMediator mediator, IConfiguration configuration) {
		this.mediator = mediator;
		this.configuration = configuration;
	}

	@Override
	public void run() {
		logger.trace("Starting a processing worker");

		while (true) {
			try {
				Content content = mediator.provideHTMLContentToProcess();
				try {
					List<Link> linksToDownload = processCurrentContent(content);
					if (!linksToDownload.isEmpty()) {
						mediator.acceptAllNewLinks(linksToDownload);
					}
					mediator.acceptProcessedHTMLContent(content);

				} catch (ProcessingException e) {
					mediator.acceptHTMLProcessingError(content, e.getMessage());
				}
			} catch (InterruptedException e) {
				return;
			}
		}
	}

	// Made public for testing purposes.
	// Mutates the Content rather than copying it.
	public List<Link> processCurrentContent(Content content) throws ProcessingException, InterruptedException {

		// may be changed in the presence of a <base> element
		URL baseUrl = content.getEffectiveLocation();
		if (baseUrl == null) {
			logger.warn("No effective location was set for {} ; using source link URL instead. May be unreliable.",
					content.getSourceLink());
			baseUrl = content.getSourceLink().getTarget();
		}

		logger.trace("HTML Processing worker got document for {}", baseUrl);

		InputStream is = new ByteArrayInputStream(content.getBytes());
		Document dom;
		List<Link> linksToDownload = new ArrayList<>(20);
		try {
			dom = Jsoup.parse(is, null, baseUrl.toString());

		} catch (IOException e) {
			throw new ProcessingException("Error while trying to parse HTML content");
		}

		baseUrl = getNewBaseUrl_IfBaseElement(baseUrl, dom);

		Elements linkElements = selectLinkElements(dom);
		for (Element el : linkElements) {
			processLinkElement(el, content.getSourceLink(), baseUrl, linksToDownload);
		}

		String processedHtml = dom.outerHtml();
		content.setBytes(processedHtml.getBytes(dom.outputSettings().charset()));
		return linksToDownload;
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

		if (el.tagName() == "base") {
			return;
		}
		String refStr = el.attr(attributeKey);
		if (is_ignoredProtocolPrefix(refStr)) {
			return;
		}

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
				storageHref = Utils.getRelativeHref(sourceLink.getStorageFile(), link.getStorageFile()) + link.getUrlHash();
			} else {
				// if we the target is not part of the target set, make
				// sure we leave an bsolute href in the stored page, to
				// let people go back online to the right place
				storageHref = link.getTargetAsString();
			}
			el.attr(attributeKey, storageHref);

			// Targets may be part of the target set, but not need to be
			// downloaded if their offline copy was produced by a
			// previous job.

			// Conversely, one could imagine that targets may need to be
			// downloaded even though they're not part of the target set,
			// to allow visiting their links whilst not saving them.
			if (needsDownload) {
				linksToDownload.add(link);
			}

		} catch (MalformedURLException e) {
			logger.info("Ignoring malformed URL : {}, found in {}", refStr, sourceLink.getTargetAsString());
		}
	}



	private URL getNewBaseUrl_IfBaseElement(URL baseUrl, Document dom) throws ProcessingException {
		Elements baseElems = dom.select("base");
		if (baseElems.isEmpty()) {
			return baseUrl;
		}
		if (baseElems.size() > 1) {
			throw new ProcessingException(
					"Several <base> elements in the document. This is invalid HTML, and I don't know which one to use.");
		}
		Element base = baseElems.first();
		if (base.hasAttr("href")) {
			try {
				// the href SHOULD be absolute, but I'm sure people WILL put
				// relative URLs...
				return new URL(baseUrl, base.attr("href"));
			} catch (MalformedURLException e) {
				throw new ProcessingException("<base> element has a malformed URL : " + base.attr("href"));
			}
		}
		return baseUrl;
	}

	private boolean is_ignoredProtocolPrefix(String refStr) {
		if (refStr == null) {
			return true;
		}
		for (String prefix : ignore_ProtocolPrefixes) {
			if (refStr.startsWith(prefix)) {
				return true;
			}
		}
		return false;
	}
}
