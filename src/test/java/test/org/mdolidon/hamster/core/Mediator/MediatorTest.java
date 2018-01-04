package test.org.mdolidon.hamster.core.Mediator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.Serializable;
import java.net.URL;

import org.junit.Test;
import org.mdolidon.hamster.core.Content;
import org.mdolidon.hamster.core.IConfiguration;
import org.mdolidon.hamster.core.IMediator;
import org.mdolidon.hamster.core.Link;
import org.mdolidon.hamster.core.Mediator;
import org.mdolidon.hamster.core.MediatorMemento;

import test.org.mdolidon.hamster.mocks.BaseMockConfig;

public class MediatorTest {

	@Test
	public void pausesWhenPauseCalled() throws Exception {
		BaseMockConfig cfg = new BaseMockConfig();
		Mediator mediator = new Mediator(cfg);

		Stuffer stuffer = new Stuffer(cfg, mediator);
		Thread stufferThread = new Thread(stuffer);
		long startTime = System.currentTimeMillis();
		stufferThread.start();
		Thread.sleep(300); // leaves the stuffer enough time for a few hundred feed cycles
		assertTrue("The stuffer works correctly", startTime < stuffer.getLatestStuffTimeMillis());
		assertTrue("The mediator accepted the stuffer's links while not paused",
				mediator.getNumberOfTrackedActivities() > 150);

		mediator.pause();
		Thread.sleep(10); // the mediator has the right to finish some pending operations before pausing

		long pauseTime = System.currentTimeMillis();
		Thread.sleep(200); // leaves way enough time for things to go wrong if they need to

		assertTrue("The mediator stopped accepting links when paused", pauseTime > stuffer.getLatestStuffTimeMillis());
		stufferThread.interrupt();
	}

	@Test
	public void getMementoAndResetFromMementoDoIdentity() throws Exception {
		BaseMockConfig cfg = new BaseMockConfig();
		IMediator mediator_a = makeMediatorWithSomeContent(cfg);
		Serializable memento = mediator_a.getMemento();
		IMediator mediator_b = new Mediator(cfg);
		mediator_b.resetFromMemento(memento);

		assertEquals(4, mediator_b.getNumberOfTrackedActivities());

		Content ct_should_html = mediator_b.provideContentToProcess();
		assertTrue(new String(ct_should_html.getBytes()).contains("This is valid html"));
		Content ct_should_data = mediator_b.provideContentToStore();
		assertTrue(ct_should_data.getBytes().length == 6);

		assertEquals(4, mediator_b.getNumberOfTrackedActivities());

		mediator_b.acceptNewLink(new Link(new URL("http://place.com/home/index.html"), 0, cfg));
		// the links has already been seen before saving the memento, we should not
		// queue it again
		assertEquals(4, mediator_b.getNumberOfTrackedActivities());
	}

	@Test
	public void mementoContentIsNotAffectedByFurtherActivity() throws Exception {
		BaseMockConfig cfg = new BaseMockConfig();
		IMediator mediator = makeMediatorWithSomeContent(cfg);

		// cast to access innards ; we don't cast in the app, because we don't
		// want to access innards !
		MediatorMemento memento = (MediatorMemento) mediator.getMemento();
		Content mementoHtmlContent = memento.contentToProcess.get(0);
		assertTrue(new String(mementoHtmlContent.getBytes()).contains("valid html"));
		assertTrue(mementoHtmlContent.isHtml()); // if the content does not recognize itself as html,
		// the mediator will route it the wrong way and this test case would fail by
		// someone else's fault

		Content liveHtmlContent = mediator.provideContentToProcess();
		assertTrue(new String(liveHtmlContent.getBytes()).contains("valid html"));
		liveHtmlContent
				.setBytes("<html><body>THIS HAS BEEN PROCESSED BEFORE THE MEMENTO WAS SAVED</body></html>".getBytes());

		assertTrue(new String(liveHtmlContent.getBytes()).contains("PROCESSED"));

		assertTrue(new String(mementoHtmlContent.getBytes()).contains("valid html")); // should not have changed, this																				// is the
		// real object of the test case
	}

	// --------------------

	private Mediator makeMediatorWithSomeContent(IConfiguration cfg) throws Exception {
		Mediator mediator = new Mediator(cfg);

		mediator.acceptNewLink(new Link(new URL("http://place.com/home/index.html"), 0, cfg));
		mediator.acceptNewLink(new Link(new URL("http://place.com/framework/base.js"), 1, cfg));

		Content ct_html = new Content(new Link(new URL("http://place.com/about/us.html"), 1, cfg));
		ct_html.setBytes("<html><body>This is valid html</body></html>".getBytes());
		mediator.acceptDownloadedContent(ct_html);

		Content ct_data = new Content(new Link(new URL("http://place.com/data"), 1, cfg));
		ct_data.setBytes(new byte[] { 0, 1, 2, 3, 4, 5 });
		mediator.acceptDownloadedContent(ct_data);
		return mediator;

	}

}
