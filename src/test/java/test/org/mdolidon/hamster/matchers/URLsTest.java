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
	public void matching() throws Exception {
		IConfiguration cfg = new BaseMockConfig();
		URLs matcher = new URLs(".*\\.jpg");

		Link link = new Link(new URL("http://place.at/image.jpg"), 0, cfg);
		assertTrue(matcher.matches(link));

		link = new Link(new URL("http://place.at/image.png"), 0, cfg);
		assertFalse(matcher.matches(link));
	}

	@Test
	public void replacing() throws Exception {
		URLs matcher = new URLs(".*topic.([0-9]+).message.([0-9]+).*");
		IConfiguration cfg = new BaseMockConfig();

		Link link = new Link(new URL("http://place.at/image.jpg"), 0, cfg);
		assertFalse(matcher.matches(link));

		link = new Link(new URL("http://place.at/stuff.php?topic=444&message=555"), 0, cfg);
		assertTrue(matcher.matches(link));

		URLs.MatchDetails md = matcher.matchWithDetails(link);
		assertTrue(md.isMatch());
		assertEquals("tidy/444/555.html", md.runTemplate("tidy/$1/$2.html"));
	}

}
