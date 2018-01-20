package test.org.mdolidon.hamster.matchers;

import java.net.URL;

import static org.junit.Assert.*;
import org.junit.Test;
import org.mdolidon.hamster.core.IConfiguration;
import org.mdolidon.hamster.core.Link;
import org.mdolidon.hamster.matchers.Resources;

import test.org.mdolidon.hamster.mocks.BaseMockConfig;

public class ResourcesTest {

	@Test
	public void onCommonExtensions() throws Exception {

		Resources matcher = new Resources();
		IConfiguration cfg = new BaseMockConfig();

		Link link = new Link(new URL("http://place.by/the/fire"), 0, cfg);
		assertFalse(matcher.matches(link));

		link = new Link(new URL("http://place.by/index.html"), 0, cfg);
		assertFalse(matcher.matches(link));

		link = new Link(new URL("http://place.by/flash.swf"), 0, cfg);
		assertTrue(matcher.matches(link));

		link = new Link(new URL("http://place.by/style.css"), 0, cfg);
		assertTrue(matcher.matches(link));

		link = new Link(new URL("http://some.other.place/out/there/image.png"), 0, cfg);
		assertTrue(matcher.matches(link));
	}

	@Test
	public void onUpperCaseUrls() throws Exception {

		Resources matcher = new Resources();
		IConfiguration cfg = new BaseMockConfig();

		Link link = new Link(new URL("http://place.by/style.CSS"), 0, cfg);
		assertTrue(matcher.matches(link));

	}

	@Test
	public void onExtensionBeforeQueryString() throws Exception {
		Resources matcher = new Resources();
		IConfiguration cfg = new BaseMockConfig();

		Link link = new Link(new URL("http://place.by/style.css?1234abcd"), 0, cfg);
		assertTrue(matcher.matches(link));

		link = new Link(new URL("http://place.by/style.html?1234abcd"), 0, cfg);
		assertFalse(matcher.matches(link));

	}

	@Test
	public void onLinkFlags() throws Exception {
		Resources matcher = new Resources();
		IConfiguration cfg = new BaseMockConfig();
		Link link = new Link(new URL("http://some.other.place/out/1234avatar"), 0, cfg);
		assertFalse(matcher.matches(link));

		link.setFlag_image();
		assertTrue(matcher.matches(link));
	}

}
