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
		ALL=1, AS=2, AS_BASE_NAME=3, AS_TREE=4, AVOID=5, CHECK_IN_AT=6, COOKIES=7, 
		CSS=8, DOMAIN=9, EACH=10, FLAT=11, FROM=12, GET=13, GET_UNKNOWN=14, IMAGES=15, 
		ITEMS_ON_DOMAIN=16, JUMPS=17, JUMPS_AND_MORE=18, KB=19, MAXIMUM=20, MB=21, 
		NO_SIZE_LIMIT=22, ON=23, OUTSIDE=24, PARALLEL_DOWNLOADS=25, PASSWORD=26, 
		POST=27, RESOURCES=28, SAVE=29, START_AT=30, SUBPATHS=31, UNDER=32, UNKNOWN=33, 
		UP_TO=34, URLS=35, USER=36, EQUALS=37, INTEGER_LITERAL=38, OPENING_QUOTE=39, 
		COMMENT=40, WS=41, WORD=42, CLOSING_QUOTE=43, STRING_LITERAL=44;
	public static final int
		RULE_integer = 0, RULE_string = 1, RULE_string_properties_map = 2, RULE_string_property = 3, 
		RULE_config = 4, RULE_directive = 5, RULE_start_directive = 6, RULE_parallel_directive = 7, 
		RULE_max_size_directive = 8, RULE_no_max_size_directive = 9, RULE_max_size_per_file_directive = 10, 
		RULE_size_unit = 11, RULE_kilobytes = 12, RULE_megabytes = 13, RULE_save_directive = 14, 
		RULE_save_as_tree = 15, RULE_save_flat = 16, RULE_save_as_basename = 17, 
		RULE_save_regex_to_template = 18, RULE_save_under_clause = 19, RULE_download_directive = 20, 
		RULE_get_rule = 21, RULE_get_unknown_rule = 22, RULE_avoid_rule = 23, 
		RULE_authentication_directive = 24, RULE_simple_authentication_rule = 25, 
		RULE_checkin_directive = 26, RULE_cookies_directive = 27, RULE_matcher = 28, 
		RULE_unknown_matcher_op = 29, RULE_matchers_product = 30, RULE_rest = 31, 
		RULE_and_matcher = 32, RULE_and_not_matcher = 33, RULE_matcher_factor = 34, 
		RULE_not_matcher_op = 35, RULE_all_matcher = 36, RULE_images_matcher = 37, 
		RULE_same_domain_matcher = 38, RULE_subpaths_matcher = 39, RULE_resources_matcher = 40, 
		RULE_css_matcher = 41, RULE_urls_matcher = 42, RULE_max_jumps_matcher = 43, 
		RULE_min_jumps_matcher = 44;
	public static final String[] ruleNames = {
		"integer", "string", "string_properties_map", "string_property", "config", 
		"directive", "start_directive", "parallel_directive", "max_size_directive", 
		"no_max_size_directive", "max_size_per_file_directive", "size_unit", "kilobytes", 
		"megabytes", "save_directive", "save_as_tree", "save_flat", "save_as_basename", 
		"save_regex_to_template", "save_under_clause", "download_directive", "get_rule", 
		"get_unknown_rule", "avoid_rule", "authentication_directive", "simple_authentication_rule", 
		"checkin_directive", "cookies_directive", "matcher", "unknown_matcher_op", 
		"matchers_product", "rest", "and_matcher", "and_not_matcher", "matcher_factor", 
		"not_matcher_op", "all_matcher", "images_matcher", "same_domain_matcher", 
		"subpaths_matcher", "resources_matcher", "css_matcher", "urls_matcher", 
		"max_jumps_matcher", "min_jumps_matcher"
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
			setState(90);
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
			setState(92);
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
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STRING_LITERAL) {
				{
				{
				setState(94);
				string_property();
				}
				}
				setState(99);
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
			setState(100);
			string();
			setState(101);
			match(EQUALS);
			setState(102);
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
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AVOID) | (1L << CHECK_IN_AT) | (1L << COOKIES) | (1L << GET) | (1L << GET_UNKNOWN) | (1L << MAXIMUM) | (1L << NO_SIZE_LIMIT) | (1L << SAVE) | (1L << START_AT) | (1L << USER) | (1L << INTEGER_LITERAL))) != 0)) {
				{
				{
				setState(104);
				directive();
				}
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(110);
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
			setState(120);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case START_AT:
				{
				setState(112);
				start_directive();
				}
				break;
			case INTEGER_LITERAL:
				{
				setState(113);
				parallel_directive();
				}
				break;
			case AVOID:
			case GET:
			case GET_UNKNOWN:
				{
				setState(114);
				download_directive();
				}
				break;
			case SAVE:
				{
				setState(115);
				save_directive();
				}
				break;
			case USER:
				{
				setState(116);
				authentication_directive();
				}
				break;
			case MAXIMUM:
			case NO_SIZE_LIMIT:
				{
				setState(117);
				max_size_directive();
				}
				break;
			case CHECK_IN_AT:
				{
				setState(118);
				checkin_directive();
				}
				break;
			case COOKIES:
				{
				setState(119);
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
			setState(122);
			match(START_AT);
			setState(123);
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
			setState(125);
			integer();
			setState(126);
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
			setState(130);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAXIMUM:
				{
				setState(128);
				max_size_per_file_directive();
				}
				break;
			case NO_SIZE_LIMIT:
				{
				setState(129);
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
			setState(132);
			match(NO_SIZE_LIMIT);
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(133);
				match(FROM);
				setState(134);
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
			setState(137);
			match(MAXIMUM);
			setState(138);
			integer();
			setState(139);
			size_unit();
			setState(140);
			match(EACH);
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(141);
				match(FROM);
				setState(142);
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
			setState(147);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KB:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				kilobytes();
				}
				break;
			case MB:
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
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
			setState(149);
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
			setState(151);
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
		public Save_as_basenameContext save_as_basename() {
			return getRuleContext(Save_as_basenameContext.class,0);
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
			setState(153);
			match(SAVE);
			setState(158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(154);
				save_as_tree();
				}
				break;
			case 2:
				{
				setState(155);
				save_flat();
				}
				break;
			case 3:
				{
				setState(156);
				save_regex_to_template();
				}
				break;
			case 4:
				{
				setState(157);
				save_as_basename();
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
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << CSS) | (1L << DOMAIN) | (1L << IMAGES) | (1L << ITEMS_ON_DOMAIN) | (1L << OUTSIDE) | (1L << RESOURCES) | (1L << SUBPATHS) | (1L << UNKNOWN) | (1L << UP_TO) | (1L << URLS) | (1L << INTEGER_LITERAL))) != 0)) {
				{
				setState(160);
				matcher();
				}
			}

			setState(163);
			match(AS_TREE);
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNDER) {
				{
				setState(164);
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
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << CSS) | (1L << DOMAIN) | (1L << IMAGES) | (1L << ITEMS_ON_DOMAIN) | (1L << OUTSIDE) | (1L << RESOURCES) | (1L << SUBPATHS) | (1L << UNKNOWN) | (1L << UP_TO) | (1L << URLS) | (1L << INTEGER_LITERAL))) != 0)) {
				{
				setState(167);
				matcher();
				}
			}

			setState(170);
			match(FLAT);
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNDER) {
				{
				setState(171);
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

	public static class Save_as_basenameContext extends ParserRuleContext {
		public TerminalNode AS_BASE_NAME() { return getToken(HamsterConfigParser.AS_BASE_NAME, 0); }
		public MatcherContext matcher() {
			return getRuleContext(MatcherContext.class,0);
		}
		public Save_under_clauseContext save_under_clause() {
			return getRuleContext(Save_under_clauseContext.class,0);
		}
		public Save_as_basenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_save_as_basename; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HamsterConfigParserListener ) ((HamsterConfigParserListener)listener).enterSave_as_basename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HamsterConfigParserListener ) ((HamsterConfigParserListener)listener).exitSave_as_basename(this);
		}
	}

	public final Save_as_basenameContext save_as_basename() throws RecognitionException {
		Save_as_basenameContext _localctx = new Save_as_basenameContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_save_as_basename);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << CSS) | (1L << DOMAIN) | (1L << IMAGES) | (1L << ITEMS_ON_DOMAIN) | (1L << OUTSIDE) | (1L << RESOURCES) | (1L << SUBPATHS) | (1L << UNKNOWN) | (1L << UP_TO) | (1L << URLS) | (1L << INTEGER_LITERAL))) != 0)) {
				{
				setState(174);
				matcher();
				}
			}

			setState(177);
			match(AS_BASE_NAME);
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNDER) {
				{
				setState(178);
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
			setState(181);
			urls_matcher();
			setState(182);
			match(AS);
			setState(183);
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
		enterRule(_localctx, 38, RULE_save_under_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(UNDER);
			setState(186);
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
		enterRule(_localctx, 40, RULE_download_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GET:
				{
				setState(188);
				get_rule();
				}
				break;
			case GET_UNKNOWN:
				{
				setState(189);
				get_unknown_rule();
				}
				break;
			case AVOID:
				{
				setState(190);
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
		enterRule(_localctx, 42, RULE_get_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(GET);
			setState(194);
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
		enterRule(_localctx, 44, RULE_get_unknown_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(GET_UNKNOWN);
			setState(197);
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
		enterRule(_localctx, 46, RULE_avoid_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(AVOID);
			setState(200);
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
		enterRule(_localctx, 48, RULE_authentication_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
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
		enterRule(_localctx, 50, RULE_simple_authentication_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(USER);
			setState(205);
			string();
			setState(206);
			match(PASSWORD);
			setState(207);
			string();
			setState(208);
			match(ON);
			setState(209);
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
		enterRule(_localctx, 52, RULE_checkin_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(CHECK_IN_AT);
			setState(212);
			string();
			setState(213);
			match(POST);
			setState(214);
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
		enterRule(_localctx, 54, RULE_cookies_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(COOKIES);
			setState(217);
			string_properties_map();
			setState(218);
			match(ON);
			setState(219);
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
		enterRule(_localctx, 56, RULE_matcher);
		try {
			setState(223);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UNKNOWN:
				enterOuterAlt(_localctx, 1);
				{
				setState(221);
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
				setState(222);
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
		enterRule(_localctx, 58, RULE_unknown_matcher_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(UNKNOWN);
			setState(226);
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
		enterRule(_localctx, 60, RULE_matchers_product);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			matcher_factor();
			setState(229);
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
		enterRule(_localctx, 62, RULE_rest);
		try {
			setState(238);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(233);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ON:
					{
					setState(231);
					and_matcher();
					}
					break;
				case OUTSIDE:
					{
					setState(232);
					and_not_matcher();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(235);
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
		enterRule(_localctx, 64, RULE_and_matcher);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(ON);
			setState(241);
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
		enterRule(_localctx, 66, RULE_and_not_matcher);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(OUTSIDE);
			setState(244);
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
		enterRule(_localctx, 68, RULE_matcher_factor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OUTSIDE:
				{
				setState(246);
				not_matcher_op();
				}
				break;
			case ALL:
				{
				setState(247);
				all_matcher();
				}
				break;
			case CSS:
				{
				setState(248);
				css_matcher();
				}
				break;
			case IMAGES:
				{
				setState(249);
				images_matcher();
				}
				break;
			case UP_TO:
				{
				setState(250);
				max_jumps_matcher();
				}
				break;
			case INTEGER_LITERAL:
				{
				setState(251);
				min_jumps_matcher();
				}
				break;
			case RESOURCES:
				{
				setState(252);
				resources_matcher();
				}
				break;
			case DOMAIN:
			case ITEMS_ON_DOMAIN:
				{
				setState(253);
				same_domain_matcher();
				}
				break;
			case SUBPATHS:
				{
				setState(254);
				subpaths_matcher();
				}
				break;
			case URLS:
				{
				setState(255);
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
		enterRule(_localctx, 70, RULE_not_matcher_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			match(OUTSIDE);
			setState(259);
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
		enterRule(_localctx, 72, RULE_all_matcher);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
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
		enterRule(_localctx, 74, RULE_images_matcher);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
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
		enterRule(_localctx, 76, RULE_same_domain_matcher);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
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
		enterRule(_localctx, 78, RULE_subpaths_matcher);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
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
		enterRule(_localctx, 80, RULE_resources_matcher);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
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
		enterRule(_localctx, 82, RULE_css_matcher);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(CSS);
			setState(272);
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
		enterRule(_localctx, 84, RULE_urls_matcher);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(URLS);
			setState(275);
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
		enterRule(_localctx, 86, RULE_max_jumps_matcher);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(UP_TO);
			setState(278);
			integer();
			setState(279);
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
		enterRule(_localctx, 88, RULE_min_jumps_matcher);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			integer();
			setState(282);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u011f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\3\2\3\2\3\3\3\3\3\4\7\4b\n\4\f\4\16\4e\13\4\3\5\3\5\3"+
		"\5\3\5\3\6\7\6l\n\6\f\6\16\6o\13\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\5\7{\n\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\5\n\u0085\n\n\3\13\3\13"+
		"\3\13\5\13\u008a\n\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0092\n\f\3\r\3\r\5"+
		"\r\u0096\n\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\5\20\u00a1\n"+
		"\20\3\21\5\21\u00a4\n\21\3\21\3\21\5\21\u00a8\n\21\3\22\5\22\u00ab\n\22"+
		"\3\22\3\22\5\22\u00af\n\22\3\23\5\23\u00b2\n\23\3\23\3\23\5\23\u00b6\n"+
		"\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\5\26\u00c2\n\26"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35"+
		"\3\36\3\36\5\36\u00e2\n\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\5!\u00ec\n!\3"+
		"!\3!\3!\5!\u00f1\n!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3"+
		"$\5$\u0103\n$\3%\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3+\3,\3,"+
		"\3,\3-\3-\3-\3-\3.\3.\3.\3.\2\2/\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\2\3\4\2\13\13\22\22\2\u0115\2"+
		"\\\3\2\2\2\4^\3\2\2\2\6c\3\2\2\2\bf\3\2\2\2\nm\3\2\2\2\fz\3\2\2\2\16|"+
		"\3\2\2\2\20\177\3\2\2\2\22\u0084\3\2\2\2\24\u0086\3\2\2\2\26\u008b\3\2"+
		"\2\2\30\u0095\3\2\2\2\32\u0097\3\2\2\2\34\u0099\3\2\2\2\36\u009b\3\2\2"+
		"\2 \u00a3\3\2\2\2\"\u00aa\3\2\2\2$\u00b1\3\2\2\2&\u00b7\3\2\2\2(\u00bb"+
		"\3\2\2\2*\u00c1\3\2\2\2,\u00c3\3\2\2\2.\u00c6\3\2\2\2\60\u00c9\3\2\2\2"+
		"\62\u00cc\3\2\2\2\64\u00ce\3\2\2\2\66\u00d5\3\2\2\28\u00da\3\2\2\2:\u00e1"+
		"\3\2\2\2<\u00e3\3\2\2\2>\u00e6\3\2\2\2@\u00f0\3\2\2\2B\u00f2\3\2\2\2D"+
		"\u00f5\3\2\2\2F\u0102\3\2\2\2H\u0104\3\2\2\2J\u0107\3\2\2\2L\u0109\3\2"+
		"\2\2N\u010b\3\2\2\2P\u010d\3\2\2\2R\u010f\3\2\2\2T\u0111\3\2\2\2V\u0114"+
		"\3\2\2\2X\u0117\3\2\2\2Z\u011b\3\2\2\2\\]\7(\2\2]\3\3\2\2\2^_\7.\2\2_"+
		"\5\3\2\2\2`b\5\b\5\2a`\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2d\7\3\2\2"+
		"\2ec\3\2\2\2fg\5\4\3\2gh\7\'\2\2hi\5\4\3\2i\t\3\2\2\2jl\5\f\7\2kj\3\2"+
		"\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2np\3\2\2\2om\3\2\2\2pq\7\2\2\3q\13\3"+
		"\2\2\2r{\5\16\b\2s{\5\20\t\2t{\5*\26\2u{\5\36\20\2v{\5\62\32\2w{\5\22"+
		"\n\2x{\5\66\34\2y{\58\35\2zr\3\2\2\2zs\3\2\2\2zt\3\2\2\2zu\3\2\2\2zv\3"+
		"\2\2\2zw\3\2\2\2zx\3\2\2\2zy\3\2\2\2{\r\3\2\2\2|}\7 \2\2}~\5\4\3\2~\17"+
		"\3\2\2\2\177\u0080\5\2\2\2\u0080\u0081\7\33\2\2\u0081\21\3\2\2\2\u0082"+
		"\u0085\5\26\f\2\u0083\u0085\5\24\13\2\u0084\u0082\3\2\2\2\u0084\u0083"+
		"\3\2\2\2\u0085\23\3\2\2\2\u0086\u0089\7\30\2\2\u0087\u0088\7\16\2\2\u0088"+
		"\u008a\5:\36\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\25\3\2\2"+
		"\2\u008b\u008c\7\26\2\2\u008c\u008d\5\2\2\2\u008d\u008e\5\30\r\2\u008e"+
		"\u0091\7\f\2\2\u008f\u0090\7\16\2\2\u0090\u0092\5:\36\2\u0091\u008f\3"+
		"\2\2\2\u0091\u0092\3\2\2\2\u0092\27\3\2\2\2\u0093\u0096\5\32\16\2\u0094"+
		"\u0096\5\34\17\2\u0095\u0093\3\2\2\2\u0095\u0094\3\2\2\2\u0096\31\3\2"+
		"\2\2\u0097\u0098\7\25\2\2\u0098\33\3\2\2\2\u0099\u009a\7\27\2\2\u009a"+
		"\35\3\2\2\2\u009b\u00a0\7\37\2\2\u009c\u00a1\5 \21\2\u009d\u00a1\5\"\22"+
		"\2\u009e\u00a1\5&\24\2\u009f\u00a1\5$\23\2\u00a0\u009c\3\2\2\2\u00a0\u009d"+
		"\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u009f\3\2\2\2\u00a1\37\3\2\2\2\u00a2"+
		"\u00a4\5:\36\2\u00a3\u00a2\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\3\2"+
		"\2\2\u00a5\u00a7\7\6\2\2\u00a6\u00a8\5(\25\2\u00a7\u00a6\3\2\2\2\u00a7"+
		"\u00a8\3\2\2\2\u00a8!\3\2\2\2\u00a9\u00ab\5:\36\2\u00aa\u00a9\3\2\2\2"+
		"\u00aa\u00ab\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ae\7\r\2\2\u00ad\u00af"+
		"\5(\25\2\u00ae\u00ad\3\2\2\2\u00ae\u00af\3\2\2\2\u00af#\3\2\2\2\u00b0"+
		"\u00b2\5:\36\2\u00b1\u00b0\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\3\2"+
		"\2\2\u00b3\u00b5\7\5\2\2\u00b4\u00b6\5(\25\2\u00b5\u00b4\3\2\2\2\u00b5"+
		"\u00b6\3\2\2\2\u00b6%\3\2\2\2\u00b7\u00b8\5V,\2\u00b8\u00b9\7\4\2\2\u00b9"+
		"\u00ba\5\4\3\2\u00ba\'\3\2\2\2\u00bb\u00bc\7\"\2\2\u00bc\u00bd\5\4\3\2"+
		"\u00bd)\3\2\2\2\u00be\u00c2\5,\27\2\u00bf\u00c2\5.\30\2\u00c0\u00c2\5"+
		"\60\31\2\u00c1\u00be\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c0\3\2\2\2\u00c2"+
		"+\3\2\2\2\u00c3\u00c4\7\17\2\2\u00c4\u00c5\5:\36\2\u00c5-\3\2\2\2\u00c6"+
		"\u00c7\7\20\2\2\u00c7\u00c8\5:\36\2\u00c8/\3\2\2\2\u00c9\u00ca\7\7\2\2"+
		"\u00ca\u00cb\5:\36\2\u00cb\61\3\2\2\2\u00cc\u00cd\5\64\33\2\u00cd\63\3"+
		"\2\2\2\u00ce\u00cf\7&\2\2\u00cf\u00d0\5\4\3\2\u00d0\u00d1\7\34\2\2\u00d1"+
		"\u00d2\5\4\3\2\u00d2\u00d3\7\31\2\2\u00d3\u00d4\5:\36\2\u00d4\65\3\2\2"+
		"\2\u00d5\u00d6\7\b\2\2\u00d6\u00d7\5\4\3\2\u00d7\u00d8\7\35\2\2\u00d8"+
		"\u00d9\5\6\4\2\u00d9\67\3\2\2\2\u00da\u00db\7\t\2\2\u00db\u00dc\5\6\4"+
		"\2\u00dc\u00dd\7\31\2\2\u00dd\u00de\5\4\3\2\u00de9\3\2\2\2\u00df\u00e2"+
		"\5<\37\2\u00e0\u00e2\5> \2\u00e1\u00df\3\2\2\2\u00e1\u00e0\3\2\2\2\u00e2"+
		";\3\2\2\2\u00e3\u00e4\7#\2\2\u00e4\u00e5\5> \2\u00e5=\3\2\2\2\u00e6\u00e7"+
		"\5F$\2\u00e7\u00e8\5@!\2\u00e8?\3\2\2\2\u00e9\u00ec\5B\"\2\u00ea\u00ec"+
		"\5D#\2\u00eb\u00e9\3\2\2\2\u00eb\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed"+
		"\u00ee\5@!\2\u00ee\u00f1\3\2\2\2\u00ef\u00f1\3\2\2\2\u00f0\u00eb\3\2\2"+
		"\2\u00f0\u00ef\3\2\2\2\u00f1A\3\2\2\2\u00f2\u00f3\7\31\2\2\u00f3\u00f4"+
		"\5F$\2\u00f4C\3\2\2\2\u00f5\u00f6\7\32\2\2\u00f6\u00f7\5F$\2\u00f7E\3"+
		"\2\2\2\u00f8\u0103\5H%\2\u00f9\u0103\5J&\2\u00fa\u0103\5T+\2\u00fb\u0103"+
		"\5L\'\2\u00fc\u0103\5X-\2\u00fd\u0103\5Z.\2\u00fe\u0103\5R*\2\u00ff\u0103"+
		"\5N(\2\u0100\u0103\5P)\2\u0101\u0103\5V,\2\u0102\u00f8\3\2\2\2\u0102\u00f9"+
		"\3\2\2\2\u0102\u00fa\3\2\2\2\u0102\u00fb\3\2\2\2\u0102\u00fc\3\2\2\2\u0102"+
		"\u00fd\3\2\2\2\u0102\u00fe\3\2\2\2\u0102\u00ff\3\2\2\2\u0102\u0100\3\2"+
		"\2\2\u0102\u0101\3\2\2\2\u0103G\3\2\2\2\u0104\u0105\7\32\2\2\u0105\u0106"+
		"\5:\36\2\u0106I\3\2\2\2\u0107\u0108\7\3\2\2\u0108K\3\2\2\2\u0109\u010a"+
		"\7\21\2\2\u010aM\3\2\2\2\u010b\u010c\t\2\2\2\u010cO\3\2\2\2\u010d\u010e"+
		"\7!\2\2\u010eQ\3\2\2\2\u010f\u0110\7\36\2\2\u0110S\3\2\2\2\u0111\u0112"+
		"\7\n\2\2\u0112\u0113\5\4\3\2\u0113U\3\2\2\2\u0114\u0115\7%\2\2\u0115\u0116"+
		"\5\4\3\2\u0116W\3\2\2\2\u0117\u0118\7$\2\2\u0118\u0119\5\2\2\2\u0119\u011a"+
		"\7\23\2\2\u011aY\3\2\2\2\u011b\u011c\5\2\2\2\u011c\u011d\7\24\2\2\u011d"+
		"[\3\2\2\2\25cmz\u0084\u0089\u0091\u0095\u00a0\u00a3\u00a7\u00aa\u00ae"+
		"\u00b1\u00b5\u00c1\u00e1\u00eb\u00f0\u0102";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}