package test.org.mdolidon.hamster.configParser;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.net.URL;

import org.junit.Test;
import org.mdolidon.hamster.configuration.BaseConfiguration;
import org.mdolidon.hamster.configuration.TextConfiguration;
import org.mdolidon.hamster.core.Link;
import org.mdolidon.hamster.core.TargetProfile;

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

	@Test
	public void getUnknown() throws Exception {
		BaseConfiguration cfg = new TextConfiguration(
				"get unknown items on domain start at \"http://anywhere.com\" save flat under \".\"");
		assertTrue(cfg.isValid());

		Link link = new Link(new URL("http://elsewhere.com/testcontent.html"), 1, cfg);
		TargetProfile profile = cfg.getTargetProfile(link);
		assertFalse(profile.isPartOfTargetSet());
		assertFalse(profile.needsDownload());

		link = new Link(new URL("http://anywhere.com/testcontent.html"), 1, cfg);
		profile = cfg.getTargetProfile(link);
		assertTrue(profile.isPartOfTargetSet());
		assertTrue(profile.needsDownload());

		File f = cfg.getStorageFile(link);
		f.createNewFile();

		profile = cfg.getTargetProfile(link);
		assertTrue(profile.isPartOfTargetSet());
		assertFalse(profile.needsDownload());

		f.delete();
	}
}
