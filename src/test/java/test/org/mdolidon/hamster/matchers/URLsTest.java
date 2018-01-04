package test.org.mdolidon.hamster.matchers;

import java.net.URL;
import static org.junit.Assert.*;
import org.junit.Test;
import org.mdolidon.hamster.core.IConfiguration;
import org.mdolidon.hamster.core.Link;
import org.mdolidon.hamster.matchers.URLs;

import test.org.mdolidon.hamster.mocks.BaseMockConfig;

public class URLsTest {

	@Test
	public void seesUrlExtension() throws Exception {
		assertTrue(matches(".*\\.jpg", "http://place.at/image.jpg"));
		assertFalse(matches(".*\\.jpg", "http://place.at/image.png"));
	}
	
	
	@Test
	public void seesPath() throws Exception {
		assertTrue(matches(".*/hidden/.*", "http://place.at/hidden/image.jpg"));
		assertFalse(matches(".*/hidden/.*", "http://place.at/visible/image.jpg"));
	}
	
	@Test
	public void seesHost() throws Exception {
		assertTrue(matches(".*://place.at/.*", "http://place.at/hidden/image.jpg"));
		assertFalse(matches(".*://place.at/.*", "http://elsewhere.net/hidden/image.jpg"));
	}
	
	@Test
	public void seesProtocol() throws Exception {
		assertTrue(matches("http[^s].*", "http://place.at/hidden/image.jpg"));
		assertFalse(matches("http[^s].*", "https://place.at/hidden/image.jpg"));
	}

	@Test
	public void seesTheQueryString() throws Exception {
		assertTrue(matches(".*thing=good.*", "http://place.at/taste.php?thing=good"));
		assertFalse(matches(".*thing=good.*", "https://place.at/taste.php?thing=bad"));
	}

	@Test
	public void doesNotCareAboutTheHash() throws Exception {
		assertFalse(matches(".*thing=good.*", "http://place.at/taste.js#thing=good"));
		assertFalse(matches(".*thing=good.*", "https://place.at/taste.js#thing=bad"));
	}
	
	@Test
	public void seesAcrossUrlParts() throws Exception {
		assertTrue(matches("https.*place.*do.*\\?things=great", "https://place.at/do.php?things=great"));
	}
	
	
	@Test
	public void needsTheWholeUrlToMatch() throws Exception {
		assertTrue(matches(".*place.at.*", "http://place.at/hidden/image.jpg"));
		assertFalse(matches("place.at", "https://place.at/hidden/image.jpg"));
	}
	

	@Test
	public void replacing() throws Exception {
		URLs matcher = new URLs(".*topic.([0-9]+).message.([0-9]+).*");
		IConfiguration cfg = new BaseMockConfig();

		Link link = new Link(new URL("http://place.at/stuff.php?topic=444&message=555"), 1, cfg);
		assertTrue(matcher.matches(link));

		URLs.MatchDetails md = matcher.matchWithDetails(link);
		assertTrue(md.isMatch());
		assertEquals("tidy/444/555.html", md.runTemplate("tidy/$1/$2.html"));
	}

	
	
	private boolean matches(String urlPattern, String linkUrl) throws Exception {
		IConfiguration cfg = new BaseMockConfig();
		URLs matcher = new URLs(urlPattern);
		Link link = new Link(new URL(linkUrl), 1, cfg);
		return matcher.matches(link);
	}

}
