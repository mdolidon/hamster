package org.mdolidon.hamster.configParser;

import static org.junit.Assert.*;
import org.junit.Test;
import org.mdolidon.hamster.configuration.BaseConfiguration;
import org.mdolidon.hamster.configuration.TextConfiguration;

import java.net.URL;

public class ListenerTest {


	@Test
	public void startUrl() throws Exception {
		BaseConfiguration cfg = new TextConfiguration("start at \"http://place.fr\"");
		assertEquals(new URL("http://place.fr"), cfg.getStartUrl());

		cfg = new TextConfiguration("start at \"http://place.fr/dir\"");
		assertEquals(new URL("http://place.fr/dir"), cfg.getStartUrl());

		cfg = new TextConfiguration("start at \"http://place.fr/dir/index.html\"");
		assertEquals(new URL("http://place.fr/dir/index.html"), cfg.getStartUrl());
	}

	@Test
	public void parallelDownloads() throws Exception {
		BaseConfiguration cfg = new TextConfiguration("25 parallel downloads start at \"http://nowhere.com\"");
		assertTrue(cfg.isValid());
		assertEquals(25, cfg.getMaxConcurrentRequests());

		cfg = new TextConfiguration("-17 parallel downloads start at \"http://nowhere.com\\\"");
		assertFalse(cfg.isValid());
	}
}
