package org.mdolidon.hamster.configuration;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.mdolidon.hamster.configuration.antlrGenerated.HamsterConfigLexer;
import org.mdolidon.hamster.configuration.antlrGenerated.HamsterConfigParser;
import org.mdolidon.hamster.configuration.antlrGenerated.HamsterConfigParser.ConfigContext;

/**
 * Upon construction, this class drives an ANTLR parser to analyze
 * the configuration text that is passed to it as a string, and
 * sets itself up (via an external ParserListener object) accordingly.
 *
 */
public class TextConfiguration extends BaseConfiguration {

	private static Logger logger = LogManager.getLogger();

	private boolean hadParserErrors = false;
	private boolean hadListenerErrors = false;

	private List<String> parserErrors;
	private List<String> listenerErrors;

	public TextConfiguration(String configText) throws Exception {
		super();

		logger.trace("Instanciating configuration from text");

		RecognitionErrorListener errorListener = new RecognitionErrorListener();

		// ANTLR boilerplate
		HamsterConfigLexer lexer = new HamsterConfigLexer(CharStreams.fromString(configText));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		HamsterConfigParser parser = new HamsterConfigParser(tokens);
		lexer.removeErrorListeners();
		parser.removeErrorListeners();
		lexer.addErrorListener(errorListener);
		parser.addErrorListener(errorListener);

		ConfigContext ctx = parser.config();
		ParseTreeWalker walker = new ParseTreeWalker();
		ParserListener parserListener = new ParserListener(this);
		walker.walk(parserListener, ctx);

		hadParserErrors = errorListener.hasErrors();
		hadListenerErrors = parserListener.hasErrors();
		
		parserErrors = errorListener.listErrors();
		listenerErrors = parserListener.listErrors();
	}

	@Override
	public boolean isValid() {
		return super.isValid() && !hadListenerErrors && !hadParserErrors;
	}

	public List<String> listErrors() {
		List<String> allErrorMessages = new ArrayList<>(15);
		allErrorMessages.addAll(parserErrors);
		allErrorMessages.addAll(super.listErrors());
		allErrorMessages.addAll(listenerErrors);
		return allErrorMessages;
	}

	@Override
	public String getErrorMessage() {
		return String.join("\n", listErrors());
	}

}
