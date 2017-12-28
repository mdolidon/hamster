package test.org.mdolidon.hamster.storageResolvers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.io.File;
import java.net.URL;

import org.junit.Test;
import org.mdolidon.hamster.configuration.FlatStorageResolver;
import org.mdolidon.hamster.configuration.IStorageResolver;
import org.mdolidon.hamster.core.IConfiguration;
import org.mdolidon.hamster.core.Link;
import org.mdolidon.hamster.matchers.All;

public class FlatStorageResolverTest {
	private String startUrlStr = "http://thing.com/app";

	
	@Test
	public void sameUrlMapsToSameFile() throws Exception {
		IConfiguration cfg = new Config(startUrlStr);
		IStorageResolver r = new FlatStorageResolver(new All(), cfg, "dir");

		Link l1 = new Link(new URL(startUrlStr + "/folder/index.html"), 1, cfg);
		Link l2 = new Link(new URL(startUrlStr + "/folder/index.html"), 2, cfg);

		assertNotNull(r.getStorageFile(l1));
		assertEquals(r.getStorageFile(l1), r.getStorageFile(l2));
	}
	
	@Test
	public void sameUrlWithDifferentHashMapsToSameFile() throws Exception {
		IConfiguration cfg = new Config(startUrlStr);
		IStorageResolver r = new FlatStorageResolver(new All(), cfg, "dir");

		Link l0 = new Link(new URL(startUrlStr + "/folder/index.html"), 1, cfg);
		Link l1 = new Link(new URL(startUrlStr + "/folder/index.html#one"), 1, cfg);
		Link l2 = new Link(new URL(startUrlStr + "/folder/index.html#two"), 2, cfg);

		assertNotNull(r.getStorageFile(l0));
		assertEquals(r.getStorageFile(l0), r.getStorageFile(l1));
		assertEquals(r.getStorageFile(l0), r.getStorageFile(l2));
	}
	
	
	@Test
	public void inSameDirectory() throws Exception {
		IConfiguration cfg = new Config(startUrlStr);
		IStorageResolver r = new FlatStorageResolver(new All(), cfg, "dir");

		Link l1 = new Link(new URL(startUrlStr + "/folder/index.html"), 1, cfg);
		Link l2 = new Link(new URL(startUrlStr + "/elsewhere/deep/across/nowhere.html"), 2, cfg);

		assertNotNull(r.getStorageFile(l1));
		assertEquals(r.getStorageFile(l1).getParentFile(), r.getStorageFile(l2).getParentFile());
		assertNotEquals(r.getStorageFile(l1), r.getStorageFile(l2));
	}

	@Test
	public void worksIfNoUnderDirSpecified() throws Exception {
		IConfiguration cfg = new Config(startUrlStr);
		IStorageResolver r = new FlatStorageResolver(new All(), cfg, null);

		Link l1 = new Link(new URL(startUrlStr + "/folder/index.html"), 1, cfg);
		Link l2 = new Link(new URL(startUrlStr + "/elsewhere/deep/across/nowhere.html"), 2, cfg);

		assertNotNull(r.getStorageFile(l1));
		assertNotNull(r.getStorageFile(l1).getParentFile());
		assertNotEquals(r.getStorageFile(l1), r.getStorageFile(l2));
	}

	@Test
	public void noCollisionIfSameFilename() throws Exception {
		IConfiguration cfg = new Config(startUrlStr);
		IStorageResolver r = new FlatStorageResolver(new All(), cfg, null);

		Link l1 = new Link(new URL(startUrlStr + "/folder/file.html"), 1, cfg);
		Link l2 = new Link(new URL(startUrlStr + "/elsewhere/deep/across/file.html"), 2, cfg);

		assertNotEquals(r.getStorageFile(l1), r.getStorageFile(l2));
	}

	@Test
	public void startUrlAsIndexHtml() throws Exception {
		IConfiguration cfg = new Config(startUrlStr);
		IStorageResolver r = new FlatStorageResolver(new All(), cfg, "underDir");

		Link l1 = new Link(new URL(startUrlStr), 1, cfg);
		File result = r.getStorageFile(l1);
		assertEquals("index.html", result.getName());
		assertNull(result.getParentFile());
	}
}
