// Generated from HamsterConfigParser.g4 by ANTLR 4.7.1
package org.mdolidon.hamster.configuration.antlrGenerated;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HamsterConfigParser extends Parser {
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
		RULE_integer = 0, RULE_string = 1, RULE_string_properties_map = 2, RULE_string_property = 3, 
		RULE_config = 4, RULE_directive = 5, RULE_start_directive = 6, RULE_parallel_directive = 7, 
		RULE_max_size_directive = 8, RULE_no_max_size_directive = 9, RULE_max_size_per_file_directive = 10, 
		RULE_size_unit = 11, RULE_kilobytes = 12, RULE_megabytes = 13, RULE_save_directive = 14, 
		RULE_save_as_tree = 15, RULE_save_flat = 16, RULE_save_under_clause = 17, 
		RULE_save_regex_to_template = 18, RULE_download_directive = 19, RULE_get_rule = 20, 
		RULE_get_unknown_rule = 21, RULE_avoid_rule = 22, RULE_authentication_directive = 23, 
		RULE_simple_authentication_rule = 24, RULE_checkin_directive = 25, RULE_cookies_directive = 26, 
		RULE_matcher = 27, RULE_unknown_matcher_op = 28, RULE_matchers_product = 29, 
		RULE_rest = 30, RULE_and_matcher = 31, RULE_and_not_matcher = 32, RULE_matcher_factor = 33, 
		RULE_not_matcher_op = 34, RULE_all_matcher = 35, RULE_images_matcher = 36, 
		RULE_same_domain_matcher = 37, RULE_subpaths_matcher = 38, RULE_resources_matcher = 39, 
		RULE_css_matcher = 40, RULE_urls_matcher = 41, RULE_max_jumps_matcher = 42, 
		RULE_min_jumps_matcher = 43;
	public static final String[] ruleNames = {
		"integer", "string", "string_properties_map", "string_property", "config", 
		"directive", "start_directive", "parallel_directive", "max_size_directive", 
		"no_max_size_directive", "max_size_per_file_directive", "size_unit", "kilobytes", 
		"megabytes", "save_directive", "save_as_tree", "save_flat", "save_under_clause", 
		"save_regex_to_template", "download_directive", "get_rule", "get_unknown_rule", 
		"avoid_rule", "authentication_directive", "simple_authentication_rule", 
		"checkin_directive", "cookies_directive", "matcher", "unknown_matcher_op", 
		"matchers_product", "rest", "and_matcher", "and_not_matcher", "matcher_factor", 
		"not_matcher_op", "all_matcher", "images_matcher", "same_domain_matcher", 
		"subpaths_matcher", "resources_matcher", "css_matcher", "urls_matcher", 
		"max_jumps_matcher", "min_jumps_matcher"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'all'", "'as'", null, "'avoid'", null, null, "'css'", "'domain'", 
		"'each'", "'flat'", "'from'", "'get'", null, "'images'", null, null, null, 
		"'Kb'", "'maximum'", "'Mb'", null, "'on'", "'outside'", null, "'password'", 
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

	@Override
	public String getGrammarFileName() { return "HamsterConfigParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HamsterConfigParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class IntegerContext extends ParserRuleContext {
		public TerminalNode INTEGER_LITERAL() { return getToken(HamsterConfigParser.INTEGER_LITERAL, 0); }
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HamsterConfigParserListener ) ((HamsterConfigParserListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HamsterConfigParserListener ) ((HamsterConfigParserListener)listener).exitInteger(this);
		}
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_integer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(INTEGER_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(HamsterConfigParser.STRING_LITERAL, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HamsterConfigParserListener ) ((HamsterConfigParserListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HamsterConfigParserListener ) ((HamsterConfigParserListener)listener).exitString(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class String_properties_mapContext extends ParserRuleContext {
		public List<String_propertyContext> string_property() {
			return getRuleContexts(String_propertyContext.class);
		}
		public String_propertyContext string_property(int i) {
			return getRuleContext(String_propertyContext.class,i);
		}
		public String_properties_mapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_properties_map; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HamsterConfigParserListener ) ((HamsterConfigParserListener)listener).enterString_properties_map(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HamsterConfigParserListener ) ((HamsterConfigParserListener)listener).exitString_properties_map(this);
		}
	}

	public final String_properties_mapContext string_properties_map() throws RecognitionException {
		String_properties_mapContext _localctx = new String_properties_mapContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_string_properties_map);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STRING_LITERAL) {
				{
				{
				setState(92);
				string_property();
				}
				}
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class String_propertyContext extends ParserRuleContext {
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public TerminalNode EQUALS() { return getToken(HamsterConfigParser.EQUALS, 0); }
		public String_propertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HamsterConfigParserListener ) ((HamsterConfigParserListener)listener).enterString_property(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HamsterConfigParserListener ) ((HamsterConfigParserListener)listener).exitString_property(this);
		}
	}

	public final String_propertyContext string_property() throws RecognitionException {
		String_propertyContext _localctx = new String_propertyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_string_property);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			string();
			setState(99);
			match(EQUALS);
			setState(100);
			string();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConfigContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(HamsterConfigParser.EOF, 0); }
		public List<DirectiveContext> directive() {
			return getRuleContexts(DirectiveContext.class);
		}
		public DirectiveContext directive(int i) {
			return getRuleContext(DirectiveContext.class,i);
		}
		public ConfigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_config; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HamsterConfigParserListener ) ((HamsterConfigParserListener)listener).enterConfig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HamsterConfigParserListener ) ((HamsterConfigParserListener)listener).exitConfig(this);
		}
	}

	public final ConfigContext config() throws RecognitionException {
		ConfigContext _localctx = new ConfigContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_config);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AVOID) | (1L << CHECK_IN_AT) | (1L << COOKIES) | (1L << GET) | (1L << GET_UNKNOWN) | (1L << MAXIMUM) | (1L << NO_SIZE_LIMIT) | (1L << SAVE) | (1L << START_AT) | (1L << USER) | (1L << INTEGER_LITERAL))) != 0)) {
				{
				{
				setState(102);
				directive();
				}
				}
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(108);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DirectiveContext extends ParserRuleContext {
		public Start_directiveContext start_directive() {
			return getRuleContext(Start_directiveContext.class,0);
		}
		public Parallel_directiveContext parallel_directive() {
			return getRuleContext(Parallel_directiveContext.class,0);
		}
		public Download_directiveContext download_directive() {
			return getRuleContext(Download_directiveContext.class,0);
		}
		public Save_directiveContext save_directive() {
			return getRuleContext(Save_directiveContext.class,0);
		}
		public Authentication_directiveContext authentication_directive() {
			return getRuleContext(Authentication_directiveContext.class,0);
		}
		public Max_size_directiveContext max_size_directive() {
			return getRuleContext(Max_size_directiveContext.class,0);
		}
		public Checkin_directiveContext checkin_directive() {
			return getRuleContext(Checkin_directiveContext.class,0);
		}
		public Cookies_directiveContext cookies_directive() {
			return getRuleContext(Cookies_directiveContext.class,0);
		}
		public DirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HamsterConfigParserListener ) ((HamsterConfigParserListener)listener).enterDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HamsterConfigParserListener ) ((HamsterConfigParserListener)listener).exitDirective(this);
		}
	}

	public final DirectiveContext directive() throws RecognitionException {
		DirectiveContext _localctx = new DirectiveContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case START_AT:
				{
				setState(110);
				start_directive();
				}
				break;
			case INTEGER_LITERAL:
				{
				setState(111);
				parallel_directive();
				}
				break;
			case AVOID:
			case GET:
			case GET_UNKNOWN:
				{
				setState(112);
				download_directive();
				}
				break;
			case SAVE:
				{
				setState(113);
				save_directive();
				}
				break;
			case USER:
				{
				setState(114);
				authentication_directive();
				}
				break;
			case MAXIMUM:
			case NO_SIZE_LIMIT:
				{
				setState(115);
				max_size_directive();
				}
				break;
			case CHECK_IN_AT:
				{
				setState(116);
				checkin_directive();
				}
				break;
			case COOKIES:
				{
				setState(117);
				cookies_directive();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Start_directiveContext extends ParserRuleContext {
		public TerminalNode START_AT() { return getToken(HamsterConfigParser.START_AT, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public Start_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HamsterConfigParserListener ) ((HamsterConfigParserListener)listener).enterStart_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HamsterConfigParserListener ) ((HamsterConfigParserListener)listener).exitStart_directive(this);
		}
	}

	public final Start_directiveContext start_directive() throws RecognitionException {
		Start_directiveContext _localctx = new Start_directiveContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_start_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(START_AT);
			setState(121);
			string();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parallel_directiveContext extends ParserRuleContext {
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public TerminalNode PARALLEL_DOWNLOADS() { return getToken(HamsterConfigParser.PARALLEL_DOWNLOADS, 0); }
		public Parallel_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parallel_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HamsterConfigParserListener ) ((HamsterConfigParserListener)listener).enterParallel_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HamsterConfigParserListener ) ((HamsterConfigParserListener)listener).exitParallel_directive(this);
		}
	}

	public final Parallel_directiveContext parallel_directive() throws RecognitionException {
		Parallel_directiveContext _localctx = new Parallel_directiveContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_parallel_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			integer();
			setState(124);
			match(PARALLEL_DOWNLOADS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Max_size_directiveContext extends ParserRuleContext {
		public Max_size_per_file_directiveContext max_size_per_file_directive() {
			return getRuleContext(Max_size_per_file_directiveContext.class,0);
		}
		public No_max_size_directiveContext no_max_size_directive() {
			return getRuleContext(No_max_size_directiveContext.class,0);
		}
		public Max_size_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_max_size_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HamsterConfigParserListener ) ((HamsterConfigParserListener)listener).enterMax_size_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HamsterConfigParserListener ) ((HamsterConfigParserListener)listener).exitMax_size_directive(this);
		}
	}

	public final Max_size_directiveContext max_size_directive() throws RecognitionException {
		Max_size_directiveContext _localctx = new Max_size_directiveContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_max_size_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAXIMUM:
				{
				setState(126);
				max_size_per_file_directive();
				}
				break;
			case NO_SIZE_LIMIT:
				{
				setState(127);
				no_max_size_directive();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class No_max_size_directiveContext extends ParserRuleContext {
		public TerminalNode NO_SIZE_LIMIT() { return getToken(HamsterConfigParser.NO_SIZE_LIMIT, 0); }
		public TerminalNode FROM() { return getToken(HamsterConfigParser.FROM, 0); }
		public MatcherContext matcher() {
			return getRuleContext(MatcherContext.class,0);
		}
		public No_max_size_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_no_max_size_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HamsterConfigParserListener ) ((HamsterConfigParserListener)listener).enterNo_max_size_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HamsterConfigParserListener ) ((HamsterConfigParserListener)listener).exitNo_max_size_directive(this);
		}
	}

	public final No_max_size_directiveContext no_max_size_directive() throws RecognitionException {
		No_max_size_directiveContext _localctx = new No_max_size_directiveContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_no_max_size_directive);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(NO_SIZE_LIMIT);
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(131);
				match(FROM);
				setState(132);
				matcher();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Max_size_per_file_directiveContext extends ParserRuleContext {
		public TerminalNode MAXIMUM() { return getToken(HamsterConfigParser.MAXIMUM, 0); }
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public Size_unitContext size_unit() {
			return getRuleContext(Size_unitContext.class,0);
		}
		public TerminalNode EACH() { return getToken(HamsterConfigParser.EACH, 0); }
		public TerminalNode FROM() { return getToken(HamsterConfigParser.FROM, 0); }
		public MatcherContext matcher() {
			return getRuleContext(MatcherContext.class,0);
		}
		public Max_size_per_file_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_max_size_per_file_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HamsterConfigParserListener ) ((HamsterConfigParserListener)listener).enterMax_size_per_file_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HamsterConfigParserListener ) ((HamsterConfigParserListener)listener).exitMax_size_per_file_directive(this);
		}
	}

	public final Max_size_per_file_directiveContext max_size_per_file_directive() throws RecognitionException {
		Max_size_per_file_directiveContext _localctx = new Max_size_per_file_directiveContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_max_size_per_file_directive);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(MAXIMUM);
			setState(136);
			integer();
			setState(137);
			size_unit();
			setState(138);
			match(EACH);
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(139);
				match(FROM);
				setState(140);
				matcher();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Size_unitContext extends ParserRuleContext {
		public KilobytesContext kilobytes() {
			return getRuleContext(KilobytesContext.class,0);
		}
		public MegabytesContext megabytes() {
			return getRuleContext(MegabytesContext.class,0);
		}
		public Size_unitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_size_unit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HamsterConfigParserListener ) ((HamsterConfigParserListener)listener).enterSize_unit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HamsterConfigParserListener ) ((HamsterConfigParserListener)listener).exitSize_unit(this);
		}
	}

	public final Size_unitContext size_unit() throws RecognitionException {
		Size_unitContext _localctx = new Size_unitContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_size_unit);
		try {
			setState(145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KB:
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				kilobytes();
				}
				break;
			case MB:
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				megabytes();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KilobytesContext extends ParserRuleContext {
		public TerminalNode KB() { return getToken(HamsterConfigParser.KB, 0); }
		public KilobytesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kilobytes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HamsterConfigParserListener ) ((HamsterConfigParserListener)listener).enterKilobytes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HamsterConfigParserListener ) ((HamsterConfigParserListener)listener).exitKilobytes(this);
		}
	}

	public final KilobytesContext kilobytes() throws RecognitionException {
		KilobytesContext _localctx = new KilobytesContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_kilobytes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(KB);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MegabytesContext extends ParserRuleContext {
		public TerminalNode MB() { return getToken(HamsterConfigParser.MB, 0); }
		public MegabytesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_megabytes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HamsterConfigParserListener ) ((HamsterConfigParserListener)listener).enterMegabytes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HamsterConfigParserListener ) ((HamsterConfigParserListener)listener).exitMegabytes(this);
		}
	}

	public final MegabytesContext megabytes() throws RecognitionException {
		MegabytesContext _localctx = new MegabytesContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_megabytes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(MB);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Save_directiveContext extends ParserRuleContext {
		public TerminalNode SAVE() { return getToken(HamsterConfigParser.SAVE, 0); }
		public Save_as_treeContext save_as_tree() {
			return getRuleContext(Save_as_treeContext.class,0);
		}
		public Save_flatContext save_flat() {
			return getRuleContext(Save_flatContext.class,0);
		}
		public Save_regex_to_templateContext save_regex_to_template() {
			return getRuleContext(Save_regex_to_templateContext.class,0);
		}
		public Save_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_save_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HamsterConfigParserListener ) ((HamsterConfigParserListener)listener).enterSave_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HamsterConfigParserListener ) ((HamsterConfigParserListener)listener).exitSave_directive(this);
		}
	}

	public final Save_directiveContext save_directive() throws RecognitionException {
		Save_directiveContext _localctx = new Save_directiveContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_save_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(SAVE);
			setState(155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(152);
				save_as_tree();
				}
				break;
			case 2:
				{
				setState(153);
				save_flat();
				}
				break;
			case 3:
				{
				setState(154);
				save_regex_to_template();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Save_as_treeContext extends ParserRuleContext {
		public TerminalNode AS_TREE() { return getToken(HamsterConfigParser.AS_TREE, 0); }
		public MatcherContext matcher() {
			return getRuleContext(MatcherContext.class,0);
		}
		public Save_under_clauseContext save_under_clause() {
			return getRuleContext(Save_under_clauseContext.class,0);
		}
		public Save_as_treeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_save_as_tree; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HamsterConfigParserListener ) ((HamsterConfigParserListener)listener).enterSave_as_tree(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HamsterConfigParserListener ) ((HamsterConfigParserListener)listener).exitSave_as_tree(this);
		}
	}

	public final Save_as_treeContext save_as_tree() throws RecognitionException {
		Save_as_treeContext _localctx = new Save_as_treeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_save_as_tree);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << CSS) | (1L << DOMAIN) | (1L << IMAGES) | (1L << ITEMS_ON_DOMAIN) | (1L << OUTSIDE) | (1L << RESOURCES) | (1L << SUBPATHS) | (1L << UNKNOWN) | (1L << UP_TO) | (1L << URLS) | (1L << INTEGER_LITERAL))) != 0)) {
				{
				setState(157);
				matcher();
				}
			}

			setState(160);
			match(AS_TREE);
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNDER) {
				{
				setState(161);
				save_under_clause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Save_flatContext extends ParserRuleContext {
		public TerminalNode FLAT() { return getToken(HamsterConfigParser.FLAT, 0); }
		public MatcherContext matcher() {
			return getRuleContext(MatcherContext.class,0);
		}
		public Save_under_clauseContext save_under_clause() {
			return getRuleContext(Save_under_clauseContext.class,0);
		}
		public Save_flatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_save_flat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HamsterConfigParserListener ) ((HamsterConfigParserListener)listener).enterSave_flat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HamsterConfigParserListener ) ((HamsterConfigParserListener)listener).exitSave_flat(this);
		}
	}

	public final Save_flatContext save_flat() throws RecognitionException {
		Save_flatContext _localctx = new Save_flatContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_save_flat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << CSS) | (1L << DOMAIN) | (1L << IMAGES) | (1L << ITEMS_ON_DOMAIN) | (1L << OUTSIDE) | (1L << RESOURCES) | (1L << SUBPATHS) | (1L << UNKNOWN) | (1L << UP_TO) | (1L << URLS) | (1L << INTEGER_LITERAL))) != 0)) {
				{
				setState(164);
				matcher();
				}
			}

			setState(167);
			match(FLAT);
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNDER) {
				{
				setState(168);
				save_under_clause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Save_under_clauseContext extends ParserRuleContext {
		public TerminalNode UNDER() { return getToken(HamsterConfigParser.UNDER, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public Save_under_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_save_under_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HamsterConfigParserListener ) ((HamsterConfigParserListener)listener).enterSave_under_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HamsterConfigParserListener ) ((HamsterConfigParserListener)listener).exitSave_under_clause(this);
		}
	}

	public final Save_under_clauseContext save_under_clause() throws RecognitionException {
		Save_under_clauseContext _localctx = new Save_under_clauseContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_save_under_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(UNDER);
			setState(172);
			string();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Save_regex_to_templateContext extends ParserRuleContext {
		public Urls_matcherContext urls_matcher() {
			return getRuleContext(Urls_matcherContext.class,0);
		}
		public TerminalNode AS() { return getToken(HamsterConfigParser.AS, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public Save_regex_to_templateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_save_regex_to_template; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HamsterConfigParserListener ) ((HamsterConfigParserListener)listener).enterSave_regex_to_template(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HamsterConfigParserListener ) ((HamsterConfigParserListener)listener).exitSave_regex_to_template(this);
		}
	}

	public final Save_regex_to_templateContext save_regex_to_template() throws RecognitionException {
		Save_regex_to_templateContext _localctx = new Save_regex_to_templateContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_save_regex_to_template);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			urls_matcher();
			setState(175);
			match(AS);
			setState(176);
			string();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Download_directiveContext extends ParserRuleContext {
		public Get_ruleContext get_rule() {
			return getRuleContext(Get_ruleContext.class,0);
		}
		public Get_unknown_ruleContext get_unknown_rule() {
			return getRuleContext(Get_unknown_ruleContext.class,0);
		}
		public Avoid_ruleContext avoid_rule() {
			return getRuleContext(Avoid_ruleContext.class,0);
		}
		public Download_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_download_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HamsterConfigParserListener ) ((HamsterConfigParserListener)listener).enterDownload_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HamsterConfigParserListener ) ((HamsterConfigParserListener)listener).exitDownload_directive(this);
		}
	}

	public final Download_directiveContext download_directive() throws RecognitionException {
		Download_directiveContext _localctx = new Download_directiveContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_download_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GET:
				{
				setState(178);
				get_rule();
				}
				break;
			case GET_UNKNOWN:
				{
				setState(179);
				get_unknown_rule();
				}
				break;
			case AVOID:
				{
				setState(180);
				avoid_rule();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Get_ruleContext extends ParserRuleContext {
		public TerminalNode GET() { return getToken(HamsterConfigParser.GET, 0); }
		public MatcherContext matcher() {
			return getRuleContext(MatcherContext.class,0);
		}
		public Get_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_get_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HamsterConfigParserListener ) ((HamsterConfigParserListener)listener).enterGet_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HamsterConfigParserListener ) ((HamsterConfigParserListener)listener).exitGet_rule(this);
		}
	}

	public final Get_ruleContext get_rule() throws RecognitionException {
		Get_ruleContext _localctx = new Get_ruleContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_get_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(GET);
			setState(184);
			matcher();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Get_unknown_ruleContext extends ParserRuleContext {
		public TerminalNode GET_UNKNOWN() { return getToken(HamsterConfigParser.GET_UNKNOWN, 0); }
		public MatcherContext matcher() {
			return getRuleContext(MatcherContext.class,0);
		}
		public Get_unknown_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_get_unknown_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HamsterConfigParserListener ) ((HamsterConfigParserListener)listener).enterGet_unknown_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HamsterConfigParserListener ) ((HamsterConfigParserListener)listener).exitGet_unknown_rule(this);
		}
	}

	public final Get_unknown_ruleContext get_unknown_rule() throws RecognitionException {
		Get_unknown_ruleContext _localctx = new Get_unknown_ruleContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_get_unknown_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(GET_UNKNOWN);
			setState(187);
			matcher();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Avoid_ruleContext extends ParserRuleContext {
		public TerminalNode AVOID() { return getToken(HamsterConfigParser.AVOID, 0); }
		public MatcherContext matcher() {
			return getRuleContext(MatcherContext.class,0);
		}
		public Avoid_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_avoid_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HamsterConfigParserListener ) ((HamsterConfigParserListener)listener).enterAvoid_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HamsterConfigParserListener ) ((HamsterConfigParserListener)listener).exitAvoid_rule(this);
		}
	}

	public final Avoid_ruleContext avoid_rule() throws RecognitionException {
		Avoid_ruleContext _localctx = new Avoid_ruleContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_avoid_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(AVOID);
			setState(190);
			matcher();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Authentication_directiveContext extends ParserRuleContext {
		public Simple_authentication_ruleContext simple_authentication_rule() {
			return getRuleContext(Simple_authentication_ruleContext.class,0);
		}
		public Authentication_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_authentication_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HamsterConfigParserListener ) ((HamsterConfigParserListener)listener).enterAuthentication_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HamsterConfigParserListener ) ((HamsterConfigParserListener)listener).exitAuthentication_directive(this);
		}
	}

	public final Authentication_directiveContext authentication_directive() throws RecognitionException {
		Authentication_directiveContext _localctx = new Authentication_directiveContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_authentication_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			simple_authentication_rule();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_authentication_ruleContext extends ParserRuleContext {
		public TerminalNode USER() { return getToken(HamsterConfigParser.USER, 0); }
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public TerminalNode PASSWORD() { return getToken(HamsterConfigParser.PASSWORD, 0); }
		public TerminalNode ON() { return getToken(HamsterConfigParser.ON, 0); }
		public MatcherContext matcher() {
			return getRuleContext(MatcherContext.class,0);
		}
		public Simple_authentication_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_authentication_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HamsterConfigParserListener ) ((HamsterConfigParserListener)listener).enterSimple_authentication_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HamsterConfigParserListener ) ((HamsterConfigParserListener)listener).exitSimple_authentication_rule(this);
		}
	}

	public final Simple_authentication_ruleContext simple_authentication_rule() throws RecognitionException {
		Simple_authentication_ruleContext _localctx = new Simple_authentication_ruleContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_simple_authentication_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(USER);
			setState(195);
			string();
			setState(196);
			match(PASSWORD);
			setState(197);
			string();
			setState(198);
			match(ON);
			setState(199);
			matcher();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Checkin_directiveContext extends ParserRuleContext {
		public TerminalNode CHECK_IN_AT() { return getToken(HamsterConfigParser.CHECK_IN_AT, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode POST() { return getToken(HamsterConfigParser.POST, 0); }
		public String_properties_mapContext string_properties_map() {
			return getRuleContext(String_properties_mapContext.class,0);
		}
		public Checkin_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_checkin_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HamsterConfigParserListener ) ((HamsterConfigParserListener)listener).enterCheckin_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HamsterConfigParserListener ) ((HamsterConfigParserListener)listener).exitCheckin_directive(this);
		}
	}

	public final Checkin_directiveContext checkin_directive() throws RecognitionException {
		Checkin_directiveContext _localctx = new Checkin_directiveContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_checkin_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(CHECK_IN_AT);
			setState(202);
			string();
			setState(203);
			match(POST);
			setState(204);
			string_properties_map();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cookies_directiveContext extends ParserRuleContext {
		public TerminalNode COOKIES() { return getToken(HamsterConfigParser.COOKIES, 0); }
		public String_properties_mapContext string_properties_map() {
			return getRuleContext(String_properties_mapContext.class,0);
		}
		public TerminalNode ON() { return getToken(HamsterConfigParser.ON, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public Cookies_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cookies_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HamsterConfigParserListener ) ((HamsterConfigParserListener)listener).enterCookies_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HamsterConfigParserListener ) ((HamsterConfigParserListener)listener).exitCookies_directive(this);
		}
	}

	public final Cookies_directiveContext cookies_directive() throws RecognitionException {
		Cookies_directiveContext _localctx = new Cookies_directiveContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_cookies_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(COOKIES);
			setState(207);
			string_properties_map();
			setState(208);
			match(ON);
			setState(209);
			string();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MatcherContext extends ParserRuleContext {
		public Unknown_matcher_opContext unknown_matcher_op() {
			return getRuleContext(Unknown_matcher_opContext.class,0);
		}
		public Matchers_productContext matchers_product() {
			return getRuleContext(Matchers_productContext.class,0);
		}
		public MatcherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matcher; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HamsterConfigParserListener ) ((HamsterConfigParserListener)listener).enterMatcher(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HamsterConfigParserListener ) ((HamsterConfigParserListener)listener).exitMatcher(this);
		}
	}

	public final MatcherContext matcher() throws RecognitionException {
		MatcherContext _localctx = new MatcherContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_matcher);
		try {
			setState(213);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UNKNOWN:
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				unknown_matcher_op();
				}
				break;
			case ALL:
			case CSS:
			case DOMAIN:
			case IMAGES:
			case ITEMS_ON_DOMAIN:
			case OUTSIDE:
			case RESOURCES:
			case SUBPATHS:
			case UP_TO:
			case URLS:
			case INTEGER_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
				matchers_product();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unknown_matcher_opContext extends ParserRuleContext {
		public TerminalNode UNKNOWN() { return getToken(HamsterConfigParser.UNKNOWN, 0); }
		public Matchers_productContext matchers_product() {
			return getRuleContext(Matchers_productContext.class,0);
		}
		public Unknown_matcher_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unknown_matcher_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HamsterConfigParserListener ) ((HamsterConfigParserListener)listener).enterUnknown_matcher_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HamsterConfigParserListener ) ((HamsterConfigParserListener)listener).exitUnknown_matcher_op(this);
		}
	}

	public final Unknown_matcher_opContext unknown_matcher_op() throws RecognitionException {
		Unknown_matcher_opContext _localctx = new Unknown_matcher_opContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_unknown_matcher_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(UNKNOWN);
			setState(216);
			matchers_product();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Matchers_productContext extends ParserRuleContext {
		public Matcher_factorContext matcher_factor() {
			return getRuleContext(Matcher_factorContext.class,0);
		}
		public RestContext rest() {
			return getRuleContext(RestContext.class,0);
		}
		public Matchers_productContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchers_product; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HamsterConfigParserListener ) ((HamsterConfigParserListener)listener).enterMatchers_product(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HamsterConfigParserListener ) ((HamsterConfigParserListener)listener).exitMatchers_product(this);
		}
	}

	public final Matchers_productContext matchers_product() throws RecognitionException {
		Matchers_productContext _localctx = new Matchers_productContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_matchers_product);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			matcher_factor();
			setState(219);
			rest();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RestContext extends ParserRuleContext {
		public RestContext rest() {
			return getRuleContext(RestContext.class,0);
		}
		public And_matcherContext and_matcher() {
			return getRuleContext(And_matcherContext.class,0);
		}
		public And_not_matcherContext and_not_matcher() {
			return getRuleContext(And_not_matcherContext.class,0);
		}
		public RestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HamsterConfigParserListener ) ((HamsterConfigParserListener)listener).enterRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HamsterConfigParserListener ) ((HamsterConfigParserListener)listener).exitRest(this);
		}
	}

	public final RestContext rest() throws RecognitionException {
		RestContext _localctx = new RestContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_rest);
		try {
			setState(228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(223);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ON:
					{
					setState(221);
					and_matcher();
					}
					break;
				case OUTSIDE:
					{
					setState(222);
					and_not_matcher();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(225);
				rest();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class And_matcherContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(HamsterConfigParser.ON, 0); }
		public Matcher_factorContext matcher_factor() {
			return getRuleContext(Matcher_factorContext.class,0);
		}
		public And_matcherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and_matcher; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HamsterConfigParserListener ) ((HamsterConfigParserListener)listener).enterAnd_matcher(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HamsterConfigParserListener ) ((HamsterConfigParserListener)listener).exitAnd_matcher(this);
		}
	}

	public final And_matcherContext and_matcher() throws RecognitionException {
		And_matcherContext _localctx = new And_matcherContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_and_matcher);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(ON);
			setState(231);
			matcher_factor();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class And_not_matcherContext extends ParserRuleContext {
		public TerminalNode OUTSIDE() { return getToken(HamsterConfigParser.OUTSIDE, 0); }
		public Matcher_factorContext matcher_factor() {
			return getRuleContext(Matcher_factorContext.class,0);
		}
		public And_not_matcherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and_not_matcher; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HamsterConfigParserListener ) ((HamsterConfigParserListener)listener).enterAnd_not_matcher(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HamsterConfigParserListener ) ((HamsterConfigParserListener)listener).exitAnd_not_matcher(this);
		}
	}

	public final And_not_matcherContext and_not_matcher() throws RecognitionException {
		And_not_matcherContext _localctx = new And_not_matcherContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_and_not_matcher);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(OUTSIDE);
			setState(234);
			matcher_factor();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Matcher_factorContext extends ParserRuleContext {
		public Not_matcher_opContext not_matcher_op() {
			return getRuleContext(Not_matcher_opContext.class,0);
		}
		public All_matcherContext all_matcher() {
			return getRuleContext(All_matcherContext.class,0);
		}
		public Css_matcherContext css_matcher() {
			return getRuleContext(Css_matcherContext.class,0);
		}
		public Images_matcherContext images_matcher() {
			return getRuleContext(Images_matcherContext.class,0);
		}
		public Max_jumps_matcherContext max_jumps_matcher() {
			return getRuleContext(Max_jumps_matcherContext.class,0);
		}
		public Min_jumps_matcherContext min_jumps_matcher() {
			return getRuleContext(Min_jumps_matcherContext.class,0);
		}
		public Resources_matcherContext resources_matcher() {
			return getRuleContext(Resources_matcherContext.class,0);
		}
		public Same_domain_matcherContext same_domain_matcher() {
			return getRuleContext(Same_domain_matcherContext.class,0);
		}
		public Subpaths_matcherContext subpaths_matcher() {
			return getRuleContext(Subpaths_matcherContext.class,0);
		}
		public Urls_matcherContext urls_matcher() {
			return getRuleContext(Urls_matcherContext.class,0);
		}
		public Matcher_factorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matcher_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HamsterConfigParserListener ) ((HamsterConfigParserListener)listener).enterMatcher_factor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HamsterConfigParserListener ) ((HamsterConfigParserListener)listener).exitMatcher_factor(this);
		}
	}

	public final Matcher_factorContext matcher_factor() throws RecognitionException {
		Matcher_factorContext _localctx = new Matcher_factorContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_matcher_factor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OUTSIDE:
				{
				setState(236);
				not_matcher_op();
				}
				break;
			case ALL:
				{
				setState(237);
				all_matcher();
				}
				break;
			case CSS:
				{
				setState(238);
				css_matcher();
				}
				break;
			case IMAGES:
				{
				setState(239);
				images_matcher();
				}
				break;
			case UP_TO:
				{
				setState(240);
				max_jumps_matcher();
				}
				break;
			case INTEGER_LITERAL:
				{
				setState(241);
				min_jumps_matcher();
				}
				break;
			case RESOURCES:
				{
				setState(242);
				resources_matcher();
				}
				break;
			case DOMAIN:
			case ITEMS_ON_DOMAIN:
				{
				setState(243);
				same_domain_matcher();
				}
				break;
			case SUBPATHS:
				{
				setState(244);
				subpaths_matcher();
				}
				break;
			case URLS:
				{
				setState(245);
				urls_matcher();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Not_matcher_opContext extends ParserRuleContext {
		public TerminalNode OUTSIDE() { return getToken(HamsterConfigParser.OUTSIDE, 0); }
		public MatcherContext matcher() {
			return getRuleContext(MatcherContext.class,0);
		}
		public Not_matcher_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_not_matcher_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HamsterConfigParserListener ) ((HamsterConfigParserListener)listener).enterNot_matcher_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HamsterConfigParserListener ) ((HamsterConfigParserListener)listener).exitNot_matcher_op(this);
		}
	}

	public final Not_matcher_opContext not_matcher_op() throws RecognitionException {
		Not_matcher_opContext _localctx = new Not_matcher_opContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_not_matcher_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(OUTSIDE);
			setState(249);
			matcher();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class All_matcherContext extends ParserRuleContext {
		public TerminalNode ALL() { return getToken(HamsterConfigParser.ALL, 0); }
		public All_matcherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_all_matcher; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HamsterConfigParserListener ) ((HamsterConfigParserListener)listener).enterAll_matcher(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HamsterConfigParserListener ) ((HamsterConfigParserListener)listener).exitAll_matcher(this);
		}
	}

	public final All_matcherContext all_matcher() throws RecognitionException {
		All_matcherContext _localctx = new All_matcherContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_all_matcher);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(ALL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Images_matcherContext extends ParserRuleContext {
		public TerminalNode IMAGES() { return getToken(HamsterConfigParser.IMAGES, 0); }
		public Images_matcherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_images_matcher; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HamsterConfigParserListener ) ((HamsterConfigParserListener)listener).enterImages_matcher(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HamsterConfigParserListener ) ((HamsterConfigParserListener)listener).exitImages_matcher(this);
		}
	}

	public final Images_matcherContext images_matcher() throws RecognitionException {
		Images_matcherContext _localctx = new Images_matcherContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_images_matcher);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(IMAGES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Same_domain_matcherContext extends ParserRuleContext {
		public TerminalNode DOMAIN() { return getToken(HamsterConfigParser.DOMAIN, 0); }
		public TerminalNode ITEMS_ON_DOMAIN() { return getToken(HamsterConfigParser.ITEMS_ON_DOMAIN, 0); }
		public Same_domain_matcherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_same_domain_matcher; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HamsterConfigParserListener ) ((HamsterConfigParserListener)listener).enterSame_domain_matcher(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HamsterConfigParserListener ) ((HamsterConfigParserListener)listener).exitSame_domain_matcher(this);
		}
	}

	public final Same_domain_matcherContext same_domain_matcher() throws RecognitionException {
		Same_domain_matcherContext _localctx = new Same_domain_matcherContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_same_domain_matcher);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			_la = _input.LA(1);
			if ( !(_la==DOMAIN || _la==ITEMS_ON_DOMAIN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Subpaths_matcherContext extends ParserRuleContext {
		public TerminalNode SUBPATHS() { return getToken(HamsterConfigParser.SUBPATHS, 0); }
		public Subpaths_matcherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subpaths_matcher; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HamsterConfigParserListener ) ((HamsterConfigParserListener)listener).enterSubpaths_matcher(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HamsterConfigParserListener ) ((HamsterConfigParserListener)listener).exitSubpaths_matcher(this);
		}
	}

	public final Subpaths_matcherContext subpaths_matcher() throws RecognitionException {
		Subpaths_matcherContext _localctx = new Subpaths_matcherContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_subpaths_matcher);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			match(SUBPATHS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Resources_matcherContext extends ParserRuleContext {
		public TerminalNode RESOURCES() { return getToken(HamsterConfigParser.RESOURCES, 0); }
		public Resources_matcherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resources_matcher; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HamsterConfigParserListener ) ((HamsterConfigParserListener)listener).enterResources_matcher(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HamsterConfigParserListener ) ((HamsterConfigParserListener)listener).exitResources_matcher(this);
		}
	}

	public final Resources_matcherContext resources_matcher() throws RecognitionException {
		Resources_matcherContext _localctx = new Resources_matcherContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_resources_matcher);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(RESOURCES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Css_matcherContext extends ParserRuleContext {
		public TerminalNode CSS() { return getToken(HamsterConfigParser.CSS, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public Css_matcherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_css_matcher; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HamsterConfigParserListener ) ((HamsterConfigParserListener)listener).enterCss_matcher(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HamsterConfigParserListener ) ((HamsterConfigParserListener)listener).exitCss_matcher(this);
		}
	}

	public final Css_matcherContext css_matcher() throws RecognitionException {
		Css_matcherContext _localctx = new Css_matcherContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_css_matcher);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(CSS);
			setState(262);
			string();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Urls_matcherContext extends ParserRuleContext {
		public TerminalNode URLS() { return getToken(HamsterConfigParser.URLS, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public Urls_matcherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_urls_matcher; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HamsterConfigParserListener ) ((HamsterConfigParserListener)listener).enterUrls_matcher(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HamsterConfigParserListener ) ((HamsterConfigParserListener)listener).exitUrls_matcher(this);
		}
	}

	public final Urls_matcherContext urls_matcher() throws RecognitionException {
		Urls_matcherContext _localctx = new Urls_matcherContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_urls_matcher);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(URLS);
			setState(265);
			string();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Max_jumps_matcherContext extends ParserRuleContext {
		public TerminalNode UP_TO() { return getToken(HamsterConfigParser.UP_TO, 0); }
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public TerminalNode JUMPS() { return getToken(HamsterConfigParser.JUMPS, 0); }
		public Max_jumps_matcherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_max_jumps_matcher; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HamsterConfigParserListener ) ((HamsterConfigParserListener)listener).enterMax_jumps_matcher(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HamsterConfigParserListener ) ((HamsterConfigParserListener)listener).exitMax_jumps_matcher(this);
		}
	}

	public final Max_jumps_matcherContext max_jumps_matcher() throws RecognitionException {
		Max_jumps_matcherContext _localctx = new Max_jumps_matcherContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_max_jumps_matcher);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(UP_TO);
			setState(268);
			integer();
			setState(269);
			match(JUMPS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Min_jumps_matcherContext extends ParserRuleContext {
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public TerminalNode JUMPS_AND_MORE() { return getToken(HamsterConfigParser.JUMPS_AND_MORE, 0); }
		public Min_jumps_matcherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_min_jumps_matcher; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HamsterConfigParserListener ) ((HamsterConfigParserListener)listener).enterMin_jumps_matcher(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HamsterConfigParserListener ) ((HamsterConfigParserListener)listener).exitMin_jumps_matcher(this);
		}
	}

	public final Min_jumps_matcherContext min_jumps_matcher() throws RecognitionException {
		Min_jumps_matcherContext _localctx = new Min_jumps_matcherContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_min_jumps_matcher);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			integer();
			setState(272);
			match(JUMPS_AND_MORE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3-\u0115\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\3\2\3\3\3\3\3\4\7\4`\n\4\f\4\16\4c\13\4\3\5\3\5\3\5\3\5"+
		"\3\6\7\6j\n\6\f\6\16\6m\13\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5"+
		"\7y\n\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\5\n\u0083\n\n\3\13\3\13\3\13\5"+
		"\13\u0088\n\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0090\n\f\3\r\3\r\5\r\u0094"+
		"\n\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\5\20\u009e\n\20\3\21\5\21"+
		"\u00a1\n\21\3\21\3\21\5\21\u00a5\n\21\3\22\5\22\u00a8\n\22\3\22\3\22\5"+
		"\22\u00ac\n\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\5\25"+
		"\u00b8\n\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34"+
		"\3\34\3\34\3\35\3\35\5\35\u00d8\n\35\3\36\3\36\3\36\3\37\3\37\3\37\3 "+
		"\3 \5 \u00e2\n \3 \3 \3 \5 \u00e7\n \3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3#"+
		"\3#\3#\3#\3#\3#\3#\5#\u00f9\n#\3$\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3"+
		")\3*\3*\3*\3+\3+\3+\3,\3,\3,\3,\3-\3-\3-\3-\2\2.\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVX\2\3\4\2\n\n\21"+
		"\21\2\u0109\2Z\3\2\2\2\4\\\3\2\2\2\6a\3\2\2\2\bd\3\2\2\2\nk\3\2\2\2\f"+
		"x\3\2\2\2\16z\3\2\2\2\20}\3\2\2\2\22\u0082\3\2\2\2\24\u0084\3\2\2\2\26"+
		"\u0089\3\2\2\2\30\u0093\3\2\2\2\32\u0095\3\2\2\2\34\u0097\3\2\2\2\36\u0099"+
		"\3\2\2\2 \u00a0\3\2\2\2\"\u00a7\3\2\2\2$\u00ad\3\2\2\2&\u00b0\3\2\2\2"+
		"(\u00b7\3\2\2\2*\u00b9\3\2\2\2,\u00bc\3\2\2\2.\u00bf\3\2\2\2\60\u00c2"+
		"\3\2\2\2\62\u00c4\3\2\2\2\64\u00cb\3\2\2\2\66\u00d0\3\2\2\28\u00d7\3\2"+
		"\2\2:\u00d9\3\2\2\2<\u00dc\3\2\2\2>\u00e6\3\2\2\2@\u00e8\3\2\2\2B\u00eb"+
		"\3\2\2\2D\u00f8\3\2\2\2F\u00fa\3\2\2\2H\u00fd\3\2\2\2J\u00ff\3\2\2\2L"+
		"\u0101\3\2\2\2N\u0103\3\2\2\2P\u0105\3\2\2\2R\u0107\3\2\2\2T\u010a\3\2"+
		"\2\2V\u010d\3\2\2\2X\u0111\3\2\2\2Z[\7\'\2\2[\3\3\2\2\2\\]\7-\2\2]\5\3"+
		"\2\2\2^`\5\b\5\2_^\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2b\7\3\2\2\2ca"+
		"\3\2\2\2de\5\4\3\2ef\7&\2\2fg\5\4\3\2g\t\3\2\2\2hj\5\f\7\2ih\3\2\2\2j"+
		"m\3\2\2\2ki\3\2\2\2kl\3\2\2\2ln\3\2\2\2mk\3\2\2\2no\7\2\2\3o\13\3\2\2"+
		"\2py\5\16\b\2qy\5\20\t\2ry\5(\25\2sy\5\36\20\2ty\5\60\31\2uy\5\22\n\2"+
		"vy\5\64\33\2wy\5\66\34\2xp\3\2\2\2xq\3\2\2\2xr\3\2\2\2xs\3\2\2\2xt\3\2"+
		"\2\2xu\3\2\2\2xv\3\2\2\2xw\3\2\2\2y\r\3\2\2\2z{\7\37\2\2{|\5\4\3\2|\17"+
		"\3\2\2\2}~\5\2\2\2~\177\7\32\2\2\177\21\3\2\2\2\u0080\u0083\5\26\f\2\u0081"+
		"\u0083\5\24\13\2\u0082\u0080\3\2\2\2\u0082\u0081\3\2\2\2\u0083\23\3\2"+
		"\2\2\u0084\u0087\7\27\2\2\u0085\u0086\7\r\2\2\u0086\u0088\58\35\2\u0087"+
		"\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\25\3\2\2\2\u0089\u008a\7\25\2"+
		"\2\u008a\u008b\5\2\2\2\u008b\u008c\5\30\r\2\u008c\u008f\7\13\2\2\u008d"+
		"\u008e\7\r\2\2\u008e\u0090\58\35\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2"+
		"\2\2\u0090\27\3\2\2\2\u0091\u0094\5\32\16\2\u0092\u0094\5\34\17\2\u0093"+
		"\u0091\3\2\2\2\u0093\u0092\3\2\2\2\u0094\31\3\2\2\2\u0095\u0096\7\24\2"+
		"\2\u0096\33\3\2\2\2\u0097\u0098\7\26\2\2\u0098\35\3\2\2\2\u0099\u009d"+
		"\7\36\2\2\u009a\u009e\5 \21\2\u009b\u009e\5\"\22\2\u009c\u009e\5&\24\2"+
		"\u009d\u009a\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009c\3\2\2\2\u009e\37"+
		"\3\2\2\2\u009f\u00a1\58\35\2\u00a0\u009f\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1"+
		"\u00a2\3\2\2\2\u00a2\u00a4\7\5\2\2\u00a3\u00a5\5$\23\2\u00a4\u00a3\3\2"+
		"\2\2\u00a4\u00a5\3\2\2\2\u00a5!\3\2\2\2\u00a6\u00a8\58\35\2\u00a7\u00a6"+
		"\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ab\7\f\2\2\u00aa"+
		"\u00ac\5$\23\2\u00ab\u00aa\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac#\3\2\2\2"+
		"\u00ad\u00ae\7!\2\2\u00ae\u00af\5\4\3\2\u00af%\3\2\2\2\u00b0\u00b1\5T"+
		"+\2\u00b1\u00b2\7\4\2\2\u00b2\u00b3\5\4\3\2\u00b3\'\3\2\2\2\u00b4\u00b8"+
		"\5*\26\2\u00b5\u00b8\5,\27\2\u00b6\u00b8\5.\30\2\u00b7\u00b4\3\2\2\2\u00b7"+
		"\u00b5\3\2\2\2\u00b7\u00b6\3\2\2\2\u00b8)\3\2\2\2\u00b9\u00ba\7\16\2\2"+
		"\u00ba\u00bb\58\35\2\u00bb+\3\2\2\2\u00bc\u00bd\7\17\2\2\u00bd\u00be\5"+
		"8\35\2\u00be-\3\2\2\2\u00bf\u00c0\7\6\2\2\u00c0\u00c1\58\35\2\u00c1/\3"+
		"\2\2\2\u00c2\u00c3\5\62\32\2\u00c3\61\3\2\2\2\u00c4\u00c5\7%\2\2\u00c5"+
		"\u00c6\5\4\3\2\u00c6\u00c7\7\33\2\2\u00c7\u00c8\5\4\3\2\u00c8\u00c9\7"+
		"\30\2\2\u00c9\u00ca\58\35\2\u00ca\63\3\2\2\2\u00cb\u00cc\7\7\2\2\u00cc"+
		"\u00cd\5\4\3\2\u00cd\u00ce\7\34\2\2\u00ce\u00cf\5\6\4\2\u00cf\65\3\2\2"+
		"\2\u00d0\u00d1\7\b\2\2\u00d1\u00d2\5\6\4\2\u00d2\u00d3\7\30\2\2\u00d3"+
		"\u00d4\5\4\3\2\u00d4\67\3\2\2\2\u00d5\u00d8\5:\36\2\u00d6\u00d8\5<\37"+
		"\2\u00d7\u00d5\3\2\2\2\u00d7\u00d6\3\2\2\2\u00d89\3\2\2\2\u00d9\u00da"+
		"\7\"\2\2\u00da\u00db\5<\37\2\u00db;\3\2\2\2\u00dc\u00dd\5D#\2\u00dd\u00de"+
		"\5> \2\u00de=\3\2\2\2\u00df\u00e2\5@!\2\u00e0\u00e2\5B\"\2\u00e1\u00df"+
		"\3\2\2\2\u00e1\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\5> \2\u00e4"+
		"\u00e7\3\2\2\2\u00e5\u00e7\3\2\2\2\u00e6\u00e1\3\2\2\2\u00e6\u00e5\3\2"+
		"\2\2\u00e7?\3\2\2\2\u00e8\u00e9\7\30\2\2\u00e9\u00ea\5D#\2\u00eaA\3\2"+
		"\2\2\u00eb\u00ec\7\31\2\2\u00ec\u00ed\5D#\2\u00edC\3\2\2\2\u00ee\u00f9"+
		"\5F$\2\u00ef\u00f9\5H%\2\u00f0\u00f9\5R*\2\u00f1\u00f9\5J&\2\u00f2\u00f9"+
		"\5V,\2\u00f3\u00f9\5X-\2\u00f4\u00f9\5P)\2\u00f5\u00f9\5L\'\2\u00f6\u00f9"+
		"\5N(\2\u00f7\u00f9\5T+\2\u00f8\u00ee\3\2\2\2\u00f8\u00ef\3\2\2\2\u00f8"+
		"\u00f0\3\2\2\2\u00f8\u00f1\3\2\2\2\u00f8\u00f2\3\2\2\2\u00f8\u00f3\3\2"+
		"\2\2\u00f8\u00f4\3\2\2\2\u00f8\u00f5\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8"+
		"\u00f7\3\2\2\2\u00f9E\3\2\2\2\u00fa\u00fb\7\31\2\2\u00fb\u00fc\58\35\2"+
		"\u00fcG\3\2\2\2\u00fd\u00fe\7\3\2\2\u00feI\3\2\2\2\u00ff\u0100\7\20\2"+
		"\2\u0100K\3\2\2\2\u0101\u0102\t\2\2\2\u0102M\3\2\2\2\u0103\u0104\7 \2"+
		"\2\u0104O\3\2\2\2\u0105\u0106\7\35\2\2\u0106Q\3\2\2\2\u0107\u0108\7\t"+
		"\2\2\u0108\u0109\5\4\3\2\u0109S\3\2\2\2\u010a\u010b\7$\2\2\u010b\u010c"+
		"\5\4\3\2\u010cU\3\2\2\2\u010d\u010e\7#\2\2\u010e\u010f\5\2\2\2\u010f\u0110"+
		"\7\22\2\2\u0110W\3\2\2\2\u0111\u0112\5\2\2\2\u0112\u0113\7\23\2\2\u0113"+
		"Y\3\2\2\2\23akx\u0082\u0087\u008f\u0093\u009d\u00a0\u00a4\u00a7\u00ab"+
		"\u00b7\u00d7\u00e1\u00e6\u00f8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}