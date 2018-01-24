package test.org.mdolidon.hamster.core.CSSProcessingWorker;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.List;

import org.junit.Test;
import org.mdolidon.hamster.core.CSSProcessingWorker;
import org.mdolidon.hamster.core.Content;
import org.mdolidon.hamster.core.IConfiguration;
import org.mdolidon.hamster.core.Link;

import test.org.mdolidon.hamster.mocks.BaseMockMediator;

/*
 * Tests links extraction and rewriting by the processing worker.
 * The mock configuration that is used is assumed to offer a working TreeStorageResolver.
 * 
 * The tested page pretends to be http://place.com/home/index.html
 */
public class CSSProcessingWorkerTest {

	private class ProcessingTestResult {
		public Content content;
		public List<Link> links;
	}

	@Test
	public void extractsSimpleLink() throws Exception {
		String pageText = "abcd\nefgh\n   @import url('otherYY.css');\nijklm";
		ProcessingTestResult result = runOnString(pageText);

		assertEquals(1, result.links.size());
		Link l = result.links.get(0);
		assertTrue(l.getTargetAsString().contains("place.com/style/otherYY.css"));
	}

	@Test
	public void doesNotReturnNonDownloadableLink() throws Exception {
		String pageText = "abcd\\nefgh\\n   @import url('otherNN.css');\\nijklm";
		ProcessingTestResult result = runOnString(pageText);
		assertEquals(0, result.links.size());
	}

	@Test
	public void rewritesOfflineTargetInRelativeForm() throws Exception {
		String pageText = "abcd\nefgh\n   @import url('http://place.com/framework/otherYY.css');\nijklm";
		ProcessingTestResult result = runOnString(pageText);

		byte[] b = result.content.getBytes();
		String ct = new String(b, StandardCharsets.UTF_8);
		assertEquals("abcd\nefgh\n   @import url('../framework/otherYY.css');\nijklm", ct);
	}

	@Test
	public void rewritesOnlineTargetInAbsoluteForm() throws Exception {
		String pageText = "abcd\nefgh\n   @import url('../framework/otherNN.css');\nijklm";
		ProcessingTestResult result = runOnString(pageText);

		byte[] b = result.content.getBytes();
		String ct = new String(b, StandardCharsets.UTF_8);
		assertEquals("abcd\nefgh\n   @import url('http://place.com/framework/otherNN.css');\nijklm", ct);
	}

	
	@Test
	public void severalImportsYieldSeveralLinks() throws Exception {
		String pageText = "abcd\nefgh\n   @import url('http://place.com/framework/firstYY.css');\ni\n@import \"secondYY.css\";\njklm";
		ProcessingTestResult result = runOnString(pageText);

		assertEquals(2, result.links.size());
	}
	

	@Test
	public void severalImportsAreRewritten() throws Exception {
		String pageText = "abcd\nefgh\n   @import url('http://place.com/framework/firstYY.css');\ni\n@import \"secondYY.css\";\njklm";
		ProcessingTestResult result = runOnString(pageText);

		byte[] b = result.content.getBytes();
		String ct = new String(b, StandardCharsets.UTF_8);
		assertEquals("abcd\nefgh\n   @import url('../framework/firstYY.css');\ni\n@import \"secondYY.css\";\njklm", ct);
	}
	
	@Test
	public void importIsTheOnlyThing() throws Exception {
		String pageText = "@import url('http://place.com/framework/otherYY.css')";
		ProcessingTestResult result = runOnString(pageText);

		byte[] b = result.content.getBytes();
		String ct = new String(b, StandardCharsets.UTF_8);
		assertEquals("@import url('../framework/otherYY.css')", ct);
	}


	@Test
	public void interactsWithMediator() throws Exception {
		BaseMockMediator mediator = new BaseMockMediator();
		IConfiguration cfg = new MockConfig("http://place.com");
		String pageText = "abcd\\nefgh\\n   @import url('http://place.com/framework/otherYY.css');\\nijklm\"";
		mediator.contentsToProvideForProcessing.addLast(makeContentFromString(pageText, cfg));

		CSSProcessingWorker worker = new CSSProcessingWorker(mediator, cfg);
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
		CSSProcessingWorker worker = new CSSProcessingWorker(null, cfg); // the processing worker only needs a mediator when
																	// running autonomously, but we won't test the
																	// overly simple outer loop of the worker
		List<Link> linksToDownload = worker.processCurrentContent(page);
		ProcessingTestResult r = new ProcessingTestResult();
		r.content = page;
		r.links = linksToDownload;
		return r;
	}
	
	private Content makeContentFromString(String pageText, IConfiguration cfg) throws Exception {
		Link location = new Link(new URL("http://place.com/style/main.css"), 1, cfg);
		Content page = new Content(location);
		page.setBytes(pageText.getBytes());
		return page;
	}
}
