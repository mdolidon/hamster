package test.org.mdolidon.hamster.matchers;

import java.net.URL;
import static org.junit.Assert.*;
import org.junit.Test;
import org.mdolidon.hamster.configuration.BaseConfiguration;
import org.mdolidon.hamster.core.Link;
import org.mdolidon.hamster.matchers.Subpaths;

public class SubpathMatcherTest {

	@Test
	public void basicTests() throws Exception {
		BaseConfiguration cfg = new BaseConfiguration();
		Subpaths matcher = new Subpaths(cfg);

		cfg.setStartUrl(new URL("http://place.by/the/"));

		Link link = new Link(new URL("http://place.by/the/fire"), 0, cfg);
		assertTrue(matcher.matches(link));

		link = new Link(new URL("http://place.by/the/deep/deep/old/well"), 0, cfg);
		assertTrue(matcher.matches(link));

		link = new Link(new URL("http://place.by/a/town"), 0, cfg);
		assertFalse(matcher.matches(link));

		link = new Link(new URL("http://some.other.place/out/there"), 0, cfg);
		assertFalse(matcher.matches(link));

	}

}
