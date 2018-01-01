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
		JUMPS=16, JUMPS_AND_MORE=17, KB=18, MAXIMUM=19, MB=20, ON=21, OUTSIDE=22, 
		PARALLEL_DOWNLOADS=23, PASSWORD=24, POST=25, RESOURCES=26, SAVE=27, START_AT=28, 
		SUBPATHS=29, UNDER=30, UNKNOWN=31, UP_TO=32, URLS=33, USER=34, EQUALS=35, 
		INTEGER_LITERAL=36, OPENING_QUOTE=37, COMMENT=38, WS=39, WORD=40, CLOSING_QUOTE=41, 
		STRING_LITERAL=42;
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
		"JUMPS", "JUMPS_AND_MORE", "KB", "MAXIMUM", "MB", "ON", "OUTSIDE", "PARALLEL_DOWNLOADS", 
		"PASSWORD", "POST", "RESOURCES", "SAVE", "START_AT", "SUBPATHS", "UNDER", 
		"UNKNOWN", "UP_TO", "URLS", "USER", "EQUALS", "INTEGER_LITERAL", "OPENING_QUOTE", 
		"COMMENT", "WS", "WORD", "CLOSING_QUOTE", "STRING_LITERAL"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'all'", "'as'", null, "'avoid'", null, null, "'css'", "'domain'", 
		"'each'", "'flat'", "'from'", "'get'", null, "'images'", null, null, null, 
		"'Kb'", "'maximum'", "'Mb'", "'on'", "'outside'", null, "'password'", 
		"'post'", "'resources'", "'save'", null, "'subpaths'", "'under'", "'unknown'", 
		null, "'urls'", "'user'", "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ALL", "AS", "AS_TREE", "AVOID", "CHECK_IN_AT", "COOKIES", "CSS", 
		"DOMAIN", "EACH", "FLAT", "FROM", "GET", "GET_UNKNOWN", "IMAGES", "ITEMS_ON_DOMAIN", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2,\u01bb\b\1\b\1\4"+
		"\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n"+
		"\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\6\4d\n\4\r\4\16\4e\3\4\3"+
		"\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\6\6"+
		"z\n\6\r\6\16\6{\3\6\3\6\3\6\3\6\6\6\u0082\n\6\r\6\16\6\u0083\3\6\3\6\3"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0091\n\7\3\b\3\b\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\6\16\u00b6"+
		"\n\16\r\16\16\16\u00b7\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\6\20\u00d0"+
		"\n\20\r\20\16\20\u00d1\3\20\3\20\3\20\3\20\6\20\u00d8\n\20\r\20\16\20"+
		"\u00d9\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\5\21\u00e9\n\21\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00f1\n\22\3\22\6"+
		"\22\u00f4\n\22\r\22\16\22\u00f5\3\22\3\22\3\22\3\22\3\22\6\22\u00fd\n"+
		"\22\r\22\16\22\u00fe\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\6\30\u0129\n\30\r\30\16\30\u012a\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\5\30\u0137\n\30\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\6\35\u015d\n\35\r\35\16\35\u015e\3\35\3\35\3\35\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 "+
		"\3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\6!\u017f\n!\r!\16!\u0180\3!\3!\3!\3\"\3"+
		"\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3%\6%\u0193\n%\r%\16%\u0194\3&\3&"+
		"\3&\3&\3&\3\'\3\'\7\'\u019e\n\'\f\'\16\'\u01a1\13\'\3\'\3\'\3(\6(\u01a6"+
		"\n(\r(\16(\u01a7\3(\3(\3)\6)\u01ad\n)\r)\16)\u01ae\3*\3*\3*\3*\3*\3+\7"+
		"+\u01b7\n+\f+\16+\u01ba\13+\2\2,\4\3\6\4\b\5\n\6\f\7\16\b\20\t\22\n\24"+
		"\13\26\f\30\r\32\16\34\17\36\20 \21\"\22$\23&\24(\25*\26,\27.\30\60\31"+
		"\62\32\64\33\66\348\35:\36<\37> @!B\"D#F$H%J&L\'N(P)R*T+V,\4\2\3\7\3\2"+
		"\62;\3\2\f\f\5\2\13\f\17\17\"\"\5\2C\\aac|\3\2$$\2\u01cd\2\4\3\2\2\2\2"+
		"\6\3\2\2\2\2\b\3\2\2\2\2\n\3\2\2\2\2\f\3\2\2\2\2\16\3\2\2\2\2\20\3\2\2"+
		"\2\2\22\3\2\2\2\2\24\3\2\2\2\2\26\3\2\2\2\2\30\3\2\2\2\2\32\3\2\2\2\2"+
		"\34\3\2\2\2\2\36\3\2\2\2\2 \3\2\2\2\2\"\3\2\2\2\2$\3\2\2\2\2&\3\2\2\2"+
		"\2(\3\2\2\2\2*\3\2\2\2\2,\3\2\2\2\2.\3\2\2\2\2\60\3\2\2\2\2\62\3\2\2\2"+
		"\2\64\3\2\2\2\2\66\3\2\2\2\28\3\2\2\2\2:\3\2\2\2\2<\3\2\2\2\2>\3\2\2\2"+
		"\2@\3\2\2\2\2B\3\2\2\2\2D\3\2\2\2\2F\3\2\2\2\2H\3\2\2\2\2J\3\2\2\2\2L"+
		"\3\2\2\2\2N\3\2\2\2\2P\3\2\2\2\2R\3\2\2\2\3T\3\2\2\2\3V\3\2\2\2\4X\3\2"+
		"\2\2\6\\\3\2\2\2\b_\3\2\2\2\nl\3\2\2\2\fr\3\2\2\2\16\u0088\3\2\2\2\20"+
		"\u0092\3\2\2\2\22\u0096\3\2\2\2\24\u009d\3\2\2\2\26\u00a2\3\2\2\2\30\u00a7"+
		"\3\2\2\2\32\u00ac\3\2\2\2\34\u00b0\3\2\2\2\36\u00c1\3\2\2\2 \u00c8\3\2"+
		"\2\2\"\u00e2\3\2\2\2$\u00ea\3\2\2\2&\u0105\3\2\2\2(\u0108\3\2\2\2*\u0110"+
		"\3\2\2\2,\u0113\3\2\2\2.\u0116\3\2\2\2\60\u011e\3\2\2\2\62\u0138\3\2\2"+
		"\2\64\u0141\3\2\2\2\66\u0146\3\2\2\28\u0150\3\2\2\2:\u0155\3\2\2\2<\u0163"+
		"\3\2\2\2>\u016c\3\2\2\2@\u0172\3\2\2\2B\u017a\3\2\2\2D\u0185\3\2\2\2F"+
		"\u018a\3\2\2\2H\u018f\3\2\2\2J\u0192\3\2\2\2L\u0196\3\2\2\2N\u019b\3\2"+
		"\2\2P\u01a5\3\2\2\2R\u01ac\3\2\2\2T\u01b0\3\2\2\2V\u01b8\3\2\2\2XY\7c"+
		"\2\2YZ\7n\2\2Z[\7n\2\2[\5\3\2\2\2\\]\7c\2\2]^\7u\2\2^\7\3\2\2\2_`\7c\2"+
		"\2`a\7u\2\2ac\3\2\2\2bd\7\"\2\2cb\3\2\2\2de\3\2\2\2ec\3\2\2\2ef\3\2\2"+
		"\2fg\3\2\2\2gh\7v\2\2hi\7t\2\2ij\7g\2\2jk\7g\2\2k\t\3\2\2\2lm\7c\2\2m"+
		"n\7x\2\2no\7q\2\2op\7k\2\2pq\7f\2\2q\13\3\2\2\2rs\7e\2\2st\7j\2\2tu\7"+
		"g\2\2uv\7e\2\2vw\7m\2\2wy\3\2\2\2xz\7\"\2\2yx\3\2\2\2z{\3\2\2\2{y\3\2"+
		"\2\2{|\3\2\2\2|}\3\2\2\2}~\7k\2\2~\177\7p\2\2\177\u0081\3\2\2\2\u0080"+
		"\u0082\7\"\2\2\u0081\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0081\3\2"+
		"\2\2\u0083\u0084\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\7c\2\2\u0086"+
		"\u0087\7v\2\2\u0087\r\3\2\2\2\u0088\u0089\7e\2\2\u0089\u008a\7q\2\2\u008a"+
		"\u008b\7q\2\2\u008b\u008c\7m\2\2\u008c\u008d\7k\2\2\u008d\u008e\7g\2\2"+
		"\u008e\u0090\3\2\2\2\u008f\u0091\7u\2\2\u0090\u008f\3\2\2\2\u0090\u0091"+
		"\3\2\2\2\u0091\17\3\2\2\2\u0092\u0093\7e\2\2\u0093\u0094\7u\2\2\u0094"+
		"\u0095\7u\2\2\u0095\21\3\2\2\2\u0096\u0097\7f\2\2\u0097\u0098\7q\2\2\u0098"+
		"\u0099\7o\2\2\u0099\u009a\7c\2\2\u009a\u009b\7k\2\2\u009b\u009c\7p\2\2"+
		"\u009c\23\3\2\2\2\u009d\u009e\7g\2\2\u009e\u009f\7c\2\2\u009f\u00a0\7"+
		"e\2\2\u00a0\u00a1\7j\2\2\u00a1\25\3\2\2\2\u00a2\u00a3\7h\2\2\u00a3\u00a4"+
		"\7n\2\2\u00a4\u00a5\7c\2\2\u00a5\u00a6\7v\2\2\u00a6\27\3\2\2\2\u00a7\u00a8"+
		"\7h\2\2\u00a8\u00a9\7t\2\2\u00a9\u00aa\7q\2\2\u00aa\u00ab\7o\2\2\u00ab"+
		"\31\3\2\2\2\u00ac\u00ad\7i\2\2\u00ad\u00ae\7g\2\2\u00ae\u00af\7v\2\2\u00af"+
		"\33\3\2\2\2\u00b0\u00b1\7i\2\2\u00b1\u00b2\7g\2\2\u00b2\u00b3\7v\2\2\u00b3"+
		"\u00b5\3\2\2\2\u00b4\u00b6\7\"\2\2\u00b5\u00b4\3\2\2\2\u00b6\u00b7\3\2"+
		"\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9"+
		"\u00ba\7w\2\2\u00ba\u00bb\7p\2\2\u00bb\u00bc\7m\2\2\u00bc\u00bd\7p\2\2"+
		"\u00bd\u00be\7q\2\2\u00be\u00bf\7y\2\2\u00bf\u00c0\7p\2\2\u00c0\35\3\2"+
		"\2\2\u00c1\u00c2\7k\2\2\u00c2\u00c3\7o\2\2\u00c3\u00c4\7c\2\2\u00c4\u00c5"+
		"\7i\2\2\u00c5\u00c6\7g\2\2\u00c6\u00c7\7u\2\2\u00c7\37\3\2\2\2\u00c8\u00c9"+
		"\7k\2\2\u00c9\u00ca\7v\2\2\u00ca\u00cb\7g\2\2\u00cb\u00cc\7o\2\2\u00cc"+
		"\u00cd\7u\2\2\u00cd\u00cf\3\2\2\2\u00ce\u00d0\7\"\2\2\u00cf\u00ce\3\2"+
		"\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2"+
		"\u00d3\3\2\2\2\u00d3\u00d4\7q\2\2\u00d4\u00d5\7p\2\2\u00d5\u00d7\3\2\2"+
		"\2\u00d6\u00d8\7\"\2\2\u00d7\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00d7"+
		"\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dc\7f\2\2\u00dc"+
		"\u00dd\7q\2\2\u00dd\u00de\7o\2\2\u00de\u00df\7c\2\2\u00df\u00e0\7k\2\2"+
		"\u00e0\u00e1\7p\2\2\u00e1!\3\2\2\2\u00e2\u00e3\7l\2\2\u00e3\u00e4\7w\2"+
		"\2\u00e4\u00e5\7o\2\2\u00e5\u00e6\7r\2\2\u00e6\u00e8\3\2\2\2\u00e7\u00e9"+
		"\7u\2\2\u00e8\u00e7\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9#\3\2\2\2\u00ea\u00eb"+
		"\7l\2\2\u00eb\u00ec\7w\2\2\u00ec\u00ed\7o\2\2\u00ed\u00ee\7r\2\2\u00ee"+
		"\u00f0\3\2\2\2\u00ef\u00f1\7u\2\2\u00f0\u00ef\3\2\2\2\u00f0\u00f1\3\2"+
		"\2\2\u00f1\u00f3\3\2\2\2\u00f2\u00f4\7\"\2\2\u00f3\u00f2\3\2\2\2\u00f4"+
		"\u00f5\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\3\2"+
		"\2\2\u00f7\u00f8\7c\2\2\u00f8\u00f9\7p\2\2\u00f9\u00fa\7f\2\2\u00fa\u00fc"+
		"\3\2\2\2\u00fb\u00fd\7\"\2\2\u00fc\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe"+
		"\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0101\7o"+
		"\2\2\u0101\u0102\7q\2\2\u0102\u0103\7t\2\2\u0103\u0104\7g\2\2\u0104%\3"+
		"\2\2\2\u0105\u0106\7M\2\2\u0106\u0107\7d\2\2\u0107\'\3\2\2\2\u0108\u0109"+
		"\7o\2\2\u0109\u010a\7c\2\2\u010a\u010b\7z\2\2\u010b\u010c\7k\2\2\u010c"+
		"\u010d\7o\2\2\u010d\u010e\7w\2\2\u010e\u010f\7o\2\2\u010f)\3\2\2\2\u0110"+
		"\u0111\7O\2\2\u0111\u0112\7d\2\2\u0112+\3\2\2\2\u0113\u0114\7q\2\2\u0114"+
		"\u0115\7p\2\2\u0115-\3\2\2\2\u0116\u0117\7q\2\2\u0117\u0118\7w\2\2\u0118"+
		"\u0119\7v\2\2\u0119\u011a\7u\2\2\u011a\u011b\7k\2\2\u011b\u011c\7f\2\2"+
		"\u011c\u011d\7g\2\2\u011d/\3\2\2\2\u011e\u011f\7r\2\2\u011f\u0120\7c\2"+
		"\2\u0120\u0121\7t\2\2\u0121\u0122\7c\2\2\u0122\u0123\7n\2\2\u0123\u0124"+
		"\7n\2\2\u0124\u0125\7g\2\2\u0125\u0126\7n\2\2\u0126\u0128\3\2\2\2\u0127"+
		"\u0129\7\"\2\2\u0128\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u0128\3\2"+
		"\2\2\u012a\u012b\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012d\7f\2\2\u012d"+
		"\u012e\7q\2\2\u012e\u012f\7y\2\2\u012f\u0130\7p\2\2\u0130\u0131\7n\2\2"+
		"\u0131\u0132\7q\2\2\u0132\u0133\7c\2\2\u0133\u0134\7f\2\2\u0134\u0136"+
		"\3\2\2\2\u0135\u0137\7u\2\2\u0136\u0135\3\2\2\2\u0136\u0137\3\2\2\2\u0137"+
		"\61\3\2\2\2\u0138\u0139\7r\2\2\u0139\u013a\7c\2\2\u013a\u013b\7u\2\2\u013b"+
		"\u013c\7u\2\2\u013c\u013d\7y\2\2\u013d\u013e\7q\2\2\u013e\u013f\7t\2\2"+
		"\u013f\u0140\7f\2\2\u0140\63\3\2\2\2\u0141\u0142\7r\2\2\u0142\u0143\7"+
		"q\2\2\u0143\u0144\7u\2\2\u0144\u0145\7v\2\2\u0145\65\3\2\2\2\u0146\u0147"+
		"\7t\2\2\u0147\u0148\7g\2\2\u0148\u0149\7u\2\2\u0149\u014a\7q\2\2\u014a"+
		"\u014b\7w\2\2\u014b\u014c\7t\2\2\u014c\u014d\7e\2\2\u014d\u014e\7g\2\2"+
		"\u014e\u014f\7u\2\2\u014f\67\3\2\2\2\u0150\u0151\7u\2\2\u0151\u0152\7"+
		"c\2\2\u0152\u0153\7x\2\2\u0153\u0154\7g\2\2\u01549\3\2\2\2\u0155\u0156"+
		"\7u\2\2\u0156\u0157\7v\2\2\u0157\u0158\7c\2\2\u0158\u0159\7t\2\2\u0159"+
		"\u015a\7v\2\2\u015a\u015c\3\2\2\2\u015b\u015d\7\"\2\2\u015c\u015b\3\2"+
		"\2\2\u015d\u015e\3\2\2\2\u015e\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015f"+
		"\u0160\3\2\2\2\u0160\u0161\7c\2\2\u0161\u0162\7v\2\2\u0162;\3\2\2\2\u0163"+
		"\u0164\7u\2\2\u0164\u0165\7w\2\2\u0165\u0166\7d\2\2\u0166\u0167\7r\2\2"+
		"\u0167\u0168\7c\2\2\u0168\u0169\7v\2\2\u0169\u016a\7j\2\2\u016a\u016b"+
		"\7u\2\2\u016b=\3\2\2\2\u016c\u016d\7w\2\2\u016d\u016e\7p\2\2\u016e\u016f"+
		"\7f\2\2\u016f\u0170\7g\2\2\u0170\u0171\7t\2\2\u0171?\3\2\2\2\u0172\u0173"+
		"\7w\2\2\u0173\u0174\7p\2\2\u0174\u0175\7m\2\2\u0175\u0176\7p\2\2\u0176"+
		"\u0177\7q\2\2\u0177\u0178\7y\2\2\u0178\u0179\7p\2\2\u0179A\3\2\2\2\u017a"+
		"\u017b\7w\2\2\u017b\u017c\7r\2\2\u017c\u017e\3\2\2\2\u017d\u017f\7\"\2"+
		"\2\u017e\u017d\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u017e\3\2\2\2\u0180\u0181"+
		"\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0183\7v\2\2\u0183\u0184\7q\2\2\u0184"+
		"C\3\2\2\2\u0185\u0186\7w\2\2\u0186\u0187\7t\2\2\u0187\u0188\7n\2\2\u0188"+
		"\u0189\7u\2\2\u0189E\3\2\2\2\u018a\u018b\7w\2\2\u018b\u018c\7u\2\2\u018c"+
		"\u018d\7g\2\2\u018d\u018e\7t\2\2\u018eG\3\2\2\2\u018f\u0190\7?\2\2\u0190"+
		"I\3\2\2\2\u0191\u0193\t\2\2\2\u0192\u0191\3\2\2\2\u0193\u0194\3\2\2\2"+
		"\u0194\u0192\3\2\2\2\u0194\u0195\3\2\2\2\u0195K\3\2\2\2\u0196\u0197\7"+
		"$\2\2\u0197\u0198\3\2\2\2\u0198\u0199\b&\2\2\u0199\u019a\b&\3\2\u019a"+
		"M\3\2\2\2\u019b\u019f\7%\2\2\u019c\u019e\n\3\2\2\u019d\u019c\3\2\2\2\u019e"+
		"\u01a1\3\2\2\2\u019f\u019d\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a2\3\2"+
		"\2\2\u01a1\u019f\3\2\2\2\u01a2\u01a3\b\'\3\2\u01a3O\3\2\2\2\u01a4\u01a6"+
		"\t\4\2\2\u01a5\u01a4\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a7"+
		"\u01a8\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01aa\b(\3\2\u01aaQ\3\2\2\2\u01ab"+
		"\u01ad\t\5\2\2\u01ac\u01ab\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01ac\3\2"+
		"\2\2\u01ae\u01af\3\2\2\2\u01afS\3\2\2\2\u01b0\u01b1\7$\2\2\u01b1\u01b2"+
		"\3\2\2\2\u01b2\u01b3\b*\4\2\u01b3\u01b4\b*\3\2\u01b4U\3\2\2\2\u01b5\u01b7"+
		"\n\6\2\2\u01b6\u01b5\3\2\2\2\u01b7\u01ba\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b8"+
		"\u01b9\3\2\2\2\u01b9W\3\2\2\2\u01ba\u01b8\3\2\2\2\30\2\3e{\u0083\u0090"+
		"\u00b7\u00d1\u00d9\u00e8\u00f0\u00f5\u00fe\u012a\u0136\u015e\u0180\u0194"+
		"\u019f\u01a7\u01ae\u01b8\5\7\3\2\b\2\2\6\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}