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
		ALL=1, AS=2, AS_TREE=3, AVOID=4, CHECK_IN_AT=5, CSS=6, DOMAIN=7, EACH=8, 
		FLAT=9, FROM=10, GET=11, GET_UNKNOWN=12, IMAGES=13, ITEMS_ON_DOMAIN=14, 
		JUMPS=15, JUMPS_AND_MORE=16, KB=17, MAXIMUM=18, MB=19, ON=20, OUTSIDE=21, 
		PARALLEL_DOWNLOADS=22, PASSWORD=23, POST=24, RESOURCES=25, SAVE=26, START_AT=27, 
		SUBPATHS=28, UNDER=29, UNKNOWN=30, UP_TO=31, URLS=32, USER=33, EQUALS=34, 
		INTEGER_LITERAL=35, OPENING_QUOTE=36, COMMENT=37, WS=38, WORD=39, CLOSING_QUOTE=40, 
		STRING_LITERAL=41;
	public static final int
		RULE_integer = 0, RULE_string = 1, RULE_config = 2, RULE_directive = 3, 
		RULE_start_directive = 4, RULE_parallel_directive = 5, RULE_max_size_directive = 6, 
		RULE_max_size_per_file_directive = 7, RULE_size_unit = 8, RULE_kilobytes = 9, 
		RULE_megabytes = 10, RULE_save_directive = 11, RULE_save_as_tree = 12, 
		RULE_save_flat = 13, RULE_save_under_clause = 14, RULE_save_regex_to_template = 15, 
		RULE_download_directive = 16, RULE_get_rule = 17, RULE_get_unknown_rule = 18, 
		RULE_avoid_rule = 19, RULE_authentication_directive = 20, RULE_simple_authentication_rule = 21, 
		RULE_checkin_directive = 22, RULE_checkin_post_param = 23, RULE_matcher = 24, 
		RULE_unknown_matcher_op = 25, RULE_matchers_product = 26, RULE_rest = 27, 
		RULE_and_matcher = 28, RULE_and_not_matcher = 29, RULE_matcher_factor = 30, 
		RULE_not_matcher_op = 31, RULE_all_matcher = 32, RULE_images_matcher = 33, 
		RULE_same_domain_matcher = 34, RULE_subpaths_matcher = 35, RULE_resources_matcher = 36, 
		RULE_css_matcher = 37, RULE_urls_matcher = 38, RULE_max_jumps_matcher = 39, 
		RULE_min_jumps_matcher = 40;
	public static final String[] ruleNames = {
		"integer", "string", "config", "directive", "start_directive", "parallel_directive", 
		"max_size_directive", "max_size_per_file_directive", "size_unit", "kilobytes", 
		"megabytes", "save_directive", "save_as_tree", "save_flat", "save_under_clause", 
		"save_regex_to_template", "download_directive", "get_rule", "get_unknown_rule", 
		"avoid_rule", "authentication_directive", "simple_authentication_rule", 
		"checkin_directive", "checkin_post_param", "matcher", "unknown_matcher_op", 
		"matchers_product", "rest", "and_matcher", "and_not_matcher", "matcher_factor", 
		"not_matcher_op", "all_matcher", "images_matcher", "same_domain_matcher", 
		"subpaths_matcher", "resources_matcher", "css_matcher", "urls_matcher", 
		"max_jumps_matcher", "min_jumps_matcher"
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
			setState(82);
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
			setState(84);
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
		enterRule(_localctx, 4, RULE_config);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AVOID) | (1L << CHECK_IN_AT) | (1L << GET) | (1L << GET_UNKNOWN) | (1L << MAXIMUM) | (1L << SAVE) | (1L << START_AT) | (1L << USER) | (1L << INTEGER_LITERAL))) != 0)) {
				{
				{
				setState(86);
				directive();
				}
				}
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(92);
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
		enterRule(_localctx, 6, RULE_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case START_AT:
				{
				setState(94);
				start_directive();
				}
				break;
			case INTEGER_LITERAL:
				{
				setState(95);
				parallel_directive();
				}
				break;
			case AVOID:
			case GET:
			case GET_UNKNOWN:
				{
				setState(96);
				download_directive();
				}
				break;
			case SAVE:
				{
				setState(97);
				save_directive();
				}
				break;
			case USER:
				{
				setState(98);
				authentication_directive();
				}
				break;
			case MAXIMUM:
				{
				setState(99);
				max_size_directive();
				}
				break;
			case CHECK_IN_AT:
				{
				setState(100);
				checkin_directive();
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
		enterRule(_localctx, 8, RULE_start_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(START_AT);
			setState(104);
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
		enterRule(_localctx, 10, RULE_parallel_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			integer();
			setState(107);
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
		enterRule(_localctx, 12, RULE_max_size_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			max_size_per_file_directive();
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
		enterRule(_localctx, 14, RULE_max_size_per_file_directive);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(MAXIMUM);
			setState(112);
			integer();
			setState(113);
			size_unit();
			setState(114);
			match(EACH);
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(115);
				match(FROM);
				setState(116);
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
		enterRule(_localctx, 16, RULE_size_unit);
		try {
			setState(121);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KB:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				kilobytes();
				}
				break;
			case MB:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
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
		enterRule(_localctx, 18, RULE_kilobytes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
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
		enterRule(_localctx, 20, RULE_megabytes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
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
		enterRule(_localctx, 22, RULE_save_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(SAVE);
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(128);
				save_as_tree();
				}
				break;
			case 2:
				{
				setState(129);
				save_flat();
				}
				break;
			case 3:
				{
				setState(130);
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
		enterRule(_localctx, 24, RULE_save_as_tree);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << CSS) | (1L << DOMAIN) | (1L << IMAGES) | (1L << ITEMS_ON_DOMAIN) | (1L << OUTSIDE) | (1L << RESOURCES) | (1L << SUBPATHS) | (1L << UNKNOWN) | (1L << UP_TO) | (1L << URLS) | (1L << INTEGER_LITERAL))) != 0)) {
				{
				setState(133);
				matcher();
				}
			}

			setState(136);
			match(AS_TREE);
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNDER) {
				{
				setState(137);
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
		enterRule(_localctx, 26, RULE_save_flat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << CSS) | (1L << DOMAIN) | (1L << IMAGES) | (1L << ITEMS_ON_DOMAIN) | (1L << OUTSIDE) | (1L << RESOURCES) | (1L << SUBPATHS) | (1L << UNKNOWN) | (1L << UP_TO) | (1L << URLS) | (1L << INTEGER_LITERAL))) != 0)) {
				{
				setState(140);
				matcher();
				}
			}

			setState(143);
			match(FLAT);
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNDER) {
				{
				setState(144);
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
		enterRule(_localctx, 28, RULE_save_under_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(UNDER);
			setState(148);
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
		enterRule(_localctx, 30, RULE_save_regex_to_template);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			urls_matcher();
			setState(151);
			match(AS);
			setState(152);
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
		enterRule(_localctx, 32, RULE_download_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GET:
				{
				setState(154);
				get_rule();
				}
				break;
			case GET_UNKNOWN:
				{
				setState(155);
				get_unknown_rule();
				}
				break;
			case AVOID:
				{
				setState(156);
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
		enterRule(_localctx, 34, RULE_get_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(GET);
			setState(160);
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
		enterRule(_localctx, 36, RULE_get_unknown_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(GET_UNKNOWN);
			setState(163);
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
		enterRule(_localctx, 38, RULE_avoid_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(AVOID);
			setState(166);
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
		enterRule(_localctx, 40, RULE_authentication_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
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
		enterRule(_localctx, 42, RULE_simple_authentication_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(USER);
			setState(171);
			string();
			setState(172);
			match(PASSWORD);
			setState(173);
			string();
			setState(174);
			match(ON);
			setState(175);
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
		public List<Checkin_post_paramContext> checkin_post_param() {
			return getRuleContexts(Checkin_post_paramContext.class);
		}
		public Checkin_post_paramContext checkin_post_param(int i) {
			return getRuleContext(Checkin_post_paramContext.class,i);
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
		enterRule(_localctx, 44, RULE_checkin_directive);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(CHECK_IN_AT);
			setState(178);
			string();
			setState(179);
			match(POST);
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STRING_LITERAL) {
				{
				{
				setState(180);
				checkin_post_param();
				}
				}
				setState(185);
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

	public static class Checkin_post_paramContext extends ParserRuleContext {
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public TerminalNode EQUALS() { return getToken(HamsterConfigParser.EQUALS, 0); }
		public Checkin_post_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_checkin_post_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HamsterConfigParserListener ) ((HamsterConfigParserListener)listener).enterCheckin_post_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HamsterConfigParserListener ) ((HamsterConfigParserListener)listener).exitCheckin_post_param(this);
		}
	}

	public final Checkin_post_paramContext checkin_post_param() throws RecognitionException {
		Checkin_post_paramContext _localctx = new Checkin_post_paramContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_checkin_post_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			string();
			setState(187);
			match(EQUALS);
			setState(188);
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
		enterRule(_localctx, 48, RULE_matcher);
		try {
			setState(192);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UNKNOWN:
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
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
				setState(191);
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
		enterRule(_localctx, 50, RULE_unknown_matcher_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(UNKNOWN);
			setState(195);
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
		enterRule(_localctx, 52, RULE_matchers_product);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			matcher_factor();
			setState(198);
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
		enterRule(_localctx, 54, RULE_rest);
		try {
			setState(207);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ON:
					{
					setState(200);
					and_matcher();
					}
					break;
				case OUTSIDE:
					{
					setState(201);
					and_not_matcher();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(204);
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
		enterRule(_localctx, 56, RULE_and_matcher);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(ON);
			setState(210);
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
		enterRule(_localctx, 58, RULE_and_not_matcher);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(OUTSIDE);
			setState(213);
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
		enterRule(_localctx, 60, RULE_matcher_factor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OUTSIDE:
				{
				setState(215);
				not_matcher_op();
				}
				break;
			case ALL:
				{
				setState(216);
				all_matcher();
				}
				break;
			case CSS:
				{
				setState(217);
				css_matcher();
				}
				break;
			case IMAGES:
				{
				setState(218);
				images_matcher();
				}
				break;
			case UP_TO:
				{
				setState(219);
				max_jumps_matcher();
				}
				break;
			case INTEGER_LITERAL:
				{
				setState(220);
				min_jumps_matcher();
				}
				break;
			case RESOURCES:
				{
				setState(221);
				resources_matcher();
				}
				break;
			case DOMAIN:
			case ITEMS_ON_DOMAIN:
				{
				setState(222);
				same_domain_matcher();
				}
				break;
			case SUBPATHS:
				{
				setState(223);
				subpaths_matcher();
				}
				break;
			case URLS:
				{
				setState(224);
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
		enterRule(_localctx, 62, RULE_not_matcher_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(OUTSIDE);
			setState(228);
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
		enterRule(_localctx, 64, RULE_all_matcher);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
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
		enterRule(_localctx, 66, RULE_images_matcher);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
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
		enterRule(_localctx, 68, RULE_same_domain_matcher);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
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
		enterRule(_localctx, 70, RULE_subpaths_matcher);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
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
		enterRule(_localctx, 72, RULE_resources_matcher);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
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
		enterRule(_localctx, 74, RULE_css_matcher);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(CSS);
			setState(241);
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
		enterRule(_localctx, 76, RULE_urls_matcher);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(URLS);
			setState(244);
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
		enterRule(_localctx, 78, RULE_max_jumps_matcher);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(UP_TO);
			setState(247);
			integer();
			setState(248);
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
		enterRule(_localctx, 80, RULE_min_jumps_matcher);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			integer();
			setState(251);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3+\u0100\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\3\3\3\3\3\4\7\4Z\n\4\f\4\16\4]\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\5\5h\n\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\5"+
		"\tx\n\t\3\n\3\n\5\n|\n\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\5\r\u0086\n"+
		"\r\3\16\5\16\u0089\n\16\3\16\3\16\5\16\u008d\n\16\3\17\5\17\u0090\n\17"+
		"\3\17\3\17\5\17\u0094\n\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\5\22\u00a0\n\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26"+
		"\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\7\30\u00b8"+
		"\n\30\f\30\16\30\u00bb\13\30\3\31\3\31\3\31\3\31\3\32\3\32\5\32\u00c3"+
		"\n\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\5\35\u00cd\n\35\3\35\3\35"+
		"\3\35\5\35\u00d2\n\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 "+
		"\3 \3 \3 \3 \5 \u00e4\n \3!\3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'"+
		"\3\'\3\'\3(\3(\3(\3)\3)\3)\3)\3*\3*\3*\3*\2\2+\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPR\2\3\4\2\t\t\20\20\2"+
		"\u00f4\2T\3\2\2\2\4V\3\2\2\2\6[\3\2\2\2\bg\3\2\2\2\ni\3\2\2\2\fl\3\2\2"+
		"\2\16o\3\2\2\2\20q\3\2\2\2\22{\3\2\2\2\24}\3\2\2\2\26\177\3\2\2\2\30\u0081"+
		"\3\2\2\2\32\u0088\3\2\2\2\34\u008f\3\2\2\2\36\u0095\3\2\2\2 \u0098\3\2"+
		"\2\2\"\u009f\3\2\2\2$\u00a1\3\2\2\2&\u00a4\3\2\2\2(\u00a7\3\2\2\2*\u00aa"+
		"\3\2\2\2,\u00ac\3\2\2\2.\u00b3\3\2\2\2\60\u00bc\3\2\2\2\62\u00c2\3\2\2"+
		"\2\64\u00c4\3\2\2\2\66\u00c7\3\2\2\28\u00d1\3\2\2\2:\u00d3\3\2\2\2<\u00d6"+
		"\3\2\2\2>\u00e3\3\2\2\2@\u00e5\3\2\2\2B\u00e8\3\2\2\2D\u00ea\3\2\2\2F"+
		"\u00ec\3\2\2\2H\u00ee\3\2\2\2J\u00f0\3\2\2\2L\u00f2\3\2\2\2N\u00f5\3\2"+
		"\2\2P\u00f8\3\2\2\2R\u00fc\3\2\2\2TU\7%\2\2U\3\3\2\2\2VW\7+\2\2W\5\3\2"+
		"\2\2XZ\5\b\5\2YX\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\^\3\2\2\2][\3"+
		"\2\2\2^_\7\2\2\3_\7\3\2\2\2`h\5\n\6\2ah\5\f\7\2bh\5\"\22\2ch\5\30\r\2"+
		"dh\5*\26\2eh\5\16\b\2fh\5.\30\2g`\3\2\2\2ga\3\2\2\2gb\3\2\2\2gc\3\2\2"+
		"\2gd\3\2\2\2ge\3\2\2\2gf\3\2\2\2h\t\3\2\2\2ij\7\35\2\2jk\5\4\3\2k\13\3"+
		"\2\2\2lm\5\2\2\2mn\7\30\2\2n\r\3\2\2\2op\5\20\t\2p\17\3\2\2\2qr\7\24\2"+
		"\2rs\5\2\2\2st\5\22\n\2tw\7\n\2\2uv\7\f\2\2vx\5\62\32\2wu\3\2\2\2wx\3"+
		"\2\2\2x\21\3\2\2\2y|\5\24\13\2z|\5\26\f\2{y\3\2\2\2{z\3\2\2\2|\23\3\2"+
		"\2\2}~\7\23\2\2~\25\3\2\2\2\177\u0080\7\25\2\2\u0080\27\3\2\2\2\u0081"+
		"\u0085\7\34\2\2\u0082\u0086\5\32\16\2\u0083\u0086\5\34\17\2\u0084\u0086"+
		"\5 \21\2\u0085\u0082\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0084\3\2\2\2\u0086"+
		"\31\3\2\2\2\u0087\u0089\5\62\32\2\u0088\u0087\3\2\2\2\u0088\u0089\3\2"+
		"\2\2\u0089\u008a\3\2\2\2\u008a\u008c\7\5\2\2\u008b\u008d\5\36\20\2\u008c"+
		"\u008b\3\2\2\2\u008c\u008d\3\2\2\2\u008d\33\3\2\2\2\u008e\u0090\5\62\32"+
		"\2\u008f\u008e\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0093"+
		"\7\13\2\2\u0092\u0094\5\36\20\2\u0093\u0092\3\2\2\2\u0093\u0094\3\2\2"+
		"\2\u0094\35\3\2\2\2\u0095\u0096\7\37\2\2\u0096\u0097\5\4\3\2\u0097\37"+
		"\3\2\2\2\u0098\u0099\5N(\2\u0099\u009a\7\4\2\2\u009a\u009b\5\4\3\2\u009b"+
		"!\3\2\2\2\u009c\u00a0\5$\23\2\u009d\u00a0\5&\24\2\u009e\u00a0\5(\25\2"+
		"\u009f\u009c\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u009e\3\2\2\2\u00a0#\3"+
		"\2\2\2\u00a1\u00a2\7\r\2\2\u00a2\u00a3\5\62\32\2\u00a3%\3\2\2\2\u00a4"+
		"\u00a5\7\16\2\2\u00a5\u00a6\5\62\32\2\u00a6\'\3\2\2\2\u00a7\u00a8\7\6"+
		"\2\2\u00a8\u00a9\5\62\32\2\u00a9)\3\2\2\2\u00aa\u00ab\5,\27\2\u00ab+\3"+
		"\2\2\2\u00ac\u00ad\7#\2\2\u00ad\u00ae\5\4\3\2\u00ae\u00af\7\31\2\2\u00af"+
		"\u00b0\5\4\3\2\u00b0\u00b1\7\26\2\2\u00b1\u00b2\5\62\32\2\u00b2-\3\2\2"+
		"\2\u00b3\u00b4\7\7\2\2\u00b4\u00b5\5\4\3\2\u00b5\u00b9\7\32\2\2\u00b6"+
		"\u00b8\5\60\31\2\u00b7\u00b6\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3"+
		"\2\2\2\u00b9\u00ba\3\2\2\2\u00ba/\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00bd"+
		"\5\4\3\2\u00bd\u00be\7$\2\2\u00be\u00bf\5\4\3\2\u00bf\61\3\2\2\2\u00c0"+
		"\u00c3\5\64\33\2\u00c1\u00c3\5\66\34\2\u00c2\u00c0\3\2\2\2\u00c2\u00c1"+
		"\3\2\2\2\u00c3\63\3\2\2\2\u00c4\u00c5\7 \2\2\u00c5\u00c6\5\66\34\2\u00c6"+
		"\65\3\2\2\2\u00c7\u00c8\5> \2\u00c8\u00c9\58\35\2\u00c9\67\3\2\2\2\u00ca"+
		"\u00cd\5:\36\2\u00cb\u00cd\5<\37\2\u00cc\u00ca\3\2\2\2\u00cc\u00cb\3\2"+
		"\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\58\35\2\u00cf\u00d2\3\2\2\2\u00d0"+
		"\u00d2\3\2\2\2\u00d1\u00cc\3\2\2\2\u00d1\u00d0\3\2\2\2\u00d29\3\2\2\2"+
		"\u00d3\u00d4\7\26\2\2\u00d4\u00d5\5> \2\u00d5;\3\2\2\2\u00d6\u00d7\7\27"+
		"\2\2\u00d7\u00d8\5> \2\u00d8=\3\2\2\2\u00d9\u00e4\5@!\2\u00da\u00e4\5"+
		"B\"\2\u00db\u00e4\5L\'\2\u00dc\u00e4\5D#\2\u00dd\u00e4\5P)\2\u00de\u00e4"+
		"\5R*\2\u00df\u00e4\5J&\2\u00e0\u00e4\5F$\2\u00e1\u00e4\5H%\2\u00e2\u00e4"+
		"\5N(\2\u00e3\u00d9\3\2\2\2\u00e3\u00da\3\2\2\2\u00e3\u00db\3\2\2\2\u00e3"+
		"\u00dc\3\2\2\2\u00e3\u00dd\3\2\2\2\u00e3\u00de\3\2\2\2\u00e3\u00df\3\2"+
		"\2\2\u00e3\u00e0\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e2\3\2\2\2\u00e4"+
		"?\3\2\2\2\u00e5\u00e6\7\27\2\2\u00e6\u00e7\5\62\32\2\u00e7A\3\2\2\2\u00e8"+
		"\u00e9\7\3\2\2\u00e9C\3\2\2\2\u00ea\u00eb\7\17\2\2\u00ebE\3\2\2\2\u00ec"+
		"\u00ed\t\2\2\2\u00edG\3\2\2\2\u00ee\u00ef\7\36\2\2\u00efI\3\2\2\2\u00f0"+
		"\u00f1\7\33\2\2\u00f1K\3\2\2\2\u00f2\u00f3\7\b\2\2\u00f3\u00f4\5\4\3\2"+
		"\u00f4M\3\2\2\2\u00f5\u00f6\7\"\2\2\u00f6\u00f7\5\4\3\2\u00f7O\3\2\2\2"+
		"\u00f8\u00f9\7!\2\2\u00f9\u00fa\5\2\2\2\u00fa\u00fb\7\21\2\2\u00fbQ\3"+
		"\2\2\2\u00fc\u00fd\5\2\2\2\u00fd\u00fe\7\22\2\2\u00feS\3\2\2\2\21[gw{"+
		"\u0085\u0088\u008c\u008f\u0093\u009f\u00b9\u00c2\u00cc\u00d1\u00e3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}