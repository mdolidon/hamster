lexer grammar HamsterConfigLexer;

// Keywords
ALL : 'all' ;
AS : 'as' ;
AS_TREE : 'as' ' '+ 'tree' ;
AVOID : 'avoid' ;
CHECK_IN_AT : 'check' ' '+ 'in' ' '+ 'at' ;
COOKIES : 'cookie' 's'? ;
CSS : 'css' ;
DOMAIN : 'domain' ;
EACH : 'each' ;
FLAT : 'flat' ;
FROM : 'from' ;
GET : 'get' ;
GET_UNKNOWN : 'get' ' '+ 'unknown' ;
IMAGES : 'images' ;
ITEMS_ON_DOMAIN : 'items' ' '+ 'on' ' '+ 'domain' ;
JUMPS : 'jump' 's'? ;
JUMPS_AND_MORE : 'jump' 's'? ' '+ 'and' ' '+ 'more' ;
KB : ('Kb' | 'kb' | 'KB' ) ;
MAXIMUM : 'maximum' ;
MB : ( 'Mb' | 'mb' | 'MB' ) ;
NO_SIZE_LIMIT : 'no' ' '+ 'size' ' '+ 'limit' ;
ON : 'on' ;
OUTSIDE : 'outside' ;
PARALLEL_DOWNLOADS : 'parallel' ' '+ 'download' 's'? ;
PASSWORD : 'password' ;
POST : 'post' ;
RESOURCES : 'resources' ;
SAVE : 'save' ;
START_AT : 'start' ' '+ 'at' ;
SUBPATHS : 'subpaths' ;
UNDER : 'under' ;
UNKNOWN : 'unknown' ;
UP_TO: 'up' ' '+ 'to' ;
URLS : 'urls' ;
USER : 'user' ;


EQUALS : '=';

// Literals

INTEGER_LITERAL : [0-9]+ ;
OPENING_QUOTE : '"' -> pushMode(IN_STRING_LITERAL), skip;


// What we're less concerned about

COMMENT : '#' ~('\n')* -> skip ;
WS      : (' '|'\r'|'\n'|'\t')+ -> skip ;
WORD    : [a-zA-Z_]+ ; // grouping letters to build words lets us have nicer error messages


// Inside string literals

mode IN_STRING_LITERAL;
CLOSING_QUOTE : '"' -> popMode, skip;
STRING_LITERAL : ~('"')* ;
