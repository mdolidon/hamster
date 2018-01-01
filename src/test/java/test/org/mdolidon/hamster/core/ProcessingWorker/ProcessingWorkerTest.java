package test.org.mdolidon.hamster.core.ProcessingWorker;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.List;

import org.jsoup.nodes.Element;
import org.junit.Test;
import org.mdolidon.hamster.core.Content;
import org.mdolidon.hamster.core.IConfiguration;
import org.mdolidon.hamster.core.Link;
import org.mdolidon.hamster.core.ProcessingWorker;
import org.mdolidon.hamster.core.TargetProfile;

import test.org.mdolidon.hamster.mocks.BaseMockMediator;

/*
 * Tests links extraction and rewriting by the processing worker.
 * The mock configuration that is used is assumed to offer a working TreeStorageResolver.
 * 
 * The tested page pretends to be http://place.com/home/index.html
 */
public class ProcessingWorkerTest {

	private class ProcessingTestResult {
		public Content content;
		public List<Link> links;
	}

	@Test
	public void extractsSimpleLink() throws Exception {
		String pageText = "<html><body>Hello <a href=\"/world/YY\">world</a></body></html>";
		ProcessingTestResult result = runOnString(pageText);

		assertEquals(1, result.links.size());
		Link l = result.links.get(0);
		assertTrue(l.getTargetAsString().contains("place.com/world/YY"));
	}

	@Test
	public void testedLinkContainsSourceJsoupElement() throws Exception {
		MockConfig cfg = new MockConfig("http://place.com");
		cfg.setDelegateForTargetProfile(this); // will call the getTargetProfile defined right below
		String pageText = "<html><body>Hello <a href=\"/world/YY\">world</a></body></html>";
		@SuppressWarnings("unused")
		ProcessingTestResult result = runOnString(pageText, cfg);
	}
	
	// used by the test above
	public TargetProfile getTargetProfile(Link link) {
		assertNotNull(link.getSourceElement());
		return new TargetProfile(true,true);
	}
	

	@Test
	public void returnedLinkDoesNotContainSourceJsoupElement() throws Exception {
		String pageText = "<html><body>Hello <a href=\"/world/YY\">world</a></body></html>";
		ProcessingTestResult result = runOnString(pageText);

		assertEquals(1, result.links.size());
		Link l = result.links.get(0);
		try {
			@SuppressWarnings("unused")
			Element el = l.getSourceElement();
			assertTrue("The link object should have thrown.", false);
		} catch (NullPointerException e) {
			assertTrue(true);
		}
	}

	@Test
	public void doesNotReturnNonDownloadableLink() throws Exception {
		String pageText = "<html><body>Hello <a href=\"/world/NN\">world</a></body></html>";
		ProcessingTestResult result = runOnString(pageText);
		assertEquals(0, result.links.size());
	}

	@Test
	public void rewritesOfflineTargetInRelativeForm() throws Exception {
		String pageText = "<html><body>Hello <a href=\"/world/YY\">world</a></body></html>";
		ProcessingTestResult result = runOnString(pageText);

		byte[] b = result.content.getBytes();
		String ct = new String(b, StandardCharsets.UTF_8);
		assertTrue(ct.contains("../world/YY"));
	}

	@Test
	public void rewritesOnlineTargetInAbsoluteForm() throws Exception {
		String pageText = "<html><body>Hello <a href=\"/world/NN\">world</a></body></html>";
		ProcessingTestResult result = runOnString(pageText);

		byte[] b = result.content.getBytes();
		String ct = new String(b, StandardCharsets.UTF_8);
		assertTrue(ct.contains("http://place.com/world/NN"));
	}

	@Test
	public void takesBaseTagIntoAccountForLinks() throws Exception {
		String pageText = "<html><head><base href=\"/my/\" /></head>"
				+ "<body>Hello <a href=\"garden/YY\">let's go out</a></body></html>";

		ProcessingTestResult result = runOnString(pageText);

		assertEquals(1, result.links.size()); // the base tag href is not a new link
		Link l = result.links.get(0);
		assertTrue(l.getTargetAsString().contains("http://place.com/my/garden/YY"));
	}

	@Test
	public void takesBaseTagIntoAccountForRewriting() throws Exception {
		String pageText = "<html><head><base href=\"http://cdn.com\" /></head>"
				+ "<body>Hello <a href=\"room/NN\">outer room</a></body></html>";

		ProcessingTestResult result = runOnString(pageText);
		byte[] b = result.content.getBytes();
		String ct = new String(b, StandardCharsets.UTF_8);
		assertTrue(ct.contains("http://cdn.com/room/NN"));
	}

	@Test
	public void doesNotTouchIfMalformed() throws Exception {
		String pageText = "<html><body>Hello <a href=\"h:/world&/YY/1\">w1</a><a href=\"/world/YY/2\">w2</a></body></html>";
		ProcessingTestResult result = runOnString(pageText);

		assertEquals(1, result.links.size());
		byte[] b = result.content.getBytes();
		String ct = new String(b, StandardCharsets.UTF_8);
		assertTrue(ct.contains("../world/YY/2"));
	}

	@Test
	public void extractsLinkFromSrcAttribute() throws Exception {
		String pageText = "<html><head><script src=\"YYframework.js\"></script></head>"
				+ "<body>Hello <a href=\"/world/YY\">world</a></body></html>";
		ProcessingTestResult result = runOnString(pageText);

		assertEquals(2, result.links.size());
		Link l = result.links.get(0);
		assertTrue(l.getTargetAsString().contains("/home/YYframework.js"));
	}

	@Test
	public void setsImageFlagIfImgElement() throws Exception {
		String pageText = "<html><body>Hello <img src=\"/world/YY/nice.png\">Something nice presumably</img></body></html>";
		ProcessingTestResult result = runOnString(pageText);

		assertEquals(1, result.links.size());
		Link l = result.links.get(0);
		assertTrue(l.getTargetAsString().contains("nice.png"));
		assertTrue(l.isFlag_image());
	}

	@Test
	public void interactsWithMediator() throws Exception {
		BaseMockMediator mediator = new BaseMockMediator();
		IConfiguration cfg = new MockConfig("http://place.com");
		String pageText = "<html><body>Hello <a href=\"h:/world&/YY/1\">w1</a><a href=\"/world/YY/2\">w2</a></body></html>";
		mediator.contentsToProvideForProcessing.addLast(makeContentFromString(pageText, cfg));

		ProcessingWorker worker = new ProcessingWorker(mediator, cfg);
		Thread wthread = new Thread(worker);
		wthread.start();
		Thread.sleep(50); // no I wouldn't do this in the app code...

		assertEquals(1, mediator.acceptedLinks.size());
		assertEquals(1, mediator.processedContent.size());
		wthread.interrupt();
	}

	// ----------------------------------



	private ProcessingTestResult runOnString(String pageText) throws Exception {
		IConfiguration cfg = new MockConfig("http://place.com");
		return runOnString(pageText, cfg);
	}

	private ProcessingTestResult runOnString(String pageText, IConfiguration cfg) throws Exception {
		Content page = makeContentFromString(pageText, cfg);
		ProcessingWorker worker = new ProcessingWorker(null, cfg); // the processing worker only needs a mediator when
																	// running autonomously, but we won't test the
																	// overly simple outer loop of the worker
		List<Link> linksToDownload = worker.processCurrentContent(page);
		ProcessingTestResult r = new ProcessingTestResult();
		r.content = page;
		r.links = linksToDownload;
		return r;
	}
	
	private Content makeContentFromString(String pageText, IConfiguration cfg) throws Exception {
		Link location = new Link(new URL("http://place.com/home/index.html"), 1, cfg);
		Content page = new Content(location);
		page.setBytes(pageText.getBytes());
		return page;
	}
}
