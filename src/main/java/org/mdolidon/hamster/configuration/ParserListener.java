package org.mdolidon.hamster.configuration;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mdolidon.hamster.configuration.antlrGenerated.HamsterConfigParserBaseListener;
import org.mdolidon.hamster.configuration.antlrGenerated.HamsterConfigParser.All_matcherContext;
import org.mdolidon.hamster.configuration.antlrGenerated.HamsterConfigParser.And_matcherContext;
import org.mdolidon.hamster.configuration.antlrGenerated.HamsterConfigParser.And_not_matcherContext;
import org.mdolidon.hamster.configuration.antlrGenerated.HamsterConfigParser.Avoid_ruleContext;
import org.mdolidon.hamster.configuration.antlrGenerated.HamsterConfigParser.Checkin_directiveContext;
import org.mdolidon.hamster.configuration.antlrGenerated.HamsterConfigParser.Cookies_directiveContext;
import org.mdolidon.hamster.configuration.antlrGenerated.HamsterConfigParser.Css_matcherContext;
import org.mdolidon.hamster.configuration.antlrGenerated.HamsterConfigParser.Download_directiveContext;
import org.mdolidon.hamster.configuration.antlrGenerated.HamsterConfigParser.Get_ruleContext;
import org.mdolidon.hamster.configuration.antlrGenerated.HamsterConfigParser.Get_unknown_ruleContext;
import org.mdolidon.hamster.configuration.antlrGenerated.HamsterConfigParser.Images_matcherContext;
import org.mdolidon.hamster.configuration.antlrGenerated.HamsterConfigParser.IntegerContext;
import org.mdolidon.hamster.configuration.antlrGenerated.HamsterConfigParser.KilobytesContext;
import org.mdolidon.hamster.configuration.antlrGenerated.HamsterConfigParser.Max_jumps_matcherContext;
import org.mdolidon.hamster.configuration.antlrGenerated.HamsterConfigParser.Max_size_directiveContext;
import org.mdolidon.hamster.configuration.antlrGenerated.HamsterConfigParser.Max_size_per_file_directiveContext;
import org.mdolidon.hamster.configuration.antlrGenerated.HamsterConfigParser.MegabytesContext;
import org.mdolidon.hamster.configuration.antlrGenerated.HamsterConfigParser.Min_jumps_matcherContext;
import org.mdolidon.hamster.configuration.antlrGenerated.HamsterConfigParser.No_max_size_directiveContext;
import org.mdolidon.hamster.configuration.antlrGenerated.HamsterConfigParser.Not_matcher_opContext;
import org.mdolidon.hamster.configuration.antlrGenerated.HamsterConfigParser.Parallel_directiveContext;
import org.mdolidon.hamster.configuration.antlrGenerated.HamsterConfigParser.Resources_matcherContext;
import org.mdolidon.hamster.configuration.antlrGenerated.HamsterConfigParser.Same_domain_matcherContext;
import org.mdolidon.hamster.configuration.antlrGenerated.HamsterConfigParser.Save_as_treeContext;
import org.mdolidon.hamster.configuration.antlrGenerated.HamsterConfigParser.Save_directiveContext;
import org.mdolidon.hamster.configuration.antlrGenerated.HamsterConfigParser.Save_flatContext;
import org.mdolidon.hamster.configuration.antlrGenerated.HamsterConfigParser.Save_regex_to_templateContext;
import org.mdolidon.hamster.configuration.antlrGenerated.HamsterConfigParser.Save_under_clauseContext;
import org.mdolidon.hamster.configuration.antlrGenerated.HamsterConfigParser.Simple_authentication_ruleContext;
import org.mdolidon.hamster.configuration.antlrGenerated.HamsterConfigParser.Start_directiveContext;
import org.mdolidon.hamster.configuration.antlrGenerated.HamsterConfigParser.StringContext;
import org.mdolidon.hamster.configuration.antlrGenerated.HamsterConfigParser.String_properties_mapContext;
import org.mdolidon.hamster.configuration.antlrGenerated.HamsterConfigParser.String_propertyContext;
import org.mdolidon.hamster.configuration.antlrGenerated.HamsterConfigParser.Subpaths_matcherContext;
import org.mdolidon.hamster.configuration.antlrGenerated.HamsterConfigParser.Unknown_matcher_opContext;
import org.mdolidon.hamster.configuration.antlrGenerated.HamsterConfigParser.Urls_matcherContext;
import org.mdolidon.hamster.core.ErrorsBoard;
import org.mdolidon.hamster.core.IMatcher;
import org.mdolidon.hamster.matchers.*;

/**
 * An object of this class can listen to events that occur when walking an ANTLR
 * parse tree for a Hamster configuration file (mission for the hamster), and
 * translate the parser events into the proper calls to set up the rules in a
 * BaseConfiguration object.
 *
 */
public class ParserListener extends HamsterConfigParserBaseListener {

	private BaseConfiguration configuration;
	private ErrorsBoard errorsBoard;

	private Deque<IMatcher> matchersStack = new ArrayDeque<>(4); // initial cap
	private Deque<Integer> integersStack = new ArrayDeque<>(4); // initial cap
	private Deque<String> stringsStack = new ArrayDeque<>(4); // initial cap

	// an accumulatable string->string map
	private Map<String, String> strToStrMap = new HashMap<>(4);

	// some rule-specific storage
	private String save_under_folderStr;
	private boolean hadStartUrl = false;
	private boolean hadMaxParallel = false;
	private boolean inDownloadDirective;
	private CheckinDirective currentCheckinDirective;

	public ParserListener(BaseConfiguration mutable_configuration) {
		configuration = mutable_configuration;
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

	//
	// Literals
	//

	@Override
	public void exitString(StringContext ctx) {
		pushString(ctx.getText());
	}

	@Override
	public void exitInteger(IntegerContext ctx) {
		Integer i = new Integer(ctx.getText());
		pushInteger(i);
	}

	@Override
	public void exitKilobytes(KilobytesContext ctx) {
		int i = popInteger().intValue();
		pushInteger(Integer.valueOf(i * 1024));
	}

	@Override
	public void exitMegabytes(MegabytesContext ctx) {
		int i = popInteger().intValue();
		pushInteger(Integer.valueOf(i * 1048576));
	}

	@Override
	public void enterString_properties_map(String_properties_mapContext ctx) {
		strToStrMap = new HashMap<>(4);
	}

	@Override
	public void exitString_property(String_propertyContext ctx) {
		String value = popString();
		String key = popString();
		strToStrMap.put(key, value);
	}

	//
	// Simple globals
	//

	@Override
	public void exitStart_directive(Start_directiveContext ctx) {
		String urlText = popString();
		if (hadStartUrl) {
			errorsBoard.note(urlText + " is a redundant starting URL.");
			return;
		}
		try {
			if (!urlText.contains("://")) {
				urlText = "http://" + urlText;
			}
			URL startUrl = new URL(urlText);
			configuration.setStartUrl(startUrl);
			hadStartUrl = true;
		} catch (MalformedURLException e) {
			errorsBoard.note(urlText.concat(" : can not be used as a starting URL."));
		}
	}

	@Override
	public void exitParallel_directive(Parallel_directiveContext ctx) {
		String intText = ctx.getText();
		if (hadMaxParallel) {
			errorsBoard.note(intText + " is a redundant request for parallel downloads.");
			return;
		}
		configuration.setMaxConcurrentRequests(popInteger().intValue());
		hadMaxParallel = true;
	}

	//
	// Maximum size directives
	//

	@Override
	public void enterMax_size_directive(Max_size_directiveContext ctx) {
		clearMatchersStack();
		pushMatcher(new All());
	}

	@Override
	public void exitMax_size_per_file_directive(Max_size_per_file_directiveContext ctx) {
		configuration.addContentSizeRule(new ConstantContentSizeRule(popInteger().longValue(), popMatcher()));
	}

	@Override
	public void exitNo_max_size_directive(No_max_size_directiveContext ctx) {
		configuration.addContentSizeRule(new IllimitedContentSizeRule(popMatcher()));
	}
	
	//
	// Save directives
	//

	@Override
	public void enterSave_directive(Save_directiveContext ctx) {
		clearMatchersStack();
		pushMatcher(new All());
		save_under_folderStr = null;
	}

	@Override
	public void exitSave_under_clause(Save_under_clauseContext ctx) {
		save_under_folderStr = popString();
	}

	@Override
	public void exitSave_as_tree(Save_as_treeContext ctx) {
		configuration.addStorageResolver(new TreeStorageResolver(popMatcher(), save_under_folderStr));

	}

	@Override
	public void exitSave_flat(Save_flatContext ctx) {
		configuration.addStorageResolver(new FlatStorageResolver(popMatcher(), configuration, save_under_folderStr));
	}

	@Override
	public void exitSave_regex_to_template(Save_regex_to_templateContext ctx) {
		URLs matcher = (URLs) popMatcher();
		String template = popString();
		configuration.addStorageResolver(new RegexStorageResolver(matcher, template));
	}

	//
	// Get and avoid download rules
	//

	@Override
	public void enterDownload_directive(Download_directiveContext ctx) {
		clearMatchersStack();
		inDownloadDirective = true;
	}

	@Override
	public void exitDownload_directive(Download_directiveContext ctx) {
		inDownloadDirective = false;
	}

	@Override
	public void exitGet_rule(Get_ruleContext ctx) {
		configuration.addDownloadRule(new GetRule(popMatcher()));
	}

	@Override
	public void exitGet_unknown_rule(Get_unknown_ruleContext ctx) {
		configuration.addDownloadRule(new GetUnknownRule(popMatcher()));
	}

	@Override
	public void exitAvoid_rule(Avoid_ruleContext ctx) {
		configuration.addDownloadRule(new AvoidRule(popMatcher()));
	}

	//
	// Authentication rules
	//

	@Override
	public void exitSimple_authentication_rule(Simple_authentication_ruleContext ctx) {
		IMatcher matcher = popMatcher();
		String password = popString();
		String user = popString();
		IAuthenticationRule rule = new SimpleAuthenticationRule(user, password, matcher);
		configuration.addAuthenticationRule(rule, matcher);
	}

	//
	// Check-in directives
	//

	@Override
	public void exitCheckin_directive(Checkin_directiveContext ctx) {
		CheckinDirective checkin = new CheckinDirective();
		String urlStr = popString();
		try {
			currentCheckinDirective.setUrl(urlStr);
		} catch (MalformedURLException e) {
			errorsBoard.note("Malformed URL in check-in directive : " + urlStr);
			return;
		}

		for (String key : strToStrMap.keySet()) {
			checkin.addPostParameter(key, strToStrMap.get(key));
		}

		configuration.addCheckin(currentCheckinDirective);
	}

	//
	// Cookies
	//

	@Override
	public void exitCookies_directive(Cookies_directiveContext ctx) {
		CookiesDirective ckd = new CookiesDirective(strToStrMap, popString());
		configuration.addCookiesDirective(ckd);
	}

	//
	//
	// ------ Matchers
	//
	//

	@Override
	public void exitAll_matcher(All_matcherContext ctx) {
		pushMatcher(new All());
	}

	@Override
	public void exitAnd_matcher(And_matcherContext ctx) {
		pushMatcher(new And(popMatcher(), popMatcher()));
	}

	@Override
	public void exitAnd_not_matcher(And_not_matcherContext ctx) {
		pushMatcher(new And(new Not(popMatcher()), popMatcher()));
	}

	@Override
	public void exitCss_matcher(Css_matcherContext ctx) {
		if (!inDownloadDirective) {
			errorsBoard.note("The css matcher can only be used in download rules.");
			pushMatcher(new Not(new All()));
		}
		pushMatcher(new Css(popString()));
	}

	@Override
	public void exitImages_matcher(Images_matcherContext ctx) {
		pushMatcher(new Images());
	}

	@Override
	public void exitMax_jumps_matcher(Max_jumps_matcherContext ctx) {
		pushMatcher(new MaxJumps(popInteger().intValue()));
	}

	@Override
	public void exitMin_jumps_matcher(Min_jumps_matcherContext ctx) {
		pushMatcher(new MinJumps(popInteger().intValue()));
	}

	@Override
	public void exitNot_matcher_op(Not_matcher_opContext ctx) {
		pushMatcher(new Not(popMatcher()));
	}

	@Override
	public void exitResources_matcher(Resources_matcherContext ctx) {
		pushMatcher(new Resources());
	}

	@Override
	public void exitSame_domain_matcher(Same_domain_matcherContext ctx) {
		pushMatcher(new SameDomain(configuration));
	}

	@Override
	public void exitSubpaths_matcher(Subpaths_matcherContext ctx) {
		pushMatcher(new Subpaths(configuration));
	}

	@Override
	public void exitUnknown_matcher_op(Unknown_matcher_opContext ctx) {
		pushMatcher(new Unknown(popMatcher()));
	}

	@Override
	public void exitUrls_matcher(Urls_matcherContext ctx) {
		String urlRegex = popString();
		try {
			pushMatcher(new URLs(urlRegex));
		} catch (Exception e) {
			errorsBoard.note(e.getMessage());
		}
	}

	//
	// Some dumb bits
	//

	// Listener stack controls

	// pop operations on an empty stack do return a neutral element
	// That element won't be used as the configuration will be deemed
	// invalid by the parser, but it allows to prevent throwing exceptions
	// before ANTLR had time to realize that the syntax is wrong.

	private void pushMatcher(IMatcher matcher) {
		matchersStack.addFirst(matcher);
	}

	private IMatcher popMatcher() {
		if (matchersStack.size() == 0) {
			return new Not(new All());
		} else {
			return matchersStack.removeFirst();
		}
	}

	private void clearMatchersStack() {
		matchersStack.clear();
	}

	private void pushInteger(Integer itg) {
		integersStack.addFirst(itg);
	}

	private Integer popInteger() {
		if (integersStack.size() == 0) {
			return Integer.valueOf(0);
		} else {
			return integersStack.removeFirst();
		}
	}

	private void pushString(String s) {
		stringsStack.addFirst(s);
	}

	private String popString() {
		if (stringsStack.size() == 0) {
			return "";
		} else {
			return stringsStack.removeFirst();
		}
	}

}