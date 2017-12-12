package org.mdolidon.hamster.configuration;

import java.util.BitSet;
import java.util.List;

import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;
import org.mdolidon.hamster.core.ErrorsBoard;


/**
 * Translates ANTLR parsing errors into a format that I like.
 */
public class RecognitionErrorListener implements ANTLRErrorListener {
	
	ErrorsBoard errorsBoard;
	
	public RecognitionErrorListener() {
	    errorsBoard = new ErrorsBoard();
	}
	
	public boolean hasErrors() {
		return errorsBoard.hasErrors();
	}
	
	public String getErrorMessage() {
		return errorsBoard.getErrorMessage();
	}
	
	public List<String> listErrors() {
		return errorsBoard.listErrors();
	}
	
	


	@Override
	public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine,
			String msg, RecognitionException e) {
		
		errorsBoard.note("Line " +line + " : " + msg);
	}

	@Override
	public void reportAmbiguity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, boolean exact,
			BitSet ambigAlts, ATNConfigSet configs) {

	}

	@Override
	public void reportAttemptingFullContext(Parser recognizer, DFA dfa, int startIndex, int stopIndex,
			BitSet conflictingAlts, ATNConfigSet configs) {

	}

	@Override
	public void reportContextSensitivity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, int prediction,
			ATNConfigSet configs) {

	}

}
