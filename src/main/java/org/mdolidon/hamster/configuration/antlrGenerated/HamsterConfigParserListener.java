// Generated from HamsterConfigParser.g4 by ANTLR 4.7.1
package org.mdolidon.hamster.configuration.antlrGenerated;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HamsterConfigParser}.
 */
public interface HamsterConfigParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HamsterConfigParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(HamsterConfigParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link HamsterConfigParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(HamsterConfigParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link HamsterConfigParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(HamsterConfigParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link HamsterConfigParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(HamsterConfigParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link HamsterConfigParser#config}.
	 * @param ctx the parse tree
	 */
	void enterConfig(HamsterConfigParser.ConfigContext ctx);
	/**
	 * Exit a parse tree produced by {@link HamsterConfigParser#config}.
	 * @param ctx the parse tree
	 */
	void exitConfig(HamsterConfigParser.ConfigContext ctx);
	/**
	 * Enter a parse tree produced by {@link HamsterConfigParser#directive}.
	 * @param ctx the parse tree
	 */
	void enterDirective(HamsterConfigParser.DirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link HamsterConfigParser#directive}.
	 * @param ctx the parse tree
	 */
	void exitDirective(HamsterConfigParser.DirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link HamsterConfigParser#start_directive}.
	 * @param ctx the parse tree
	 */
	void enterStart_directive(HamsterConfigParser.Start_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link HamsterConfigParser#start_directive}.
	 * @param ctx the parse tree
	 */
	void exitStart_directive(HamsterConfigParser.Start_directiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link HamsterConfigParser#parallel_directive}.
	 * @param ctx the parse tree
	 */
	void enterParallel_directive(HamsterConfigParser.Parallel_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link HamsterConfigParser#parallel_directive}.
	 * @param ctx the parse tree
	 */
	void exitParallel_directive(HamsterConfigParser.Parallel_directiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link HamsterConfigParser#max_size_directive}.
	 * @param ctx the parse tree
	 */
	void enterMax_size_directive(HamsterConfigParser.Max_size_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link HamsterConfigParser#max_size_directive}.
	 * @param ctx the parse tree
	 */
	void exitMax_size_directive(HamsterConfigParser.Max_size_directiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link HamsterConfigParser#max_size_per_file_directive}.
	 * @param ctx the parse tree
	 */
	void enterMax_size_per_file_directive(HamsterConfigParser.Max_size_per_file_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link HamsterConfigParser#max_size_per_file_directive}.
	 * @param ctx the parse tree
	 */
	void exitMax_size_per_file_directive(HamsterConfigParser.Max_size_per_file_directiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link HamsterConfigParser#size_unit}.
	 * @param ctx the parse tree
	 */
	void enterSize_unit(HamsterConfigParser.Size_unitContext ctx);
	/**
	 * Exit a parse tree produced by {@link HamsterConfigParser#size_unit}.
	 * @param ctx the parse tree
	 */
	void exitSize_unit(HamsterConfigParser.Size_unitContext ctx);
	/**
	 * Enter a parse tree produced by {@link HamsterConfigParser#kilobytes}.
	 * @param ctx the parse tree
	 */
	void enterKilobytes(HamsterConfigParser.KilobytesContext ctx);
	/**
	 * Exit a parse tree produced by {@link HamsterConfigParser#kilobytes}.
	 * @param ctx the parse tree
	 */
	void exitKilobytes(HamsterConfigParser.KilobytesContext ctx);
	/**
	 * Enter a parse tree produced by {@link HamsterConfigParser#megabytes}.
	 * @param ctx the parse tree
	 */
	void enterMegabytes(HamsterConfigParser.MegabytesContext ctx);
	/**
	 * Exit a parse tree produced by {@link HamsterConfigParser#megabytes}.
	 * @param ctx the parse tree
	 */
	void exitMegabytes(HamsterConfigParser.MegabytesContext ctx);
	/**
	 * Enter a parse tree produced by {@link HamsterConfigParser#save_directive}.
	 * @param ctx the parse tree
	 */
	void enterSave_directive(HamsterConfigParser.Save_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link HamsterConfigParser#save_directive}.
	 * @param ctx the parse tree
	 */
	void exitSave_directive(HamsterConfigParser.Save_directiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link HamsterConfigParser#save_as_tree}.
	 * @param ctx the parse tree
	 */
	void enterSave_as_tree(HamsterConfigParser.Save_as_treeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HamsterConfigParser#save_as_tree}.
	 * @param ctx the parse tree
	 */
	void exitSave_as_tree(HamsterConfigParser.Save_as_treeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HamsterConfigParser#save_flat}.
	 * @param ctx the parse tree
	 */
	void enterSave_flat(HamsterConfigParser.Save_flatContext ctx);
	/**
	 * Exit a parse tree produced by {@link HamsterConfigParser#save_flat}.
	 * @param ctx the parse tree
	 */
	void exitSave_flat(HamsterConfigParser.Save_flatContext ctx);
	/**
	 * Enter a parse tree produced by {@link HamsterConfigParser#save_under_clause}.
	 * @param ctx the parse tree
	 */
	void enterSave_under_clause(HamsterConfigParser.Save_under_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HamsterConfigParser#save_under_clause}.
	 * @param ctx the parse tree
	 */
	void exitSave_under_clause(HamsterConfigParser.Save_under_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HamsterConfigParser#save_regex_to_template}.
	 * @param ctx the parse tree
	 */
	void enterSave_regex_to_template(HamsterConfigParser.Save_regex_to_templateContext ctx);
	/**
	 * Exit a parse tree produced by {@link HamsterConfigParser#save_regex_to_template}.
	 * @param ctx the parse tree
	 */
	void exitSave_regex_to_template(HamsterConfigParser.Save_regex_to_templateContext ctx);
	/**
	 * Enter a parse tree produced by {@link HamsterConfigParser#download_directive}.
	 * @param ctx the parse tree
	 */
	void enterDownload_directive(HamsterConfigParser.Download_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link HamsterConfigParser#download_directive}.
	 * @param ctx the parse tree
	 */
	void exitDownload_directive(HamsterConfigParser.Download_directiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link HamsterConfigParser#get_rule}.
	 * @param ctx the parse tree
	 */
	void enterGet_rule(HamsterConfigParser.Get_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link HamsterConfigParser#get_rule}.
	 * @param ctx the parse tree
	 */
	void exitGet_rule(HamsterConfigParser.Get_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link HamsterConfigParser#get_unknown_rule}.
	 * @param ctx the parse tree
	 */
	void enterGet_unknown_rule(HamsterConfigParser.Get_unknown_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link HamsterConfigParser#get_unknown_rule}.
	 * @param ctx the parse tree
	 */
	void exitGet_unknown_rule(HamsterConfigParser.Get_unknown_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link HamsterConfigParser#avoid_rule}.
	 * @param ctx the parse tree
	 */
	void enterAvoid_rule(HamsterConfigParser.Avoid_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link HamsterConfigParser#avoid_rule}.
	 * @param ctx the parse tree
	 */
	void exitAvoid_rule(HamsterConfigParser.Avoid_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link HamsterConfigParser#authentication_directive}.
	 * @param ctx the parse tree
	 */
	void enterAuthentication_directive(HamsterConfigParser.Authentication_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link HamsterConfigParser#authentication_directive}.
	 * @param ctx the parse tree
	 */
	void exitAuthentication_directive(HamsterConfigParser.Authentication_directiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link HamsterConfigParser#simple_authentication_rule}.
	 * @param ctx the parse tree
	 */
	void enterSimple_authentication_rule(HamsterConfigParser.Simple_authentication_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link HamsterConfigParser#simple_authentication_rule}.
	 * @param ctx the parse tree
	 */
	void exitSimple_authentication_rule(HamsterConfigParser.Simple_authentication_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link HamsterConfigParser#checkin_directive}.
	 * @param ctx the parse tree
	 */
	void enterCheckin_directive(HamsterConfigParser.Checkin_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link HamsterConfigParser#checkin_directive}.
	 * @param ctx the parse tree
	 */
	void exitCheckin_directive(HamsterConfigParser.Checkin_directiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link HamsterConfigParser#checkin_post_param}.
	 * @param ctx the parse tree
	 */
	void enterCheckin_post_param(HamsterConfigParser.Checkin_post_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link HamsterConfigParser#checkin_post_param}.
	 * @param ctx the parse tree
	 */
	void exitCheckin_post_param(HamsterConfigParser.Checkin_post_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link HamsterConfigParser#matcher}.
	 * @param ctx the parse tree
	 */
	void enterMatcher(HamsterConfigParser.MatcherContext ctx);
	/**
	 * Exit a parse tree produced by {@link HamsterConfigParser#matcher}.
	 * @param ctx the parse tree
	 */
	void exitMatcher(HamsterConfigParser.MatcherContext ctx);
	/**
	 * Enter a parse tree produced by {@link HamsterConfigParser#unknown_matcher_op}.
	 * @param ctx the parse tree
	 */
	void enterUnknown_matcher_op(HamsterConfigParser.Unknown_matcher_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link HamsterConfigParser#unknown_matcher_op}.
	 * @param ctx the parse tree
	 */
	void exitUnknown_matcher_op(HamsterConfigParser.Unknown_matcher_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link HamsterConfigParser#matchers_product}.
	 * @param ctx the parse tree
	 */
	void enterMatchers_product(HamsterConfigParser.Matchers_productContext ctx);
	/**
	 * Exit a parse tree produced by {@link HamsterConfigParser#matchers_product}.
	 * @param ctx the parse tree
	 */
	void exitMatchers_product(HamsterConfigParser.Matchers_productContext ctx);
	/**
	 * Enter a parse tree produced by {@link HamsterConfigParser#rest}.
	 * @param ctx the parse tree
	 */
	void enterRest(HamsterConfigParser.RestContext ctx);
	/**
	 * Exit a parse tree produced by {@link HamsterConfigParser#rest}.
	 * @param ctx the parse tree
	 */
	void exitRest(HamsterConfigParser.RestContext ctx);
	/**
	 * Enter a parse tree produced by {@link HamsterConfigParser#and_matcher}.
	 * @param ctx the parse tree
	 */
	void enterAnd_matcher(HamsterConfigParser.And_matcherContext ctx);
	/**
	 * Exit a parse tree produced by {@link HamsterConfigParser#and_matcher}.
	 * @param ctx the parse tree
	 */
	void exitAnd_matcher(HamsterConfigParser.And_matcherContext ctx);
	/**
	 * Enter a parse tree produced by {@link HamsterConfigParser#and_not_matcher}.
	 * @param ctx the parse tree
	 */
	void enterAnd_not_matcher(HamsterConfigParser.And_not_matcherContext ctx);
	/**
	 * Exit a parse tree produced by {@link HamsterConfigParser#and_not_matcher}.
	 * @param ctx the parse tree
	 */
	void exitAnd_not_matcher(HamsterConfigParser.And_not_matcherContext ctx);
	/**
	 * Enter a parse tree produced by {@link HamsterConfigParser#matcher_factor}.
	 * @param ctx the parse tree
	 */
	void enterMatcher_factor(HamsterConfigParser.Matcher_factorContext ctx);
	/**
	 * Exit a parse tree produced by {@link HamsterConfigParser#matcher_factor}.
	 * @param ctx the parse tree
	 */
	void exitMatcher_factor(HamsterConfigParser.Matcher_factorContext ctx);
	/**
	 * Enter a parse tree produced by {@link HamsterConfigParser#not_matcher_op}.
	 * @param ctx the parse tree
	 */
	void enterNot_matcher_op(HamsterConfigParser.Not_matcher_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link HamsterConfigParser#not_matcher_op}.
	 * @param ctx the parse tree
	 */
	void exitNot_matcher_op(HamsterConfigParser.Not_matcher_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link HamsterConfigParser#all_matcher}.
	 * @param ctx the parse tree
	 */
	void enterAll_matcher(HamsterConfigParser.All_matcherContext ctx);
	/**
	 * Exit a parse tree produced by {@link HamsterConfigParser#all_matcher}.
	 * @param ctx the parse tree
	 */
	void exitAll_matcher(HamsterConfigParser.All_matcherContext ctx);
	/**
	 * Enter a parse tree produced by {@link HamsterConfigParser#images_matcher}.
	 * @param ctx the parse tree
	 */
	void enterImages_matcher(HamsterConfigParser.Images_matcherContext ctx);
	/**
	 * Exit a parse tree produced by {@link HamsterConfigParser#images_matcher}.
	 * @param ctx the parse tree
	 */
	void exitImages_matcher(HamsterConfigParser.Images_matcherContext ctx);
	/**
	 * Enter a parse tree produced by {@link HamsterConfigParser#same_domain_matcher}.
	 * @param ctx the parse tree
	 */
	void enterSame_domain_matcher(HamsterConfigParser.Same_domain_matcherContext ctx);
	/**
	 * Exit a parse tree produced by {@link HamsterConfigParser#same_domain_matcher}.
	 * @param ctx the parse tree
	 */
	void exitSame_domain_matcher(HamsterConfigParser.Same_domain_matcherContext ctx);
	/**
	 * Enter a parse tree produced by {@link HamsterConfigParser#subpaths_matcher}.
	 * @param ctx the parse tree
	 */
	void enterSubpaths_matcher(HamsterConfigParser.Subpaths_matcherContext ctx);
	/**
	 * Exit a parse tree produced by {@link HamsterConfigParser#subpaths_matcher}.
	 * @param ctx the parse tree
	 */
	void exitSubpaths_matcher(HamsterConfigParser.Subpaths_matcherContext ctx);
	/**
	 * Enter a parse tree produced by {@link HamsterConfigParser#resources_matcher}.
	 * @param ctx the parse tree
	 */
	void enterResources_matcher(HamsterConfigParser.Resources_matcherContext ctx);
	/**
	 * Exit a parse tree produced by {@link HamsterConfigParser#resources_matcher}.
	 * @param ctx the parse tree
	 */
	void exitResources_matcher(HamsterConfigParser.Resources_matcherContext ctx);
	/**
	 * Enter a parse tree produced by {@link HamsterConfigParser#css_matcher}.
	 * @param ctx the parse tree
	 */
	void enterCss_matcher(HamsterConfigParser.Css_matcherContext ctx);
	/**
	 * Exit a parse tree produced by {@link HamsterConfigParser#css_matcher}.
	 * @param ctx the parse tree
	 */
	void exitCss_matcher(HamsterConfigParser.Css_matcherContext ctx);
	/**
	 * Enter a parse tree produced by {@link HamsterConfigParser#urls_matcher}.
	 * @param ctx the parse tree
	 */
	void enterUrls_matcher(HamsterConfigParser.Urls_matcherContext ctx);
	/**
	 * Exit a parse tree produced by {@link HamsterConfigParser#urls_matcher}.
	 * @param ctx the parse tree
	 */
	void exitUrls_matcher(HamsterConfigParser.Urls_matcherContext ctx);
	/**
	 * Enter a parse tree produced by {@link HamsterConfigParser#max_jumps_matcher}.
	 * @param ctx the parse tree
	 */
	void enterMax_jumps_matcher(HamsterConfigParser.Max_jumps_matcherContext ctx);
	/**
	 * Exit a parse tree produced by {@link HamsterConfigParser#max_jumps_matcher}.
	 * @param ctx the parse tree
	 */
	void exitMax_jumps_matcher(HamsterConfigParser.Max_jumps_matcherContext ctx);
	/**
	 * Enter a parse tree produced by {@link HamsterConfigParser#min_jumps_matcher}.
	 * @param ctx the parse tree
	 */
	void enterMin_jumps_matcher(HamsterConfigParser.Min_jumps_matcherContext ctx);
	/**
	 * Exit a parse tree produced by {@link HamsterConfigParser#min_jumps_matcher}.
	 * @param ctx the parse tree
	 */
	void exitMin_jumps_matcher(HamsterConfigParser.Min_jumps_matcherContext ctx);
}