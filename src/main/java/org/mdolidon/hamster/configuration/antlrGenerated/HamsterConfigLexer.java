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
		ALL=1, AS=2, AS_TREE=3, AVOID=4, CHECK_IN_AT=5, COOKIES=6, CSS=7, DOMAIN=8, 
		EACH=9, FLAT=10, FROM=11, GET=12, GET_UNKNOWN=13, IMAGES=14, ITEMS_ON_DOMAIN=15, 
		JUMPS=16, JUMPS_AND_MORE=17, KB=18, MAXIMUM=19, MB=20, NO_SIZE_LIMIT=21, 
		ON=22, OUTSIDE=23, PARALLEL_DOWNLOADS=24, PASSWORD=25, POST=26, RESOURCES=27, 
		SAVE=28, START_AT=29, SUBPATHS=30, UNDER=31, UNKNOWN=32, UP_TO=33, URLS=34, 
		USER=35, EQUALS=36, INTEGER_LITERAL=37, OPENING_QUOTE=38, COMMENT=39, 
		WS=40, WORD=41, CLOSING_QUOTE=42, STRING_LITERAL=43;
	public static final int
		IN_STRING_LITERAL=1;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "IN_STRING_LITERAL"
	};

	public static final String[] ruleNames = {
		"ALL", "AS", "AS_TREE", "AVOID", "CHECK_IN_AT", "COOKIES", "CSS", "DOMAIN", 
		"EACH", "FLAT", "FROM", "GET", "GET_UNKNOWN", "IMAGES", "ITEMS_ON_DOMAIN", 
		"JUMPS", "JUMPS_AND_MORE", "KB", "MAXIMUM", "MB", "NO_SIZE_LIMIT", "ON", 
		"OUTSIDE", "PARALLEL_DOWNLOADS", "PASSWORD", "POST", "RESOURCES", "SAVE", 
		"START_AT", "SUBPATHS", "UNDER", "UNKNOWN", "UP_TO", "URLS", "USER", "EQUALS", 
		"INTEGER_LITERAL", "OPENING_QUOTE", "COMMENT", "WS", "WORD", "CLOSING_QUOTE", 
		"STRING_LITERAL"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'all'", "'as'", null, "'avoid'", null, null, "'css'", "'domain'", 
		"'each'", "'flat'", "'from'", "'get'", null, "'images'", null, null, null, 
		null, "'maximum'", null, null, "'on'", "'outside'", null, "'password'", 
		"'post'", "'resources'", "'save'", null, "'subpaths'", "'under'", "'unknown'", 
		null, "'urls'", "'user'", "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ALL", "AS", "AS_TREE", "AVOID", "CHECK_IN_AT", "COOKIES", "CSS", 
		"DOMAIN", "EACH", "FLAT", "FROM", "GET", "GET_UNKNOWN", "IMAGES", "ITEMS_ON_DOMAIN", 
		"JUMPS", "JUMPS_AND_MORE", "KB", "MAXIMUM", "MB", "NO_SIZE_LIMIT", "ON", 
		"OUTSIDE", "PARALLEL_DOWNLOADS", "PASSWORD", "POST", "RESOURCES", "SAVE", 
		"START_AT", "SUBPATHS", "UNDER", "UNKNOWN", "UP_TO", "URLS", "USER", "EQUALS", 
		"INTEGER_LITERAL", "OPENING_QUOTE", "COMMENT", "WS", "WORD", "CLOSING_QUOTE", 
		"STRING_LITERAL"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2-\u01df\b\1\b\1\4"+
		"\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n"+
		"\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\6\4f\n\4\r\4\16\4"+
		"g\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\6\6|\n\6\r\6\16\6}\3\6\3\6\3\6\3\6\6\6\u0084\n\6\r\6\16\6\u0085\3"+
		"\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0093\n\7\3\b\3\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\6\16"+
		"\u00b8\n\16\r\16\16\16\u00b9\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\6"+
		"\20\u00d2\n\20\r\20\16\20\u00d3\3\20\3\20\3\20\3\20\6\20\u00da\n\20\r"+
		"\20\16\20\u00db\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\5\21\u00eb\n\21\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00f3\n"+
		"\22\3\22\6\22\u00f6\n\22\r\22\16\22\u00f7\3\22\3\22\3\22\3\22\3\22\6\22"+
		"\u00ff\n\22\r\22\16\22\u0100\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\5\23\u010e\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u011e\n\25\3\26\3\26\3\26\3\26\6\26"+
		"\u0124\n\26\r\26\16\26\u0125\3\26\3\26\3\26\3\26\3\26\3\26\6\26\u012e"+
		"\n\26\r\26\16\26\u012f\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\6\31\u014d\n\31\r\31\16\31\u014e\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u015b\n\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\6\36\u0181\n\36\r\36\16\36\u0182\3\36\3\36\3\36\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3"+
		"!\3!\3!\3!\3\"\3\"\3\"\3\"\6\"\u01a3\n\"\r\"\16\"\u01a4\3\"\3\"\3\"\3"+
		"#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3&\6&\u01b7\n&\r&\16&\u01b8\3\'\3\'"+
		"\3\'\3\'\3\'\3(\3(\7(\u01c2\n(\f(\16(\u01c5\13(\3(\3(\3)\6)\u01ca\n)\r"+
		")\16)\u01cb\3)\3)\3*\6*\u01d1\n*\r*\16*\u01d2\3+\3+\3+\3+\3+\3,\7,\u01db"+
		"\n,\f,\16,\u01de\13,\2\2-\4\3\6\4\b\5\n\6\f\7\16\b\20\t\22\n\24\13\26"+
		"\f\30\r\32\16\34\17\36\20 \21\"\22$\23&\24(\25*\26,\27.\30\60\31\62\32"+
		"\64\33\66\348\35:\36<\37> @!B\"D#F$H%J&L\'N(P)R*T+V,X-\4\2\3\7\3\2\62"+
		";\3\2\f\f\5\2\13\f\17\17\"\"\5\2C\\aac|\3\2$$\2\u01f7\2\4\3\2\2\2\2\6"+
		"\3\2\2\2\2\b\3\2\2\2\2\n\3\2\2\2\2\f\3\2\2\2\2\16\3\2\2\2\2\20\3\2\2\2"+
		"\2\22\3\2\2\2\2\24\3\2\2\2\2\26\3\2\2\2\2\30\3\2\2\2\2\32\3\2\2\2\2\34"+
		"\3\2\2\2\2\36\3\2\2\2\2 \3\2\2\2\2\"\3\2\2\2\2$\3\2\2\2\2&\3\2\2\2\2("+
		"\3\2\2\2\2*\3\2\2\2\2,\3\2\2\2\2.\3\2\2\2\2\60\3\2\2\2\2\62\3\2\2\2\2"+
		"\64\3\2\2\2\2\66\3\2\2\2\28\3\2\2\2\2:\3\2\2\2\2<\3\2\2\2\2>\3\2\2\2\2"+
		"@\3\2\2\2\2B\3\2\2\2\2D\3\2\2\2\2F\3\2\2\2\2H\3\2\2\2\2J\3\2\2\2\2L\3"+
		"\2\2\2\2N\3\2\2\2\2P\3\2\2\2\2R\3\2\2\2\2T\3\2\2\2\3V\3\2\2\2\3X\3\2\2"+
		"\2\4Z\3\2\2\2\6^\3\2\2\2\ba\3\2\2\2\nn\3\2\2\2\ft\3\2\2\2\16\u008a\3\2"+
		"\2\2\20\u0094\3\2\2\2\22\u0098\3\2\2\2\24\u009f\3\2\2\2\26\u00a4\3\2\2"+
		"\2\30\u00a9\3\2\2\2\32\u00ae\3\2\2\2\34\u00b2\3\2\2\2\36\u00c3\3\2\2\2"+
		" \u00ca\3\2\2\2\"\u00e4\3\2\2\2$\u00ec\3\2\2\2&\u010d\3\2\2\2(\u010f\3"+
		"\2\2\2*\u011d\3\2\2\2,\u011f\3\2\2\2.\u0137\3\2\2\2\60\u013a\3\2\2\2\62"+
		"\u0142\3\2\2\2\64\u015c\3\2\2\2\66\u0165\3\2\2\28\u016a\3\2\2\2:\u0174"+
		"\3\2\2\2<\u0179\3\2\2\2>\u0187\3\2\2\2@\u0190\3\2\2\2B\u0196\3\2\2\2D"+
		"\u019e\3\2\2\2F\u01a9\3\2\2\2H\u01ae\3\2\2\2J\u01b3\3\2\2\2L\u01b6\3\2"+
		"\2\2N\u01ba\3\2\2\2P\u01bf\3\2\2\2R\u01c9\3\2\2\2T\u01d0\3\2\2\2V\u01d4"+
		"\3\2\2\2X\u01dc\3\2\2\2Z[\7c\2\2[\\\7n\2\2\\]\7n\2\2]\5\3\2\2\2^_\7c\2"+
		"\2_`\7u\2\2`\7\3\2\2\2ab\7c\2\2bc\7u\2\2ce\3\2\2\2df\7\"\2\2ed\3\2\2\2"+
		"fg\3\2\2\2ge\3\2\2\2gh\3\2\2\2hi\3\2\2\2ij\7v\2\2jk\7t\2\2kl\7g\2\2lm"+
		"\7g\2\2m\t\3\2\2\2no\7c\2\2op\7x\2\2pq\7q\2\2qr\7k\2\2rs\7f\2\2s\13\3"+
		"\2\2\2tu\7e\2\2uv\7j\2\2vw\7g\2\2wx\7e\2\2xy\7m\2\2y{\3\2\2\2z|\7\"\2"+
		"\2{z\3\2\2\2|}\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\177\3\2\2\2\177\u0080\7k\2"+
		"\2\u0080\u0081\7p\2\2\u0081\u0083\3\2\2\2\u0082\u0084\7\"\2\2\u0083\u0082"+
		"\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086"+
		"\u0087\3\2\2\2\u0087\u0088\7c\2\2\u0088\u0089\7v\2\2\u0089\r\3\2\2\2\u008a"+
		"\u008b\7e\2\2\u008b\u008c\7q\2\2\u008c\u008d\7q\2\2\u008d\u008e\7m\2\2"+
		"\u008e\u008f\7k\2\2\u008f\u0090\7g\2\2\u0090\u0092\3\2\2\2\u0091\u0093"+
		"\7u\2\2\u0092\u0091\3\2\2\2\u0092\u0093\3\2\2\2\u0093\17\3\2\2\2\u0094"+
		"\u0095\7e\2\2\u0095\u0096\7u\2\2\u0096\u0097\7u\2\2\u0097\21\3\2\2\2\u0098"+
		"\u0099\7f\2\2\u0099\u009a\7q\2\2\u009a\u009b\7o\2\2\u009b\u009c\7c\2\2"+
		"\u009c\u009d\7k\2\2\u009d\u009e\7p\2\2\u009e\23\3\2\2\2\u009f\u00a0\7"+
		"g\2\2\u00a0\u00a1\7c\2\2\u00a1\u00a2\7e\2\2\u00a2\u00a3\7j\2\2\u00a3\25"+
		"\3\2\2\2\u00a4\u00a5\7h\2\2\u00a5\u00a6\7n\2\2\u00a6\u00a7\7c\2\2\u00a7"+
		"\u00a8\7v\2\2\u00a8\27\3\2\2\2\u00a9\u00aa\7h\2\2\u00aa\u00ab\7t\2\2\u00ab"+
		"\u00ac\7q\2\2\u00ac\u00ad\7o\2\2\u00ad\31\3\2\2\2\u00ae\u00af\7i\2\2\u00af"+
		"\u00b0\7g\2\2\u00b0\u00b1\7v\2\2\u00b1\33\3\2\2\2\u00b2\u00b3\7i\2\2\u00b3"+
		"\u00b4\7g\2\2\u00b4\u00b5\7v\2\2\u00b5\u00b7\3\2\2\2\u00b6\u00b8\7\"\2"+
		"\2\u00b7\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba"+
		"\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\7w\2\2\u00bc\u00bd\7p\2\2\u00bd"+
		"\u00be\7m\2\2\u00be\u00bf\7p\2\2\u00bf\u00c0\7q\2\2\u00c0\u00c1\7y\2\2"+
		"\u00c1\u00c2\7p\2\2\u00c2\35\3\2\2\2\u00c3\u00c4\7k\2\2\u00c4\u00c5\7"+
		"o\2\2\u00c5\u00c6\7c\2\2\u00c6\u00c7\7i\2\2\u00c7\u00c8\7g\2\2\u00c8\u00c9"+
		"\7u\2\2\u00c9\37\3\2\2\2\u00ca\u00cb\7k\2\2\u00cb\u00cc\7v\2\2\u00cc\u00cd"+
		"\7g\2\2\u00cd\u00ce\7o\2\2\u00ce\u00cf\7u\2\2\u00cf\u00d1\3\2\2\2\u00d0"+
		"\u00d2\7\"\2\2\u00d1\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d1\3\2"+
		"\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\7q\2\2\u00d6"+
		"\u00d7\7p\2\2\u00d7\u00d9\3\2\2\2\u00d8\u00da\7\"\2\2\u00d9\u00d8\3\2"+
		"\2\2\u00da\u00db\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc"+
		"\u00dd\3\2\2\2\u00dd\u00de\7f\2\2\u00de\u00df\7q\2\2\u00df\u00e0\7o\2"+
		"\2\u00e0\u00e1\7c\2\2\u00e1\u00e2\7k\2\2\u00e2\u00e3\7p\2\2\u00e3!\3\2"+
		"\2\2\u00e4\u00e5\7l\2\2\u00e5\u00e6\7w\2\2\u00e6\u00e7\7o\2\2\u00e7\u00e8"+
		"\7r\2\2\u00e8\u00ea\3\2\2\2\u00e9\u00eb\7u\2\2\u00ea\u00e9\3\2\2\2\u00ea"+
		"\u00eb\3\2\2\2\u00eb#\3\2\2\2\u00ec\u00ed\7l\2\2\u00ed\u00ee\7w\2\2\u00ee"+
		"\u00ef\7o\2\2\u00ef\u00f0\7r\2\2\u00f0\u00f2\3\2\2\2\u00f1\u00f3\7u\2"+
		"\2\u00f2\u00f1\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f5\3\2\2\2\u00f4\u00f6"+
		"\7\"\2\2\u00f5\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7"+
		"\u00f8\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fa\7c\2\2\u00fa\u00fb\7p\2"+
		"\2\u00fb\u00fc\7f\2\2\u00fc\u00fe\3\2\2\2\u00fd\u00ff\7\"\2\2\u00fe\u00fd"+
		"\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101"+
		"\u0102\3\2\2\2\u0102\u0103\7o\2\2\u0103\u0104\7q\2\2\u0104\u0105\7t\2"+
		"\2\u0105\u0106\7g\2\2\u0106%\3\2\2\2\u0107\u0108\7M\2\2\u0108\u010e\7"+
		"d\2\2\u0109\u010a\7m\2\2\u010a\u010e\7d\2\2\u010b\u010c\7M\2\2\u010c\u010e"+
		"\7D\2\2\u010d\u0107\3\2\2\2\u010d\u0109\3\2\2\2\u010d\u010b\3\2\2\2\u010e"+
		"\'\3\2\2\2\u010f\u0110\7o\2\2\u0110\u0111\7c\2\2\u0111\u0112\7z\2\2\u0112"+
		"\u0113\7k\2\2\u0113\u0114\7o\2\2\u0114\u0115\7w\2\2\u0115\u0116\7o\2\2"+
		"\u0116)\3\2\2\2\u0117\u0118\7O\2\2\u0118\u011e\7d\2\2\u0119\u011a\7o\2"+
		"\2\u011a\u011e\7d\2\2\u011b\u011c\7O\2\2\u011c\u011e\7D\2\2\u011d\u0117"+
		"\3\2\2\2\u011d\u0119\3\2\2\2\u011d\u011b\3\2\2\2\u011e+\3\2\2\2\u011f"+
		"\u0120\7p\2\2\u0120\u0121\7q\2\2\u0121\u0123\3\2\2\2\u0122\u0124\7\"\2"+
		"\2\u0123\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0126"+
		"\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0128\7u\2\2\u0128\u0129\7k\2\2\u0129"+
		"\u012a\7|\2\2\u012a\u012b\7g\2\2\u012b\u012d\3\2\2\2\u012c\u012e\7\"\2"+
		"\2\u012d\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130"+
		"\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0132\7n\2\2\u0132\u0133\7k\2\2\u0133"+
		"\u0134\7o\2\2\u0134\u0135\7k\2\2\u0135\u0136\7v\2\2\u0136-\3\2\2\2\u0137"+
		"\u0138\7q\2\2\u0138\u0139\7p\2\2\u0139/\3\2\2\2\u013a\u013b\7q\2\2\u013b"+
		"\u013c\7w\2\2\u013c\u013d\7v\2\2\u013d\u013e\7u\2\2\u013e\u013f\7k\2\2"+
		"\u013f\u0140\7f\2\2\u0140\u0141\7g\2\2\u0141\61\3\2\2\2\u0142\u0143\7"+
		"r\2\2\u0143\u0144\7c\2\2\u0144\u0145\7t\2\2\u0145\u0146\7c\2\2\u0146\u0147"+
		"\7n\2\2\u0147\u0148\7n\2\2\u0148\u0149\7g\2\2\u0149\u014a\7n\2\2\u014a"+
		"\u014c\3\2\2\2\u014b\u014d\7\"\2\2\u014c\u014b\3\2\2\2\u014d\u014e\3\2"+
		"\2\2\u014e\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0150\3\2\2\2\u0150"+
		"\u0151\7f\2\2\u0151\u0152\7q\2\2\u0152\u0153\7y\2\2\u0153\u0154\7p\2\2"+
		"\u0154\u0155\7n\2\2\u0155\u0156\7q\2\2\u0156\u0157\7c\2\2\u0157\u0158"+
		"\7f\2\2\u0158\u015a\3\2\2\2\u0159\u015b\7u\2\2\u015a\u0159\3\2\2\2\u015a"+
		"\u015b\3\2\2\2\u015b\63\3\2\2\2\u015c\u015d\7r\2\2\u015d\u015e\7c\2\2"+
		"\u015e\u015f\7u\2\2\u015f\u0160\7u\2\2\u0160\u0161\7y\2\2\u0161\u0162"+
		"\7q\2\2\u0162\u0163\7t\2\2\u0163\u0164\7f\2\2\u0164\65\3\2\2\2\u0165\u0166"+
		"\7r\2\2\u0166\u0167\7q\2\2\u0167\u0168\7u\2\2\u0168\u0169\7v\2\2\u0169"+
		"\67\3\2\2\2\u016a\u016b\7t\2\2\u016b\u016c\7g\2\2\u016c\u016d\7u\2\2\u016d"+
		"\u016e\7q\2\2\u016e\u016f\7w\2\2\u016f\u0170\7t\2\2\u0170\u0171\7e\2\2"+
		"\u0171\u0172\7g\2\2\u0172\u0173\7u\2\2\u01739\3\2\2\2\u0174\u0175\7u\2"+
		"\2\u0175\u0176\7c\2\2\u0176\u0177\7x\2\2\u0177\u0178\7g\2\2\u0178;\3\2"+
		"\2\2\u0179\u017a\7u\2\2\u017a\u017b\7v\2\2\u017b\u017c\7c\2\2\u017c\u017d"+
		"\7t\2\2\u017d\u017e\7v\2\2\u017e\u0180\3\2\2\2\u017f\u0181\7\"\2\2\u0180"+
		"\u017f\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0180\3\2\2\2\u0182\u0183\3\2"+
		"\2\2\u0183\u0184\3\2\2\2\u0184\u0185\7c\2\2\u0185\u0186\7v\2\2\u0186="+
		"\3\2\2\2\u0187\u0188\7u\2\2\u0188\u0189\7w\2\2\u0189\u018a\7d\2\2\u018a"+
		"\u018b\7r\2\2\u018b\u018c\7c\2\2\u018c\u018d\7v\2\2\u018d\u018e\7j\2\2"+
		"\u018e\u018f\7u\2\2\u018f?\3\2\2\2\u0190\u0191\7w\2\2\u0191\u0192\7p\2"+
		"\2\u0192\u0193\7f\2\2\u0193\u0194\7g\2\2\u0194\u0195\7t\2\2\u0195A\3\2"+
		"\2\2\u0196\u0197\7w\2\2\u0197\u0198\7p\2\2\u0198\u0199\7m\2\2\u0199\u019a"+
		"\7p\2\2\u019a\u019b\7q\2\2\u019b\u019c\7y\2\2\u019c\u019d\7p\2\2\u019d"+
		"C\3\2\2\2\u019e\u019f\7w\2\2\u019f\u01a0\7r\2\2\u01a0\u01a2\3\2\2\2\u01a1"+
		"\u01a3\7\"\2\2\u01a2\u01a1\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a2\3\2"+
		"\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a7\7v\2\2\u01a7"+
		"\u01a8\7q\2\2\u01a8E\3\2\2\2\u01a9\u01aa\7w\2\2\u01aa\u01ab\7t\2\2\u01ab"+
		"\u01ac\7n\2\2\u01ac\u01ad\7u\2\2\u01adG\3\2\2\2\u01ae\u01af\7w\2\2\u01af"+
		"\u01b0\7u\2\2\u01b0\u01b1\7g\2\2\u01b1\u01b2\7t\2\2\u01b2I\3\2\2\2\u01b3"+
		"\u01b4\7?\2\2\u01b4K\3\2\2\2\u01b5\u01b7\t\2\2\2\u01b6\u01b5\3\2\2\2\u01b7"+
		"\u01b8\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9M\3\2\2\2"+
		"\u01ba\u01bb\7$\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01bd\b\'\2\2\u01bd\u01be"+
		"\b\'\3\2\u01beO\3\2\2\2\u01bf\u01c3\7%\2\2\u01c0\u01c2\n\3\2\2\u01c1\u01c0"+
		"\3\2\2\2\u01c2\u01c5\3\2\2\2\u01c3\u01c1\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4"+
		"\u01c6\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c6\u01c7\b(\3\2\u01c7Q\3\2\2\2\u01c8"+
		"\u01ca\t\4\2\2\u01c9\u01c8\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01c9\3\2"+
		"\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01ce\b)\3\2\u01ce"+
		"S\3\2\2\2\u01cf\u01d1\t\5\2\2\u01d0\u01cf\3\2\2\2\u01d1\u01d2\3\2\2\2"+
		"\u01d2\u01d0\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3U\3\2\2\2\u01d4\u01d5\7"+
		"$\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d7\b+\4\2\u01d7\u01d8\b+\3\2\u01d8"+
		"W\3\2\2\2\u01d9\u01db\n\6\2\2\u01da\u01d9\3\2\2\2\u01db\u01de\3\2\2\2"+
		"\u01dc\u01da\3\2\2\2\u01dc\u01dd\3\2\2\2\u01ddY\3\2\2\2\u01de\u01dc\3"+
		"\2\2\2\34\2\3g}\u0085\u0092\u00b9\u00d3\u00db\u00ea\u00f2\u00f7\u0100"+
		"\u010d\u011d\u0125\u012f\u014e\u015a\u0182\u01a4\u01b8\u01c3\u01cb\u01d2"+
		"\u01dc\5\7\3\2\b\2\2\6\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}