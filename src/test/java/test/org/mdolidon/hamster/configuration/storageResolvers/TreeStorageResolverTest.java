package test.org.mdolidon.hamster.configuration.storageResolvers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import java.net.URL;

import org.junit.Test;
import org.mdolidon.hamster.configuration.TreeStorageResolver;
import org.mdolidon.hamster.configuration.IStorageResolver;
import org.mdolidon.hamster.core.IConfiguration;
import org.mdolidon.hamster.core.Link;
import org.mdolidon.hamster.matchers.All;

public class TreeStorageResolverTest {
	private String startUrlStr = "http://thing.com/app";

	@Test
	public void sameUrlMapsToSameFile() throws Exception {
		IConfiguration cfg = new MockConfig(startUrlStr);
		IStorageResolver r = new TreeStorageResolver(new All(), "dir");

		Link l1 = new Link(new URL(startUrlStr + "/folder/index.html"), 1, cfg);
		Link l2 = new Link(new URL(startUrlStr + "/folder/index.html"), 2, cfg);

		assertNotNull(r.getStorageFile(l1));
		assertEquals(r.getStorageFile(l1), r.getStorageFile(l2));
	}

	@Test
	public void sameUrlWithDifferentHashMapsToSameFile() throws Exception {
		IConfiguration cfg = new MockConfig(startUrlStr);
		IStorageResolver r = new TreeStorageResolver(new All(), "dir");

		Link l0 = new Link(new URL(startUrlStr + "/folder/index.html"), 1, cfg);
		Link l1 = new Link(new URL(startUrlStr + "/folder/index.html#one"), 1, cfg);
		Link l2 = new Link(new URL(startUrlStr + "/folder/index.html#two"), 2, cfg);

		assertNotNull(r.getStorageFile(l0));
		assertEquals(r.getStorageFile(l0), r.getStorageFile(l1));
		assertEquals(r.getStorageFile(l0), r.getStorageFile(l2));
	}

	@Test
	public void worksIfNoUnderDirSpecified() throws Exception {
		IConfiguration cfg = new MockConfig(startUrlStr);
		IStorageResolver r = new TreeStorageResolver(new All(), null);

		Link l1 = new Link(new URL(startUrlStr + "index.html"), 1, cfg);

		assertNotNull(r.getStorageFile(l1));
		assertNotNull(r.getStorageFile(l1).getParentFile());
	}

	@Test
	public void noCollisionWithFolderNames() throws Exception {

		// collision is tolerated if folder names end with what looks
		// like a file extension

		IConfiguration cfg = new MockConfig(startUrlStr);
		IStorageResolver r = new TreeStorageResolver(new All(), null);

		Link l1 = new Link(new URL(startUrlStr + "/folder"), 1, cfg);
		Link l2 = new Link(new URL(startUrlStr + "/folder/file.html"), 2, cfg);

		assertNotEquals(r.getStorageFile(l1), r.getStorageFile(l2));
		assertNotEquals(r.getStorageFile(l1), r.getStorageFile(l2).getParentFile());
	}

	@Test
	public void parentDirNameLikeLinkPath() throws Exception {
		IConfiguration cfg = new MockConfig(startUrlStr);
		IStorageResolver r = new TreeStorageResolver(new All(), "dir");

		Link l1 = new Link(new URL(startUrlStr + "/one/index.html"), 1, cfg);
		Link l2 = new Link(new URL(startUrlStr + "/one/two/index.html#one"), 1, cfg);
		Link l3 = new Link(new URL(startUrlStr + "/one/two/three/index.html#two"), 2, cfg);

		assertEquals("one", r.getStorageFile(l1).getParentFile().getName());
		assertEquals("two", r.getStorageFile(l2).getParentFile().getName());
		assertEquals("one", r.getStorageFile(l2).getParentFile().getParentFile().getName());
		assertEquals("three", r.getStorageFile(l3).getParentFile().getName());
		assertEquals("two", r.getStorageFile(l3).getParentFile().getParentFile().getName());
	}

	@Test
	public void decentFileNamesPreserved() throws Exception {

		IConfiguration cfg = new MockConfig(startUrlStr);
		IStorageResolver r = new TreeStorageResolver(new All(), null);

		Link l1 = new Link(new URL(startUrlStr + "/folder/useful_prog-1.2.3.jar"), 1, cfg);

		assertEquals("useful_prog-1.2.3.jar", r.getStorageFile(l1).getName());
	}

}
