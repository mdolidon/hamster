package test.org.mdolidon.hamster.matchers;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.net.URL;

import org.junit.Test;
import org.mdolidon.hamster.core.Link;
import org.mdolidon.hamster.matchers.SameDomain;

import test.org.mdolidon.hamster.mocks.BaseMockConfig;

public class SameDomainTest {
	
	@Test
	public void matchesOnExactSameDomain() throws Exception {
		assertTrue( matchesTogether("http://www.place.com/home/page", "http://www.place.com/anyplace/else"));
	}
	
	@Test
	public void rejectsDifferentDomain() throws Exception {
		assertFalse( matchesTogether("http://www.place.com/home/page", "http://www.otherplace.com/home/page"));
	}
	
	@Test
	public void matchesSameDomainOnDifferentProtocol() throws Exception {
		assertTrue( matchesTogether("http://www.place.com/home/page", "https://www.place.com/anyplace/else"));
	}
	
	@Test
	public void matchesSameDomainOnDifferentPort() throws Exception {
		assertTrue( matchesTogether("http://www.place.com:80/home/page", "http://www.place.com:81/anyplace/else"));
	}
	
	@Test
	public void rejectsDifferentSubdomain() throws Exception {
		// this is really necessary to avoid jumping into pretend- well known domains
		assertFalse( matchesTogether("http://www.place.com/home/page", "http://subdomain.place.com/anyplace/else"));
	}

	@Test
	public void matchesOnSameIP() throws Exception {
		assertTrue( matchesTogether("http://10.2.0.55/home/page", "http://10.2.0.55/anyplace/else"));
	}
	
	
	private boolean matchesTogether(String startUrl, String linkUrl) throws Exception {
		BaseMockConfig cfg = new BaseMockConfig();
		cfg.setStartUrl(new URL(startUrl));
		Link l = new Link(new URL(linkUrl), 2, cfg);
		SameDomain matcher = new SameDomain(cfg);
		return matcher.matches(l);	
	}

}
