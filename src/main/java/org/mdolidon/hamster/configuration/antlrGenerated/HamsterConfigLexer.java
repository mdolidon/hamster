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
		ALL=1, AS=2, AS_BASE_NAME=3, AS_TREE=4, AVOID=5, CHECK_IN_AT=6, COOKIES=7, 
		CSS=8, DOMAIN=9, EACH=10, FLAT=11, FROM=12, GET=13, GET_UNKNOWN=14, IMAGES=15, 
		ITEMS_ON_DOMAIN=16, JUMPS=17, JUMPS_AND_MORE=18, KB=19, MAXIMUM=20, MB=21, 
		NO_SIZE_LIMIT=22, ON=23, OUTSIDE=24, PARALLEL_DOWNLOADS=25, PASSWORD=26, 
		POST=27, RESOURCES=28, SAVE=29, START_AT=30, SUBPATHS=31, UNDER=32, UNKNOWN=33, 
		UP_TO=34, URLS=35, USER=36, EQUALS=37, INTEGER_LITERAL=38, OPENING_QUOTE=39, 
		COMMENT=40, WS=41, WORD=42, CLOSING_QUOTE=43, STRING_LITERAL=44;
	public static final int
		IN_STRING_LITERAL=1;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "IN_STRING_LITERAL"
	};

	public static final String[] ruleNames = {
		"ALL", "AS", "AS_BASE_NAME", "AS_TREE", "AVOID", "CHECK_IN_AT", "COOKIES", 
		"CSS", "DOMAIN", "EACH", "FLAT", "FROM", "GET", "GET_UNKNOWN", "IMAGES", 
		"ITEMS_ON_DOMAIN", "JUMPS", "JUMPS_AND_MORE", "KB", "MAXIMUM", "MB", "NO_SIZE_LIMIT", 
		"ON", "OUTSIDE", "PARALLEL_DOWNLOADS", "PASSWORD", "POST", "RESOURCES", 
		"SAVE", "START_AT", "SUBPATHS", "UNDER", "UNKNOWN", "UP_TO", "URLS", "USER", 
		"EQUALS", "INTEGER_LITERAL", "OPENING_QUOTE", "COMMENT", "WS", "WORD", 
		"CLOSING_QUOTE", "STRING_LITERAL"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'all'", "'as'", null, null, "'avoid'", null, null, "'css'", "'domain'", 
		"'each'", "'flat'", "'from'", "'get'", null, "'images'", null, null, null, 
		null, "'maximum'", null, null, "'on'", "'outside'", null, "'password'", 
		"'post'", "'resources'", "'save'", null, "'subpaths'", "'under'", "'unknown'", 
		null, "'urls'", "'user'", "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ALL", "AS", "AS_BASE_NAME", "AS_TREE", "AVOID", "CHECK_IN_AT", 
		"COOKIES", "CSS", "DOMAIN", "EACH", "FLAT", "FROM", "GET", "GET_UNKNOWN", 
		"IMAGES", "ITEMS_ON_DOMAIN", "JUMPS", "JUMPS_AND_MORE", "KB", "MAXIMUM", 
		"MB", "NO_SIZE_LIMIT", "ON", "OUTSIDE", "PARALLEL_DOWNLOADS", "PASSWORD", 
		"POST", "RESOURCES", "SAVE", "START_AT", "SUBPATHS", "UNDER", "UNKNOWN", 
		"UP_TO", "URLS", "USER", "EQUALS", "INTEGER_LITERAL", "OPENING_QUOTE", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2.\u01fc\b\1\b\1\4"+
		"\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n"+
		"\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\6\4h\n\4\r\4"+
		"\16\4i\3\4\3\4\3\4\3\4\3\4\3\4\7\4r\n\4\f\4\16\4u\13\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\5\4}\n\4\3\5\3\5\3\5\3\5\6\5\u0083\n\5\r\5\16\5\u0084\3\5\3\5"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\6\7\u0099"+
		"\n\7\r\7\16\7\u009a\3\7\3\7\3\7\3\7\6\7\u00a1\n\7\r\7\16\7\u00a2\3\7\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00b0\n\b\3\t\3\t\3\t\3\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\6"+
		"\17\u00d5\n\17\r\17\16\17\u00d6\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\6\21\u00ef\n\21\r\21\16\21\u00f0\3\21\3\21\3\21\3\21\6\21\u00f7\n\21"+
		"\r\21\16\21\u00f8\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\5\22\u0108\n\22\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0110"+
		"\n\23\3\23\6\23\u0113\n\23\r\23\16\23\u0114\3\23\3\23\3\23\3\23\3\23\6"+
		"\23\u011c\n\23\r\23\16\23\u011d\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\5\24\u012b\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u013b\n\26\3\27\3\27\3\27\3\27\6\27"+
		"\u0141\n\27\r\27\16\27\u0142\3\27\3\27\3\27\3\27\3\27\3\27\6\27\u014b"+
		"\n\27\r\27\16\27\u014c\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\6\32\u016a\n\32\r\32\16\32\u016b\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0178\n\32\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\6\37\u019e\n\37\r\37\16\37\u019f\3\37\3\37\3\37\3 \3 "+
		"\3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3#\3#\3#\3#\6#\u01c0\n#\r#\16#\u01c1\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%"+
		"\3%\3%\3%\3&\3&\3\'\6\'\u01d4\n\'\r\'\16\'\u01d5\3(\3(\3(\3(\3(\3)\3)"+
		"\7)\u01df\n)\f)\16)\u01e2\13)\3)\3)\3*\6*\u01e7\n*\r*\16*\u01e8\3*\3*"+
		"\3+\6+\u01ee\n+\r+\16+\u01ef\3,\3,\3,\3,\3,\3-\7-\u01f8\n-\f-\16-\u01fb"+
		"\13-\2\2.\4\3\6\4\b\5\n\6\f\7\16\b\20\t\22\n\24\13\26\f\30\r\32\16\34"+
		"\17\36\20 \21\"\22$\23&\24(\25*\26,\27.\30\60\31\62\32\64\33\66\348\35"+
		":\36<\37> @!B\"D#F$H%J&L\'N(P)R*T+V,X-Z.\4\2\3\7\3\2\62;\3\2\f\f\5\2\13"+
		"\f\17\17\"\"\5\2C\\aac|\3\2$$\2\u0217\2\4\3\2\2\2\2\6\3\2\2\2\2\b\3\2"+
		"\2\2\2\n\3\2\2\2\2\f\3\2\2\2\2\16\3\2\2\2\2\20\3\2\2\2\2\22\3\2\2\2\2"+
		"\24\3\2\2\2\2\26\3\2\2\2\2\30\3\2\2\2\2\32\3\2\2\2\2\34\3\2\2\2\2\36\3"+
		"\2\2\2\2 \3\2\2\2\2\"\3\2\2\2\2$\3\2\2\2\2&\3\2\2\2\2(\3\2\2\2\2*\3\2"+
		"\2\2\2,\3\2\2\2\2.\3\2\2\2\2\60\3\2\2\2\2\62\3\2\2\2\2\64\3\2\2\2\2\66"+
		"\3\2\2\2\28\3\2\2\2\2:\3\2\2\2\2<\3\2\2\2\2>\3\2\2\2\2@\3\2\2\2\2B\3\2"+
		"\2\2\2D\3\2\2\2\2F\3\2\2\2\2H\3\2\2\2\2J\3\2\2\2\2L\3\2\2\2\2N\3\2\2\2"+
		"\2P\3\2\2\2\2R\3\2\2\2\2T\3\2\2\2\2V\3\2\2\2\3X\3\2\2\2\3Z\3\2\2\2\4\\"+
		"\3\2\2\2\6`\3\2\2\2\bc\3\2\2\2\n~\3\2\2\2\f\u008b\3\2\2\2\16\u0091\3\2"+
		"\2\2\20\u00a7\3\2\2\2\22\u00b1\3\2\2\2\24\u00b5\3\2\2\2\26\u00bc\3\2\2"+
		"\2\30\u00c1\3\2\2\2\32\u00c6\3\2\2\2\34\u00cb\3\2\2\2\36\u00cf\3\2\2\2"+
		" \u00e0\3\2\2\2\"\u00e7\3\2\2\2$\u0101\3\2\2\2&\u0109\3\2\2\2(\u012a\3"+
		"\2\2\2*\u012c\3\2\2\2,\u013a\3\2\2\2.\u013c\3\2\2\2\60\u0154\3\2\2\2\62"+
		"\u0157\3\2\2\2\64\u015f\3\2\2\2\66\u0179\3\2\2\28\u0182\3\2\2\2:\u0187"+
		"\3\2\2\2<\u0191\3\2\2\2>\u0196\3\2\2\2@\u01a4\3\2\2\2B\u01ad\3\2\2\2D"+
		"\u01b3\3\2\2\2F\u01bb\3\2\2\2H\u01c6\3\2\2\2J\u01cb\3\2\2\2L\u01d0\3\2"+
		"\2\2N\u01d3\3\2\2\2P\u01d7\3\2\2\2R\u01dc\3\2\2\2T\u01e6\3\2\2\2V\u01ed"+
		"\3\2\2\2X\u01f1\3\2\2\2Z\u01f9\3\2\2\2\\]\7c\2\2]^\7n\2\2^_\7n\2\2_\5"+
		"\3\2\2\2`a\7c\2\2ab\7u\2\2b\7\3\2\2\2cd\7c\2\2de\7u\2\2eg\3\2\2\2fh\7"+
		"\"\2\2gf\3\2\2\2hi\3\2\2\2ig\3\2\2\2ij\3\2\2\2jk\3\2\2\2kl\7d\2\2lm\7"+
		"c\2\2mn\7u\2\2no\7g\2\2os\3\2\2\2pr\7\"\2\2qp\3\2\2\2ru\3\2\2\2sq\3\2"+
		"\2\2st\3\2\2\2tv\3\2\2\2us\3\2\2\2vw\7p\2\2wx\7c\2\2xy\7o\2\2yz\7g\2\2"+
		"z|\3\2\2\2{}\7u\2\2|{\3\2\2\2|}\3\2\2\2}\t\3\2\2\2~\177\7c\2\2\177\u0080"+
		"\7u\2\2\u0080\u0082\3\2\2\2\u0081\u0083\7\"\2\2\u0082\u0081\3\2\2\2\u0083"+
		"\u0084\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\3\2"+
		"\2\2\u0086\u0087\7v\2\2\u0087\u0088\7t\2\2\u0088\u0089\7g\2\2\u0089\u008a"+
		"\7g\2\2\u008a\13\3\2\2\2\u008b\u008c\7c\2\2\u008c\u008d\7x\2\2\u008d\u008e"+
		"\7q\2\2\u008e\u008f\7k\2\2\u008f\u0090\7f\2\2\u0090\r\3\2\2\2\u0091\u0092"+
		"\7e\2\2\u0092\u0093\7j\2\2\u0093\u0094\7g\2\2\u0094\u0095\7e\2\2\u0095"+
		"\u0096\7m\2\2\u0096\u0098\3\2\2\2\u0097\u0099\7\"\2\2\u0098\u0097\3\2"+
		"\2\2\u0099\u009a\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b"+
		"\u009c\3\2\2\2\u009c\u009d\7k\2\2\u009d\u009e\7p\2\2\u009e\u00a0\3\2\2"+
		"\2\u009f\u00a1\7\"\2\2\u00a0\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a0"+
		"\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\7c\2\2\u00a5"+
		"\u00a6\7v\2\2\u00a6\17\3\2\2\2\u00a7\u00a8\7e\2\2\u00a8\u00a9\7q\2\2\u00a9"+
		"\u00aa\7q\2\2\u00aa\u00ab\7m\2\2\u00ab\u00ac\7k\2\2\u00ac\u00ad\7g\2\2"+
		"\u00ad\u00af\3\2\2\2\u00ae\u00b0\7u\2\2\u00af\u00ae\3\2\2\2\u00af\u00b0"+
		"\3\2\2\2\u00b0\21\3\2\2\2\u00b1\u00b2\7e\2\2\u00b2\u00b3\7u\2\2\u00b3"+
		"\u00b4\7u\2\2\u00b4\23\3\2\2\2\u00b5\u00b6\7f\2\2\u00b6\u00b7\7q\2\2\u00b7"+
		"\u00b8\7o\2\2\u00b8\u00b9\7c\2\2\u00b9\u00ba\7k\2\2\u00ba\u00bb\7p\2\2"+
		"\u00bb\25\3\2\2\2\u00bc\u00bd\7g\2\2\u00bd\u00be\7c\2\2\u00be\u00bf\7"+
		"e\2\2\u00bf\u00c0\7j\2\2\u00c0\27\3\2\2\2\u00c1\u00c2\7h\2\2\u00c2\u00c3"+
		"\7n\2\2\u00c3\u00c4\7c\2\2\u00c4\u00c5\7v\2\2\u00c5\31\3\2\2\2\u00c6\u00c7"+
		"\7h\2\2\u00c7\u00c8\7t\2\2\u00c8\u00c9\7q\2\2\u00c9\u00ca\7o\2\2\u00ca"+
		"\33\3\2\2\2\u00cb\u00cc\7i\2\2\u00cc\u00cd\7g\2\2\u00cd\u00ce\7v\2\2\u00ce"+
		"\35\3\2\2\2\u00cf\u00d0\7i\2\2\u00d0\u00d1\7g\2\2\u00d1\u00d2\7v\2\2\u00d2"+
		"\u00d4\3\2\2\2\u00d3\u00d5\7\"\2\2\u00d4\u00d3\3\2\2\2\u00d5\u00d6\3\2"+
		"\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8"+
		"\u00d9\7w\2\2\u00d9\u00da\7p\2\2\u00da\u00db\7m\2\2\u00db\u00dc\7p\2\2"+
		"\u00dc\u00dd\7q\2\2\u00dd\u00de\7y\2\2\u00de\u00df\7p\2\2\u00df\37\3\2"+
		"\2\2\u00e0\u00e1\7k\2\2\u00e1\u00e2\7o\2\2\u00e2\u00e3\7c\2\2\u00e3\u00e4"+
		"\7i\2\2\u00e4\u00e5\7g\2\2\u00e5\u00e6\7u\2\2\u00e6!\3\2\2\2\u00e7\u00e8"+
		"\7k\2\2\u00e8\u00e9\7v\2\2\u00e9\u00ea\7g\2\2\u00ea\u00eb\7o\2\2\u00eb"+
		"\u00ec\7u\2\2\u00ec\u00ee\3\2\2\2\u00ed\u00ef\7\"\2\2\u00ee\u00ed\3\2"+
		"\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1"+
		"\u00f2\3\2\2\2\u00f2\u00f3\7q\2\2\u00f3\u00f4\7p\2\2\u00f4\u00f6\3\2\2"+
		"\2\u00f5\u00f7\7\"\2\2\u00f6\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f6"+
		"\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fb\7f\2\2\u00fb"+
		"\u00fc\7q\2\2\u00fc\u00fd\7o\2\2\u00fd\u00fe\7c\2\2\u00fe\u00ff\7k\2\2"+
		"\u00ff\u0100\7p\2\2\u0100#\3\2\2\2\u0101\u0102\7l\2\2\u0102\u0103\7w\2"+
		"\2\u0103\u0104\7o\2\2\u0104\u0105\7r\2\2\u0105\u0107\3\2\2\2\u0106\u0108"+
		"\7u\2\2\u0107\u0106\3\2\2\2\u0107\u0108\3\2\2\2\u0108%\3\2\2\2\u0109\u010a"+
		"\7l\2\2\u010a\u010b\7w\2\2\u010b\u010c\7o\2\2\u010c\u010d\7r\2\2\u010d"+
		"\u010f\3\2\2\2\u010e\u0110\7u\2\2\u010f\u010e\3\2\2\2\u010f\u0110\3\2"+
		"\2\2\u0110\u0112\3\2\2\2\u0111\u0113\7\"\2\2\u0112\u0111\3\2\2\2\u0113"+
		"\u0114\3\2\2\2\u0114\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0116\3\2"+
		"\2\2\u0116\u0117\7c\2\2\u0117\u0118\7p\2\2\u0118\u0119\7f\2\2\u0119\u011b"+
		"\3\2\2\2\u011a\u011c\7\"\2\2\u011b\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d"+
		"\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0120\7o"+
		"\2\2\u0120\u0121\7q\2\2\u0121\u0122\7t\2\2\u0122\u0123\7g\2\2\u0123\'"+
		"\3\2\2\2\u0124\u0125\7M\2\2\u0125\u012b\7d\2\2\u0126\u0127\7m\2\2\u0127"+
		"\u012b\7d\2\2\u0128\u0129\7M\2\2\u0129\u012b\7D\2\2\u012a\u0124\3\2\2"+
		"\2\u012a\u0126\3\2\2\2\u012a\u0128\3\2\2\2\u012b)\3\2\2\2\u012c\u012d"+
		"\7o\2\2\u012d\u012e\7c\2\2\u012e\u012f\7z\2\2\u012f\u0130\7k\2\2\u0130"+
		"\u0131\7o\2\2\u0131\u0132\7w\2\2\u0132\u0133\7o\2\2\u0133+\3\2\2\2\u0134"+
		"\u0135\7O\2\2\u0135\u013b\7d\2\2\u0136\u0137\7o\2\2\u0137\u013b\7d\2\2"+
		"\u0138\u0139\7O\2\2\u0139\u013b\7D\2\2\u013a\u0134\3\2\2\2\u013a\u0136"+
		"\3\2\2\2\u013a\u0138\3\2\2\2\u013b-\3\2\2\2\u013c\u013d\7p\2\2\u013d\u013e"+
		"\7q\2\2\u013e\u0140\3\2\2\2\u013f\u0141\7\"\2\2\u0140\u013f\3\2\2\2\u0141"+
		"\u0142\3\2\2\2\u0142\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0144\3\2"+
		"\2\2\u0144\u0145\7u\2\2\u0145\u0146\7k\2\2\u0146\u0147\7|\2\2\u0147\u0148"+
		"\7g\2\2\u0148\u014a\3\2\2\2\u0149\u014b\7\"\2\2\u014a\u0149\3\2\2\2\u014b"+
		"\u014c\3\2\2\2\u014c\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014e\3\2"+
		"\2\2\u014e\u014f\7n\2\2\u014f\u0150\7k\2\2\u0150\u0151\7o\2\2\u0151\u0152"+
		"\7k\2\2\u0152\u0153\7v\2\2\u0153/\3\2\2\2\u0154\u0155\7q\2\2\u0155\u0156"+
		"\7p\2\2\u0156\61\3\2\2\2\u0157\u0158\7q\2\2\u0158\u0159\7w\2\2\u0159\u015a"+
		"\7v\2\2\u015a\u015b\7u\2\2\u015b\u015c\7k\2\2\u015c\u015d\7f\2\2\u015d"+
		"\u015e\7g\2\2\u015e\63\3\2\2\2\u015f\u0160\7r\2\2\u0160\u0161\7c\2\2\u0161"+
		"\u0162\7t\2\2\u0162\u0163\7c\2\2\u0163\u0164\7n\2\2\u0164\u0165\7n\2\2"+
		"\u0165\u0166\7g\2\2\u0166\u0167\7n\2\2\u0167\u0169\3\2\2\2\u0168\u016a"+
		"\7\"\2\2\u0169\u0168\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u0169\3\2\2\2\u016b"+
		"\u016c\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u016e\7f\2\2\u016e\u016f\7q\2"+
		"\2\u016f\u0170\7y\2\2\u0170\u0171\7p\2\2\u0171\u0172\7n\2\2\u0172\u0173"+
		"\7q\2\2\u0173\u0174\7c\2\2\u0174\u0175\7f\2\2\u0175\u0177\3\2\2\2\u0176"+
		"\u0178\7u\2\2\u0177\u0176\3\2\2\2\u0177\u0178\3\2\2\2\u0178\65\3\2\2\2"+
		"\u0179\u017a\7r\2\2\u017a\u017b\7c\2\2\u017b\u017c\7u\2\2\u017c\u017d"+
		"\7u\2\2\u017d\u017e\7y\2\2\u017e\u017f\7q\2\2\u017f\u0180\7t\2\2\u0180"+
		"\u0181\7f\2\2\u0181\67\3\2\2\2\u0182\u0183\7r\2\2\u0183\u0184\7q\2\2\u0184"+
		"\u0185\7u\2\2\u0185\u0186\7v\2\2\u01869\3\2\2\2\u0187\u0188\7t\2\2\u0188"+
		"\u0189\7g\2\2\u0189\u018a\7u\2\2\u018a\u018b\7q\2\2\u018b\u018c\7w\2\2"+
		"\u018c\u018d\7t\2\2\u018d\u018e\7e\2\2\u018e\u018f\7g\2\2\u018f\u0190"+
		"\7u\2\2\u0190;\3\2\2\2\u0191\u0192\7u\2\2\u0192\u0193\7c\2\2\u0193\u0194"+
		"\7x\2\2\u0194\u0195\7g\2\2\u0195=\3\2\2\2\u0196\u0197\7u\2\2\u0197\u0198"+
		"\7v\2\2\u0198\u0199\7c\2\2\u0199\u019a\7t\2\2\u019a\u019b\7v\2\2\u019b"+
		"\u019d\3\2\2\2\u019c\u019e\7\"\2\2\u019d\u019c\3\2\2\2\u019e\u019f\3\2"+
		"\2\2\u019f\u019d\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1"+
		"\u01a2\7c\2\2\u01a2\u01a3\7v\2\2\u01a3?\3\2\2\2\u01a4\u01a5\7u\2\2\u01a5"+
		"\u01a6\7w\2\2\u01a6\u01a7\7d\2\2\u01a7\u01a8\7r\2\2\u01a8\u01a9\7c\2\2"+
		"\u01a9\u01aa\7v\2\2\u01aa\u01ab\7j\2\2\u01ab\u01ac\7u\2\2\u01acA\3\2\2"+
		"\2\u01ad\u01ae\7w\2\2\u01ae\u01af\7p\2\2\u01af\u01b0\7f\2\2\u01b0\u01b1"+
		"\7g\2\2\u01b1\u01b2\7t\2\2\u01b2C\3\2\2\2\u01b3\u01b4\7w\2\2\u01b4\u01b5"+
		"\7p\2\2\u01b5\u01b6\7m\2\2\u01b6\u01b7\7p\2\2\u01b7\u01b8\7q\2\2\u01b8"+
		"\u01b9\7y\2\2\u01b9\u01ba\7p\2\2\u01baE\3\2\2\2\u01bb\u01bc\7w\2\2\u01bc"+
		"\u01bd\7r\2\2\u01bd\u01bf\3\2\2\2\u01be\u01c0\7\"\2\2\u01bf\u01be\3\2"+
		"\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2"+
		"\u01c3\3\2\2\2\u01c3\u01c4\7v\2\2\u01c4\u01c5\7q\2\2\u01c5G\3\2\2\2\u01c6"+
		"\u01c7\7w\2\2\u01c7\u01c8\7t\2\2\u01c8\u01c9\7n\2\2\u01c9\u01ca\7u\2\2"+
		"\u01caI\3\2\2\2\u01cb\u01cc\7w\2\2\u01cc\u01cd\7u\2\2\u01cd\u01ce\7g\2"+
		"\2\u01ce\u01cf\7t\2\2\u01cfK\3\2\2\2\u01d0\u01d1\7?\2\2\u01d1M\3\2\2\2"+
		"\u01d2\u01d4\t\2\2\2\u01d3\u01d2\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01d3"+
		"\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6O\3\2\2\2\u01d7\u01d8\7$\2\2\u01d8\u01d9"+
		"\3\2\2\2\u01d9\u01da\b(\2\2\u01da\u01db\b(\3\2\u01dbQ\3\2\2\2\u01dc\u01e0"+
		"\7%\2\2\u01dd\u01df\n\3\2\2\u01de\u01dd\3\2\2\2\u01df\u01e2\3\2\2\2\u01e0"+
		"\u01de\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01e3\3\2\2\2\u01e2\u01e0\3\2"+
		"\2\2\u01e3\u01e4\b)\3\2\u01e4S\3\2\2\2\u01e5\u01e7\t\4\2\2\u01e6\u01e5"+
		"\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01e6\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9"+
		"\u01ea\3\2\2\2\u01ea\u01eb\b*\3\2\u01ebU\3\2\2\2\u01ec\u01ee\t\5\2\2\u01ed"+
		"\u01ec\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef\u01ed\3\2\2\2\u01ef\u01f0\3\2"+
		"\2\2\u01f0W\3\2\2\2\u01f1\u01f2\7$\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f4"+
		"\b,\4\2\u01f4\u01f5\b,\3\2\u01f5Y\3\2\2\2\u01f6\u01f8\n\6\2\2\u01f7\u01f6"+
		"\3\2\2\2\u01f8\u01fb\3\2\2\2\u01f9\u01f7\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa"+
		"[\3\2\2\2\u01fb\u01f9\3\2\2\2\37\2\3is|\u0084\u009a\u00a2\u00af\u00d6"+
		"\u00f0\u00f8\u0107\u010f\u0114\u011d\u012a\u013a\u0142\u014c\u016b\u0177"+
		"\u019f\u01c1\u01d5\u01e0\u01e8\u01ef\u01f9\5\7\3\2\b\2\2\6\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}