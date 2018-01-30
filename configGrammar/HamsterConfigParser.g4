parser grammar HamsterConfigParser;

options { tokenVocab = HamsterConfigLexer; }

// ---------------------------------------------------------------------------

integer : INTEGER_LITERAL ;
string : STRING_LITERAL ;

string_properties_map : string_property*;
string_property : string EQUALS string ;

// ---------------------------------------------------------------------------

config: directive* EOF;

directive: ( start_directive | parallel_directive |
             download_directive | save_directive |
             authentication_directive | max_size_directive |
             checkin_directive | cookies_directive );

start_directive : START_AT string ;

parallel_directive : integer PARALLEL_DOWNLOADS ;

max_size_directive : ( max_size_per_file_directive | no_max_size_directive );
no_max_size_directive : NO_SIZE_LIMIT (FROM matcher)? ;
max_size_per_file_directive : MAXIMUM integer size_unit EACH (FROM matcher)? ;
size_unit : kilobytes | megabytes ;
kilobytes : KB ;
megabytes : MB ;

save_directive          : SAVE (save_as_tree | save_flat | save_regex_to_template | save_as_basename) ;
save_as_tree            : matcher? AS_TREE save_under_clause? ;
save_flat               : matcher? FLAT save_under_clause? ;
save_as_basename        : matcher? AS_BASE_NAME save_under_clause? ;
save_regex_to_template  : urls_matcher AS string ;
save_under_clause       : UNDER string ;

download_directive : ( get_rule | get_unknown_rule | avoid_rule );
get_rule   : GET   matcher ;
get_unknown_rule : GET_UNKNOWN matcher ;
avoid_rule : AVOID matcher ;

authentication_directive : simple_authentication_rule ;
simple_authentication_rule : USER string PASSWORD string ON matcher ;

checkin_directive : CHECK_IN_AT string POST string_properties_map ;

cookies_directive : COOKIES string_properties_map ON string ;


// MATCHERS

// Expressions are deliberately kept simple.
// This part was originally a classical recursive expression grammar.
// I eventually took the position that letting someone write arbitrarily complex
// expressions with this DSL would go against the very purpose of this DSL.
// I rewrote it as a simpler grammar

// UNKNOWN? (matcher AND matcher AND_NOT matcher (...))
// This is left associative

matcher : unknown_matcher_op | matchers_product ;
unknown_matcher_op : UNKNOWN matchers_product ;

matchers_product : matcher_factor rest ;
rest : (and_matcher | and_not_matcher) rest | ;
and_matcher : ON matcher_factor ;
and_not_matcher : OUTSIDE matcher_factor ;

matcher_factor :
           ( not_matcher_op      |

             all_matcher         |
             css_matcher         |
             images_matcher      |
             max_jumps_matcher   |
             min_jumps_matcher   |
             resources_matcher   |
             same_domain_matcher |
             subpaths_matcher    |
             urls_matcher        ) ;




not_matcher_op : OUTSIDE matcher ;

all_matcher : ALL ;
images_matcher      : IMAGES ;
same_domain_matcher : ( DOMAIN | ITEMS_ON_DOMAIN ) ;
subpaths_matcher    : SUBPATHS  ;
resources_matcher   : RESOURCES ;


css_matcher : CSS string ;
urls_matcher : URLS string ;

max_jumps_matcher : UP_TO integer JUMPS ;
min_jumps_matcher : integer JUMPS_AND_MORE ;
