grammar Dax;
@header {
    package com.example;
}
// ===================
// Parser Rules
// ===================

daxExpression
    : measureAssignment EOF
    ;

measureAssignment
    : identifier MEASURE_ASSIGNMENT daxStatement
    | identifier EQUALS daxStatement
    | daxStatement
    ;

daxStatement
    : evaluateBlock returnStatement
    | expression
    ;

evaluateBlock
    : varDeclaration+ //
    ;

varDeclaration
    : VAR identifier EQUALS expression
    ;

returnStatement
    : RETURN expression
    ;

// This is a simplified expression rule. In a real grammar,
// you'd want to handle more operator precedence and structures.
expression
    : functionCall
    | identifier
    | numericLiteral
    | stringLiteral
    | parenthesizedExpression
    | expression operator expression
    ;

// Parenthesized sub-expression
parenthesizedExpression
    : LPAREN expression RPAREN
    ;

// Basic function call rule with variable argument list
functionCall
    : daxFunction LPAREN argumentList? RPAREN
    ;

argumentList
    : expression (COMMA expression)*
    ;

operator
    : PLUS
    | MINUS
    | TIMES
    | DIVIDE_OP
    | POWER_OP
    | CONCATENATE_OP
    | ARE_EQUAL_OP
    | GREATER_THAN_EQUALS_OP
    | LESS_THAN_EQUALS_OP
    | NOT_EQUAL_OP
    | GREATER_THAN_OP
    | LESS_THAN_OP
    | LOGICAL_AND
    | LOGICAL_OR
    | LOGICAL_IN
    ;

daxFunction
    : APPROXIMATEDISTINCTCOUNT | AVERAGE | AVERAGEA | AVERAGEX
    | COUNT | COUNTA | COUNTAX | COUNTBLANK
    | COUNTROWS | COUNTX | DISTINCTCOUNT | DISTINCTCOUNTNOBLANK
    | MAX | MAXA | MAXX | MIN
    | MINA | MINX | PRODUCT | PRODUCTX
    | SUM | SUMX | CALENDAR | CALENDARAUTO
    | DATE | DATEDIFF | DATEVALUE | DAY
    | EDATE | EOMONTH | HOUR | MINUTE
    | MONTH | NETWORKDAYS | NOW | QUARTER
    | SECOND | TIME | TIMEVALUE | TODAY
    | UTCNOW | UTCTODAY | WEEKDAY | WEEKNUM
    | YEAR | YEARFRAC | ALL | ALLCROSSFILTERED
    | ALLEXCEPT | ALLNOBLANKROW | ALLSELECTED | CALCULATE
    | CALCULATETABLE | EARLIER | EARLIEST | FILTER
    | FIRSTNONBLANK | FIRSTNONBLANKVALUE | INDEX | KEEPFILTERS
    | LASTNONBLANK | LASTNONBLANKVALUE | LOOKUPVALUE | MATCHBY
    | MOVINGAVERAGE | OFFSET | ORDERBY | PARTITIONBY
    | RANGE | RANK | REMOVEFILTERS | ROWNUMBER
    | RUNNINGSUM | SELECTEDVALUE | WINDOW | ACCRINT
    | ACCRINTM | AMORDEGRC | AMORLINC | COUPDAYBS
    | COUPDAYS | COUPDAYSNC | COUPNCD | COUPNUM
    | COUPPCD | CUMIPMT | CUMPRINC | DB
    | DDB | DISC | DOLLARDE | DOLLARFR
    | DURATION | EFFECT | FV | INTRATE
    | IPMT | ISPMT | MDURATION | NOMINAL
    | NPER | ODDFPRICE | ODDFYIELD | ODDLPRICE
    | ODDLYIELD | PDURATION | PMT | PPMT
    | PRICE | PRICEDISC | PRICEMAT | PV
    | RATE | RECEIVED | RRI | SLN
    | SYD | TBILLEQ | TBILLPRICE | TBILLYIELD
    | VDB | XIRR | XNPV | YIELD
    | YIELDDISC | YIELDMAT | COLUMNSTATISTICS | CONTAINS
    | CONTAINSROW | CONTAINSSTRING | CONTAINSSTRINGEXACT | CUSTOMDATA
    | HASONEFILTER | HASONEVALUE | ISAFTER | ISBLANK
    | ISCROSSFILTERED | ISEMPTY | ISERROR | ISEVEN
    | ISFILTERED | ISINSCOPE | ISLOGICAL | ISNONTEXT
    | ISNUMBER | ISODD | ISONORAFTER | ISSELECTEDMEASURE
    | ISSUBTOTAL | ISTEXT | NONVISUAL | SELECTEDMEASURE
    | SELECTEDMEASUREFORMATSTRING | SELECTEDMEASURENAME | USERCULTURE | USERNAME
    | USEROBJECTID | USERPRINCIPALNAME | AND | BITAND
    | BITLSHIFT | BITOR | BITRSHIFT | BITXOR
    | COALESCE | FALSE | IF | IFDOTEAGER
    | IFERROR | NOT | OR | SWITCH
    | TRUE | ABS | ACOS | ACOSH
    | ACOT | ACOTH | ASIN | ASINH
    | ATAN | ATANH | CEILING | CONVERT
    | COS | COSH | COT | COTH
    | CURRENCY | DEGREES | DIVIDE | EVEN
    | EXP | FACT | FLOOR | GCD
    | INT | ISODOTCEILING | LCM | LN
    | LOG | LOG10 | MOD | MROUND
    | ODD | PI | POWER | QUOTIENT
    | RADIANS | RAND | RANDBETWEEN | ROUND
    | ROUNDDOWN | ROUNDUP | SIGN | SIN
    | SINH | SQRT | SQRTPI | TAN
    | TANH | TRUNC | BLANK | ERROR
    | EVALUATEANDLOG | TOCSV | TOJSON | PATH
    | PATHCONTAINS | PATHITEM | PATHITEMREVERSE | PATHLENGTH
    | CROSSFILTER | RELATED | RELATEDTABLE | USERELATIONSHIP
    | BETADOTDIST | BETADOTINV | CHISQDOTDIST | CHISQDOTDISTDOTRT
    | CHISQDOTINV | CHISQDOTINVDOTRT | COMBIN | COMBINA
    | CONFIDENCEDOTNORM | CONFIDENCEDOTT | EXPONDOTDIST | GEOMEAN
    | GEOMEANX | LINEST | LINESTX | MEDIAN
    | MEDIANX | NORMDOTDIST | NORMDOTINV | NORMDOTSDOTDIST
    | NORMDOTSDOTINV | PERCENTILEDOTEXC | PERCENTILEDOTINC | PERCENTILEXDOTEXC
    | PERCENTILEXDOTINC | PERMUT | POISSONDOTDIST | RANKDOTEQ
    | RANKX | SAMPLE | SAMPLECARTESIANPOINTSBYCOVER | STDEVDOTS
    | STDEVDOTP | STDEVXDOTS | STDEVXDOTP | TDOTDIST
    | TDOTDISTDOT2T | TDOTDISTDOTRT | TDOTINV | TDOTINVDOT2T
    | VARDOTS | VARDOTP | VARXDOTS | VARXDOTP
    | ADDCOLUMNS | ADDMISSINGITEMS | CROSSJOIN | CURRENTGROUP
    | DATATABLE | DETAILROWS | DISTINCT
    | EXCEPT | FILTERS | GENERATE | GENERATEALL
    | GENERATESERIES | GROUPBY | IGNORE | INTERSECT
    | NATURALINNERJOIN | NATURALLEFTOUTERJOIN | ROLLUP | ROLLUPADDISSUBTOTAL
    | ROLLUPGROUP | ROLLUPISSUBTOTAL | ROW | SELECTCOLUMNS
    | SUBSTITUTEWITHINDEX | SUMMARIZE | SUMMARIZECOLUMNS | TOPN
    | TREATAS | UNION | VALUES | COMBINEVALUES
    | CONCATENATE | CONCATENATEX | EXACT | FIND
    | FIXED | FORMAT | LEFT | LEN
    | LOWER | MID | REPLACE | REPT
    | RIGHT | SEARCH | SUBSTITUTE | TRIM
    | UNICHAR | UNICODE | UPPER | VALUE
    | CLOSINGBALANCEMONTH | CLOSINGBALANCEQUARTER | CLOSINGBALANCEYEAR | DATEADD
    | DATESBETWEEN | DATESINPERIOD | DATESMTD | DATESQTD
    | DATESYTD | ENDOFMONTH | ENDOFQUARTER | ENDOFYEAR
    | FIRSTDATE | LASTDATE | NEXTDAY | NEXTMONTH
    | NEXTQUARTER | NEXTYEAR | OPENINGBALANCEMONTH | OPENINGBALANCEQUARTER
    | OPENINGBALANCEYEAR | PARALLELPERIOD | PREVIOUSDAY | PREVIOUSMONTH
    | PREVIOUSQUARTER | PREVIOUSYEAR | SAMEPERIODLASTYEAR | STARTOFMONTH
    | STARTOFQUARTER | STARTOFYEAR | TOTALMTD | TOTALQTD
    | TOTALYTD ;

// Identifiers: could be a normal identifier or a bracketed reference like Table[Column]
// Table/column reference pattern: e.g. Sales[Amount], 'My Table'[Column], etc.
// This is simplified. Real usage might need more nuance for escaping, etc.
identifier
    : IDENTIFIER LBRACK IDENTIFIER RBRACK // Support for Table[Column]
    | SINGLE_QUOTED_IDENTIFIER LBRACK IDENTIFIER RBRACK  // Support for 'Table'[Column]
    | LBRACK IDENTIFIER RBRACK  // Support for [Measure]
    | IDENTIFIER
    ;

// ===================
// Lexer Rules
// ===================

// A single-quoted identifier that can contain spaces (or anything except a single quote).
SINGLE_QUOTED_IDENTIFIER
    : '\'' (~['\r\n]|'\'\'')* '\''
    ;

// OPERATORS

// Assigment
MEASURE_ASSIGNMENT :                    ':=';
EQUALS :                                '=';

// Arithmetic Operators
PLUS :                                  '+';
MINUS :                                 '-';
TIMES :                                 '*';
DIVIDE_OP :                                '/';
POWER_OP :                                 '^';

// Comparison Operators
ARE_EQUAL_OP :                             '==';
GREATER_THAN_EQUALS_OP :                   '>=';
LESS_THAN_EQUALS_OP :                      '<=';
NOT_EQUAL_OP :                             '<>';
GREATER_THAN_OP :                          '>';
LESS_THAN_OP :                             '<';

// Text Concatenation Operator
CONCATENATE_OP :                           '&';

// Logical Operators
LOGICAL_AND :                           '&&';
LOGICAL_OR:                             '||';
LOGICAL_IN:                             'IN';

// Parentheses
LPAREN :                                '(';
RPAREN :                                ')';
LCURLY :                                '{';
RCURLY :                                '}';
LBRACK :                                '[';
RBRACK :                                ']';

SINGLE_QUOTE :                                 '\'';

COMMA :                                 ',';
DOT :                                   '.';

// Enums
BOOLEAN :                               TRUE | FALSE;
ORDERING :                              ASC | DEC;

// --- Common DAX Keywords (case-insensitive) ---

APPROXIMATEDISTINCTCOUNT : [Aa] [Pp] [Pp] [Rr] [Oo] [Xx] [Ii] [Mm] [Aa] [Tt] [Ee] [Dd] [Ii] [Ss] [Tt] [Ii] [Nn] [Cc] [Tt] [Cc] [Oo] [Uu] [Nn] [Tt] ;
AVERAGE : [Aa] [Vv] [Ee] [Rr] [Aa] [Gg] [Ee] ;
AVERAGEA : [Aa] [Vv] [Ee] [Rr] [Aa] [Gg] [Ee] [Aa] ;
AVERAGEX : [Aa] [Vv] [Ee] [Rr] [Aa] [Gg] [Ee] [Xx] ;
COUNT : [Cc] [Oo] [Uu] [Nn] [Tt] ;
COUNTA : [Cc] [Oo] [Uu] [Nn] [Tt] [Aa] ;
COUNTAX : [Cc] [Oo] [Uu] [Nn] [Tt] [Aa] [Xx] ;
COUNTBLANK : [Cc] [Oo] [Uu] [Nn] [Tt] [Bb] [Ll] [Aa] [Nn] [Kk] ;
COUNTROWS : [Cc] [Oo] [Uu] [Nn] [Tt] [Rr] [Oo] [Ww] [Ss] ;
COUNTX : [Cc] [Oo] [Uu] [Nn] [Tt] [Xx] ;
DISTINCTCOUNT : [Dd] [Ii] [Ss] [Tt] [Ii] [Nn] [Cc] [Tt] [Cc] [Oo] [Uu] [Nn] [Tt] ;
DISTINCTCOUNTNOBLANK : [Dd] [Ii] [Ss] [Tt] [Ii] [Nn] [Cc] [Tt] [Cc] [Oo] [Uu] [Nn] [Tt] [Nn] [Oo] [Bb] [Ll] [Aa] [Nn] [Kk] ;
MAX : [Mm] [Aa] [Xx] ;
MAXA : [Mm] [Aa] [Xx] [Aa] ;
MAXX : [Mm] [Aa] [Xx] [Xx] ;
MIN : [Mm] [Ii] [Nn] ;
MINA : [Mm] [Ii] [Nn] [Aa] ;
MINX : [Mm] [Ii] [Nn] [Xx] ;
PRODUCT : [Pp] [Rr] [Oo] [Dd] [Uu] [Cc] [Tt] ;
PRODUCTX : [Pp] [Rr] [Oo] [Dd] [Uu] [Cc] [Tt] [Xx] ;
SUM : [Ss] [Uu] [Mm] ;
SUMX : [Ss] [Uu] [Mm] [Xx] ;
CALENDAR : [Cc] [Aa] [Ll] [Ee] [Nn] [Dd] [Aa] [Rr] ;
CALENDARAUTO : [Cc] [Aa] [Ll] [Ee] [Nn] [Dd] [Aa] [Rr] [Aa] [Uu] [Tt] [Oo] ;
DATE : [Dd] [Aa] [Tt] [Ee] ;
DATEDIFF : [Dd] [Aa] [Tt] [Ee] [Dd] [Ii] [Ff] [Ff] ;
DATEVALUE : [Dd] [Aa] [Tt] [Ee] [Vv] [Aa] [Ll] [Uu] [Ee] ;
DAY : [Dd] [Aa] [Yy] ;
EDATE : [Ee] [Dd] [Aa] [Tt] [Ee] ;
EOMONTH : [Ee] [Oo] [Mm] [Oo] [Nn] [Tt] [Hh] ;
HOUR : [Hh] [Oo] [Uu] [Rr] ;
MINUTE : [Mm] [Ii] [Nn] [Uu] [Tt] [Ee] ;
MONTH : [Mm] [Oo] [Nn] [Tt] [Hh] ;
NETWORKDAYS : [Nn] [Ee] [Tt] [Ww] [Oo] [Rr] [Kk] [Dd] [Aa] [Yy] [Ss] ;
NOW : [Nn] [Oo] [Ww] ;
QUARTER : [Qq] [Uu] [Aa] [Rr] [Tt] [Ee] [Rr] ;
SECOND : [Ss] [Ee] [Cc] [Oo] [Nn] [Dd] ;
TIME : [Tt] [Ii] [Mm] [Ee] ;
TIMEVALUE : [Tt] [Ii] [Mm] [Ee] [Vv] [Aa] [Ll] [Uu] [Ee] ;
TODAY : [Tt] [Oo] [Dd] [Aa] [Yy] ;
UTCNOW : [Uu] [Tt] [Cc] [Nn] [Oo] [Ww] ;
UTCTODAY : [Uu] [Tt] [Cc] [Tt] [Oo] [Dd] [Aa] [Yy] ;
WEEKDAY : [Ww] [Ee] [Ee] [Kk] [Dd] [Aa] [Yy] ;
WEEKNUM : [Ww] [Ee] [Ee] [Kk] [Nn] [Uu] [Mm] ;
YEAR : [Yy] [Ee] [Aa] [Rr] ;
YEARFRAC : [Yy] [Ee] [Aa] [Rr] [Ff] [Rr] [Aa] [Cc] ;
ALL : [Aa] [Ll] [Ll] ;
ALLCROSSFILTERED : [Aa] [Ll] [Ll] [Cc] [Rr] [Oo] [Ss] [Ss] [Ff] [Ii] [Ll] [Tt] [Ee] [Rr] [Ee] [Dd] ;
ALLEXCEPT : [Aa] [Ll] [Ll] [Ee] [Xx] [Cc] [Ee] [Pp] [Tt] ;
ALLNOBLANKROW : [Aa] [Ll] [Ll] [Nn] [Oo] [Bb] [Ll] [Aa] [Nn] [Kk] [Rr] [Oo] [Ww] ;
ALLSELECTED : [Aa] [Ll] [Ll] [Ss] [Ee] [Ll] [Ee] [Cc] [Tt] [Ee] [Dd] ;
CALCULATE : [Cc] [Aa] [Ll] [Cc] [Uu] [Ll] [Aa] [Tt] [Ee] ;
CALCULATETABLE : [Cc] [Aa] [Ll] [Cc] [Uu] [Ll] [Aa] [Tt] [Ee] [Tt] [Aa] [Bb] [Ll] [Ee] ;
EARLIER : [Ee] [Aa] [Rr] [Ll] [Ii] [Ee] [Rr] ;
EARLIEST : [Ee] [Aa] [Rr] [Ll] [Ii] [Ee] [Ss] [Tt] ;
FILTER : [Ff] [Ii] [Ll] [Tt] [Ee] [Rr] ;
FIRSTNONBLANK : [Ff] [Ii] [Rr] [Ss] [Tt] [Nn] [Oo] [Nn] [Bb] [Ll] [Aa] [Nn] [Kk] ;
FIRSTNONBLANKVALUE : [Ff] [Ii] [Rr] [Ss] [Tt] [Nn] [Oo] [Nn] [Bb] [Ll] [Aa] [Nn] [Kk] [Vv] [Aa] [Ll] [Uu] [Ee] ;
INDEX : [Ii] [Nn] [Dd] [Ee] [Xx] ;
KEEPFILTERS : [Kk] [Ee] [Ee] [Pp] [Ff] [Ii] [Ll] [Tt] [Ee] [Rr] [Ss] ;
LASTNONBLANK : [Ll] [Aa] [Ss] [Tt] [Nn] [Oo] [Nn] [Bb] [Ll] [Aa] [Nn] [Kk] ;
LASTNONBLANKVALUE : [Ll] [Aa] [Ss] [Tt] [Nn] [Oo] [Nn] [Bb] [Ll] [Aa] [Nn] [Kk] [Vv] [Aa] [Ll] [Uu] [Ee] ;
LOOKUPVALUE : [Ll] [Oo] [Oo] [Kk] [Uu] [Pp] [Vv] [Aa] [Ll] [Uu] [Ee] ;
MATCHBY : [Mm] [Aa] [Tt] [Cc] [Hh] [Bb] [Yy] ;
MOVINGAVERAGE : [Mm] [Oo] [Vv] [Ii] [Nn] [Gg] [Aa] [Vv] [Ee] [Rr] [Aa] [Gg] [Ee] ;
OFFSET : [Oo] [Ff] [Ff] [Ss] [Ee] [Tt] ;
ORDERBY : [Oo] [Rr] [Dd] [Ee] [Rr] [Bb] [Yy] ;
PARTITIONBY : [Pp] [Aa] [Rr] [Tt] [Ii] [Tt] [Ii] [Oo] [Nn] [Bb] [Yy] ;
RANGE : [Rr] [Aa] [Nn] [Gg] [Ee] ;
RANK : [Rr] [Aa] [Nn] [Kk] ;
REMOVEFILTERS : [Rr] [Ee] [Mm] [Oo] [Vv] [Ee] [Ff] [Ii] [Ll] [Tt] [Ee] [Rr] [Ss] ;
ROWNUMBER : [Rr] [Oo] [Ww] [Nn] [Uu] [Mm] [Bb] [Ee] [Rr] ;
RUNNINGSUM : [Rr] [Uu] [Nn] [Nn] [Ii] [Nn] [Gg] [Ss] [Uu] [Mm] ;
SELECTEDVALUE : [Ss] [Ee] [Ll] [Ee] [Cc] [Tt] [Ee] [Dd] [Vv] [Aa] [Ll] [Uu] [Ee] ;
WINDOW : [Ww] [Ii] [Nn] [Dd] [Oo] [Ww] ;
ACCRINT : [Aa] [Cc] [Cc] [Rr] [Ii] [Nn] [Tt] ;
ACCRINTM : [Aa] [Cc] [Cc] [Rr] [Ii] [Nn] [Tt] [Mm] ;
AMORDEGRC : [Aa] [Mm] [Oo] [Rr] [Dd] [Ee] [Gg] [Rr] [Cc] ;
AMORLINC : [Aa] [Mm] [Oo] [Rr] [Ll] [Ii] [Nn] [Cc] ;
COUPDAYBS : [Cc] [Oo] [Uu] [Pp] [Dd] [Aa] [Yy] [Bb] [Ss] ;
COUPDAYS : [Cc] [Oo] [Uu] [Pp] [Dd] [Aa] [Yy] [Ss] ;
COUPDAYSNC : [Cc] [Oo] [Uu] [Pp] [Dd] [Aa] [Yy] [Ss] [Nn] [Cc] ;
COUPNCD : [Cc] [Oo] [Uu] [Pp] [Nn] [Cc] [Dd] ;
COUPNUM : [Cc] [Oo] [Uu] [Pp] [Nn] [Uu] [Mm] ;
COUPPCD : [Cc] [Oo] [Uu] [Pp] [Pp] [Cc] [Dd] ;
CUMIPMT : [Cc] [Uu] [Mm] [Ii] [Pp] [Mm] [Tt] ;
CUMPRINC : [Cc] [Uu] [Mm] [Pp] [Rr] [Ii] [Nn] [Cc] ;
DB : [Dd] [Bb] ;
DDB : [Dd] [Dd] [Bb] ;
DISC : [Dd] [Ii] [Ss] [Cc] ;
DOLLARDE : [Dd] [Oo] [Ll] [Ll] [Aa] [Rr] [Dd] [Ee] ;
DOLLARFR : [Dd] [Oo] [Ll] [Ll] [Aa] [Rr] [Ff] [Rr] ;
DURATION : [Dd] [Uu] [Rr] [Aa] [Tt] [Ii] [Oo] [Nn] ;
EFFECT : [Ee] [Ff] [Ff] [Ee] [Cc] [Tt] ;
FV : [Ff] [Vv] ;
INTRATE : [Ii] [Nn] [Tt] [Rr] [Aa] [Tt] [Ee] ;
IPMT : [Ii] [Pp] [Mm] [Tt] ;
ISPMT : [Ii] [Ss] [Pp] [Mm] [Tt] ;
MDURATION : [Mm] [Dd] [Uu] [Rr] [Aa] [Tt] [Ii] [Oo] [Nn] ;
NOMINAL : [Nn] [Oo] [Mm] [Ii] [Nn] [Aa] [Ll] ;
NPER : [Nn] [Pp] [Ee] [Rr] ;
ODDFPRICE : [Oo] [Dd] [Dd] [Ff] [Pp] [Rr] [Ii] [Cc] [Ee] ;
ODDFYIELD : [Oo] [Dd] [Dd] [Ff] [Yy] [Ii] [Ee] [Ll] [Dd] ;
ODDLPRICE : [Oo] [Dd] [Dd] [Ll] [Pp] [Rr] [Ii] [Cc] [Ee] ;
ODDLYIELD : [Oo] [Dd] [Dd] [Ll] [Yy] [Ii] [Ee] [Ll] [Dd] ;
PDURATION : [Pp] [Dd] [Uu] [Rr] [Aa] [Tt] [Ii] [Oo] [Nn] ;
PMT : [Pp] [Mm] [Tt] ;
PPMT : [Pp] [Pp] [Mm] [Tt] ;
PRICE : [Pp] [Rr] [Ii] [Cc] [Ee] ;
PRICEDISC : [Pp] [Rr] [Ii] [Cc] [Ee] [Dd] [Ii] [Ss] [Cc] ;
PRICEMAT : [Pp] [Rr] [Ii] [Cc] [Ee] [Mm] [Aa] [Tt] ;
PV : [Pp] [Vv] ;
RATE : [Rr] [Aa] [Tt] [Ee] ;
RECEIVED : [Rr] [Ee] [Cc] [Ee] [Ii] [Vv] [Ee] [Dd] ;
RRI : [Rr] [Rr] [Ii] ;
SLN : [Ss] [Ll] [Nn] ;
SYD : [Ss] [Yy] [Dd] ;
TBILLEQ : [Tt] [Bb] [Ii] [Ll] [Ll] [Ee] [Qq] ;
TBILLPRICE : [Tt] [Bb] [Ii] [Ll] [Ll] [Pp] [Rr] [Ii] [Cc] [Ee] ;
TBILLYIELD : [Tt] [Bb] [Ii] [Ll] [Ll] [Yy] [Ii] [Ee] [Ll] [Dd] ;
VDB : [Vv] [Dd] [Bb] ;
XIRR : [Xx] [Ii] [Rr] [Rr] ;
XNPV : [Xx] [Nn] [Pp] [Vv] ;
YIELD : [Yy] [Ii] [Ee] [Ll] [Dd] ;
YIELDDISC : [Yy] [Ii] [Ee] [Ll] [Dd] [Dd] [Ii] [Ss] [Cc] ;
YIELDMAT : [Yy] [Ii] [Ee] [Ll] [Dd] [Mm] [Aa] [Tt] ;
COLUMNSTATISTICS : [Cc] [Oo] [Ll] [Uu] [Mm] [Nn] [Ss] [Tt] [Aa] [Tt] [Ii] [Ss] [Tt] [Ii] [Cc] [Ss] ;
CONTAINS : [Cc] [Oo] [Nn] [Tt] [Aa] [Ii] [Nn] [Ss] ;
CONTAINSROW : [Cc] [Oo] [Nn] [Tt] [Aa] [Ii] [Nn] [Ss] [Rr] [Oo] [Ww] ;
CONTAINSSTRING : [Cc] [Oo] [Nn] [Tt] [Aa] [Ii] [Nn] [Ss] [Ss] [Tt] [Rr] [Ii] [Nn] [Gg] ;
CONTAINSSTRINGEXACT : [Cc] [Oo] [Nn] [Tt] [Aa] [Ii] [Nn] [Ss] [Ss] [Tt] [Rr] [Ii] [Nn] [Gg] [Ee] [Xx] [Aa] [Cc] [Tt] ;
CUSTOMDATA : [Cc] [Uu] [Ss] [Tt] [Oo] [Mm] [Dd] [Aa] [Tt] [Aa] ;
HASONEFILTER : [Hh] [Aa] [Ss] [Oo] [Nn] [Ee] [Ff] [Ii] [Ll] [Tt] [Ee] [Rr] ;
HASONEVALUE : [Hh] [Aa] [Ss] [Oo] [Nn] [Ee] [Vv] [Aa] [Ll] [Uu] [Ee] ;
ISAFTER : [Ii] [Ss] [Aa] [Ff] [Tt] [Ee] [Rr] ;
ISBLANK : [Ii] [Ss] [Bb] [Ll] [Aa] [Nn] [Kk] ;
ISCROSSFILTERED : [Ii] [Ss] [Cc] [Rr] [Oo] [Ss] [Ss] [Ff] [Ii] [Ll] [Tt] [Ee] [Rr] [Ee] [Dd] ;
ISEMPTY : [Ii] [Ss] [Ee] [Mm] [Pp] [Tt] [Yy] ;
ISERROR : [Ii] [Ss] [Ee] [Rr] [Rr] [Oo] [Rr] ;
ISEVEN : [Ii] [Ss] [Ee] [Vv] [Ee] [Nn] ;
ISFILTERED : [Ii] [Ss] [Ff] [Ii] [Ll] [Tt] [Ee] [Rr] [Ee] [Dd] ;
ISINSCOPE : [Ii] [Ss] [Ii] [Nn] [Ss] [Cc] [Oo] [Pp] [Ee] ;
ISLOGICAL : [Ii] [Ss] [Ll] [Oo] [Gg] [Ii] [Cc] [Aa] [Ll] ;
ISNONTEXT : [Ii] [Ss] [Nn] [Oo] [Nn] [Tt] [Ee] [Xx] [Tt] ;
ISNUMBER : [Ii] [Ss] [Nn] [Uu] [Mm] [Bb] [Ee] [Rr] ;
ISODD : [Ii] [Ss] [Oo] [Dd] [Dd] ;
ISONORAFTER : [Ii] [Ss] [Oo] [Nn] [Oo] [Rr] [Aa] [Ff] [Tt] [Ee] [Rr] ;
ISSELECTEDMEASURE : [Ii] [Ss] [Ss] [Ee] [Ll] [Ee] [Cc] [Tt] [Ee] [Dd] [Mm] [Ee] [Aa] [Ss] [Uu] [Rr] [Ee] ;
ISSUBTOTAL : [Ii] [Ss] [Ss] [Uu] [Bb] [Tt] [Oo] [Tt] [Aa] [Ll] ;
ISTEXT : [Ii] [Ss] [Tt] [Ee] [Xx] [Tt] ;
NONVISUAL : [Nn] [Oo] [Nn] [Vv] [Ii] [Ss] [Uu] [Aa] [Ll] ;
SELECTEDMEASURE : [Ss] [Ee] [Ll] [Ee] [Cc] [Tt] [Ee] [Dd] [Mm] [Ee] [Aa] [Ss] [Uu] [Rr] [Ee] ;
SELECTEDMEASUREFORMATSTRING : [Ss] [Ee] [Ll] [Ee] [Cc] [Tt] [Ee] [Dd] [Mm] [Ee] [Aa] [Ss] [Uu] [Rr] [Ee] [Ff] [Oo] [Rr] [Mm] [Aa] [Tt] [Ss] [Tt] [Rr] [Ii] [Nn] [Gg] ;
SELECTEDMEASURENAME : [Ss] [Ee] [Ll] [Ee] [Cc] [Tt] [Ee] [Dd] [Mm] [Ee] [Aa] [Ss] [Uu] [Rr] [Ee] [Nn] [Aa] [Mm] [Ee] ;
USERCULTURE : [Uu] [Ss] [Ee] [Rr] [Cc] [Uu] [Ll] [Tt] [Uu] [Rr] [Ee] ;
USERNAME : [Uu] [Ss] [Ee] [Rr] [Nn] [Aa] [Mm] [Ee] ;
USEROBJECTID : [Uu] [Ss] [Ee] [Rr] [Oo] [Bb] [Jj] [Ee] [Cc] [Tt] [Ii] [Dd] ;
USERPRINCIPALNAME : [Uu] [Ss] [Ee] [Rr] [Pp] [Rr] [Ii] [Nn] [Cc] [Ii] [Pp] [Aa] [Ll] [Nn] [Aa] [Mm] [Ee] ;
AND : [Aa] [Nn] [Dd] ;
BITAND : [Bb] [Ii] [Tt] [Aa] [Nn] [Dd] ;
BITLSHIFT : [Bb] [Ii] [Tt] [Ll] [Ss] [Hh] [Ii] [Ff] [Tt] ;
BITOR : [Bb] [Ii] [Tt] [Oo] [Rr] ;
BITRSHIFT : [Bb] [Ii] [Tt] [Rr] [Ss] [Hh] [Ii] [Ff] [Tt] ;
BITXOR : [Bb] [Ii] [Tt] [Xx] [Oo] [Rr] ;
COALESCE : [Cc] [Oo] [Aa] [Ll] [Ee] [Ss] [Cc] [Ee] ;
FALSE : [Ff] [Aa] [Ll] [Ss] [Ee] ;
IF : [Ii] [Ff] ;
IFDOTEAGER : [Ii] [Ff] DOT [Ee] [Aa] [Gg] [Ee] [Rr] ;
IFERROR : [Ii] [Ff] [Ee] [Rr] [Rr] [Oo] [Rr] ;
NOT : [Nn] [Oo] [Tt] ;
OR : [Oo] [Rr] ;
SWITCH : [Ss] [Ww] [Ii] [Tt] [Cc] [Hh] ;
TRUE : [Tt] [Rr] [Uu] [Ee] ;
ABS : [Aa] [Bb] [Ss] ;
ACOS : [Aa] [Cc] [Oo] [Ss] ;
ACOSH : [Aa] [Cc] [Oo] [Ss] [Hh] ;
ACOT : [Aa] [Cc] [Oo] [Tt] ;
ACOTH : [Aa] [Cc] [Oo] [Tt] [Hh] ;
ASIN : [Aa] [Ss] [Ii] [Nn] ;
ASINH : [Aa] [Ss] [Ii] [Nn] [Hh] ;
ATAN : [Aa] [Tt] [Aa] [Nn] ;
ATANH : [Aa] [Tt] [Aa] [Nn] [Hh] ;
CEILING : [Cc] [Ee] [Ii] [Ll] [Ii] [Nn] [Gg] ;
CONVERT : [Cc] [Oo] [Nn] [Vv] [Ee] [Rr] [Tt] ;
COS : [Cc] [Oo] [Ss] ;
COSH : [Cc] [Oo] [Ss] [Hh] ;
COT : [Cc] [Oo] [Tt] ;
COTH : [Cc] [Oo] [Tt] [Hh] ;
CURRENCY : [Cc] [Uu] [Rr] [Rr] [Ee] [Nn] [Cc] [Yy] ;
DEGREES : [Dd] [Ee] [Gg] [Rr] [Ee] [Ee] [Ss] ;
DIVIDE : [Dd] [Ii] [Vv] [Ii] [Dd] [Ee] ;
EVEN : [Ee] [Vv] [Ee] [Nn] ;
EXP : [Ee] [Xx] [Pp] ;
FACT : [Ff] [Aa] [Cc] [Tt] ;
FLOOR : [Ff] [Ll] [Oo] [Oo] [Rr] ;
GCD : [Gg] [Cc] [Dd] ;
INT : [Ii] [Nn] [Tt] ;
ISODOTCEILING : [Ii] [Ss] [Oo] DOT [Cc] [Ee] [Ii] [Ll] [Ii] [Nn] [Gg] ;
LCM : [Ll] [Cc] [Mm] ;
LN : [Ll] [Nn] ;
LOG : [Ll] [Oo] [Gg] ;
LOG10 : [Ll] [Oo] [Gg] [1] [0] ;
MOD : [Mm] [Oo] [Dd] ;
MROUND : [Mm] [Rr] [Oo] [Uu] [Nn] [Dd] ;
ODD : [Oo] [Dd] [Dd] ;
PI : [Pp] [Ii] ;
POWER : [Pp] [Oo] [Ww] [Ee] [Rr] ;
QUOTIENT : [Qq] [Uu] [Oo] [Tt] [Ii] [Ee] [Nn] [Tt] ;
RADIANS : [Rr] [Aa] [Dd] [Ii] [Aa] [Nn] [Ss] ;
RAND : [Rr] [Aa] [Nn] [Dd] ;
RANDBETWEEN : [Rr] [Aa] [Nn] [Dd] [Bb] [Ee] [Tt] [Ww] [Ee] [Ee] [Nn] ;
ROUND : [Rr] [Oo] [Uu] [Nn] [Dd] ;
ROUNDDOWN : [Rr] [Oo] [Uu] [Nn] [Dd] [Dd] [Oo] [Ww] [Nn] ;
ROUNDUP : [Rr] [Oo] [Uu] [Nn] [Dd] [Uu] [Pp] ;
SIGN : [Ss] [Ii] [Gg] [Nn] ;
SIN : [Ss] [Ii] [Nn] ;
SINH : [Ss] [Ii] [Nn] [Hh] ;
SQRT : [Ss] [Qq] [Rr] [Tt] ;
SQRTPI : [Ss] [Qq] [Rr] [Tt] [Pp] [Ii] ;
TAN : [Tt] [Aa] [Nn] ;
TANH : [Tt] [Aa] [Nn] [Hh] ;
TRUNC : [Tt] [Rr] [Uu] [Nn] [Cc] ;
BLANK : [Bb] [Ll] [Aa] [Nn] [Kk] ;
ERROR : [Ee] [Rr] [Rr] [Oo] [Rr] ;
EVALUATEANDLOG : [Ee] [Vv] [Aa] [Ll] [Uu] [Aa] [Tt] [Ee] [Aa] [Nn] [Dd] [Ll] [Oo] [Gg] ;
TOCSV : [Tt] [Oo] [Cc] [Ss] [Vv] ;
TOJSON : [Tt] [Oo] [Jj] [Ss] [Oo] [Nn] ;
PATH : [Pp] [Aa] [Tt] [Hh] ;
PATHCONTAINS : [Pp] [Aa] [Tt] [Hh] [Cc] [Oo] [Nn] [Tt] [Aa] [Ii] [Nn] [Ss] ;
PATHITEM : [Pp] [Aa] [Tt] [Hh] [Ii] [Tt] [Ee] [Mm] ;
PATHITEMREVERSE : [Pp] [Aa] [Tt] [Hh] [Ii] [Tt] [Ee] [Mm] [Rr] [Ee] [Vv] [Ee] [Rr] [Ss] [Ee] ;
PATHLENGTH : [Pp] [Aa] [Tt] [Hh] [Ll] [Ee] [Nn] [Gg] [Tt] [Hh] ;
CROSSFILTER : [Cc] [Rr] [Oo] [Ss] [Ss] [Ff] [Ii] [Ll] [Tt] [Ee] [Rr] ;
RELATED : [Rr] [Ee] [Ll] [Aa] [Tt] [Ee] [Dd] ;
RELATEDTABLE : [Rr] [Ee] [Ll] [Aa] [Tt] [Ee] [Dd] [Tt] [Aa] [Bb] [Ll] [Ee] ;
USERELATIONSHIP : [Uu] [Ss] [Ee] [Rr] [Ee] [Ll] [Aa] [Tt] [Ii] [Oo] [Nn] [Ss] [Hh] [Ii] [Pp] ;
BETADOTDIST : [Bb] [Ee] [Tt] [Aa] DOT [Dd] [Ii] [Ss] [Tt] ;
BETADOTINV : [Bb] [Ee] [Tt] [Aa] DOT [Ii] [Nn] [Vv] ;
CHISQDOTDIST : [Cc] [Hh] [Ii] [Ss] [Qq] DOT [Dd] [Ii] [Ss] [Tt] ;
CHISQDOTDISTDOTRT : [Cc] [Hh] [Ii] [Ss] [Qq] DOT [Dd] [Ii] [Ss] [Tt] DOT [Rr] [Tt] ;
CHISQDOTINV : [Cc] [Hh] [Ii] [Ss] [Qq] DOT [Ii] [Nn] [Vv] ;
CHISQDOTINVDOTRT : [Cc] [Hh] [Ii] [Ss] [Qq] DOT [Ii] [Nn] [Vv] DOT [Rr] [Tt] ;
COMBIN : [Cc] [Oo] [Mm] [Bb] [Ii] [Nn] ;
COMBINA : [Cc] [Oo] [Mm] [Bb] [Ii] [Nn] [Aa] ;
CONFIDENCEDOTNORM : [Cc] [Oo] [Nn] [Ff] [Ii] [Dd] [Ee] [Nn] [Cc] [Ee] DOT [Nn] [Oo] [Rr] [Mm] ;
CONFIDENCEDOTT : [Cc] [Oo] [Nn] [Ff] [Ii] [Dd] [Ee] [Nn] [Cc] [Ee] DOT [Tt] ;
EXPONDOTDIST : [Ee] [Xx] [Pp] [Oo] [Nn] DOT [Dd] [Ii] [Ss] [Tt] ;
GEOMEAN : [Gg] [Ee] [Oo] [Mm] [Ee] [Aa] [Nn] ;
GEOMEANX : [Gg] [Ee] [Oo] [Mm] [Ee] [Aa] [Nn] [Xx] ;
LINEST : [Ll] [Ii] [Nn] [Ee] [Ss] [Tt] ;
LINESTX : [Ll] [Ii] [Nn] [Ee] [Ss] [Tt] [Xx] ;
MEDIAN : [Mm] [Ee] [Dd] [Ii] [Aa] [Nn] ;
MEDIANX : [Mm] [Ee] [Dd] [Ii] [Aa] [Nn] [Xx] ;
NORMDOTDIST : [Nn] [Oo] [Rr] [Mm] DOT [Dd] [Ii] [Ss] [Tt] ;
NORMDOTINV : [Nn] [Oo] [Rr] [Mm] DOT [Ii] [Nn] [Vv] ;
NORMDOTSDOTDIST : [Nn] [Oo] [Rr] [Mm] DOT [Ss] DOT [Dd] [Ii] [Ss] [Tt] ;
NORMDOTSDOTINV : [Nn] [Oo] [Rr] [Mm] DOT [Ss] DOT [Ii] [Nn] [Vv] ;
PERCENTILEDOTEXC : [Pp] [Ee] [Rr] [Cc] [Ee] [Nn] [Tt] [Ii] [Ll] [Ee] DOT [Ee] [Xx] [Cc] ;
PERCENTILEDOTINC : [Pp] [Ee] [Rr] [Cc] [Ee] [Nn] [Tt] [Ii] [Ll] [Ee] DOT [Ii] [Nn] [Cc] ;
PERCENTILEXDOTEXC : [Pp] [Ee] [Rr] [Cc] [Ee] [Nn] [Tt] [Ii] [Ll] [Ee] [Xx] DOT [Ee] [Xx] [Cc] ;
PERCENTILEXDOTINC : [Pp] [Ee] [Rr] [Cc] [Ee] [Nn] [Tt] [Ii] [Ll] [Ee] [Xx] DOT [Ii] [Nn] [Cc] ;
PERMUT : [Pp] [Ee] [Rr] [Mm] [Uu] [Tt] ;
POISSONDOTDIST : [Pp] [Oo] [Ii] [Ss] [Ss] [Oo] [Nn] DOT [Dd] [Ii] [Ss] [Tt] ;
RANKDOTEQ : [Rr] [Aa] [Nn] [Kk] DOT [Ee] [Qq] ;
RANKX : [Rr] [Aa] [Nn] [Kk] [Xx] ;
SAMPLE : [Ss] [Aa] [Mm] [Pp] [Ll] [Ee] ;
SAMPLECARTESIANPOINTSBYCOVER : [Ss] [Aa] [Mm] [Pp] [Ll] [Ee] [Cc] [Aa] [Rr] [Tt] [Ee] [Ss] [Ii] [Aa] [Nn] [Pp] [Oo] [Ii] [Nn] [Tt] [Ss] [Bb] [Yy] [Cc] [Oo] [Vv] [Ee] [Rr] ;
STDEVDOTS : [Ss] [Tt] [Dd] [Ee] [Vv] DOT [Ss] ;
STDEVDOTP : [Ss] [Tt] [Dd] [Ee] [Vv] DOT [Pp] ;
STDEVXDOTS : [Ss] [Tt] [Dd] [Ee] [Vv] [Xx] DOT [Ss] ;
STDEVXDOTP : [Ss] [Tt] [Dd] [Ee] [Vv] [Xx] DOT [Pp] ;
TDOTDIST : [Tt] DOT [Dd] [Ii] [Ss] [Tt] ;
TDOTDISTDOT2T : [Tt] DOT [Dd] [Ii] [Ss] [Tt] DOT [2] [Tt] ;
TDOTDISTDOTRT : [Tt] DOT [Dd] [Ii] [Ss] [Tt] DOT [Rr] [Tt] ;
TDOTINV : [Tt] DOT [Ii] [Nn] [Vv] ;
TDOTINVDOT2T : [Tt] DOT [Ii] [Nn] [Vv] DOT [2] [Tt] ;
VARDOTS : [Vv] [Aa] [Rr] DOT [Ss] ;
VARDOTP : [Vv] [Aa] [Rr] DOT [Pp] ;
VARXDOTS : [Vv] [Aa] [Rr] [Xx] DOT [Ss] ;
VARXDOTP : [Vv] [Aa] [Rr] [Xx] DOT [Pp] ;
ADDCOLUMNS : [Aa] [Dd] [Dd] [Cc] [Oo] [Ll] [Uu] [Mm] [Nn] [Ss] ;
ADDMISSINGITEMS : [Aa] [Dd] [Dd] [Mm] [Ii] [Ss] [Ss] [Ii] [Nn] [Gg] [Ii] [Tt] [Ee] [Mm] [Ss] ;
CROSSJOIN : [Cc] [Rr] [Oo] [Ss] [Ss] [Jj] [Oo] [Ii] [Nn] ;
CURRENTGROUP : [Cc] [Uu] [Rr] [Rr] [Ee] [Nn] [Tt] [Gg] [Rr] [Oo] [Uu] [Pp] ;
DATATABLE : [Dd] [Aa] [Tt] [Aa] [Tt] [Aa] [Bb] [Ll] [Ee] ;
DETAILROWS : [Dd] [Ee] [Tt] [Aa] [Ii] [Ll] [Rr] [Oo] [Ww] [Ss] ;
DISTINCT : [Dd] [Ii] [Ss] [Tt] [Ii] [Nn] [Cc] [Tt] ;
EXCEPT : [Ee] [Xx] [Cc] [Ee] [Pp] [Tt] ;
FILTERS : [Ff] [Ii] [Ll] [Tt] [Ee] [Rr] [Ss] ;
GENERATE : [Gg] [Ee] [Nn] [Ee] [Rr] [Aa] [Tt] [Ee] ;
GENERATEALL : [Gg] [Ee] [Nn] [Ee] [Rr] [Aa] [Tt] [Ee] [Aa] [Ll] [Ll] ;
GENERATESERIES : [Gg] [Ee] [Nn] [Ee] [Rr] [Aa] [Tt] [Ee] [Ss] [Ee] [Rr] [Ii] [Ee] [Ss] ;
GROUPBY : [Gg] [Rr] [Oo] [Uu] [Pp] [Bb] [Yy] ;
IGNORE : [Ii] [Gg] [Nn] [Oo] [Rr] [Ee] ;
INTERSECT : [Ii] [Nn] [Tt] [Ee] [Rr] [Ss] [Ee] [Cc] [Tt] ;
NATURALINNERJOIN : [Nn] [Aa] [Tt] [Uu] [Rr] [Aa] [Ll] [Ii] [Nn] [Nn] [Ee] [Rr] [Jj] [Oo] [Ii] [Nn] ;
NATURALLEFTOUTERJOIN : [Nn] [Aa] [Tt] [Uu] [Rr] [Aa] [Ll] [Ll] [Ee] [Ff] [Tt] [Oo] [Uu] [Tt] [Ee] [Rr] [Jj] [Oo] [Ii] [Nn] ;
ROLLUP : [Rr] [Oo] [Ll] [Ll] [Uu] [Pp] ;
ROLLUPADDISSUBTOTAL : [Rr] [Oo] [Ll] [Ll] [Uu] [Pp] [Aa] [Dd] [Dd] [Ii] [Ss] [Ss] [Uu] [Bb] [Tt] [Oo] [Tt] [Aa] [Ll] ;
ROLLUPGROUP : [Rr] [Oo] [Ll] [Ll] [Uu] [Pp] [Gg] [Rr] [Oo] [Uu] [Pp] ;
ROLLUPISSUBTOTAL : [Rr] [Oo] [Ll] [Ll] [Uu] [Pp] [Ii] [Ss] [Ss] [Uu] [Bb] [Tt] [Oo] [Tt] [Aa] [Ll] ;
ROW : [Rr] [Oo] [Ww] ;
SELECTCOLUMNS : [Ss] [Ee] [Ll] [Ee] [Cc] [Tt] [Cc] [Oo] [Ll] [Uu] [Mm] [Nn] [Ss] ;
SUBSTITUTEWITHINDEX : [Ss] [Uu] [Bb] [Ss] [Tt] [Ii] [Tt] [Uu] [Tt] [Ee] [Ww] [Ii] [Tt] [Hh] [Ii] [Nn] [Dd] [Ee] [Xx] ;
SUMMARIZE : [Ss] [Uu] [Mm] [Mm] [Aa] [Rr] [Ii] [Zz] [Ee] ;
SUMMARIZECOLUMNS : [Ss] [Uu] [Mm] [Mm] [Aa] [Rr] [Ii] [Zz] [Ee] [Cc] [Oo] [Ll] [Uu] [Mm] [Nn] [Ss] ;
TOPN : [Tt] [Oo] [Pp] [Nn] ;
TREATAS : [Tt] [Rr] [Ee] [Aa] [Tt] [Aa] [Ss] ;
UNION : [Uu] [Nn] [Ii] [Oo] [Nn] ;
VALUES : [Vv] [Aa] [Ll] [Uu] [Ee] [Ss] ;
COMBINEVALUES : [Cc] [Oo] [Mm] [Bb] [Ii] [Nn] [Ee] [Vv] [Aa] [Ll] [Uu] [Ee] [Ss] ;
CONCATENATE : [Cc] [Oo] [Nn] [Cc] [Aa] [Tt] [Ee] [Nn] [Aa] [Tt] [Ee] ;
CONCATENATEX : [Cc] [Oo] [Nn] [Cc] [Aa] [Tt] [Ee] [Nn] [Aa] [Tt] [Ee] [Xx] ;
EXACT : [Ee] [Xx] [Aa] [Cc] [Tt] ;
FIND : [Ff] [Ii] [Nn] [Dd] ;
FIXED : [Ff] [Ii] [Xx] [Ee] [Dd] ;
FORMAT : [Ff] [Oo] [Rr] [Mm] [Aa] [Tt] ;
LEFT : [Ll] [Ee] [Ff] [Tt] ;
LEN : [Ll] [Ee] [Nn] ;
LOWER : [Ll] [Oo] [Ww] [Ee] [Rr] ;
MID : [Mm] [Ii] [Dd] ;
REPLACE : [Rr] [Ee] [Pp] [Ll] [Aa] [Cc] [Ee] ;
REPT : [Rr] [Ee] [Pp] [Tt] ;
RIGHT : [Rr] [Ii] [Gg] [Hh] [Tt] ;
SEARCH : [Ss] [Ee] [Aa] [Rr] [Cc] [Hh] ;
SUBSTITUTE : [Ss] [Uu] [Bb] [Ss] [Tt] [Ii] [Tt] [Uu] [Tt] [Ee] ;
TRIM : [Tt] [Rr] [Ii] [Mm] ;
UNICHAR : [Uu] [Nn] [Ii] [Cc] [Hh] [Aa] [Rr] ;
UNICODE : [Uu] [Nn] [Ii] [Cc] [Oo] [Dd] [Ee] ;
UPPER : [Uu] [Pp] [Pp] [Ee] [Rr] ;
VALUE : [Vv] [Aa] [Ll] [Uu] [Ee] ;
CLOSINGBALANCEMONTH : [Cc] [Ll] [Oo] [Ss] [Ii] [Nn] [Gg] [Bb] [Aa] [Ll] [Aa] [Nn] [Cc] [Ee] [Mm] [Oo] [Nn] [Tt] [Hh] ;
CLOSINGBALANCEQUARTER : [Cc] [Ll] [Oo] [Ss] [Ii] [Nn] [Gg] [Bb] [Aa] [Ll] [Aa] [Nn] [Cc] [Ee] [Qq] [Uu] [Aa] [Rr] [Tt] [Ee] [Rr] ;
CLOSINGBALANCEYEAR : [Cc] [Ll] [Oo] [Ss] [Ii] [Nn] [Gg] [Bb] [Aa] [Ll] [Aa] [Nn] [Cc] [Ee] [Yy] [Ee] [Aa] [Rr] ;
DATEADD : [Dd] [Aa] [Tt] [Ee] [Aa] [Dd] [Dd] ;
DATESBETWEEN : [Dd] [Aa] [Tt] [Ee] [Ss] [Bb] [Ee] [Tt] [Ww] [Ee] [Ee] [Nn] ;
DATESINPERIOD : [Dd] [Aa] [Tt] [Ee] [Ss] [Ii] [Nn] [Pp] [Ee] [Rr] [Ii] [Oo] [Dd] ;
DATESMTD : [Dd] [Aa] [Tt] [Ee] [Ss] [Mm] [Tt] [Dd] ;
DATESQTD : [Dd] [Aa] [Tt] [Ee] [Ss] [Qq] [Tt] [Dd] ;
DATESYTD : [Dd] [Aa] [Tt] [Ee] [Ss] [Yy] [Tt] [Dd] ;
ENDOFMONTH : [Ee] [Nn] [Dd] [Oo] [Ff] [Mm] [Oo] [Nn] [Tt] [Hh] ;
ENDOFQUARTER : [Ee] [Nn] [Dd] [Oo] [Ff] [Qq] [Uu] [Aa] [Rr] [Tt] [Ee] [Rr] ;
ENDOFYEAR : [Ee] [Nn] [Dd] [Oo] [Ff] [Yy] [Ee] [Aa] [Rr] ;
FIRSTDATE : [Ff] [Ii] [Rr] [Ss] [Tt] [Dd] [Aa] [Tt] [Ee] ;
LASTDATE : [Ll] [Aa] [Ss] [Tt] [Dd] [Aa] [Tt] [Ee] ;
NEXTDAY : [Nn] [Ee] [Xx] [Tt] [Dd] [Aa] [Yy] ;
NEXTMONTH : [Nn] [Ee] [Xx] [Tt] [Mm] [Oo] [Nn] [Tt] [Hh] ;
NEXTQUARTER : [Nn] [Ee] [Xx] [Tt] [Qq] [Uu] [Aa] [Rr] [Tt] [Ee] [Rr] ;
NEXTYEAR : [Nn] [Ee] [Xx] [Tt] [Yy] [Ee] [Aa] [Rr] ;
OPENINGBALANCEMONTH : [Oo] [Pp] [Ee] [Nn] [Ii] [Nn] [Gg] [Bb] [Aa] [Ll] [Aa] [Nn] [Cc] [Ee] [Mm] [Oo] [Nn] [Tt] [Hh] ;
OPENINGBALANCEQUARTER : [Oo] [Pp] [Ee] [Nn] [Ii] [Nn] [Gg] [Bb] [Aa] [Ll] [Aa] [Nn] [Cc] [Ee] [Qq] [Uu] [Aa] [Rr] [Tt] [Ee] [Rr] ;
OPENINGBALANCEYEAR : [Oo] [Pp] [Ee] [Nn] [Ii] [Nn] [Gg] [Bb] [Aa] [Ll] [Aa] [Nn] [Cc] [Ee] [Yy] [Ee] [Aa] [Rr] ;
PARALLELPERIOD : [Pp] [Aa] [Rr] [Aa] [Ll] [Ll] [Ee] [Ll] [Pp] [Ee] [Rr] [Ii] [Oo] [Dd] ;
PREVIOUSDAY : [Pp] [Rr] [Ee] [Vv] [Ii] [Oo] [Uu] [Ss] [Dd] [Aa] [Yy] ;
PREVIOUSMONTH : [Pp] [Rr] [Ee] [Vv] [Ii] [Oo] [Uu] [Ss] [Mm] [Oo] [Nn] [Tt] [Hh] ;
PREVIOUSQUARTER : [Pp] [Rr] [Ee] [Vv] [Ii] [Oo] [Uu] [Ss] [Qq] [Uu] [Aa] [Rr] [Tt] [Ee] [Rr] ;
PREVIOUSYEAR : [Pp] [Rr] [Ee] [Vv] [Ii] [Oo] [Uu] [Ss] [Yy] [Ee] [Aa] [Rr] ;
SAMEPERIODLASTYEAR : [Ss] [Aa] [Mm] [Ee] [Pp] [Ee] [Rr] [Ii] [Oo] [Dd] [Ll] [Aa] [Ss] [Tt] [Yy] [Ee] [Aa] [Rr] ;
STARTOFMONTH : [Ss] [Tt] [Aa] [Rr] [Tt] [Oo] [Ff] [Mm] [Oo] [Nn] [Tt] [Hh] ;
STARTOFQUARTER : [Ss] [Tt] [Aa] [Rr] [Tt] [Oo] [Ff] [Qq] [Uu] [Aa] [Rr] [Tt] [Ee] [Rr] ;
STARTOFYEAR : [Ss] [Tt] [Aa] [Rr] [Tt] [Oo] [Ff] [Yy] [Ee] [Aa] [Rr] ;
TOTALMTD : [Tt] [Oo] [Tt] [Aa] [Ll] [Mm] [Tt] [Dd] ;
TOTALQTD : [Tt] [Oo] [Tt] [Aa] [Ll] [Qq] [Tt] [Dd] ;
TOTALYTD : [Tt] [Oo] [Tt] [Aa] [Ll] [Yy] [Tt] [Dd] ;

// ===================
// Reserved words
// ===================

COLUMN : [Cc] [Oo] [Ll] [Uu] [Mm] [Nn] ;
DEFINE : [Dd] [Ee] [Ff] [Ii] [Nn] [Ee] ;
EVALUATE : [Ee] [Vv] [Aa] [Ll] [Uu] [Aa] [Tt] [Ee] ;
MEASURE : [Mm] [Ee] [Aa] [Ss] [Uu] [Rr] [Ee] ;
MPARAMETER : [Mm] [Pp] [Aa] [Rr] [Aa] [Mm] [Ee] [Tt] [Ee] [Rr] ;
ORDER_BY : [Oo] [Rr] [Dd] [Ee] [Rr] WS [Bb] [Yy] ;
RETURN : [Rr] [Ee] [Tt] [Uu] [Rr] [Nn] ;
START_AT : [Ss] [Tt] [Aa] [Rr] [Tt] WS [Aa] [Tt] ;
TABLE : [Tt] [Aa] [Bb] [Ll] [Ee] ;

VAR : [Vv] [Aa] [Rr] ;


// ===================
// Other tokens
// ===================

// Fragments for reuse
DIGIT : [0-9] ;

// Generic identifier. Must come AFTER keywords so it doesn't catch them.
IDENTIFIER
    : [a-zA-Z_] [a-zA-Z0-9_]*
    ;

// Numeric literal (simplified).
numericLiteral
    : DIGIT+ ( '.' DIGIT+ )?
    ;

// Simple string literal in double quotes
stringLiteral
    : '"' ( ~'"' | '""' )* '"'
    ;

// Enum Definitions
ASC :                                   [Aa] [Ss] [Cc];
DEC :                                   [Dd] [Ee] [Cc];

// Whitespace
WS : [ \t\r\n]+ -> skip ;