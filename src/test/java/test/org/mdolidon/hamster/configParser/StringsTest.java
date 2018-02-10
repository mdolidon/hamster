package test.org.mdolidon.hamster.configParser;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mdolidon.hamster.configuration.BaseConfiguration;
import org.mdolidon.hamster.configuration.TextConfiguration;

public class StringsTest {

	@Test
	public void outerQuotesNotInString() throws Exception {
		BaseConfiguration cfg = new TextConfiguration(
				"start at \"http://place.fr\" cookies  \"one\"=\"two\" on \"place.fr\"");

		assertEquals("two", cfg.getFirstCookieDirective().getValue("one"));
	}

	@Test
	public void unquotedQuoteInString() throws Exception {
		BaseConfiguration cfg = new TextConfiguration(
				"start at \"http://place.fr\" cookies  \"one\"=\"t~\"wo\" on \"place.fr\"");
		assertEquals("t\"wo", cfg.getFirstCookieDirective().getValue("one"));
	}

	// I admit this test works all right with Eclipse / Linux and I haven't bothered
	// trying with other IDEs / systems. If your IDE runs with a different CWD, this
	// may fail. That's OK by me.
	@Test
	public void getStringFromFile() throws Exception {
		BaseConfiguration cfg = new TextConfiguration(
				"start at \"http://place.fr\" cookies  \"one\"=file \"src/test/resources/file_content_string_test.txt\" on \"place.fr\"");
		assertEquals("Oh baby it's a wild world.", cfg.getFirstCookieDirective().getValue("one"));
	}
	
	@Test
	public void emptyStringIfFileDoesNotExist() throws Exception {
		BaseConfiguration cfg = new TextConfiguration(
				"start at \"http://place.fr\" cookies  \"one\"=file \"my_name_is_nobody\" on \"place.fr\"");
		assertEquals("", cfg.getFirstCookieDirective().getValue("one"));
	}
}
