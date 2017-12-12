package org.mdolidon.hamster.configParser;

import static org.junit.Assert.*;
import org.junit.Test;
import org.mdolidon.hamster.configuration.TextConfiguration;
import org.mdolidon.hamster.core.IConfiguration;

public class ParseErrorsTest {

	@Test
	public void expectStartDirective() throws Exception {
		IConfiguration cfg = new TextConfiguration("start at \"http://place.at\"");
		if(!cfg.isValid()) {
			System.out.println(cfg.getErrorMessage());
		}
		assertTrue(cfg.isValid());


		cfg = new TextConfiguration("get urls \"http://place.at\"");
		assertFalse(cfg.isValid());
	}

	
	@Test
	public void unknownToken() {
		try {
			IConfiguration cfg = new TextConfiguration("start at \"http://place.at\"\nrandom stuff");
			assertFalse(cfg.isValid());
		} catch (Exception e) {
			fail("TextConfiguration threw an exception instead of just appending a syntax error when an unknown token was present.");
		}
	}


	@Test
	public void incompleteRules() {
		try {
			IConfiguration cfg = new TextConfiguration("start at \"http://place.at\"\n    avoid");
			assertFalse(cfg.isValid());
		} catch (Exception e) {
			fail("TextConfiguration threw an exception instead of just appending a syntax error when an incomplete avoid rule was present.");
		}
	}
}
