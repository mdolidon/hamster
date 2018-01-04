package test.org.mdolidon.hamster.matchers;

import java.net.URL;
import static org.junit.Assert.*;
import org.junit.Test;
import org.mdolidon.hamster.configuration.BaseConfiguration;
import org.mdolidon.hamster.core.Link;
import org.mdolidon.hamster.matchers.Subpaths;

public class SubpathTest {

	@Test
	public void matchesSamePath() throws Exception {
		assertTrue(matches("http://hello.com/this/way", "http://hello.com/this/way"));
	}

	@Test
	public void matchesChildPath() throws Exception {
		assertTrue(matches("http://hello.com/this/way", "http://hello.com/this/way/out"));
	}

	@Test
	public void refusesLengthenedPath() throws Exception {
		assertFalse(matches("http://hello.com/this/way", "http://hello.com/this/wayfarer"));
	}

	@Test
	public void refusesParentPath() throws Exception {
		assertFalse(matches("http://hello.com/this/way", "http://hello.com/this"));
	}
	
	@Test
	public void refusesOtherDomain() throws Exception {
		assertFalse(matches("http://hello.com/this/way", "http://buon-giorno.com/this/way"));
	}

	
	
	private boolean matches(String cfgStartUrl, String linkUrl) throws Exception {
		BaseConfiguration cfg = new BaseConfiguration();
		Subpaths matcher = new Subpaths(cfg);
		cfg.setStartUrl(new URL(cfgStartUrl));
		Link link = new Link(new URL(linkUrl), 1, cfg);
		return matcher.matches(link);
	}

}
