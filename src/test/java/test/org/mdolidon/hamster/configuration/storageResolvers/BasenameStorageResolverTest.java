package test.org.mdolidon.hamster.configuration.storageResolvers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.io.File;
import java.net.URL;

import org.junit.Test;
import org.mdolidon.hamster.configuration.BasenameStorageResolver;
import org.mdolidon.hamster.configuration.IStorageResolver;
import org.mdolidon.hamster.core.IConfiguration;
import org.mdolidon.hamster.core.Link;
import org.mdolidon.hamster.matchers.All;

public class BasenameStorageResolverTest {
	private String startUrlStr = "http://thing.com/app";

	
	@Test
	public void sameUrlMapsToSameFile() throws Exception {
		IConfiguration cfg = new MockConfig(startUrlStr);
		IStorageResolver r = new BasenameStorageResolver(new All(), "dir");

		Link l1 = new Link(new URL(startUrlStr + "/folder/index.html"), 1, cfg);
		Link l2 = new Link(new URL(startUrlStr + "/folder/index.html"), 2, cfg);

		assertNotNull(r.getStorageFile(l1));
		assertEquals(r.getStorageFile(l1), r.getStorageFile(l2));
	}
	
	@Test
	public void sameUrlWithDifferentHashMapsToSameFile() throws Exception {
		IConfiguration cfg = new MockConfig(startUrlStr);
		IStorageResolver r = new BasenameStorageResolver(new All(), "dir");

		Link l0 = new Link(new URL(startUrlStr + "/folder/index.html"), 1, cfg);
		Link l1 = new Link(new URL(startUrlStr + "/folder/index.html#one"), 1, cfg);
		Link l2 = new Link(new URL(startUrlStr + "/folder/index.html#two"), 2, cfg);

		assertNotNull(r.getStorageFile(l0));
		assertEquals(r.getStorageFile(l0), r.getStorageFile(l1));
		assertEquals(r.getStorageFile(l0), r.getStorageFile(l2));
	}
	
	
	@Test
	public void inSameDirectory() throws Exception {
		IConfiguration cfg = new MockConfig(startUrlStr);
		IStorageResolver r = new BasenameStorageResolver(new All(), "dir");

		Link l1 = new Link(new URL(startUrlStr + "/folder/index.html"), 1, cfg);
		Link l2 = new Link(new URL(startUrlStr + "/elsewhere/deep/across/nowhere.html"), 2, cfg);

		assertNotNull(r.getStorageFile(l1));
		assertEquals(r.getStorageFile(l1).getParentFile(), r.getStorageFile(l2).getParentFile());
		assertNotEquals(r.getStorageFile(l1), r.getStorageFile(l2));
	}

	@Test
	public void worksIfNoUnderDirSpecified() throws Exception {
		IConfiguration cfg = new MockConfig(startUrlStr);
		IStorageResolver r = new BasenameStorageResolver(new All(), null);

		Link l1 = new Link(new URL(startUrlStr + "/folder/index.html"), 1, cfg);
		Link l2 = new Link(new URL(startUrlStr + "/elsewhere/deep/across/nowhere.html"), 2, cfg);

		assertNotNull(r.getStorageFile(l1));
		assertNotNull(r.getStorageFile(l1).getParentFile());
		assertNotEquals(r.getStorageFile(l1), r.getStorageFile(l2));
	}
	
	@Test
	public void preservesSimpleBasename() throws Exception {
		IConfiguration cfg = new MockConfig(startUrlStr);
		IStorageResolver r = new BasenameStorageResolver(new All(), null);

		Link l1 = new Link(new URL(startUrlStr + "/folder/file.zip"), 1, cfg);

		assertNotNull(r.getStorageFile(l1));
		assertEquals("file.zip", r.getStorageFile(l1).getName());
	}
	
	@Test
	public void preservesBasenameBeforeQuery() throws Exception {
		IConfiguration cfg = new MockConfig(startUrlStr);
		IStorageResolver r = new BasenameStorageResolver(new All(), null);

		Link l1 = new Link(new URL(startUrlStr + "/folder/file.zip?query=should&be=ignored"), 1, cfg);

		assertNotNull(r.getStorageFile(l1));
		assertEquals("file.zip", r.getStorageFile(l1).getName());
	}
	
	
}
