package test.org.mdolidon.hamster.core;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.net.URL;

import org.junit.Test;
import org.mdolidon.hamster.configuration.BaseConfiguration;
import org.mdolidon.hamster.core.Content;
import org.mdolidon.hamster.core.DownloadWorker;
import org.mdolidon.hamster.core.Link;
import org.mdolidon.hamster.core.Mediator;

public class DownloadWorkerTest {

	@Test
	public void getGithub() throws Exception {
		BaseConfiguration cfg = new BaseConfiguration();
		cfg.setStartUrl(new URL("https://github.com"));
		Mediator med = new Mediator(cfg);
		DownloadWorker dw = new DownloadWorker(med, cfg);

		Link link = new Link(new URL("http://github.com/mdolidon"), 0,cfg); // check https redirect
		Content doc = dw.getAsContent(link);

		assertEquals("http://github.com/mdolidon", doc.getSourceLink().getTargetAsString());
		assertEquals("https://github.com/mdolidon", doc.getEffectiveLocation().toString());
		assertTrue(doc.getMimeType().contains("text/html"));
	}
}
