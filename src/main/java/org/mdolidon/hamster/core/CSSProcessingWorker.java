package org.mdolidon.hamster.core;

import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * This worker, meant to be ran in its own thread, receives downloaded documents
 * from the mediator, rewrites them into an offline-friendly form. External
 * stylesheet imports that are discovered within the documents are checked
 * against the configuration, and if they are meant to be downloaded, then they
 * are sent to the mediator.
 */

public class CSSProcessingWorker implements Runnable {

	// just a record
	private class ImportTarget {
		public Link sourceLink;
		public int start;
		public int end;
		public String rewrittenHref;

		public ImportTarget(Link link, int start, int end) {
			this.sourceLink = link;
			this.start = start;
			this.end = end;
		}
	}

	// It's CSS. Make it crude, make it manly. This regex should extract import
	// targets in its first group.
	// The biggest current weakness is : if the import is inside a comment, we
	// follow the link anyway.
	// It's most likely no big deal.
	private Pattern importPattern = Pattern.compile("@import *(?:url\\( *)?(?:\"|')?([^'\"\\)]*)(?:\"|')? *\\)?",
			Pattern.CASE_INSENSITIVE);

	private static Logger logger = LogManager.getLogger();

	private IMediator mediator;
	private IConfiguration configuration;

	public CSSProcessingWorker(IMediator mediator, IConfiguration configuration) {
		this.mediator = mediator;
		this.configuration = configuration;
	}

	@Override
	public void run() {
		logger.trace("Starting a CSS processing worker");

		// These bits between HTMLProcessingWorker and CSSProcessingWorker
		// are pretty much the same. TODO : factor (but I wish Java had macros...)
		while (true) {
			try {
				Content content = mediator.provideCSSContentToProcess();

				List<Link> linksToDownload = processCurrentContent(content);
				if (!linksToDownload.isEmpty()) {
					mediator.acceptAllNewLinks(linksToDownload);
				}
				mediator.acceptProcessedCSSContent(content);

			} catch (InterruptedException e) {
				return;
			}
		}
	}

	// Made public for testing purposes.
	// Mutates the Content rather than copying it.
	public List<Link> processCurrentContent(Content content) throws InterruptedException {

		// may be changed in the presence of a <base> element
		URL baseUrl = content.getEffectiveLocation();
		if (baseUrl == null) {
			logger.warn("No effective location was set for {} ; using source link URL instead. May be unreliable.",
					content.getSourceLink());
			baseUrl = content.getSourceLink().getTarget();
		}

		List<Link> linksToDownload = new ArrayList<>();

		logger.trace("CSS Processing worker got style-sheet for {}", baseUrl);

		// we'll decode and reencode as a single byte encoding ; this avoids decoding
		// errors with invalid utf 8, and all we're concerned about is <ascii 127 anyway
		// ; higher character codes will be preserved, whatever encoding they are meant
		// to be understood in by the actual final consumer.
		String cssString = new String(content.getBytes(), StandardCharsets.ISO_8859_1);

		List<ImportTarget> places = extractImportTargets(cssString, linksToDownload, baseUrl, content);
		String newCssString = replaceImportTargets(cssString, places);

		content.setBytes(newCssString.getBytes(StandardCharsets.ISO_8859_1));

		return linksToDownload;
	}

	
	private List<ImportTarget> extractImportTargets(String cssString, List<Link> linksToDownload, URL baseUrl,
			Content content) {
		List<ImportTarget> places = new ArrayList<>();
		Matcher matcher = importPattern.matcher(cssString);

		while (matcher.find()) {
			try {
				ImportTarget newPlace = new ImportTarget(
						new Link(new URL(baseUrl, matcher.group(1)),
								content.getSourceLink().getJumpsFromStartingURL() + 1, configuration),
						matcher.start(1), matcher.end(1));

				if (newPlace.sourceLink.isPartOfTargetSet()) {
					newPlace.rewrittenHref = Utils.getRelativeHref(content.getSourceLink().getStorageFile(),
							newPlace.sourceLink.getStorageFile());
				} else {
					newPlace.rewrittenHref = newPlace.sourceLink.getTargetAsString();
				}
				if (newPlace.sourceLink.needsDownload()) {
					linksToDownload.add(newPlace.sourceLink);
				}
				places.add(newPlace);
			} catch (MalformedURLException e) {
				// Do nothing, just leave that @import clause at it was,
				// and carry on retrieving that style sheet.
			}
		}
		return places;
	}

	private String replaceImportTargets(String cssString, List<ImportTarget> places) {
		StringBuffer buf = new StringBuffer(cssString.length() + 200);

		// NB. an import target can never be the first or the last thing in the CSS
		// string. It will always be preceded at least by the @import keyword itself,
		// and followed at least by a closing quote.
		int beginAt = 0;
		for (ImportTarget place : places) {
			buf.append(cssString.substring(beginAt, place.start));
			buf.append(place.rewrittenHref);
			beginAt = place.end;
		}
		buf.append(cssString.substring(beginAt));
		return buf.toString();
	}

}