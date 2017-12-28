package test.org.mdolidon.hamster.storageResolvers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.io.File;
import java.net.URL;

import org.junit.Test;
import org.mdolidon.hamster.configuration.IStorageResolver;
import org.mdolidon.hamster.configuration.RegexStorageResolver;
import org.mdolidon.hamster.core.IConfiguration;
import org.mdolidon.hamster.core.Link;
import org.mdolidon.hamster.matchers.URLs;

public class RegexStorageResolverTest {
	
	private String startUrlStr = "http://thing.com/app";

	@Test
	public void sameUrlWithDifferentHashMapsToSameFile() throws Exception {
		IConfiguration cfg = new Config(startUrlStr);
		IStorageResolver r = new RegexStorageResolver(new URLs("(.*)"), "$1");

		Link l0 = new Link(new URL(startUrlStr + "/folder/index.html"), 1, cfg);
		Link l1 = new Link(new URL(startUrlStr + "/folder/index.html#one"), 1, cfg);
		Link l2 = new Link(new URL(startUrlStr + "/folder/index.html#two"), 2, cfg);

		assertNotNull(r.getStorageFile(l0));
		assertEquals(r.getStorageFile(l0), r.getStorageFile(l1));
		assertEquals(r.getStorageFile(l0), r.getStorageFile(l2));
	}

	@Test
	public void mapsUrlToFile() throws Exception {
		IConfiguration cfg = new Config(startUrlStr);
		IStorageResolver r = new RegexStorageResolver(new URLs(".*topic.([0-9]+).message.([0-9]+).*"),
				"board/$1/$2.html");

		Link l0 = new Link(new URL(startUrlStr + "/index.php?topic=36&message=49"), 1, cfg);

		File file = r.getStorageFile(l0);
		assertEquals("49.html", file.getName());
		assertEquals("36", file.getParentFile().getName());
		assertEquals("board", file.getParentFile().getParentFile().getName());
		assertNull(file.getParentFile().getParentFile().getParentFile());
	}

}
