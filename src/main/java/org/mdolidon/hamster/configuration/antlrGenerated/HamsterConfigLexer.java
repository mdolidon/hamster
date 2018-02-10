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
		CSS=8, DOMAIN=9, EACH=10, FILE=11, FLAT=12, FROM=13, GET=14, GET_UNKNOWN=15, 
		IMAGES=16, ITEMS_ON_DOMAIN=17, JUMPS=18, JUMPS_AND_MORE=19, KB=20, MAXIMUM=21, 
		MB=22, NO_SIZE_LIMIT=23, ON=24, OUTSIDE=25, PARALLEL_DOWNLOADS=26, PASSWORD=27, 
		POST=28, RESOURCES=29, SAVE=30, START_AT=31, SUBPATHS=32, UNDER=33, UNKNOWN=34, 
		UP_TO=35, URLS=36, USER=37, EQUALS=38, INTEGER_LITERAL=39, STRING_LITERAL=40, 
		COMMENT=41, WS=42, WORD=43;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"ALL", "AS", "AS_BASE_NAME", "AS_TREE", "AVOID", "CHECK_IN_AT", "COOKIES", 
		"CSS", "DOMAIN", "EACH", "FILE", "FLAT", "FROM", "GET", "GET_UNKNOWN", 
		"IMAGES", "ITEMS_ON_DOMAIN", "JUMPS", "JUMPS_AND_MORE", "KB", "MAXIMUM", 
		"MB", "NO_SIZE_LIMIT", "ON", "OUTSIDE", "PARALLEL_DOWNLOADS", "PASSWORD", 
		"POST", "RESOURCES", "SAVE", "START_AT", "SUBPATHS", "UNDER", "UNKNOWN", 
		"UP_TO", "URLS", "USER", "EQUALS", "INTEGER_LITERAL", "STRING_LITERAL", 
		"COMMENT", "WS", "WORD"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'all'", "'as'", null, null, "'avoid'", null, null, "'css'", "'domain'", 
		"'each'", "'file'", "'flat'", "'from'", "'get'", null, "'images'", null, 
		null, null, null, "'maximum'", null, null, "'on'", "'outside'", null, 
		"'password'", "'post'", "'resources'", "'save'", null, "'subpaths'", "'under'", 
		"'unknown'", null, "'urls'", "'user'", "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ALL", "AS", "AS_BASE_NAME", "AS_TREE", "AVOID", "CHECK_IN_AT", 
		"COOKIES", "CSS", "DOMAIN", "EACH", "FILE", "FLAT", "FROM", "GET", "GET_UNKNOWN", 
		"IMAGES", "ITEMS_ON_DOMAIN", "JUMPS", "JUMPS_AND_MORE", "KB", "MAXIMUM", 
		"MB", "NO_SIZE_LIMIT", "ON", "OUTSIDE", "PARALLEL_DOWNLOADS", "PASSWORD", 
		"POST", "RESOURCES", "SAVE", "START_AT", "SUBPATHS", "UNDER", "UNKNOWN", 
		"UP_TO", "URLS", "USER", "EQUALS", "INTEGER_LITERAL", "STRING_LITERAL", 
		"COMMENT", "WS", "WORD"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2-\u01f9\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\6\4e\n\4\r\4\16\4f\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\7\4o\n\4\f\4\16\4r\13\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\5\4z\n\4\3\5\3\5\3\5\3\5\6\5\u0080\n\5\r\5\16\5\u0081\3\5\3\5\3\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\6\7\u0096\n\7"+
		"\r\7\16\7\u0097\3\7\3\7\3\7\3\7\6\7\u009e\n\7\r\7\16\7\u009f\3\7\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00ad\n\b\3\t\3\t\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3"+
		"\20\3\20\3\20\3\20\6\20\u00d7\n\20\r\20\16\20\u00d8\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\6\22\u00f1\n\22\r\22\16\22\u00f2\3\22\3\22\3\22\3"+
		"\22\6\22\u00f9\n\22\r\22\16\22\u00fa\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u010a\n\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\5\24\u0112\n\24\3\24\6\24\u0115\n\24\r\24\16\24\u0116\3\24\3\24"+
		"\3\24\3\24\3\24\6\24\u011e\n\24\r\24\16\24\u011f\3\24\3\24\3\24\3\24\3"+
		"\24\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u012d\n\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u013d\n\27\3\30"+
		"\3\30\3\30\3\30\6\30\u0143\n\30\r\30\16\30\u0144\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\6\30\u014d\n\30\r\30\16\30\u014e\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\6\33\u016c\n\33\r\33\16\33\u016d\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u017a\n\33\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37"+
		"\3 \3 \3 \3 \3 \3 \3 \6 \u01a0\n \r \16 \u01a1\3 \3 \3 \3!\3!\3!\3!\3"+
		"!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3"+
		"$\3$\6$\u01c2\n$\r$\16$\u01c3\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3"+
		"\'\3\'\3(\6(\u01d6\n(\r(\16(\u01d7\3)\3)\3)\3)\7)\u01de\n)\f)\16)\u01e1"+
		"\13)\3)\3)\3*\3*\7*\u01e7\n*\f*\16*\u01ea\13*\3*\3*\3+\6+\u01ef\n+\r+"+
		"\16+\u01f0\3+\3+\3,\6,\u01f6\n,\r,\16,\u01f7\2\2-\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O"+
		")Q*S+U,W-\3\2\7\3\2\62;\5\2\f\f\17\17$$\3\2\f\f\5\2\13\f\17\17\"\"\5\2"+
		"C\\aac|\2\u0216\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3"+
		"\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2"+
		"\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\3Y\3\2\2\2\5]\3\2\2\2\7`\3\2\2\2\t"+
		"{\3\2\2\2\13\u0088\3\2\2\2\r\u008e\3\2\2\2\17\u00a4\3\2\2\2\21\u00ae\3"+
		"\2\2\2\23\u00b2\3\2\2\2\25\u00b9\3\2\2\2\27\u00be\3\2\2\2\31\u00c3\3\2"+
		"\2\2\33\u00c8\3\2\2\2\35\u00cd\3\2\2\2\37\u00d1\3\2\2\2!\u00e2\3\2\2\2"+
		"#\u00e9\3\2\2\2%\u0103\3\2\2\2\'\u010b\3\2\2\2)\u012c\3\2\2\2+\u012e\3"+
		"\2\2\2-\u013c\3\2\2\2/\u013e\3\2\2\2\61\u0156\3\2\2\2\63\u0159\3\2\2\2"+
		"\65\u0161\3\2\2\2\67\u017b\3\2\2\29\u0184\3\2\2\2;\u0189\3\2\2\2=\u0193"+
		"\3\2\2\2?\u0198\3\2\2\2A\u01a6\3\2\2\2C\u01af\3\2\2\2E\u01b5\3\2\2\2G"+
		"\u01bd\3\2\2\2I\u01c8\3\2\2\2K\u01cd\3\2\2\2M\u01d2\3\2\2\2O\u01d5\3\2"+
		"\2\2Q\u01d9\3\2\2\2S\u01e4\3\2\2\2U\u01ee\3\2\2\2W\u01f5\3\2\2\2YZ\7c"+
		"\2\2Z[\7n\2\2[\\\7n\2\2\\\4\3\2\2\2]^\7c\2\2^_\7u\2\2_\6\3\2\2\2`a\7c"+
		"\2\2ab\7u\2\2bd\3\2\2\2ce\7\"\2\2dc\3\2\2\2ef\3\2\2\2fd\3\2\2\2fg\3\2"+
		"\2\2gh\3\2\2\2hi\7d\2\2ij\7c\2\2jk\7u\2\2kl\7g\2\2lp\3\2\2\2mo\7\"\2\2"+
		"nm\3\2\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2qs\3\2\2\2rp\3\2\2\2st\7p\2\2"+
		"tu\7c\2\2uv\7o\2\2vw\7g\2\2wy\3\2\2\2xz\7u\2\2yx\3\2\2\2yz\3\2\2\2z\b"+
		"\3\2\2\2{|\7c\2\2|}\7u\2\2}\177\3\2\2\2~\u0080\7\"\2\2\177~\3\2\2\2\u0080"+
		"\u0081\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\3\2\2"+
		"\2\u0083\u0084\7v\2\2\u0084\u0085\7t\2\2\u0085\u0086\7g\2\2\u0086\u0087"+
		"\7g\2\2\u0087\n\3\2\2\2\u0088\u0089\7c\2\2\u0089\u008a\7x\2\2\u008a\u008b"+
		"\7q\2\2\u008b\u008c\7k\2\2\u008c\u008d\7f\2\2\u008d\f\3\2\2\2\u008e\u008f"+
		"\7e\2\2\u008f\u0090\7j\2\2\u0090\u0091\7g\2\2\u0091\u0092\7e\2\2\u0092"+
		"\u0093\7m\2\2\u0093\u0095\3\2\2\2\u0094\u0096\7\"\2\2\u0095\u0094\3\2"+
		"\2\2\u0096\u0097\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098"+
		"\u0099\3\2\2\2\u0099\u009a\7k\2\2\u009a\u009b\7p\2\2\u009b\u009d\3\2\2"+
		"\2\u009c\u009e\7\"\2\2\u009d\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u009d"+
		"\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\7c\2\2\u00a2"+
		"\u00a3\7v\2\2\u00a3\16\3\2\2\2\u00a4\u00a5\7e\2\2\u00a5\u00a6\7q\2\2\u00a6"+
		"\u00a7\7q\2\2\u00a7\u00a8\7m\2\2\u00a8\u00a9\7k\2\2\u00a9\u00aa\7g\2\2"+
		"\u00aa\u00ac\3\2\2\2\u00ab\u00ad\7u\2\2\u00ac\u00ab\3\2\2\2\u00ac\u00ad"+
		"\3\2\2\2\u00ad\20\3\2\2\2\u00ae\u00af\7e\2\2\u00af\u00b0\7u\2\2\u00b0"+
		"\u00b1\7u\2\2\u00b1\22\3\2\2\2\u00b2\u00b3\7f\2\2\u00b3\u00b4\7q\2\2\u00b4"+
		"\u00b5\7o\2\2\u00b5\u00b6\7c\2\2\u00b6\u00b7\7k\2\2\u00b7\u00b8\7p\2\2"+
		"\u00b8\24\3\2\2\2\u00b9\u00ba\7g\2\2\u00ba\u00bb\7c\2\2\u00bb\u00bc\7"+
		"e\2\2\u00bc\u00bd\7j\2\2\u00bd\26\3\2\2\2\u00be\u00bf\7h\2\2\u00bf\u00c0"+
		"\7k\2\2\u00c0\u00c1\7n\2\2\u00c1\u00c2\7g\2\2\u00c2\30\3\2\2\2\u00c3\u00c4"+
		"\7h\2\2\u00c4\u00c5\7n\2\2\u00c5\u00c6\7c\2\2\u00c6\u00c7\7v\2\2\u00c7"+
		"\32\3\2\2\2\u00c8\u00c9\7h\2\2\u00c9\u00ca\7t\2\2\u00ca\u00cb\7q\2\2\u00cb"+
		"\u00cc\7o\2\2\u00cc\34\3\2\2\2\u00cd\u00ce\7i\2\2\u00ce\u00cf\7g\2\2\u00cf"+
		"\u00d0\7v\2\2\u00d0\36\3\2\2\2\u00d1\u00d2\7i\2\2\u00d2\u00d3\7g\2\2\u00d3"+
		"\u00d4\7v\2\2\u00d4\u00d6\3\2\2\2\u00d5\u00d7\7\"\2\2\u00d6\u00d5\3\2"+
		"\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9"+
		"\u00da\3\2\2\2\u00da\u00db\7w\2\2\u00db\u00dc\7p\2\2\u00dc\u00dd\7m\2"+
		"\2\u00dd\u00de\7p\2\2\u00de\u00df\7q\2\2\u00df\u00e0\7y\2\2\u00e0\u00e1"+
		"\7p\2\2\u00e1 \3\2\2\2\u00e2\u00e3\7k\2\2\u00e3\u00e4\7o\2\2\u00e4\u00e5"+
		"\7c\2\2\u00e5\u00e6\7i\2\2\u00e6\u00e7\7g\2\2\u00e7\u00e8\7u\2\2\u00e8"+
		"\"\3\2\2\2\u00e9\u00ea\7k\2\2\u00ea\u00eb\7v\2\2\u00eb\u00ec\7g\2\2\u00ec"+
		"\u00ed\7o\2\2\u00ed\u00ee\7u\2\2\u00ee\u00f0\3\2\2\2\u00ef\u00f1\7\"\2"+
		"\2\u00f0\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3"+
		"\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f5\7q\2\2\u00f5\u00f6\7p\2\2\u00f6"+
		"\u00f8\3\2\2\2\u00f7\u00f9\7\"\2\2\u00f8\u00f7\3\2\2\2\u00f9\u00fa\3\2"+
		"\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc"+
		"\u00fd\7f\2\2\u00fd\u00fe\7q\2\2\u00fe\u00ff\7o\2\2\u00ff\u0100\7c\2\2"+
		"\u0100\u0101\7k\2\2\u0101\u0102\7p\2\2\u0102$\3\2\2\2\u0103\u0104\7l\2"+
		"\2\u0104\u0105\7w\2\2\u0105\u0106\7o\2\2\u0106\u0107\7r\2\2\u0107\u0109"+
		"\3\2\2\2\u0108\u010a\7u\2\2\u0109\u0108\3\2\2\2\u0109\u010a\3\2\2\2\u010a"+
		"&\3\2\2\2\u010b\u010c\7l\2\2\u010c\u010d\7w\2\2\u010d\u010e\7o\2\2\u010e"+
		"\u010f\7r\2\2\u010f\u0111\3\2\2\2\u0110\u0112\7u\2\2\u0111\u0110\3\2\2"+
		"\2\u0111\u0112\3\2\2\2\u0112\u0114\3\2\2\2\u0113\u0115\7\"\2\2\u0114\u0113"+
		"\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117"+
		"\u0118\3\2\2\2\u0118\u0119\7c\2\2\u0119\u011a\7p\2\2\u011a\u011b\7f\2"+
		"\2\u011b\u011d\3\2\2\2\u011c\u011e\7\"\2\2\u011d\u011c\3\2\2\2\u011e\u011f"+
		"\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0121\3\2\2\2\u0121"+
		"\u0122\7o\2\2\u0122\u0123\7q\2\2\u0123\u0124\7t\2\2\u0124\u0125\7g\2\2"+
		"\u0125(\3\2\2\2\u0126\u0127\7M\2\2\u0127\u012d\7d\2\2\u0128\u0129\7m\2"+
		"\2\u0129\u012d\7d\2\2\u012a\u012b\7M\2\2\u012b\u012d\7D\2\2\u012c\u0126"+
		"\3\2\2\2\u012c\u0128\3\2\2\2\u012c\u012a\3\2\2\2\u012d*\3\2\2\2\u012e"+
		"\u012f\7o\2\2\u012f\u0130\7c\2\2\u0130\u0131\7z\2\2\u0131\u0132\7k\2\2"+
		"\u0132\u0133\7o\2\2\u0133\u0134\7w\2\2\u0134\u0135\7o\2\2\u0135,\3\2\2"+
		"\2\u0136\u0137\7O\2\2\u0137\u013d\7d\2\2\u0138\u0139\7o\2\2\u0139\u013d"+
		"\7d\2\2\u013a\u013b\7O\2\2\u013b\u013d\7D\2\2\u013c\u0136\3\2\2\2\u013c"+
		"\u0138\3\2\2\2\u013c\u013a\3\2\2\2\u013d.\3\2\2\2\u013e\u013f\7p\2\2\u013f"+
		"\u0140\7q\2\2\u0140\u0142\3\2\2\2\u0141\u0143\7\"\2\2\u0142\u0141\3\2"+
		"\2\2\u0143\u0144\3\2\2\2\u0144\u0142\3\2\2\2\u0144\u0145\3\2\2\2\u0145"+
		"\u0146\3\2\2\2\u0146\u0147\7u\2\2\u0147\u0148\7k\2\2\u0148\u0149\7|\2"+
		"\2\u0149\u014a\7g\2\2\u014a\u014c\3\2\2\2\u014b\u014d\7\"\2\2\u014c\u014b"+
		"\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f"+
		"\u0150\3\2\2\2\u0150\u0151\7n\2\2\u0151\u0152\7k\2\2\u0152\u0153\7o\2"+
		"\2\u0153\u0154\7k\2\2\u0154\u0155\7v\2\2\u0155\60\3\2\2\2\u0156\u0157"+
		"\7q\2\2\u0157\u0158\7p\2\2\u0158\62\3\2\2\2\u0159\u015a\7q\2\2\u015a\u015b"+
		"\7w\2\2\u015b\u015c\7v\2\2\u015c\u015d\7u\2\2\u015d\u015e\7k\2\2\u015e"+
		"\u015f\7f\2\2\u015f\u0160\7g\2\2\u0160\64\3\2\2\2\u0161\u0162\7r\2\2\u0162"+
		"\u0163\7c\2\2\u0163\u0164\7t\2\2\u0164\u0165\7c\2\2\u0165\u0166\7n\2\2"+
		"\u0166\u0167\7n\2\2\u0167\u0168\7g\2\2\u0168\u0169\7n\2\2\u0169\u016b"+
		"\3\2\2\2\u016a\u016c\7\"\2\2\u016b\u016a\3\2\2\2\u016c\u016d\3\2\2\2\u016d"+
		"\u016b\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0170\7f"+
		"\2\2\u0170\u0171\7q\2\2\u0171\u0172\7y\2\2\u0172\u0173\7p\2\2\u0173\u0174"+
		"\7n\2\2\u0174\u0175\7q\2\2\u0175\u0176\7c\2\2\u0176\u0177\7f\2\2\u0177"+
		"\u0179\3\2\2\2\u0178\u017a\7u\2\2\u0179\u0178\3\2\2\2\u0179\u017a\3\2"+
		"\2\2\u017a\66\3\2\2\2\u017b\u017c\7r\2\2\u017c\u017d\7c\2\2\u017d\u017e"+
		"\7u\2\2\u017e\u017f\7u\2\2\u017f\u0180\7y\2\2\u0180\u0181\7q\2\2\u0181"+
		"\u0182\7t\2\2\u0182\u0183\7f\2\2\u01838\3\2\2\2\u0184\u0185\7r\2\2\u0185"+
		"\u0186\7q\2\2\u0186\u0187\7u\2\2\u0187\u0188\7v\2\2\u0188:\3\2\2\2\u0189"+
		"\u018a\7t\2\2\u018a\u018b\7g\2\2\u018b\u018c\7u\2\2\u018c\u018d\7q\2\2"+
		"\u018d\u018e\7w\2\2\u018e\u018f\7t\2\2\u018f\u0190\7e\2\2\u0190\u0191"+
		"\7g\2\2\u0191\u0192\7u\2\2\u0192<\3\2\2\2\u0193\u0194\7u\2\2\u0194\u0195"+
		"\7c\2\2\u0195\u0196\7x\2\2\u0196\u0197\7g\2\2\u0197>\3\2\2\2\u0198\u0199"+
		"\7u\2\2\u0199\u019a\7v\2\2\u019a\u019b\7c\2\2\u019b\u019c\7t\2\2\u019c"+
		"\u019d\7v\2\2\u019d\u019f\3\2\2\2\u019e\u01a0\7\"\2\2\u019f\u019e\3\2"+
		"\2\2\u01a0\u01a1\3\2\2\2\u01a1\u019f\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2"+
		"\u01a3\3\2\2\2\u01a3\u01a4\7c\2\2\u01a4\u01a5\7v\2\2\u01a5@\3\2\2\2\u01a6"+
		"\u01a7\7u\2\2\u01a7\u01a8\7w\2\2\u01a8\u01a9\7d\2\2\u01a9\u01aa\7r\2\2"+
		"\u01aa\u01ab\7c\2\2\u01ab\u01ac\7v\2\2\u01ac\u01ad\7j\2\2\u01ad\u01ae"+
		"\7u\2\2\u01aeB\3\2\2\2\u01af\u01b0\7w\2\2\u01b0\u01b1\7p\2\2\u01b1\u01b2"+
		"\7f\2\2\u01b2\u01b3\7g\2\2\u01b3\u01b4\7t\2\2\u01b4D\3\2\2\2\u01b5\u01b6"+
		"\7w\2\2\u01b6\u01b7\7p\2\2\u01b7\u01b8\7m\2\2\u01b8\u01b9\7p\2\2\u01b9"+
		"\u01ba\7q\2\2\u01ba\u01bb\7y\2\2\u01bb\u01bc\7p\2\2\u01bcF\3\2\2\2\u01bd"+
		"\u01be\7w\2\2\u01be\u01bf\7r\2\2\u01bf\u01c1\3\2\2\2\u01c0\u01c2\7\"\2"+
		"\2\u01c1\u01c0\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c1\3\2\2\2\u01c3\u01c4"+
		"\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01c6\7v\2\2\u01c6\u01c7\7q\2\2\u01c7"+
		"H\3\2\2\2\u01c8\u01c9\7w\2\2\u01c9\u01ca\7t\2\2\u01ca\u01cb\7n\2\2\u01cb"+
		"\u01cc\7u\2\2\u01ccJ\3\2\2\2\u01cd\u01ce\7w\2\2\u01ce\u01cf\7u\2\2\u01cf"+
		"\u01d0\7g\2\2\u01d0\u01d1\7t\2\2\u01d1L\3\2\2\2\u01d2\u01d3\7?\2\2\u01d3"+
		"N\3\2\2\2\u01d4\u01d6\t\2\2\2\u01d5\u01d4\3\2\2\2\u01d6\u01d7\3\2\2\2"+
		"\u01d7\u01d5\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8P\3\2\2\2\u01d9\u01df\7"+
		"$\2\2\u01da\u01de\n\3\2\2\u01db\u01dc\7\u0080\2\2\u01dc\u01de\7$\2\2\u01dd"+
		"\u01da\3\2\2\2\u01dd\u01db\3\2\2\2\u01de\u01e1\3\2\2\2\u01df\u01dd\3\2"+
		"\2\2\u01df\u01e0\3\2\2\2\u01e0\u01e2\3\2\2\2\u01e1\u01df\3\2\2\2\u01e2"+
		"\u01e3\7$\2\2\u01e3R\3\2\2\2\u01e4\u01e8\7%\2\2\u01e5\u01e7\n\4\2\2\u01e6"+
		"\u01e5\3\2\2\2\u01e7\u01ea\3\2\2\2\u01e8\u01e6\3\2\2\2\u01e8\u01e9\3\2"+
		"\2\2\u01e9\u01eb\3\2\2\2\u01ea\u01e8\3\2\2\2\u01eb\u01ec\b*\2\2\u01ec"+
		"T\3\2\2\2\u01ed\u01ef\t\5\2\2\u01ee\u01ed\3\2\2\2\u01ef\u01f0\3\2\2\2"+
		"\u01f0\u01ee\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01f3"+
		"\b+\2\2\u01f3V\3\2\2\2\u01f4\u01f6\t\6\2\2\u01f5\u01f4\3\2\2\2\u01f6\u01f7"+
		"\3\2\2\2\u01f7\u01f5\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8X\3\2\2\2\37\2f"+
		"py\u0081\u0097\u009f\u00ac\u00d8\u00f2\u00fa\u0109\u0111\u0116\u011f\u012c"+
		"\u013c\u0144\u014e\u016d\u0179\u01a1\u01c3\u01d7\u01dd\u01df\u01e8\u01f0"+
		"\u01f7\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}