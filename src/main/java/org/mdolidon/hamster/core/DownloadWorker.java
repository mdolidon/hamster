package org.mdolidon.hamster.core;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.util.List;

import org.apache.commons.io.IOUtils;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * This worker class is meant to run in its own separate thread. It will query a
 * mediator for links to download. There is no check of the link against the
 * configuration : the worker downloads whatever the mediator gives.
 * 
 * Anything downloaded will be put in a Content object, and sent back to the
 * mediator.
 * 
 * @author mathias
 *
 */
public class DownloadWorker implements Runnable {

	private static Logger logger = LogManager.getLogger();

	private class DownloadException extends Exception {
		public static final long serialVersionUID = 1L;

		public DownloadException(String message) {
			super(message);
		}
	}

	private class NonRetriableDownloadException extends DownloadException {
		public static final long serialVersionUID = 1L;

		public NonRetriableDownloadException(String message) {
			super(message);
		}
	};

	private class RetriableDownloadException extends DownloadException {
		public static final long serialVersionUID = 1L;

		public RetriableDownloadException(String message) {
			super(message);
		}
	};

	private CloseableHttpClient httpclient;
	private IMediator mediator;
	private IConfiguration configuration;

	public DownloadWorker(IMediator mediator, IConfiguration configuration) {
		this.mediator = mediator;
		this.configuration = configuration;
		httpclient = HttpClients.createDefault();
	}

	@Override
	public void run() {
		logger.trace("Starting a download worker");

		List<HttpPost> checkinRequests = configuration.getCheckinPostRequests();
		for (HttpPost request : checkinRequests) {
			postForCheckin(request);
		}

		for (;;) {
			try {
				Link link = mediator.provideLinkToDownload();
				try {
					Content content = getAsContent(link);
					mediator.acceptDownloadedContent(content);

				} catch (NonRetriableDownloadException e) {
					mediator.acceptDownloadError(link, false, e.getMessage());
				} catch (RetriableDownloadException e) {
					mediator.acceptDownloadError(link, true, e.getMessage());
				}
			} catch (InterruptedException e) {
				return;
			}
		}
	}

	/**
	 * This method is made public as a good testing entry point. It is not meant to
	 * be called otherwise.
	 * 
	 * @param link
	 * @return
	 * @throws DownloadException
	 */
	public Content getAsContent(Link link) throws NonRetriableDownloadException, RetriableDownloadException {
		try {
			URL target = link.getTarget();
			logger.info("Downloading {}", target);

			HttpClientContext httpContext = mediator.getAuthContext(link);
			HttpGet httpGet = new HttpGet(target.toURI());
			CloseableHttpResponse response = httpclient.execute(httpGet, httpContext);

			try {
				throwIfNoSuccess(target, response);
				URL effectiveUrl = getEffectiveURL(httpGet, httpContext);

				if (link.getJumpsFromStartingURL() == 0
						&& !link.getTargetAsStringWithoutHash().equals(Utils.getBeforeHash(effectiveUrl.toString()))) {
					logger.info("Correcting start URL to its redirected location : {}", effectiveUrl);
					configuration.correctStartUrl(effectiveUrl);
				}

				HttpEntity entity = response.getEntity();

				long length = entity.getContentLength();
				if (length > 0 && !configuration.isAcceptableContentSize(link, length)) {
					throw new Exception("Target is expected to be too large. Not downloading.");
				}
				InputStream contentStream = entity.getContent();
				try {
					byte[] bytes = IOUtils.toByteArray(contentStream);
					Content content = new Content(link);
					content.setEffectiveLocation(effectiveUrl);
					content.setBytes(bytes);
					content.setMimeType(getMimeType(entity));
					return content;

				} finally {
					contentStream.close();
				}
			} finally {
				response.close();
				mediator.setAuthContext(link, httpContext);
			}
		} catch (IOException | OutOfMemoryError | RetriableDownloadException e) {
			throw new RetriableDownloadException(e.toString());
		} catch (Exception e) {
			throw new NonRetriableDownloadException(e.toString());
		}
	}

	private void postForCheckin(HttpPost httpPost) {
		String targetStr = httpPost.getURI().toString();
		try {
			URL target = httpPost.getURI().toURL();
			logger.info("Checking in at {}", target);
			Link pseudoLink = new Link(target, 0, configuration);
			HttpClientContext httpContext = mediator.getAuthContext(pseudoLink);
			CloseableHttpResponse response = httpclient.execute(httpPost, httpContext);
			try {
				throwIfNoSuccess(target, response);
			} finally {
				response.close();
				mediator.setAuthContext(pseudoLink, httpContext);
			}
		} catch (Exception e) {
			logger.warn("Failed check-in post request at {}", targetStr);
		}
	}

	private void throwIfNoSuccess(URL target, HttpResponse response)
			throws NonRetriableDownloadException, RetriableDownloadException {

		int code = response.getStatusLine().getStatusCode();
		if (code >= 500) {
			throw new RetriableDownloadException("Got status " + Integer.toString(code));
		}
		if (code >= 300) {
			// successful redirects should be handled by Apache's client ; if we're left
			// with one, it means that something went wrong
			throw new NonRetriableDownloadException("Got status " + Integer.toString(code));
		}
	}

	private URL getEffectiveURL(HttpRequestBase request, HttpClientContext context) throws Exception {
		URI effectiveUri = request.getURI();
		List<URI> locations = context.getRedirectLocations();
		if (locations != null && !locations.isEmpty()) {
			effectiveUri = locations.get(locations.size() - 1);
		}

		return effectiveUri.toURL();
	}

	private String getMimeType(HttpEntity entity) {
		Header mimeHeader = entity.getContentType();
		if (mimeHeader != null) {
			return mimeHeader.getValue();
		} else {
			return "";
		}
	}

}
