// Generated from HamsterConfigLexer.g4 by ANTLR 4.7.1
package org.mdolidon.hamster.configuration.antlrGenerated;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HamsterConfigLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ALL=1, AS=2, AS_TREE=3, AVOID=4, CHECK_IN_AT=5, CSS=6, DOMAIN=7, EACH=8, 
		FLAT=9, FROM=10, GET=11, GET_UNKNOWN=12, IMAGES=13, ITEMS_ON_DOMAIN=14, 
		JUMPS=15, JUMPS_AND_MORE=16, KB=17, MAXIMUM=18, MB=19, ON=20, OUTSIDE=21, 
		PARALLEL_DOWNLOADS=22, PASSWORD=23, POST=24, RESOURCES=25, SAVE=26, START_AT=27, 
		SUBPATHS=28, UNDER=29, UNKNOWN=30, UP_TO=31, URLS=32, USER=33, EQUALS=34, 
		INTEGER_LITERAL=35, OPENING_QUOTE=36, COMMENT=37, WS=38, WORD=39, CLOSING_QUOTE=40, 
		STRING_LITERAL=41;
	public static final int
		IN_STRING_LITERAL=1;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "IN_STRING_LITERAL"
	};

	public static final String[] ruleNames = {
		"ALL", "AS", "AS_TREE", "AVOID", "CHECK_IN_AT", "CSS", "DOMAIN", "EACH", 
		"FLAT", "FROM", "GET", "GET_UNKNOWN", "IMAGES", "ITEMS_ON_DOMAIN", "JUMPS", 
		"JUMPS_AND_MORE", "KB", "MAXIMUM", "MB", "ON", "OUTSIDE", "PARALLEL_DOWNLOADS", 
		"PASSWORD", "POST", "RESOURCES", "SAVE", "START_AT", "SUBPATHS", "UNDER", 
		"UNKNOWN", "UP_TO", "URLS", "USER", "EQUALS", "INTEGER_LITERAL", "OPENING_QUOTE", 
		"COMMENT", "WS", "WORD", "CLOSING_QUOTE", "STRING_LITERAL"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'all'", "'as'", null, "'avoid'", null, "'css'", "'domain'", "'each'", 
		"'flat'", "'from'", "'get'", null, "'images'", null, null, null, "'Kb'", 
		"'maximum'", "'Mb'", "'on'", "'outside'", null, "'password'", "'post'", 
		"'resources'", "'save'", null, "'subpaths'", "'under'", "'unknown'", null, 
		"'urls'", "'user'", "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ALL", "AS", "AS_TREE", "AVOID", "CHECK_IN_AT", "CSS", "DOMAIN", 
		"EACH", "FLAT", "FROM", "GET", "GET_UNKNOWN", "IMAGES", "ITEMS_ON_DOMAIN", 
		"JUMPS", "JUMPS_AND_MORE", "KB", "MAXIMUM", "MB", "ON", "OUTSIDE", "PARALLEL_DOWNLOADS", 
		"PASSWORD", "POST", "RESOURCES", "SAVE", "START_AT", "SUBPATHS", "UNDER", 
		"UNKNOWN", "UP_TO", "URLS", "USER", "EQUALS", "INTEGER_LITERAL", "OPENING_QUOTE", 
		"COMMENT", "WS", "WORD", "CLOSING_QUOTE", "STRING_LITERAL"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public HamsterConfigLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "HamsterConfigLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2+\u01af\b\1\b\1\4"+
		"\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n"+
		"\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2"+
		"\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\6\4b\n\4\r\4\16\4c\3\4\3\4\3"+
		"\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\6\6x\n"+
		"\6\r\6\16\6y\3\6\3\6\3\6\3\6\6\6\u0080\n\6\r\6\16\6\u0081\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\3\r\6\r\u00aa\n\r\r\r\16\r\u00ab\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\6"+
		"\17\u00c4\n\17\r\17\16\17\u00c5\3\17\3\17\3\17\3\17\6\17\u00cc\n\17\r"+
		"\17\16\17\u00cd\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\5\20\u00dd\n\20\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00e5\n"+
		"\21\3\21\6\21\u00e8\n\21\r\21\16\21\u00e9\3\21\3\21\3\21\3\21\3\21\6\21"+
		"\u00f1\n\21\r\21\16\21\u00f2\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\6\27\u011d\n\27\r\27\16\27\u011e\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u012b\n\27\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\6\34\u0151\n\34\r\34\16\34\u0152\3\34\3\34\3\34\3\35\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \6 \u0173\n \r \16 "+
		"\u0174\3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3$\6$\u0187\n"+
		"$\r$\16$\u0188\3%\3%\3%\3%\3%\3&\3&\7&\u0192\n&\f&\16&\u0195\13&\3&\3"+
		"&\3\'\6\'\u019a\n\'\r\'\16\'\u019b\3\'\3\'\3(\6(\u01a1\n(\r(\16(\u01a2"+
		"\3)\3)\3)\3)\3)\3*\7*\u01ab\n*\f*\16*\u01ae\13*\2\2+\4\3\6\4\b\5\n\6\f"+
		"\7\16\b\20\t\22\n\24\13\26\f\30\r\32\16\34\17\36\20 \21\"\22$\23&\24("+
		"\25*\26,\27.\30\60\31\62\32\64\33\66\348\35:\36<\37> @!B\"D#F$H%J&L\'"+
		"N(P)R*T+\4\2\3\7\3\2\62;\3\2\f\f\5\2\13\f\17\17\"\"\5\2C\\aac|\3\2$$\2"+
		"\u01c0\2\4\3\2\2\2\2\6\3\2\2\2\2\b\3\2\2\2\2\n\3\2\2\2\2\f\3\2\2\2\2\16"+
		"\3\2\2\2\2\20\3\2\2\2\2\22\3\2\2\2\2\24\3\2\2\2\2\26\3\2\2\2\2\30\3\2"+
		"\2\2\2\32\3\2\2\2\2\34\3\2\2\2\2\36\3\2\2\2\2 \3\2\2\2\2\"\3\2\2\2\2$"+
		"\3\2\2\2\2&\3\2\2\2\2(\3\2\2\2\2*\3\2\2\2\2,\3\2\2\2\2.\3\2\2\2\2\60\3"+
		"\2\2\2\2\62\3\2\2\2\2\64\3\2\2\2\2\66\3\2\2\2\28\3\2\2\2\2:\3\2\2\2\2"+
		"<\3\2\2\2\2>\3\2\2\2\2@\3\2\2\2\2B\3\2\2\2\2D\3\2\2\2\2F\3\2\2\2\2H\3"+
		"\2\2\2\2J\3\2\2\2\2L\3\2\2\2\2N\3\2\2\2\2P\3\2\2\2\3R\3\2\2\2\3T\3\2\2"+
		"\2\4V\3\2\2\2\6Z\3\2\2\2\b]\3\2\2\2\nj\3\2\2\2\fp\3\2\2\2\16\u0086\3\2"+
		"\2\2\20\u008a\3\2\2\2\22\u0091\3\2\2\2\24\u0096\3\2\2\2\26\u009b\3\2\2"+
		"\2\30\u00a0\3\2\2\2\32\u00a4\3\2\2\2\34\u00b5\3\2\2\2\36\u00bc\3\2\2\2"+
		" \u00d6\3\2\2\2\"\u00de\3\2\2\2$\u00f9\3\2\2\2&\u00fc\3\2\2\2(\u0104\3"+
		"\2\2\2*\u0107\3\2\2\2,\u010a\3\2\2\2.\u0112\3\2\2\2\60\u012c\3\2\2\2\62"+
		"\u0135\3\2\2\2\64\u013a\3\2\2\2\66\u0144\3\2\2\28\u0149\3\2\2\2:\u0157"+
		"\3\2\2\2<\u0160\3\2\2\2>\u0166\3\2\2\2@\u016e\3\2\2\2B\u0179\3\2\2\2D"+
		"\u017e\3\2\2\2F\u0183\3\2\2\2H\u0186\3\2\2\2J\u018a\3\2\2\2L\u018f\3\2"+
		"\2\2N\u0199\3\2\2\2P\u01a0\3\2\2\2R\u01a4\3\2\2\2T\u01ac\3\2\2\2VW\7c"+
		"\2\2WX\7n\2\2XY\7n\2\2Y\5\3\2\2\2Z[\7c\2\2[\\\7u\2\2\\\7\3\2\2\2]^\7c"+
		"\2\2^_\7u\2\2_a\3\2\2\2`b\7\"\2\2a`\3\2\2\2bc\3\2\2\2ca\3\2\2\2cd\3\2"+
		"\2\2de\3\2\2\2ef\7v\2\2fg\7t\2\2gh\7g\2\2hi\7g\2\2i\t\3\2\2\2jk\7c\2\2"+
		"kl\7x\2\2lm\7q\2\2mn\7k\2\2no\7f\2\2o\13\3\2\2\2pq\7e\2\2qr\7j\2\2rs\7"+
		"g\2\2st\7e\2\2tu\7m\2\2uw\3\2\2\2vx\7\"\2\2wv\3\2\2\2xy\3\2\2\2yw\3\2"+
		"\2\2yz\3\2\2\2z{\3\2\2\2{|\7k\2\2|}\7p\2\2}\177\3\2\2\2~\u0080\7\"\2\2"+
		"\177~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2"+
		"\2\u0082\u0083\3\2\2\2\u0083\u0084\7c\2\2\u0084\u0085\7v\2\2\u0085\r\3"+
		"\2\2\2\u0086\u0087\7e\2\2\u0087\u0088\7u\2\2\u0088\u0089\7u\2\2\u0089"+
		"\17\3\2\2\2\u008a\u008b\7f\2\2\u008b\u008c\7q\2\2\u008c\u008d\7o\2\2\u008d"+
		"\u008e\7c\2\2\u008e\u008f\7k\2\2\u008f\u0090\7p\2\2\u0090\21\3\2\2\2\u0091"+
		"\u0092\7g\2\2\u0092\u0093\7c\2\2\u0093\u0094\7e\2\2\u0094\u0095\7j\2\2"+
		"\u0095\23\3\2\2\2\u0096\u0097\7h\2\2\u0097\u0098\7n\2\2\u0098\u0099\7"+
		"c\2\2\u0099\u009a\7v\2\2\u009a\25\3\2\2\2\u009b\u009c\7h\2\2\u009c\u009d"+
		"\7t\2\2\u009d\u009e\7q\2\2\u009e\u009f\7o\2\2\u009f\27\3\2\2\2\u00a0\u00a1"+
		"\7i\2\2\u00a1\u00a2\7g\2\2\u00a2\u00a3\7v\2\2\u00a3\31\3\2\2\2\u00a4\u00a5"+
		"\7i\2\2\u00a5\u00a6\7g\2\2\u00a6\u00a7\7v\2\2\u00a7\u00a9\3\2\2\2\u00a8"+
		"\u00aa\7\"\2\2\u00a9\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00a9\3\2"+
		"\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\7w\2\2\u00ae"+
		"\u00af\7p\2\2\u00af\u00b0\7m\2\2\u00b0\u00b1\7p\2\2\u00b1\u00b2\7q\2\2"+
		"\u00b2\u00b3\7y\2\2\u00b3\u00b4\7p\2\2\u00b4\33\3\2\2\2\u00b5\u00b6\7"+
		"k\2\2\u00b6\u00b7\7o\2\2\u00b7\u00b8\7c\2\2\u00b8\u00b9\7i\2\2\u00b9\u00ba"+
		"\7g\2\2\u00ba\u00bb\7u\2\2\u00bb\35\3\2\2\2\u00bc\u00bd\7k\2\2\u00bd\u00be"+
		"\7v\2\2\u00be\u00bf\7g\2\2\u00bf\u00c0\7o\2\2\u00c0\u00c1\7u\2\2\u00c1"+
		"\u00c3\3\2\2\2\u00c2\u00c4\7\"\2\2\u00c3\u00c2\3\2\2\2\u00c4\u00c5\3\2"+
		"\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7"+
		"\u00c8\7q\2\2\u00c8\u00c9\7p\2\2\u00c9\u00cb\3\2\2\2\u00ca\u00cc\7\"\2"+
		"\2\u00cb\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce"+
		"\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\7f\2\2\u00d0\u00d1\7q\2\2\u00d1"+
		"\u00d2\7o\2\2\u00d2\u00d3\7c\2\2\u00d3\u00d4\7k\2\2\u00d4\u00d5\7p\2\2"+
		"\u00d5\37\3\2\2\2\u00d6\u00d7\7l\2\2\u00d7\u00d8\7w\2\2\u00d8\u00d9\7"+
		"o\2\2\u00d9\u00da\7r\2\2\u00da\u00dc\3\2\2\2\u00db\u00dd\7u\2\2\u00dc"+
		"\u00db\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd!\3\2\2\2\u00de\u00df\7l\2\2\u00df"+
		"\u00e0\7w\2\2\u00e0\u00e1\7o\2\2\u00e1\u00e2\7r\2\2\u00e2\u00e4\3\2\2"+
		"\2\u00e3\u00e5\7u\2\2\u00e4\u00e3\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e7"+
		"\3\2\2\2\u00e6\u00e8\7\"\2\2\u00e7\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9"+
		"\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ec\7c"+
		"\2\2\u00ec\u00ed\7p\2\2\u00ed\u00ee\7f\2\2\u00ee\u00f0\3\2\2\2\u00ef\u00f1"+
		"\7\"\2\2\u00f0\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2"+
		"\u00f3\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f5\7o\2\2\u00f5\u00f6\7q\2"+
		"\2\u00f6\u00f7\7t\2\2\u00f7\u00f8\7g\2\2\u00f8#\3\2\2\2\u00f9\u00fa\7"+
		"M\2\2\u00fa\u00fb\7d\2\2\u00fb%\3\2\2\2\u00fc\u00fd\7o\2\2\u00fd\u00fe"+
		"\7c\2\2\u00fe\u00ff\7z\2\2\u00ff\u0100\7k\2\2\u0100\u0101\7o\2\2\u0101"+
		"\u0102\7w\2\2\u0102\u0103\7o\2\2\u0103\'\3\2\2\2\u0104\u0105\7O\2\2\u0105"+
		"\u0106\7d\2\2\u0106)\3\2\2\2\u0107\u0108\7q\2\2\u0108\u0109\7p\2\2\u0109"+
		"+\3\2\2\2\u010a\u010b\7q\2\2\u010b\u010c\7w\2\2\u010c\u010d\7v\2\2\u010d"+
		"\u010e\7u\2\2\u010e\u010f\7k\2\2\u010f\u0110\7f\2\2\u0110\u0111\7g\2\2"+
		"\u0111-\3\2\2\2\u0112\u0113\7r\2\2\u0113\u0114\7c\2\2\u0114\u0115\7t\2"+
		"\2\u0115\u0116\7c\2\2\u0116\u0117\7n\2\2\u0117\u0118\7n\2\2\u0118\u0119"+
		"\7g\2\2\u0119\u011a\7n\2\2\u011a\u011c\3\2\2\2\u011b\u011d\7\"\2\2\u011c"+
		"\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2"+
		"\2\2\u011f\u0120\3\2\2\2\u0120\u0121\7f\2\2\u0121\u0122\7q\2\2\u0122\u0123"+
		"\7y\2\2\u0123\u0124\7p\2\2\u0124\u0125\7n\2\2\u0125\u0126\7q\2\2\u0126"+
		"\u0127\7c\2\2\u0127\u0128\7f\2\2\u0128\u012a\3\2\2\2\u0129\u012b\7u\2"+
		"\2\u012a\u0129\3\2\2\2\u012a\u012b\3\2\2\2\u012b/\3\2\2\2\u012c\u012d"+
		"\7r\2\2\u012d\u012e\7c\2\2\u012e\u012f\7u\2\2\u012f\u0130\7u\2\2\u0130"+
		"\u0131\7y\2\2\u0131\u0132\7q\2\2\u0132\u0133\7t\2\2\u0133\u0134\7f\2\2"+
		"\u0134\61\3\2\2\2\u0135\u0136\7r\2\2\u0136\u0137\7q\2\2\u0137\u0138\7"+
		"u\2\2\u0138\u0139\7v\2\2\u0139\63\3\2\2\2\u013a\u013b\7t\2\2\u013b\u013c"+
		"\7g\2\2\u013c\u013d\7u\2\2\u013d\u013e\7q\2\2\u013e\u013f\7w\2\2\u013f"+
		"\u0140\7t\2\2\u0140\u0141\7e\2\2\u0141\u0142\7g\2\2\u0142\u0143\7u\2\2"+
		"\u0143\65\3\2\2\2\u0144\u0145\7u\2\2\u0145\u0146\7c\2\2\u0146\u0147\7"+
		"x\2\2\u0147\u0148\7g\2\2\u0148\67\3\2\2\2\u0149\u014a\7u\2\2\u014a\u014b"+
		"\7v\2\2\u014b\u014c\7c\2\2\u014c\u014d\7t\2\2\u014d\u014e\7v\2\2\u014e"+
		"\u0150\3\2\2\2\u014f\u0151\7\"\2\2\u0150\u014f\3\2\2\2\u0151\u0152\3\2"+
		"\2\2\u0152\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0154\3\2\2\2\u0154"+
		"\u0155\7c\2\2\u0155\u0156\7v\2\2\u01569\3\2\2\2\u0157\u0158\7u\2\2\u0158"+
		"\u0159\7w\2\2\u0159\u015a\7d\2\2\u015a\u015b\7r\2\2\u015b\u015c\7c\2\2"+
		"\u015c\u015d\7v\2\2\u015d\u015e\7j\2\2\u015e\u015f\7u\2\2\u015f;\3\2\2"+
		"\2\u0160\u0161\7w\2\2\u0161\u0162\7p\2\2\u0162\u0163\7f\2\2\u0163\u0164"+
		"\7g\2\2\u0164\u0165\7t\2\2\u0165=\3\2\2\2\u0166\u0167\7w\2\2\u0167\u0168"+
		"\7p\2\2\u0168\u0169\7m\2\2\u0169\u016a\7p\2\2\u016a\u016b\7q\2\2\u016b"+
		"\u016c\7y\2\2\u016c\u016d\7p\2\2\u016d?\3\2\2\2\u016e\u016f\7w\2\2\u016f"+
		"\u0170\7r\2\2\u0170\u0172\3\2\2\2\u0171\u0173\7\"\2\2\u0172\u0171\3\2"+
		"\2\2\u0173\u0174\3\2\2\2\u0174\u0172\3\2\2\2\u0174\u0175\3\2\2\2\u0175"+
		"\u0176\3\2\2\2\u0176\u0177\7v\2\2\u0177\u0178\7q\2\2\u0178A\3\2\2\2\u0179"+
		"\u017a\7w\2\2\u017a\u017b\7t\2\2\u017b\u017c\7n\2\2\u017c\u017d\7u\2\2"+
		"\u017dC\3\2\2\2\u017e\u017f\7w\2\2\u017f\u0180\7u\2\2\u0180\u0181\7g\2"+
		"\2\u0181\u0182\7t\2\2\u0182E\3\2\2\2\u0183\u0184\7?\2\2\u0184G\3\2\2\2"+
		"\u0185\u0187\t\2\2\2\u0186\u0185\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u0186"+
		"\3\2\2\2\u0188\u0189\3\2\2\2\u0189I\3\2\2\2\u018a\u018b\7$\2\2\u018b\u018c"+
		"\3\2\2\2\u018c\u018d\b%\2\2\u018d\u018e\b%\3\2\u018eK\3\2\2\2\u018f\u0193"+
		"\7%\2\2\u0190\u0192\n\3\2\2\u0191\u0190\3\2\2\2\u0192\u0195\3\2\2\2\u0193"+
		"\u0191\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u0196\3\2\2\2\u0195\u0193\3\2"+
		"\2\2\u0196\u0197\b&\3\2\u0197M\3\2\2\2\u0198\u019a\t\4\2\2\u0199\u0198"+
		"\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u0199\3\2\2\2\u019b\u019c\3\2\2\2\u019c"+
		"\u019d\3\2\2\2\u019d\u019e\b\'\3\2\u019eO\3\2\2\2\u019f\u01a1\t\5\2\2"+
		"\u01a0\u019f\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a2\u01a3"+
		"\3\2\2\2\u01a3Q\3\2\2\2\u01a4\u01a5\7$\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a7"+
		"\b)\4\2\u01a7\u01a8\b)\3\2\u01a8S\3\2\2\2\u01a9\u01ab\n\6\2\2\u01aa\u01a9"+
		"\3\2\2\2\u01ab\u01ae\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad"+
		"U\3\2\2\2\u01ae\u01ac\3\2\2\2\27\2\3cy\u0081\u00ab\u00c5\u00cd\u00dc\u00e4"+
		"\u00e9\u00f2\u011e\u012a\u0152\u0174\u0188\u0193\u019b\u01a2\u01ac\5\7"+
		"\3\2\b\2\2\6\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}