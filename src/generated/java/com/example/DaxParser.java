// Generated from Dax.g4 by ANTLR 4.5

    package com.example;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DaxParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, SINGLE_QUOTED_IDENTIFIER=3, MEASURE_ASSIGNMENT=4, EQUALS=5, 
		PLUS=6, MINUS=7, TIMES=8, DIVIDE_OP=9, POWER_OP=10, ARE_EQUAL_OP=11, GREATER_THAN_EQUALS_OP=12, 
		LESS_THAN_EQUALS_OP=13, NOT_EQUAL_OP=14, GREATER_THAN_OP=15, LESS_THAN_OP=16, 
		CONCATENATE_OP=17, LOGICAL_AND=18, LOGICAL_OR=19, LOGICAL_IN=20, LPAREN=21, 
		RPAREN=22, LCURLY=23, RCURLY=24, LBRACK=25, RBRACK=26, SINGLE_QUOTE=27, 
		COMMA=28, DOT=29, BOOLEAN=30, ORDERING=31, APPROXIMATEDISTINCTCOUNT=32, 
		AVERAGE=33, AVERAGEA=34, AVERAGEX=35, COUNT=36, COUNTA=37, COUNTAX=38, 
		COUNTBLANK=39, COUNTROWS=40, COUNTX=41, DISTINCTCOUNT=42, DISTINCTCOUNTNOBLANK=43, 
		MAX=44, MAXA=45, MAXX=46, MIN=47, MINA=48, MINX=49, PRODUCT=50, PRODUCTX=51, 
		SUM=52, SUMX=53, CALENDAR=54, CALENDARAUTO=55, DATE=56, DATEDIFF=57, DATEVALUE=58, 
		DAY=59, EDATE=60, EOMONTH=61, HOUR=62, MINUTE=63, MONTH=64, NETWORKDAYS=65, 
		NOW=66, QUARTER=67, SECOND=68, TIME=69, TIMEVALUE=70, TODAY=71, UTCNOW=72, 
		UTCTODAY=73, WEEKDAY=74, WEEKNUM=75, YEAR=76, YEARFRAC=77, ALL=78, ALLCROSSFILTERED=79, 
		ALLEXCEPT=80, ALLNOBLANKROW=81, ALLSELECTED=82, CALCULATE=83, CALCULATETABLE=84, 
		EARLIER=85, EARLIEST=86, FILTER=87, FIRSTNONBLANK=88, FIRSTNONBLANKVALUE=89, 
		INDEX=90, KEEPFILTERS=91, LASTNONBLANK=92, LASTNONBLANKVALUE=93, LOOKUPVALUE=94, 
		MATCHBY=95, MOVINGAVERAGE=96, OFFSET=97, ORDERBY=98, PARTITIONBY=99, RANGE=100, 
		RANK=101, REMOVEFILTERS=102, ROWNUMBER=103, RUNNINGSUM=104, SELECTEDVALUE=105, 
		WINDOW=106, ACCRINT=107, ACCRINTM=108, AMORDEGRC=109, AMORLINC=110, COUPDAYBS=111, 
		COUPDAYS=112, COUPDAYSNC=113, COUPNCD=114, COUPNUM=115, COUPPCD=116, CUMIPMT=117, 
		CUMPRINC=118, DB=119, DDB=120, DISC=121, DOLLARDE=122, DOLLARFR=123, DURATION=124, 
		EFFECT=125, FV=126, INTRATE=127, IPMT=128, ISPMT=129, MDURATION=130, NOMINAL=131, 
		NPER=132, ODDFPRICE=133, ODDFYIELD=134, ODDLPRICE=135, ODDLYIELD=136, 
		PDURATION=137, PMT=138, PPMT=139, PRICE=140, PRICEDISC=141, PRICEMAT=142, 
		PV=143, RATE=144, RECEIVED=145, RRI=146, SLN=147, SYD=148, TBILLEQ=149, 
		TBILLPRICE=150, TBILLYIELD=151, VDB=152, XIRR=153, XNPV=154, YIELD=155, 
		YIELDDISC=156, YIELDMAT=157, COLUMNSTATISTICS=158, CONTAINS=159, CONTAINSROW=160, 
		CONTAINSSTRING=161, CONTAINSSTRINGEXACT=162, CUSTOMDATA=163, HASONEFILTER=164, 
		HASONEVALUE=165, ISAFTER=166, ISBLANK=167, ISCROSSFILTERED=168, ISEMPTY=169, 
		ISERROR=170, ISEVEN=171, ISFILTERED=172, ISINSCOPE=173, ISLOGICAL=174, 
		ISNONTEXT=175, ISNUMBER=176, ISODD=177, ISONORAFTER=178, ISSELECTEDMEASURE=179, 
		ISSUBTOTAL=180, ISTEXT=181, NONVISUAL=182, SELECTEDMEASURE=183, SELECTEDMEASUREFORMATSTRING=184, 
		SELECTEDMEASURENAME=185, USERCULTURE=186, USERNAME=187, USEROBJECTID=188, 
		USERPRINCIPALNAME=189, AND=190, BITAND=191, BITLSHIFT=192, BITOR=193, 
		BITRSHIFT=194, BITXOR=195, COALESCE=196, FALSE=197, IF=198, IFDOTEAGER=199, 
		IFERROR=200, NOT=201, OR=202, SWITCH=203, TRUE=204, ABS=205, ACOS=206, 
		ACOSH=207, ACOT=208, ACOTH=209, ASIN=210, ASINH=211, ATAN=212, ATANH=213, 
		CEILING=214, CONVERT=215, COS=216, COSH=217, COT=218, COTH=219, CURRENCY=220, 
		DEGREES=221, DIVIDE=222, EVEN=223, EXP=224, FACT=225, FLOOR=226, GCD=227, 
		INT=228, ISODOTCEILING=229, LCM=230, LN=231, LOG=232, LOG10=233, MOD=234, 
		MROUND=235, ODD=236, PI=237, POWER=238, QUOTIENT=239, RADIANS=240, RAND=241, 
		RANDBETWEEN=242, ROUND=243, ROUNDDOWN=244, ROUNDUP=245, SIGN=246, SIN=247, 
		SINH=248, SQRT=249, SQRTPI=250, TAN=251, TANH=252, TRUNC=253, BLANK=254, 
		ERROR=255, EVALUATEANDLOG=256, TOCSV=257, TOJSON=258, PATH=259, PATHCONTAINS=260, 
		PATHITEM=261, PATHITEMREVERSE=262, PATHLENGTH=263, CROSSFILTER=264, RELATED=265, 
		RELATEDTABLE=266, USERELATIONSHIP=267, BETADOTDIST=268, BETADOTINV=269, 
		CHISQDOTDIST=270, CHISQDOTDISTDOTRT=271, CHISQDOTINV=272, CHISQDOTINVDOTRT=273, 
		COMBIN=274, COMBINA=275, CONFIDENCEDOTNORM=276, CONFIDENCEDOTT=277, EXPONDOTDIST=278, 
		GEOMEAN=279, GEOMEANX=280, LINEST=281, LINESTX=282, MEDIAN=283, MEDIANX=284, 
		NORMDOTDIST=285, NORMDOTINV=286, NORMDOTSDOTDIST=287, NORMDOTSDOTINV=288, 
		PERCENTILEDOTEXC=289, PERCENTILEDOTINC=290, PERCENTILEXDOTEXC=291, PERCENTILEXDOTINC=292, 
		PERMUT=293, POISSONDOTDIST=294, RANKDOTEQ=295, RANKX=296, SAMPLE=297, 
		SAMPLECARTESIANPOINTSBYCOVER=298, STDEVDOTS=299, STDEVDOTP=300, STDEVXDOTS=301, 
		STDEVXDOTP=302, TDOTDIST=303, TDOTDISTDOT2T=304, TDOTDISTDOTRT=305, TDOTINV=306, 
		TDOTINVDOT2T=307, VARDOTS=308, VARDOTP=309, VARXDOTS=310, VARXDOTP=311, 
		ADDCOLUMNS=312, ADDMISSINGITEMS=313, CROSSJOIN=314, CURRENTGROUP=315, 
		DATATABLE=316, DETAILROWS=317, DISTINCT=318, EXCEPT=319, FILTERS=320, 
		GENERATE=321, GENERATEALL=322, GENERATESERIES=323, GROUPBY=324, IGNORE=325, 
		INTERSECT=326, NATURALINNERJOIN=327, NATURALLEFTOUTERJOIN=328, ROLLUP=329, 
		ROLLUPADDISSUBTOTAL=330, ROLLUPGROUP=331, ROLLUPISSUBTOTAL=332, ROW=333, 
		SELECTCOLUMNS=334, SUBSTITUTEWITHINDEX=335, SUMMARIZE=336, SUMMARIZECOLUMNS=337, 
		TOPN=338, TREATAS=339, UNION=340, VALUES=341, COMBINEVALUES=342, CONCATENATE=343, 
		CONCATENATEX=344, EXACT=345, FIND=346, FIXED=347, FORMAT=348, LEFT=349, 
		LEN=350, LOWER=351, MID=352, REPLACE=353, REPT=354, RIGHT=355, SEARCH=356, 
		SUBSTITUTE=357, TRIM=358, UNICHAR=359, UNICODE=360, UPPER=361, VALUE=362, 
		CLOSINGBALANCEMONTH=363, CLOSINGBALANCEQUARTER=364, CLOSINGBALANCEYEAR=365, 
		DATEADD=366, DATESBETWEEN=367, DATESINPERIOD=368, DATESMTD=369, DATESQTD=370, 
		DATESYTD=371, ENDOFMONTH=372, ENDOFQUARTER=373, ENDOFYEAR=374, FIRSTDATE=375, 
		LASTDATE=376, NEXTDAY=377, NEXTMONTH=378, NEXTQUARTER=379, NEXTYEAR=380, 
		OPENINGBALANCEMONTH=381, OPENINGBALANCEQUARTER=382, OPENINGBALANCEYEAR=383, 
		PARALLELPERIOD=384, PREVIOUSDAY=385, PREVIOUSMONTH=386, PREVIOUSQUARTER=387, 
		PREVIOUSYEAR=388, SAMEPERIODLASTYEAR=389, STARTOFMONTH=390, STARTOFQUARTER=391, 
		STARTOFYEAR=392, TOTALMTD=393, TOTALQTD=394, TOTALYTD=395, COLUMN=396, 
		DEFINE=397, EVALUATE=398, MEASURE=399, MPARAMETER=400, ORDER_BY=401, RETURN=402, 
		START_AT=403, TABLE=404, VAR=405, DIGIT=406, IDENTIFIER=407, ASC=408, 
		DEC=409, WS=410;
	public static final int
		RULE_daxExpression = 0, RULE_measureAssignment = 1, RULE_daxStatement = 2, 
		RULE_evaluateBlock = 3, RULE_varDeclaration = 4, RULE_returnStatement = 5, 
		RULE_expression = 6, RULE_parenthesizedExpression = 7, RULE_functionCall = 8, 
		RULE_argumentList = 9, RULE_operator = 10, RULE_daxFunction = 11, RULE_identifier = 12, 
		RULE_numericLiteral = 13, RULE_stringLiteral = 14;
	public static final String[] ruleNames = {
		"daxExpression", "measureAssignment", "daxStatement", "evaluateBlock", 
		"varDeclaration", "returnStatement", "expression", "parenthesizedExpression", 
		"functionCall", "argumentList", "operator", "daxFunction", "identifier", 
		"numericLiteral", "stringLiteral"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'\"'", "'\"\"'", null, "':='", "'='", "'+'", "'-'", "'*'", "'/'", 
		"'^'", "'=='", "'>='", "'<='", "'<>'", "'>'", "'<'", "'&'", "'&&'", "'||'", 
		"'IN'", "'('", "')'", "'{'", "'}'", "'['", "']'", "'''", "','", "'.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "SINGLE_QUOTED_IDENTIFIER", "MEASURE_ASSIGNMENT", "EQUALS", 
		"PLUS", "MINUS", "TIMES", "DIVIDE_OP", "POWER_OP", "ARE_EQUAL_OP", "GREATER_THAN_EQUALS_OP", 
		"LESS_THAN_EQUALS_OP", "NOT_EQUAL_OP", "GREATER_THAN_OP", "LESS_THAN_OP", 
		"CONCATENATE_OP", "LOGICAL_AND", "LOGICAL_OR", "LOGICAL_IN", "LPAREN", 
		"RPAREN", "LCURLY", "RCURLY", "LBRACK", "RBRACK", "SINGLE_QUOTE", "COMMA", 
		"DOT", "BOOLEAN", "ORDERING", "APPROXIMATEDISTINCTCOUNT", "AVERAGE", "AVERAGEA", 
		"AVERAGEX", "COUNT", "COUNTA", "COUNTAX", "COUNTBLANK", "COUNTROWS", "COUNTX", 
		"DISTINCTCOUNT", "DISTINCTCOUNTNOBLANK", "MAX", "MAXA", "MAXX", "MIN", 
		"MINA", "MINX", "PRODUCT", "PRODUCTX", "SUM", "SUMX", "CALENDAR", "CALENDARAUTO", 
		"DATE", "DATEDIFF", "DATEVALUE", "DAY", "EDATE", "EOMONTH", "HOUR", "MINUTE", 
		"MONTH", "NETWORKDAYS", "NOW", "QUARTER", "SECOND", "TIME", "TIMEVALUE", 
		"TODAY", "UTCNOW", "UTCTODAY", "WEEKDAY", "WEEKNUM", "YEAR", "YEARFRAC", 
		"ALL", "ALLCROSSFILTERED", "ALLEXCEPT", "ALLNOBLANKROW", "ALLSELECTED", 
		"CALCULATE", "CALCULATETABLE", "EARLIER", "EARLIEST", "FILTER", "FIRSTNONBLANK", 
		"FIRSTNONBLANKVALUE", "INDEX", "KEEPFILTERS", "LASTNONBLANK", "LASTNONBLANKVALUE", 
		"LOOKUPVALUE", "MATCHBY", "MOVINGAVERAGE", "OFFSET", "ORDERBY", "PARTITIONBY", 
		"RANGE", "RANK", "REMOVEFILTERS", "ROWNUMBER", "RUNNINGSUM", "SELECTEDVALUE", 
		"WINDOW", "ACCRINT", "ACCRINTM", "AMORDEGRC", "AMORLINC", "COUPDAYBS", 
		"COUPDAYS", "COUPDAYSNC", "COUPNCD", "COUPNUM", "COUPPCD", "CUMIPMT", 
		"CUMPRINC", "DB", "DDB", "DISC", "DOLLARDE", "DOLLARFR", "DURATION", "EFFECT", 
		"FV", "INTRATE", "IPMT", "ISPMT", "MDURATION", "NOMINAL", "NPER", "ODDFPRICE", 
		"ODDFYIELD", "ODDLPRICE", "ODDLYIELD", "PDURATION", "PMT", "PPMT", "PRICE", 
		"PRICEDISC", "PRICEMAT", "PV", "RATE", "RECEIVED", "RRI", "SLN", "SYD", 
		"TBILLEQ", "TBILLPRICE", "TBILLYIELD", "VDB", "XIRR", "XNPV", "YIELD", 
		"YIELDDISC", "YIELDMAT", "COLUMNSTATISTICS", "CONTAINS", "CONTAINSROW", 
		"CONTAINSSTRING", "CONTAINSSTRINGEXACT", "CUSTOMDATA", "HASONEFILTER", 
		"HASONEVALUE", "ISAFTER", "ISBLANK", "ISCROSSFILTERED", "ISEMPTY", "ISERROR", 
		"ISEVEN", "ISFILTERED", "ISINSCOPE", "ISLOGICAL", "ISNONTEXT", "ISNUMBER", 
		"ISODD", "ISONORAFTER", "ISSELECTEDMEASURE", "ISSUBTOTAL", "ISTEXT", "NONVISUAL", 
		"SELECTEDMEASURE", "SELECTEDMEASUREFORMATSTRING", "SELECTEDMEASURENAME", 
		"USERCULTURE", "USERNAME", "USEROBJECTID", "USERPRINCIPALNAME", "AND", 
		"BITAND", "BITLSHIFT", "BITOR", "BITRSHIFT", "BITXOR", "COALESCE", "FALSE", 
		"IF", "IFDOTEAGER", "IFERROR", "NOT", "OR", "SWITCH", "TRUE", "ABS", "ACOS", 
		"ACOSH", "ACOT", "ACOTH", "ASIN", "ASINH", "ATAN", "ATANH", "CEILING", 
		"CONVERT", "COS", "COSH", "COT", "COTH", "CURRENCY", "DEGREES", "DIVIDE", 
		"EVEN", "EXP", "FACT", "FLOOR", "GCD", "INT", "ISODOTCEILING", "LCM", 
		"LN", "LOG", "LOG10", "MOD", "MROUND", "ODD", "PI", "POWER", "QUOTIENT", 
		"RADIANS", "RAND", "RANDBETWEEN", "ROUND", "ROUNDDOWN", "ROUNDUP", "SIGN", 
		"SIN", "SINH", "SQRT", "SQRTPI", "TAN", "TANH", "TRUNC", "BLANK", "ERROR", 
		"EVALUATEANDLOG", "TOCSV", "TOJSON", "PATH", "PATHCONTAINS", "PATHITEM", 
		"PATHITEMREVERSE", "PATHLENGTH", "CROSSFILTER", "RELATED", "RELATEDTABLE", 
		"USERELATIONSHIP", "BETADOTDIST", "BETADOTINV", "CHISQDOTDIST", "CHISQDOTDISTDOTRT", 
		"CHISQDOTINV", "CHISQDOTINVDOTRT", "COMBIN", "COMBINA", "CONFIDENCEDOTNORM", 
		"CONFIDENCEDOTT", "EXPONDOTDIST", "GEOMEAN", "GEOMEANX", "LINEST", "LINESTX", 
		"MEDIAN", "MEDIANX", "NORMDOTDIST", "NORMDOTINV", "NORMDOTSDOTDIST", "NORMDOTSDOTINV", 
		"PERCENTILEDOTEXC", "PERCENTILEDOTINC", "PERCENTILEXDOTEXC", "PERCENTILEXDOTINC", 
		"PERMUT", "POISSONDOTDIST", "RANKDOTEQ", "RANKX", "SAMPLE", "SAMPLECARTESIANPOINTSBYCOVER", 
		"STDEVDOTS", "STDEVDOTP", "STDEVXDOTS", "STDEVXDOTP", "TDOTDIST", "TDOTDISTDOT2T", 
		"TDOTDISTDOTRT", "TDOTINV", "TDOTINVDOT2T", "VARDOTS", "VARDOTP", "VARXDOTS", 
		"VARXDOTP", "ADDCOLUMNS", "ADDMISSINGITEMS", "CROSSJOIN", "CURRENTGROUP", 
		"DATATABLE", "DETAILROWS", "DISTINCT", "EXCEPT", "FILTERS", "GENERATE", 
		"GENERATEALL", "GENERATESERIES", "GROUPBY", "IGNORE", "INTERSECT", "NATURALINNERJOIN", 
		"NATURALLEFTOUTERJOIN", "ROLLUP", "ROLLUPADDISSUBTOTAL", "ROLLUPGROUP", 
		"ROLLUPISSUBTOTAL", "ROW", "SELECTCOLUMNS", "SUBSTITUTEWITHINDEX", "SUMMARIZE", 
		"SUMMARIZECOLUMNS", "TOPN", "TREATAS", "UNION", "VALUES", "COMBINEVALUES", 
		"CONCATENATE", "CONCATENATEX", "EXACT", "FIND", "FIXED", "FORMAT", "LEFT", 
		"LEN", "LOWER", "MID", "REPLACE", "REPT", "RIGHT", "SEARCH", "SUBSTITUTE", 
		"TRIM", "UNICHAR", "UNICODE", "UPPER", "VALUE", "CLOSINGBALANCEMONTH", 
		"CLOSINGBALANCEQUARTER", "CLOSINGBALANCEYEAR", "DATEADD", "DATESBETWEEN", 
		"DATESINPERIOD", "DATESMTD", "DATESQTD", "DATESYTD", "ENDOFMONTH", "ENDOFQUARTER", 
		"ENDOFYEAR", "FIRSTDATE", "LASTDATE", "NEXTDAY", "NEXTMONTH", "NEXTQUARTER", 
		"NEXTYEAR", "OPENINGBALANCEMONTH", "OPENINGBALANCEQUARTER", "OPENINGBALANCEYEAR", 
		"PARALLELPERIOD", "PREVIOUSDAY", "PREVIOUSMONTH", "PREVIOUSQUARTER", "PREVIOUSYEAR", 
		"SAMEPERIODLASTYEAR", "STARTOFMONTH", "STARTOFQUARTER", "STARTOFYEAR", 
		"TOTALMTD", "TOTALQTD", "TOTALYTD", "COLUMN", "DEFINE", "EVALUATE", "MEASURE", 
		"MPARAMETER", "ORDER_BY", "RETURN", "START_AT", "TABLE", "VAR", "DIGIT", 
		"IDENTIFIER", "ASC", "DEC", "WS"
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
	public String getGrammarFileName() { return "Dax.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DaxParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class DaxExpressionContext extends ParserRuleContext {
		public MeasureAssignmentContext measureAssignment() {
			return getRuleContext(MeasureAssignmentContext.class,0);
		}
		public TerminalNode EOF() { return getToken(DaxParser.EOF, 0); }
		public DaxExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_daxExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DaxListener ) ((DaxListener)listener).enterDaxExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DaxListener ) ((DaxListener)listener).exitDaxExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaxVisitor ) return ((DaxVisitor<? extends T>)visitor).visitDaxExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DaxExpressionContext daxExpression() throws RecognitionException {
		DaxExpressionContext _localctx = new DaxExpressionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_daxExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			measureAssignment();
			setState(31);
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

	public static class MeasureAssignmentContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode MEASURE_ASSIGNMENT() { return getToken(DaxParser.MEASURE_ASSIGNMENT, 0); }
		public DaxStatementContext daxStatement() {
			return getRuleContext(DaxStatementContext.class,0);
		}
		public TerminalNode EQUALS() { return getToken(DaxParser.EQUALS, 0); }
		public MeasureAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_measureAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DaxListener ) ((DaxListener)listener).enterMeasureAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DaxListener ) ((DaxListener)listener).exitMeasureAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaxVisitor ) return ((DaxVisitor<? extends T>)visitor).visitMeasureAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MeasureAssignmentContext measureAssignment() throws RecognitionException {
		MeasureAssignmentContext _localctx = new MeasureAssignmentContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_measureAssignment);
		try {
			setState(42);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(33);
				identifier();
				setState(34);
				match(MEASURE_ASSIGNMENT);
				setState(35);
				daxStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				identifier();
				setState(38);
				match(EQUALS);
				setState(39);
				daxStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(41);
				daxStatement();
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

	public static class DaxStatementContext extends ParserRuleContext {
		public EvaluateBlockContext evaluateBlock() {
			return getRuleContext(EvaluateBlockContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DaxStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_daxStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DaxListener ) ((DaxListener)listener).enterDaxStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DaxListener ) ((DaxListener)listener).exitDaxStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaxVisitor ) return ((DaxVisitor<? extends T>)visitor).visitDaxStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DaxStatementContext daxStatement() throws RecognitionException {
		DaxStatementContext _localctx = new DaxStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_daxStatement);
		try {
			setState(48);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(44);
				evaluateBlock();
				setState(45);
				returnStatement();
				}
				break;
			case T__0:
			case SINGLE_QUOTED_IDENTIFIER:
			case LPAREN:
			case LBRACK:
			case APPROXIMATEDISTINCTCOUNT:
			case AVERAGE:
			case AVERAGEA:
			case AVERAGEX:
			case COUNT:
			case COUNTA:
			case COUNTAX:
			case COUNTBLANK:
			case COUNTROWS:
			case COUNTX:
			case DISTINCTCOUNT:
			case DISTINCTCOUNTNOBLANK:
			case MAX:
			case MAXA:
			case MAXX:
			case MIN:
			case MINA:
			case MINX:
			case PRODUCT:
			case PRODUCTX:
			case SUM:
			case SUMX:
			case CALENDAR:
			case CALENDARAUTO:
			case DATE:
			case DATEDIFF:
			case DATEVALUE:
			case DAY:
			case EDATE:
			case EOMONTH:
			case HOUR:
			case MINUTE:
			case MONTH:
			case NETWORKDAYS:
			case NOW:
			case QUARTER:
			case SECOND:
			case TIME:
			case TIMEVALUE:
			case TODAY:
			case UTCNOW:
			case UTCTODAY:
			case WEEKDAY:
			case WEEKNUM:
			case YEAR:
			case YEARFRAC:
			case ALL:
			case ALLCROSSFILTERED:
			case ALLEXCEPT:
			case ALLNOBLANKROW:
			case ALLSELECTED:
			case CALCULATE:
			case CALCULATETABLE:
			case EARLIER:
			case EARLIEST:
			case FILTER:
			case FIRSTNONBLANK:
			case FIRSTNONBLANKVALUE:
			case INDEX:
			case KEEPFILTERS:
			case LASTNONBLANK:
			case LASTNONBLANKVALUE:
			case LOOKUPVALUE:
			case MATCHBY:
			case MOVINGAVERAGE:
			case OFFSET:
			case ORDERBY:
			case PARTITIONBY:
			case RANGE:
			case RANK:
			case REMOVEFILTERS:
			case ROWNUMBER:
			case RUNNINGSUM:
			case SELECTEDVALUE:
			case WINDOW:
			case ACCRINT:
			case ACCRINTM:
			case AMORDEGRC:
			case AMORLINC:
			case COUPDAYBS:
			case COUPDAYS:
			case COUPDAYSNC:
			case COUPNCD:
			case COUPNUM:
			case COUPPCD:
			case CUMIPMT:
			case CUMPRINC:
			case DB:
			case DDB:
			case DISC:
			case DOLLARDE:
			case DOLLARFR:
			case DURATION:
			case EFFECT:
			case FV:
			case INTRATE:
			case IPMT:
			case ISPMT:
			case MDURATION:
			case NOMINAL:
			case NPER:
			case ODDFPRICE:
			case ODDFYIELD:
			case ODDLPRICE:
			case ODDLYIELD:
			case PDURATION:
			case PMT:
			case PPMT:
			case PRICE:
			case PRICEDISC:
			case PRICEMAT:
			case PV:
			case RATE:
			case RECEIVED:
			case RRI:
			case SLN:
			case SYD:
			case TBILLEQ:
			case TBILLPRICE:
			case TBILLYIELD:
			case VDB:
			case XIRR:
			case XNPV:
			case YIELD:
			case YIELDDISC:
			case YIELDMAT:
			case COLUMNSTATISTICS:
			case CONTAINS:
			case CONTAINSROW:
			case CONTAINSSTRING:
			case CONTAINSSTRINGEXACT:
			case CUSTOMDATA:
			case HASONEFILTER:
			case HASONEVALUE:
			case ISAFTER:
			case ISBLANK:
			case ISCROSSFILTERED:
			case ISEMPTY:
			case ISERROR:
			case ISEVEN:
			case ISFILTERED:
			case ISINSCOPE:
			case ISLOGICAL:
			case ISNONTEXT:
			case ISNUMBER:
			case ISODD:
			case ISONORAFTER:
			case ISSELECTEDMEASURE:
			case ISSUBTOTAL:
			case ISTEXT:
			case NONVISUAL:
			case SELECTEDMEASURE:
			case SELECTEDMEASUREFORMATSTRING:
			case SELECTEDMEASURENAME:
			case USERCULTURE:
			case USERNAME:
			case USEROBJECTID:
			case USERPRINCIPALNAME:
			case AND:
			case BITAND:
			case BITLSHIFT:
			case BITOR:
			case BITRSHIFT:
			case BITXOR:
			case COALESCE:
			case FALSE:
			case IF:
			case IFDOTEAGER:
			case IFERROR:
			case NOT:
			case OR:
			case SWITCH:
			case TRUE:
			case ABS:
			case ACOS:
			case ACOSH:
			case ACOT:
			case ACOTH:
			case ASIN:
			case ASINH:
			case ATAN:
			case ATANH:
			case CEILING:
			case CONVERT:
			case COS:
			case COSH:
			case COT:
			case COTH:
			case CURRENCY:
			case DEGREES:
			case DIVIDE:
			case EVEN:
			case EXP:
			case FACT:
			case FLOOR:
			case GCD:
			case INT:
			case ISODOTCEILING:
			case LCM:
			case LN:
			case LOG:
			case LOG10:
			case MOD:
			case MROUND:
			case ODD:
			case PI:
			case POWER:
			case QUOTIENT:
			case RADIANS:
			case RAND:
			case RANDBETWEEN:
			case ROUND:
			case ROUNDDOWN:
			case ROUNDUP:
			case SIGN:
			case SIN:
			case SINH:
			case SQRT:
			case SQRTPI:
			case TAN:
			case TANH:
			case TRUNC:
			case BLANK:
			case ERROR:
			case EVALUATEANDLOG:
			case TOCSV:
			case TOJSON:
			case PATH:
			case PATHCONTAINS:
			case PATHITEM:
			case PATHITEMREVERSE:
			case PATHLENGTH:
			case CROSSFILTER:
			case RELATED:
			case RELATEDTABLE:
			case USERELATIONSHIP:
			case BETADOTDIST:
			case BETADOTINV:
			case CHISQDOTDIST:
			case CHISQDOTDISTDOTRT:
			case CHISQDOTINV:
			case CHISQDOTINVDOTRT:
			case COMBIN:
			case COMBINA:
			case CONFIDENCEDOTNORM:
			case CONFIDENCEDOTT:
			case EXPONDOTDIST:
			case GEOMEAN:
			case GEOMEANX:
			case LINEST:
			case LINESTX:
			case MEDIAN:
			case MEDIANX:
			case NORMDOTDIST:
			case NORMDOTINV:
			case NORMDOTSDOTDIST:
			case NORMDOTSDOTINV:
			case PERCENTILEDOTEXC:
			case PERCENTILEDOTINC:
			case PERCENTILEXDOTEXC:
			case PERCENTILEXDOTINC:
			case PERMUT:
			case POISSONDOTDIST:
			case RANKDOTEQ:
			case RANKX:
			case SAMPLE:
			case SAMPLECARTESIANPOINTSBYCOVER:
			case STDEVDOTS:
			case STDEVDOTP:
			case STDEVXDOTS:
			case STDEVXDOTP:
			case TDOTDIST:
			case TDOTDISTDOT2T:
			case TDOTDISTDOTRT:
			case TDOTINV:
			case TDOTINVDOT2T:
			case VARDOTS:
			case VARDOTP:
			case VARXDOTS:
			case VARXDOTP:
			case ADDCOLUMNS:
			case ADDMISSINGITEMS:
			case CROSSJOIN:
			case CURRENTGROUP:
			case DATATABLE:
			case DETAILROWS:
			case DISTINCT:
			case EXCEPT:
			case FILTERS:
			case GENERATE:
			case GENERATEALL:
			case GENERATESERIES:
			case GROUPBY:
			case IGNORE:
			case INTERSECT:
			case NATURALINNERJOIN:
			case NATURALLEFTOUTERJOIN:
			case ROLLUP:
			case ROLLUPADDISSUBTOTAL:
			case ROLLUPGROUP:
			case ROLLUPISSUBTOTAL:
			case ROW:
			case SELECTCOLUMNS:
			case SUBSTITUTEWITHINDEX:
			case SUMMARIZE:
			case SUMMARIZECOLUMNS:
			case TOPN:
			case TREATAS:
			case UNION:
			case VALUES:
			case COMBINEVALUES:
			case CONCATENATE:
			case CONCATENATEX:
			case EXACT:
			case FIND:
			case FIXED:
			case FORMAT:
			case LEFT:
			case LEN:
			case LOWER:
			case MID:
			case REPLACE:
			case REPT:
			case RIGHT:
			case SEARCH:
			case SUBSTITUTE:
			case TRIM:
			case UNICHAR:
			case UNICODE:
			case UPPER:
			case VALUE:
			case CLOSINGBALANCEMONTH:
			case CLOSINGBALANCEQUARTER:
			case CLOSINGBALANCEYEAR:
			case DATEADD:
			case DATESBETWEEN:
			case DATESINPERIOD:
			case DATESMTD:
			case DATESQTD:
			case DATESYTD:
			case ENDOFMONTH:
			case ENDOFQUARTER:
			case ENDOFYEAR:
			case FIRSTDATE:
			case LASTDATE:
			case NEXTDAY:
			case NEXTMONTH:
			case NEXTQUARTER:
			case NEXTYEAR:
			case OPENINGBALANCEMONTH:
			case OPENINGBALANCEQUARTER:
			case OPENINGBALANCEYEAR:
			case PARALLELPERIOD:
			case PREVIOUSDAY:
			case PREVIOUSMONTH:
			case PREVIOUSQUARTER:
			case PREVIOUSYEAR:
			case SAMEPERIODLASTYEAR:
			case STARTOFMONTH:
			case STARTOFQUARTER:
			case STARTOFYEAR:
			case TOTALMTD:
			case TOTALQTD:
			case TOTALYTD:
			case DIGIT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				expression(0);
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

	public static class EvaluateBlockContext extends ParserRuleContext {
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public EvaluateBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_evaluateBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DaxListener ) ((DaxListener)listener).enterEvaluateBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DaxListener ) ((DaxListener)listener).exitEvaluateBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaxVisitor ) return ((DaxVisitor<? extends T>)visitor).visitEvaluateBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EvaluateBlockContext evaluateBlock() throws RecognitionException {
		EvaluateBlockContext _localctx = new EvaluateBlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_evaluateBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(50);
				varDeclaration();
				}
				}
				setState(53); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==VAR );
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

	public static class VarDeclarationContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(DaxParser.VAR, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQUALS() { return getToken(DaxParser.EQUALS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DaxListener ) ((DaxListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DaxListener ) ((DaxListener)listener).exitVarDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaxVisitor ) return ((DaxVisitor<? extends T>)visitor).visitVarDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_varDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(VAR);
			setState(56);
			identifier();
			setState(57);
			match(EQUALS);
			setState(58);
			expression(0);
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

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(DaxParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DaxListener ) ((DaxListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DaxListener ) ((DaxListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaxVisitor ) return ((DaxVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(RETURN);
			setState(61);
			expression(0);
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

	public static class ExpressionContext extends ParserRuleContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public NumericLiteralContext numericLiteral() {
			return getRuleContext(NumericLiteralContext.class,0);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public ParenthesizedExpressionContext parenthesizedExpression() {
			return getRuleContext(ParenthesizedExpressionContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DaxListener ) ((DaxListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DaxListener ) ((DaxListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaxVisitor ) return ((DaxVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			switch (_input.LA(1)) {
			case APPROXIMATEDISTINCTCOUNT:
			case AVERAGE:
			case AVERAGEA:
			case AVERAGEX:
			case COUNT:
			case COUNTA:
			case COUNTAX:
			case COUNTBLANK:
			case COUNTROWS:
			case COUNTX:
			case DISTINCTCOUNT:
			case DISTINCTCOUNTNOBLANK:
			case MAX:
			case MAXA:
			case MAXX:
			case MIN:
			case MINA:
			case MINX:
			case PRODUCT:
			case PRODUCTX:
			case SUM:
			case SUMX:
			case CALENDAR:
			case CALENDARAUTO:
			case DATE:
			case DATEDIFF:
			case DATEVALUE:
			case DAY:
			case EDATE:
			case EOMONTH:
			case HOUR:
			case MINUTE:
			case MONTH:
			case NETWORKDAYS:
			case NOW:
			case QUARTER:
			case SECOND:
			case TIME:
			case TIMEVALUE:
			case TODAY:
			case UTCNOW:
			case UTCTODAY:
			case WEEKDAY:
			case WEEKNUM:
			case YEAR:
			case YEARFRAC:
			case ALL:
			case ALLCROSSFILTERED:
			case ALLEXCEPT:
			case ALLNOBLANKROW:
			case ALLSELECTED:
			case CALCULATE:
			case CALCULATETABLE:
			case EARLIER:
			case EARLIEST:
			case FILTER:
			case FIRSTNONBLANK:
			case FIRSTNONBLANKVALUE:
			case INDEX:
			case KEEPFILTERS:
			case LASTNONBLANK:
			case LASTNONBLANKVALUE:
			case LOOKUPVALUE:
			case MATCHBY:
			case MOVINGAVERAGE:
			case OFFSET:
			case ORDERBY:
			case PARTITIONBY:
			case RANGE:
			case RANK:
			case REMOVEFILTERS:
			case ROWNUMBER:
			case RUNNINGSUM:
			case SELECTEDVALUE:
			case WINDOW:
			case ACCRINT:
			case ACCRINTM:
			case AMORDEGRC:
			case AMORLINC:
			case COUPDAYBS:
			case COUPDAYS:
			case COUPDAYSNC:
			case COUPNCD:
			case COUPNUM:
			case COUPPCD:
			case CUMIPMT:
			case CUMPRINC:
			case DB:
			case DDB:
			case DISC:
			case DOLLARDE:
			case DOLLARFR:
			case DURATION:
			case EFFECT:
			case FV:
			case INTRATE:
			case IPMT:
			case ISPMT:
			case MDURATION:
			case NOMINAL:
			case NPER:
			case ODDFPRICE:
			case ODDFYIELD:
			case ODDLPRICE:
			case ODDLYIELD:
			case PDURATION:
			case PMT:
			case PPMT:
			case PRICE:
			case PRICEDISC:
			case PRICEMAT:
			case PV:
			case RATE:
			case RECEIVED:
			case RRI:
			case SLN:
			case SYD:
			case TBILLEQ:
			case TBILLPRICE:
			case TBILLYIELD:
			case VDB:
			case XIRR:
			case XNPV:
			case YIELD:
			case YIELDDISC:
			case YIELDMAT:
			case COLUMNSTATISTICS:
			case CONTAINS:
			case CONTAINSROW:
			case CONTAINSSTRING:
			case CONTAINSSTRINGEXACT:
			case CUSTOMDATA:
			case HASONEFILTER:
			case HASONEVALUE:
			case ISAFTER:
			case ISBLANK:
			case ISCROSSFILTERED:
			case ISEMPTY:
			case ISERROR:
			case ISEVEN:
			case ISFILTERED:
			case ISINSCOPE:
			case ISLOGICAL:
			case ISNONTEXT:
			case ISNUMBER:
			case ISODD:
			case ISONORAFTER:
			case ISSELECTEDMEASURE:
			case ISSUBTOTAL:
			case ISTEXT:
			case NONVISUAL:
			case SELECTEDMEASURE:
			case SELECTEDMEASUREFORMATSTRING:
			case SELECTEDMEASURENAME:
			case USERCULTURE:
			case USERNAME:
			case USEROBJECTID:
			case USERPRINCIPALNAME:
			case AND:
			case BITAND:
			case BITLSHIFT:
			case BITOR:
			case BITRSHIFT:
			case BITXOR:
			case COALESCE:
			case FALSE:
			case IF:
			case IFDOTEAGER:
			case IFERROR:
			case NOT:
			case OR:
			case SWITCH:
			case TRUE:
			case ABS:
			case ACOS:
			case ACOSH:
			case ACOT:
			case ACOTH:
			case ASIN:
			case ASINH:
			case ATAN:
			case ATANH:
			case CEILING:
			case CONVERT:
			case COS:
			case COSH:
			case COT:
			case COTH:
			case CURRENCY:
			case DEGREES:
			case DIVIDE:
			case EVEN:
			case EXP:
			case FACT:
			case FLOOR:
			case GCD:
			case INT:
			case ISODOTCEILING:
			case LCM:
			case LN:
			case LOG:
			case LOG10:
			case MOD:
			case MROUND:
			case ODD:
			case PI:
			case POWER:
			case QUOTIENT:
			case RADIANS:
			case RAND:
			case RANDBETWEEN:
			case ROUND:
			case ROUNDDOWN:
			case ROUNDUP:
			case SIGN:
			case SIN:
			case SINH:
			case SQRT:
			case SQRTPI:
			case TAN:
			case TANH:
			case TRUNC:
			case BLANK:
			case ERROR:
			case EVALUATEANDLOG:
			case TOCSV:
			case TOJSON:
			case PATH:
			case PATHCONTAINS:
			case PATHITEM:
			case PATHITEMREVERSE:
			case PATHLENGTH:
			case CROSSFILTER:
			case RELATED:
			case RELATEDTABLE:
			case USERELATIONSHIP:
			case BETADOTDIST:
			case BETADOTINV:
			case CHISQDOTDIST:
			case CHISQDOTDISTDOTRT:
			case CHISQDOTINV:
			case CHISQDOTINVDOTRT:
			case COMBIN:
			case COMBINA:
			case CONFIDENCEDOTNORM:
			case CONFIDENCEDOTT:
			case EXPONDOTDIST:
			case GEOMEAN:
			case GEOMEANX:
			case LINEST:
			case LINESTX:
			case MEDIAN:
			case MEDIANX:
			case NORMDOTDIST:
			case NORMDOTINV:
			case NORMDOTSDOTDIST:
			case NORMDOTSDOTINV:
			case PERCENTILEDOTEXC:
			case PERCENTILEDOTINC:
			case PERCENTILEXDOTEXC:
			case PERCENTILEXDOTINC:
			case PERMUT:
			case POISSONDOTDIST:
			case RANKDOTEQ:
			case RANKX:
			case SAMPLE:
			case SAMPLECARTESIANPOINTSBYCOVER:
			case STDEVDOTS:
			case STDEVDOTP:
			case STDEVXDOTS:
			case STDEVXDOTP:
			case TDOTDIST:
			case TDOTDISTDOT2T:
			case TDOTDISTDOTRT:
			case TDOTINV:
			case TDOTINVDOT2T:
			case VARDOTS:
			case VARDOTP:
			case VARXDOTS:
			case VARXDOTP:
			case ADDCOLUMNS:
			case ADDMISSINGITEMS:
			case CROSSJOIN:
			case CURRENTGROUP:
			case DATATABLE:
			case DETAILROWS:
			case DISTINCT:
			case EXCEPT:
			case FILTERS:
			case GENERATE:
			case GENERATEALL:
			case GENERATESERIES:
			case GROUPBY:
			case IGNORE:
			case INTERSECT:
			case NATURALINNERJOIN:
			case NATURALLEFTOUTERJOIN:
			case ROLLUP:
			case ROLLUPADDISSUBTOTAL:
			case ROLLUPGROUP:
			case ROLLUPISSUBTOTAL:
			case ROW:
			case SELECTCOLUMNS:
			case SUBSTITUTEWITHINDEX:
			case SUMMARIZE:
			case SUMMARIZECOLUMNS:
			case TOPN:
			case TREATAS:
			case UNION:
			case VALUES:
			case COMBINEVALUES:
			case CONCATENATE:
			case CONCATENATEX:
			case EXACT:
			case FIND:
			case FIXED:
			case FORMAT:
			case LEFT:
			case LEN:
			case LOWER:
			case MID:
			case REPLACE:
			case REPT:
			case RIGHT:
			case SEARCH:
			case SUBSTITUTE:
			case TRIM:
			case UNICHAR:
			case UNICODE:
			case UPPER:
			case VALUE:
			case CLOSINGBALANCEMONTH:
			case CLOSINGBALANCEQUARTER:
			case CLOSINGBALANCEYEAR:
			case DATEADD:
			case DATESBETWEEN:
			case DATESINPERIOD:
			case DATESMTD:
			case DATESQTD:
			case DATESYTD:
			case ENDOFMONTH:
			case ENDOFQUARTER:
			case ENDOFYEAR:
			case FIRSTDATE:
			case LASTDATE:
			case NEXTDAY:
			case NEXTMONTH:
			case NEXTQUARTER:
			case NEXTYEAR:
			case OPENINGBALANCEMONTH:
			case OPENINGBALANCEQUARTER:
			case OPENINGBALANCEYEAR:
			case PARALLELPERIOD:
			case PREVIOUSDAY:
			case PREVIOUSMONTH:
			case PREVIOUSQUARTER:
			case PREVIOUSYEAR:
			case SAMEPERIODLASTYEAR:
			case STARTOFMONTH:
			case STARTOFQUARTER:
			case STARTOFYEAR:
			case TOTALMTD:
			case TOTALQTD:
			case TOTALYTD:
				{
				setState(64);
				functionCall();
				}
				break;
			case SINGLE_QUOTED_IDENTIFIER:
			case LBRACK:
			case IDENTIFIER:
				{
				setState(65);
				identifier();
				}
				break;
			case DIGIT:
				{
				setState(66);
				numericLiteral();
				}
				break;
			case T__0:
				{
				setState(67);
				stringLiteral();
				}
				break;
			case LPAREN:
				{
				setState(68);
				parenthesizedExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(77);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(71);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(72);
					operator();
					setState(73);
					expression(2);
					}
					} 
				}
				setState(79);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ParenthesizedExpressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(DaxParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(DaxParser.RPAREN, 0); }
		public ParenthesizedExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parenthesizedExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DaxListener ) ((DaxListener)listener).enterParenthesizedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DaxListener ) ((DaxListener)listener).exitParenthesizedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaxVisitor ) return ((DaxVisitor<? extends T>)visitor).visitParenthesizedExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParenthesizedExpressionContext parenthesizedExpression() throws RecognitionException {
		ParenthesizedExpressionContext _localctx = new ParenthesizedExpressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_parenthesizedExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(LPAREN);
			setState(81);
			expression(0);
			setState(82);
			match(RPAREN);
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

	public static class FunctionCallContext extends ParserRuleContext {
		public DaxFunctionContext daxFunction() {
			return getRuleContext(DaxFunctionContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(DaxParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(DaxParser.RPAREN, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DaxListener ) ((DaxListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DaxListener ) ((DaxListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaxVisitor ) return ((DaxVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			daxFunction();
			setState(85);
			match(LPAREN);
			setState(87);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << SINGLE_QUOTED_IDENTIFIER) | (1L << LPAREN) | (1L << LBRACK) | (1L << APPROXIMATEDISTINCTCOUNT) | (1L << AVERAGE) | (1L << AVERAGEA) | (1L << AVERAGEX) | (1L << COUNT) | (1L << COUNTA) | (1L << COUNTAX) | (1L << COUNTBLANK) | (1L << COUNTROWS) | (1L << COUNTX) | (1L << DISTINCTCOUNT) | (1L << DISTINCTCOUNTNOBLANK) | (1L << MAX) | (1L << MAXA) | (1L << MAXX) | (1L << MIN) | (1L << MINA) | (1L << MINX) | (1L << PRODUCT) | (1L << PRODUCTX) | (1L << SUM) | (1L << SUMX) | (1L << CALENDAR) | (1L << CALENDARAUTO) | (1L << DATE) | (1L << DATEDIFF) | (1L << DATEVALUE) | (1L << DAY) | (1L << EDATE) | (1L << EOMONTH) | (1L << HOUR) | (1L << MINUTE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (MONTH - 64)) | (1L << (NETWORKDAYS - 64)) | (1L << (NOW - 64)) | (1L << (QUARTER - 64)) | (1L << (SECOND - 64)) | (1L << (TIME - 64)) | (1L << (TIMEVALUE - 64)) | (1L << (TODAY - 64)) | (1L << (UTCNOW - 64)) | (1L << (UTCTODAY - 64)) | (1L << (WEEKDAY - 64)) | (1L << (WEEKNUM - 64)) | (1L << (YEAR - 64)) | (1L << (YEARFRAC - 64)) | (1L << (ALL - 64)) | (1L << (ALLCROSSFILTERED - 64)) | (1L << (ALLEXCEPT - 64)) | (1L << (ALLNOBLANKROW - 64)) | (1L << (ALLSELECTED - 64)) | (1L << (CALCULATE - 64)) | (1L << (CALCULATETABLE - 64)) | (1L << (EARLIER - 64)) | (1L << (EARLIEST - 64)) | (1L << (FILTER - 64)) | (1L << (FIRSTNONBLANK - 64)) | (1L << (FIRSTNONBLANKVALUE - 64)) | (1L << (INDEX - 64)) | (1L << (KEEPFILTERS - 64)) | (1L << (LASTNONBLANK - 64)) | (1L << (LASTNONBLANKVALUE - 64)) | (1L << (LOOKUPVALUE - 64)) | (1L << (MATCHBY - 64)) | (1L << (MOVINGAVERAGE - 64)) | (1L << (OFFSET - 64)) | (1L << (ORDERBY - 64)) | (1L << (PARTITIONBY - 64)) | (1L << (RANGE - 64)) | (1L << (RANK - 64)) | (1L << (REMOVEFILTERS - 64)) | (1L << (ROWNUMBER - 64)) | (1L << (RUNNINGSUM - 64)) | (1L << (SELECTEDVALUE - 64)) | (1L << (WINDOW - 64)) | (1L << (ACCRINT - 64)) | (1L << (ACCRINTM - 64)) | (1L << (AMORDEGRC - 64)) | (1L << (AMORLINC - 64)) | (1L << (COUPDAYBS - 64)) | (1L << (COUPDAYS - 64)) | (1L << (COUPDAYSNC - 64)) | (1L << (COUPNCD - 64)) | (1L << (COUPNUM - 64)) | (1L << (COUPPCD - 64)) | (1L << (CUMIPMT - 64)) | (1L << (CUMPRINC - 64)) | (1L << (DB - 64)) | (1L << (DDB - 64)) | (1L << (DISC - 64)) | (1L << (DOLLARDE - 64)) | (1L << (DOLLARFR - 64)) | (1L << (DURATION - 64)) | (1L << (EFFECT - 64)) | (1L << (FV - 64)) | (1L << (INTRATE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (IPMT - 128)) | (1L << (ISPMT - 128)) | (1L << (MDURATION - 128)) | (1L << (NOMINAL - 128)) | (1L << (NPER - 128)) | (1L << (ODDFPRICE - 128)) | (1L << (ODDFYIELD - 128)) | (1L << (ODDLPRICE - 128)) | (1L << (ODDLYIELD - 128)) | (1L << (PDURATION - 128)) | (1L << (PMT - 128)) | (1L << (PPMT - 128)) | (1L << (PRICE - 128)) | (1L << (PRICEDISC - 128)) | (1L << (PRICEMAT - 128)) | (1L << (PV - 128)) | (1L << (RATE - 128)) | (1L << (RECEIVED - 128)) | (1L << (RRI - 128)) | (1L << (SLN - 128)) | (1L << (SYD - 128)) | (1L << (TBILLEQ - 128)) | (1L << (TBILLPRICE - 128)) | (1L << (TBILLYIELD - 128)) | (1L << (VDB - 128)) | (1L << (XIRR - 128)) | (1L << (XNPV - 128)) | (1L << (YIELD - 128)) | (1L << (YIELDDISC - 128)) | (1L << (YIELDMAT - 128)) | (1L << (COLUMNSTATISTICS - 128)) | (1L << (CONTAINS - 128)) | (1L << (CONTAINSROW - 128)) | (1L << (CONTAINSSTRING - 128)) | (1L << (CONTAINSSTRINGEXACT - 128)) | (1L << (CUSTOMDATA - 128)) | (1L << (HASONEFILTER - 128)) | (1L << (HASONEVALUE - 128)) | (1L << (ISAFTER - 128)) | (1L << (ISBLANK - 128)) | (1L << (ISCROSSFILTERED - 128)) | (1L << (ISEMPTY - 128)) | (1L << (ISERROR - 128)) | (1L << (ISEVEN - 128)) | (1L << (ISFILTERED - 128)) | (1L << (ISINSCOPE - 128)) | (1L << (ISLOGICAL - 128)) | (1L << (ISNONTEXT - 128)) | (1L << (ISNUMBER - 128)) | (1L << (ISODD - 128)) | (1L << (ISONORAFTER - 128)) | (1L << (ISSELECTEDMEASURE - 128)) | (1L << (ISSUBTOTAL - 128)) | (1L << (ISTEXT - 128)) | (1L << (NONVISUAL - 128)) | (1L << (SELECTEDMEASURE - 128)) | (1L << (SELECTEDMEASUREFORMATSTRING - 128)) | (1L << (SELECTEDMEASURENAME - 128)) | (1L << (USERCULTURE - 128)) | (1L << (USERNAME - 128)) | (1L << (USEROBJECTID - 128)) | (1L << (USERPRINCIPALNAME - 128)) | (1L << (AND - 128)) | (1L << (BITAND - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (BITLSHIFT - 192)) | (1L << (BITOR - 192)) | (1L << (BITRSHIFT - 192)) | (1L << (BITXOR - 192)) | (1L << (COALESCE - 192)) | (1L << (FALSE - 192)) | (1L << (IF - 192)) | (1L << (IFDOTEAGER - 192)) | (1L << (IFERROR - 192)) | (1L << (NOT - 192)) | (1L << (OR - 192)) | (1L << (SWITCH - 192)) | (1L << (TRUE - 192)) | (1L << (ABS - 192)) | (1L << (ACOS - 192)) | (1L << (ACOSH - 192)) | (1L << (ACOT - 192)) | (1L << (ACOTH - 192)) | (1L << (ASIN - 192)) | (1L << (ASINH - 192)) | (1L << (ATAN - 192)) | (1L << (ATANH - 192)) | (1L << (CEILING - 192)) | (1L << (CONVERT - 192)) | (1L << (COS - 192)) | (1L << (COSH - 192)) | (1L << (COT - 192)) | (1L << (COTH - 192)) | (1L << (CURRENCY - 192)) | (1L << (DEGREES - 192)) | (1L << (DIVIDE - 192)) | (1L << (EVEN - 192)) | (1L << (EXP - 192)) | (1L << (FACT - 192)) | (1L << (FLOOR - 192)) | (1L << (GCD - 192)) | (1L << (INT - 192)) | (1L << (ISODOTCEILING - 192)) | (1L << (LCM - 192)) | (1L << (LN - 192)) | (1L << (LOG - 192)) | (1L << (LOG10 - 192)) | (1L << (MOD - 192)) | (1L << (MROUND - 192)) | (1L << (ODD - 192)) | (1L << (PI - 192)) | (1L << (POWER - 192)) | (1L << (QUOTIENT - 192)) | (1L << (RADIANS - 192)) | (1L << (RAND - 192)) | (1L << (RANDBETWEEN - 192)) | (1L << (ROUND - 192)) | (1L << (ROUNDDOWN - 192)) | (1L << (ROUNDUP - 192)) | (1L << (SIGN - 192)) | (1L << (SIN - 192)) | (1L << (SINH - 192)) | (1L << (SQRT - 192)) | (1L << (SQRTPI - 192)) | (1L << (TAN - 192)) | (1L << (TANH - 192)) | (1L << (TRUNC - 192)) | (1L << (BLANK - 192)) | (1L << (ERROR - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (EVALUATEANDLOG - 256)) | (1L << (TOCSV - 256)) | (1L << (TOJSON - 256)) | (1L << (PATH - 256)) | (1L << (PATHCONTAINS - 256)) | (1L << (PATHITEM - 256)) | (1L << (PATHITEMREVERSE - 256)) | (1L << (PATHLENGTH - 256)) | (1L << (CROSSFILTER - 256)) | (1L << (RELATED - 256)) | (1L << (RELATEDTABLE - 256)) | (1L << (USERELATIONSHIP - 256)) | (1L << (BETADOTDIST - 256)) | (1L << (BETADOTINV - 256)) | (1L << (CHISQDOTDIST - 256)) | (1L << (CHISQDOTDISTDOTRT - 256)) | (1L << (CHISQDOTINV - 256)) | (1L << (CHISQDOTINVDOTRT - 256)) | (1L << (COMBIN - 256)) | (1L << (COMBINA - 256)) | (1L << (CONFIDENCEDOTNORM - 256)) | (1L << (CONFIDENCEDOTT - 256)) | (1L << (EXPONDOTDIST - 256)) | (1L << (GEOMEAN - 256)) | (1L << (GEOMEANX - 256)) | (1L << (LINEST - 256)) | (1L << (LINESTX - 256)) | (1L << (MEDIAN - 256)) | (1L << (MEDIANX - 256)) | (1L << (NORMDOTDIST - 256)) | (1L << (NORMDOTINV - 256)) | (1L << (NORMDOTSDOTDIST - 256)) | (1L << (NORMDOTSDOTINV - 256)) | (1L << (PERCENTILEDOTEXC - 256)) | (1L << (PERCENTILEDOTINC - 256)) | (1L << (PERCENTILEXDOTEXC - 256)) | (1L << (PERCENTILEXDOTINC - 256)) | (1L << (PERMUT - 256)) | (1L << (POISSONDOTDIST - 256)) | (1L << (RANKDOTEQ - 256)) | (1L << (RANKX - 256)) | (1L << (SAMPLE - 256)) | (1L << (SAMPLECARTESIANPOINTSBYCOVER - 256)) | (1L << (STDEVDOTS - 256)) | (1L << (STDEVDOTP - 256)) | (1L << (STDEVXDOTS - 256)) | (1L << (STDEVXDOTP - 256)) | (1L << (TDOTDIST - 256)) | (1L << (TDOTDISTDOT2T - 256)) | (1L << (TDOTDISTDOTRT - 256)) | (1L << (TDOTINV - 256)) | (1L << (TDOTINVDOT2T - 256)) | (1L << (VARDOTS - 256)) | (1L << (VARDOTP - 256)) | (1L << (VARXDOTS - 256)) | (1L << (VARXDOTP - 256)) | (1L << (ADDCOLUMNS - 256)) | (1L << (ADDMISSINGITEMS - 256)) | (1L << (CROSSJOIN - 256)) | (1L << (CURRENTGROUP - 256)) | (1L << (DATATABLE - 256)) | (1L << (DETAILROWS - 256)) | (1L << (DISTINCT - 256)) | (1L << (EXCEPT - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (FILTERS - 320)) | (1L << (GENERATE - 320)) | (1L << (GENERATEALL - 320)) | (1L << (GENERATESERIES - 320)) | (1L << (GROUPBY - 320)) | (1L << (IGNORE - 320)) | (1L << (INTERSECT - 320)) | (1L << (NATURALINNERJOIN - 320)) | (1L << (NATURALLEFTOUTERJOIN - 320)) | (1L << (ROLLUP - 320)) | (1L << (ROLLUPADDISSUBTOTAL - 320)) | (1L << (ROLLUPGROUP - 320)) | (1L << (ROLLUPISSUBTOTAL - 320)) | (1L << (ROW - 320)) | (1L << (SELECTCOLUMNS - 320)) | (1L << (SUBSTITUTEWITHINDEX - 320)) | (1L << (SUMMARIZE - 320)) | (1L << (SUMMARIZECOLUMNS - 320)) | (1L << (TOPN - 320)) | (1L << (TREATAS - 320)) | (1L << (UNION - 320)) | (1L << (VALUES - 320)) | (1L << (COMBINEVALUES - 320)) | (1L << (CONCATENATE - 320)) | (1L << (CONCATENATEX - 320)) | (1L << (EXACT - 320)) | (1L << (FIND - 320)) | (1L << (FIXED - 320)) | (1L << (FORMAT - 320)) | (1L << (LEFT - 320)) | (1L << (LEN - 320)) | (1L << (LOWER - 320)) | (1L << (MID - 320)) | (1L << (REPLACE - 320)) | (1L << (REPT - 320)) | (1L << (RIGHT - 320)) | (1L << (SEARCH - 320)) | (1L << (SUBSTITUTE - 320)) | (1L << (TRIM - 320)) | (1L << (UNICHAR - 320)) | (1L << (UNICODE - 320)) | (1L << (UPPER - 320)) | (1L << (VALUE - 320)) | (1L << (CLOSINGBALANCEMONTH - 320)) | (1L << (CLOSINGBALANCEQUARTER - 320)) | (1L << (CLOSINGBALANCEYEAR - 320)) | (1L << (DATEADD - 320)) | (1L << (DATESBETWEEN - 320)) | (1L << (DATESINPERIOD - 320)) | (1L << (DATESMTD - 320)) | (1L << (DATESQTD - 320)) | (1L << (DATESYTD - 320)) | (1L << (ENDOFMONTH - 320)) | (1L << (ENDOFQUARTER - 320)) | (1L << (ENDOFYEAR - 320)) | (1L << (FIRSTDATE - 320)) | (1L << (LASTDATE - 320)) | (1L << (NEXTDAY - 320)) | (1L << (NEXTMONTH - 320)) | (1L << (NEXTQUARTER - 320)) | (1L << (NEXTYEAR - 320)) | (1L << (OPENINGBALANCEMONTH - 320)) | (1L << (OPENINGBALANCEQUARTER - 320)) | (1L << (OPENINGBALANCEYEAR - 320)))) != 0) || ((((_la - 384)) & ~0x3f) == 0 && ((1L << (_la - 384)) & ((1L << (PARALLELPERIOD - 384)) | (1L << (PREVIOUSDAY - 384)) | (1L << (PREVIOUSMONTH - 384)) | (1L << (PREVIOUSQUARTER - 384)) | (1L << (PREVIOUSYEAR - 384)) | (1L << (SAMEPERIODLASTYEAR - 384)) | (1L << (STARTOFMONTH - 384)) | (1L << (STARTOFQUARTER - 384)) | (1L << (STARTOFYEAR - 384)) | (1L << (TOTALMTD - 384)) | (1L << (TOTALQTD - 384)) | (1L << (TOTALYTD - 384)) | (1L << (DIGIT - 384)) | (1L << (IDENTIFIER - 384)))) != 0)) {
				{
				setState(86);
				argumentList();
				}
			}

			setState(89);
			match(RPAREN);
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

	public static class ArgumentListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DaxParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DaxParser.COMMA, i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DaxListener ) ((DaxListener)listener).enterArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DaxListener ) ((DaxListener)listener).exitArgumentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaxVisitor ) return ((DaxVisitor<? extends T>)visitor).visitArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			expression(0);
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(92);
				match(COMMA);
				setState(93);
				expression(0);
				}
				}
				setState(98);
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

	public static class OperatorContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(DaxParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(DaxParser.MINUS, 0); }
		public TerminalNode TIMES() { return getToken(DaxParser.TIMES, 0); }
		public TerminalNode DIVIDE_OP() { return getToken(DaxParser.DIVIDE_OP, 0); }
		public TerminalNode POWER_OP() { return getToken(DaxParser.POWER_OP, 0); }
		public TerminalNode CONCATENATE_OP() { return getToken(DaxParser.CONCATENATE_OP, 0); }
		public TerminalNode ARE_EQUAL_OP() { return getToken(DaxParser.ARE_EQUAL_OP, 0); }
		public TerminalNode GREATER_THAN_EQUALS_OP() { return getToken(DaxParser.GREATER_THAN_EQUALS_OP, 0); }
		public TerminalNode LESS_THAN_EQUALS_OP() { return getToken(DaxParser.LESS_THAN_EQUALS_OP, 0); }
		public TerminalNode NOT_EQUAL_OP() { return getToken(DaxParser.NOT_EQUAL_OP, 0); }
		public TerminalNode GREATER_THAN_OP() { return getToken(DaxParser.GREATER_THAN_OP, 0); }
		public TerminalNode LESS_THAN_OP() { return getToken(DaxParser.LESS_THAN_OP, 0); }
		public TerminalNode LOGICAL_AND() { return getToken(DaxParser.LOGICAL_AND, 0); }
		public TerminalNode LOGICAL_OR() { return getToken(DaxParser.LOGICAL_OR, 0); }
		public TerminalNode LOGICAL_IN() { return getToken(DaxParser.LOGICAL_IN, 0); }
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DaxListener ) ((DaxListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DaxListener ) ((DaxListener)listener).exitOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaxVisitor ) return ((DaxVisitor<? extends T>)visitor).visitOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << TIMES) | (1L << DIVIDE_OP) | (1L << POWER_OP) | (1L << ARE_EQUAL_OP) | (1L << GREATER_THAN_EQUALS_OP) | (1L << LESS_THAN_EQUALS_OP) | (1L << NOT_EQUAL_OP) | (1L << GREATER_THAN_OP) | (1L << LESS_THAN_OP) | (1L << CONCATENATE_OP) | (1L << LOGICAL_AND) | (1L << LOGICAL_OR) | (1L << LOGICAL_IN))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class DaxFunctionContext extends ParserRuleContext {
		public TerminalNode APPROXIMATEDISTINCTCOUNT() { return getToken(DaxParser.APPROXIMATEDISTINCTCOUNT, 0); }
		public TerminalNode AVERAGE() { return getToken(DaxParser.AVERAGE, 0); }
		public TerminalNode AVERAGEA() { return getToken(DaxParser.AVERAGEA, 0); }
		public TerminalNode AVERAGEX() { return getToken(DaxParser.AVERAGEX, 0); }
		public TerminalNode COUNT() { return getToken(DaxParser.COUNT, 0); }
		public TerminalNode COUNTA() { return getToken(DaxParser.COUNTA, 0); }
		public TerminalNode COUNTAX() { return getToken(DaxParser.COUNTAX, 0); }
		public TerminalNode COUNTBLANK() { return getToken(DaxParser.COUNTBLANK, 0); }
		public TerminalNode COUNTROWS() { return getToken(DaxParser.COUNTROWS, 0); }
		public TerminalNode COUNTX() { return getToken(DaxParser.COUNTX, 0); }
		public TerminalNode DISTINCTCOUNT() { return getToken(DaxParser.DISTINCTCOUNT, 0); }
		public TerminalNode DISTINCTCOUNTNOBLANK() { return getToken(DaxParser.DISTINCTCOUNTNOBLANK, 0); }
		public TerminalNode MAX() { return getToken(DaxParser.MAX, 0); }
		public TerminalNode MAXA() { return getToken(DaxParser.MAXA, 0); }
		public TerminalNode MAXX() { return getToken(DaxParser.MAXX, 0); }
		public TerminalNode MIN() { return getToken(DaxParser.MIN, 0); }
		public TerminalNode MINA() { return getToken(DaxParser.MINA, 0); }
		public TerminalNode MINX() { return getToken(DaxParser.MINX, 0); }
		public TerminalNode PRODUCT() { return getToken(DaxParser.PRODUCT, 0); }
		public TerminalNode PRODUCTX() { return getToken(DaxParser.PRODUCTX, 0); }
		public TerminalNode SUM() { return getToken(DaxParser.SUM, 0); }
		public TerminalNode SUMX() { return getToken(DaxParser.SUMX, 0); }
		public TerminalNode CALENDAR() { return getToken(DaxParser.CALENDAR, 0); }
		public TerminalNode CALENDARAUTO() { return getToken(DaxParser.CALENDARAUTO, 0); }
		public TerminalNode DATE() { return getToken(DaxParser.DATE, 0); }
		public TerminalNode DATEDIFF() { return getToken(DaxParser.DATEDIFF, 0); }
		public TerminalNode DATEVALUE() { return getToken(DaxParser.DATEVALUE, 0); }
		public TerminalNode DAY() { return getToken(DaxParser.DAY, 0); }
		public TerminalNode EDATE() { return getToken(DaxParser.EDATE, 0); }
		public TerminalNode EOMONTH() { return getToken(DaxParser.EOMONTH, 0); }
		public TerminalNode HOUR() { return getToken(DaxParser.HOUR, 0); }
		public TerminalNode MINUTE() { return getToken(DaxParser.MINUTE, 0); }
		public TerminalNode MONTH() { return getToken(DaxParser.MONTH, 0); }
		public TerminalNode NETWORKDAYS() { return getToken(DaxParser.NETWORKDAYS, 0); }
		public TerminalNode NOW() { return getToken(DaxParser.NOW, 0); }
		public TerminalNode QUARTER() { return getToken(DaxParser.QUARTER, 0); }
		public TerminalNode SECOND() { return getToken(DaxParser.SECOND, 0); }
		public TerminalNode TIME() { return getToken(DaxParser.TIME, 0); }
		public TerminalNode TIMEVALUE() { return getToken(DaxParser.TIMEVALUE, 0); }
		public TerminalNode TODAY() { return getToken(DaxParser.TODAY, 0); }
		public TerminalNode UTCNOW() { return getToken(DaxParser.UTCNOW, 0); }
		public TerminalNode UTCTODAY() { return getToken(DaxParser.UTCTODAY, 0); }
		public TerminalNode WEEKDAY() { return getToken(DaxParser.WEEKDAY, 0); }
		public TerminalNode WEEKNUM() { return getToken(DaxParser.WEEKNUM, 0); }
		public TerminalNode YEAR() { return getToken(DaxParser.YEAR, 0); }
		public TerminalNode YEARFRAC() { return getToken(DaxParser.YEARFRAC, 0); }
		public TerminalNode ALL() { return getToken(DaxParser.ALL, 0); }
		public TerminalNode ALLCROSSFILTERED() { return getToken(DaxParser.ALLCROSSFILTERED, 0); }
		public TerminalNode ALLEXCEPT() { return getToken(DaxParser.ALLEXCEPT, 0); }
		public TerminalNode ALLNOBLANKROW() { return getToken(DaxParser.ALLNOBLANKROW, 0); }
		public TerminalNode ALLSELECTED() { return getToken(DaxParser.ALLSELECTED, 0); }
		public TerminalNode CALCULATE() { return getToken(DaxParser.CALCULATE, 0); }
		public TerminalNode CALCULATETABLE() { return getToken(DaxParser.CALCULATETABLE, 0); }
		public TerminalNode EARLIER() { return getToken(DaxParser.EARLIER, 0); }
		public TerminalNode EARLIEST() { return getToken(DaxParser.EARLIEST, 0); }
		public TerminalNode FILTER() { return getToken(DaxParser.FILTER, 0); }
		public TerminalNode FIRSTNONBLANK() { return getToken(DaxParser.FIRSTNONBLANK, 0); }
		public TerminalNode FIRSTNONBLANKVALUE() { return getToken(DaxParser.FIRSTNONBLANKVALUE, 0); }
		public TerminalNode INDEX() { return getToken(DaxParser.INDEX, 0); }
		public TerminalNode KEEPFILTERS() { return getToken(DaxParser.KEEPFILTERS, 0); }
		public TerminalNode LASTNONBLANK() { return getToken(DaxParser.LASTNONBLANK, 0); }
		public TerminalNode LASTNONBLANKVALUE() { return getToken(DaxParser.LASTNONBLANKVALUE, 0); }
		public TerminalNode LOOKUPVALUE() { return getToken(DaxParser.LOOKUPVALUE, 0); }
		public TerminalNode MATCHBY() { return getToken(DaxParser.MATCHBY, 0); }
		public TerminalNode MOVINGAVERAGE() { return getToken(DaxParser.MOVINGAVERAGE, 0); }
		public TerminalNode OFFSET() { return getToken(DaxParser.OFFSET, 0); }
		public TerminalNode ORDERBY() { return getToken(DaxParser.ORDERBY, 0); }
		public TerminalNode PARTITIONBY() { return getToken(DaxParser.PARTITIONBY, 0); }
		public TerminalNode RANGE() { return getToken(DaxParser.RANGE, 0); }
		public TerminalNode RANK() { return getToken(DaxParser.RANK, 0); }
		public TerminalNode REMOVEFILTERS() { return getToken(DaxParser.REMOVEFILTERS, 0); }
		public TerminalNode ROWNUMBER() { return getToken(DaxParser.ROWNUMBER, 0); }
		public TerminalNode RUNNINGSUM() { return getToken(DaxParser.RUNNINGSUM, 0); }
		public TerminalNode SELECTEDVALUE() { return getToken(DaxParser.SELECTEDVALUE, 0); }
		public TerminalNode WINDOW() { return getToken(DaxParser.WINDOW, 0); }
		public TerminalNode ACCRINT() { return getToken(DaxParser.ACCRINT, 0); }
		public TerminalNode ACCRINTM() { return getToken(DaxParser.ACCRINTM, 0); }
		public TerminalNode AMORDEGRC() { return getToken(DaxParser.AMORDEGRC, 0); }
		public TerminalNode AMORLINC() { return getToken(DaxParser.AMORLINC, 0); }
		public TerminalNode COUPDAYBS() { return getToken(DaxParser.COUPDAYBS, 0); }
		public TerminalNode COUPDAYS() { return getToken(DaxParser.COUPDAYS, 0); }
		public TerminalNode COUPDAYSNC() { return getToken(DaxParser.COUPDAYSNC, 0); }
		public TerminalNode COUPNCD() { return getToken(DaxParser.COUPNCD, 0); }
		public TerminalNode COUPNUM() { return getToken(DaxParser.COUPNUM, 0); }
		public TerminalNode COUPPCD() { return getToken(DaxParser.COUPPCD, 0); }
		public TerminalNode CUMIPMT() { return getToken(DaxParser.CUMIPMT, 0); }
		public TerminalNode CUMPRINC() { return getToken(DaxParser.CUMPRINC, 0); }
		public TerminalNode DB() { return getToken(DaxParser.DB, 0); }
		public TerminalNode DDB() { return getToken(DaxParser.DDB, 0); }
		public TerminalNode DISC() { return getToken(DaxParser.DISC, 0); }
		public TerminalNode DOLLARDE() { return getToken(DaxParser.DOLLARDE, 0); }
		public TerminalNode DOLLARFR() { return getToken(DaxParser.DOLLARFR, 0); }
		public TerminalNode DURATION() { return getToken(DaxParser.DURATION, 0); }
		public TerminalNode EFFECT() { return getToken(DaxParser.EFFECT, 0); }
		public TerminalNode FV() { return getToken(DaxParser.FV, 0); }
		public TerminalNode INTRATE() { return getToken(DaxParser.INTRATE, 0); }
		public TerminalNode IPMT() { return getToken(DaxParser.IPMT, 0); }
		public TerminalNode ISPMT() { return getToken(DaxParser.ISPMT, 0); }
		public TerminalNode MDURATION() { return getToken(DaxParser.MDURATION, 0); }
		public TerminalNode NOMINAL() { return getToken(DaxParser.NOMINAL, 0); }
		public TerminalNode NPER() { return getToken(DaxParser.NPER, 0); }
		public TerminalNode ODDFPRICE() { return getToken(DaxParser.ODDFPRICE, 0); }
		public TerminalNode ODDFYIELD() { return getToken(DaxParser.ODDFYIELD, 0); }
		public TerminalNode ODDLPRICE() { return getToken(DaxParser.ODDLPRICE, 0); }
		public TerminalNode ODDLYIELD() { return getToken(DaxParser.ODDLYIELD, 0); }
		public TerminalNode PDURATION() { return getToken(DaxParser.PDURATION, 0); }
		public TerminalNode PMT() { return getToken(DaxParser.PMT, 0); }
		public TerminalNode PPMT() { return getToken(DaxParser.PPMT, 0); }
		public TerminalNode PRICE() { return getToken(DaxParser.PRICE, 0); }
		public TerminalNode PRICEDISC() { return getToken(DaxParser.PRICEDISC, 0); }
		public TerminalNode PRICEMAT() { return getToken(DaxParser.PRICEMAT, 0); }
		public TerminalNode PV() { return getToken(DaxParser.PV, 0); }
		public TerminalNode RATE() { return getToken(DaxParser.RATE, 0); }
		public TerminalNode RECEIVED() { return getToken(DaxParser.RECEIVED, 0); }
		public TerminalNode RRI() { return getToken(DaxParser.RRI, 0); }
		public TerminalNode SLN() { return getToken(DaxParser.SLN, 0); }
		public TerminalNode SYD() { return getToken(DaxParser.SYD, 0); }
		public TerminalNode TBILLEQ() { return getToken(DaxParser.TBILLEQ, 0); }
		public TerminalNode TBILLPRICE() { return getToken(DaxParser.TBILLPRICE, 0); }
		public TerminalNode TBILLYIELD() { return getToken(DaxParser.TBILLYIELD, 0); }
		public TerminalNode VDB() { return getToken(DaxParser.VDB, 0); }
		public TerminalNode XIRR() { return getToken(DaxParser.XIRR, 0); }
		public TerminalNode XNPV() { return getToken(DaxParser.XNPV, 0); }
		public TerminalNode YIELD() { return getToken(DaxParser.YIELD, 0); }
		public TerminalNode YIELDDISC() { return getToken(DaxParser.YIELDDISC, 0); }
		public TerminalNode YIELDMAT() { return getToken(DaxParser.YIELDMAT, 0); }
		public TerminalNode COLUMNSTATISTICS() { return getToken(DaxParser.COLUMNSTATISTICS, 0); }
		public TerminalNode CONTAINS() { return getToken(DaxParser.CONTAINS, 0); }
		public TerminalNode CONTAINSROW() { return getToken(DaxParser.CONTAINSROW, 0); }
		public TerminalNode CONTAINSSTRING() { return getToken(DaxParser.CONTAINSSTRING, 0); }
		public TerminalNode CONTAINSSTRINGEXACT() { return getToken(DaxParser.CONTAINSSTRINGEXACT, 0); }
		public TerminalNode CUSTOMDATA() { return getToken(DaxParser.CUSTOMDATA, 0); }
		public TerminalNode HASONEFILTER() { return getToken(DaxParser.HASONEFILTER, 0); }
		public TerminalNode HASONEVALUE() { return getToken(DaxParser.HASONEVALUE, 0); }
		public TerminalNode ISAFTER() { return getToken(DaxParser.ISAFTER, 0); }
		public TerminalNode ISBLANK() { return getToken(DaxParser.ISBLANK, 0); }
		public TerminalNode ISCROSSFILTERED() { return getToken(DaxParser.ISCROSSFILTERED, 0); }
		public TerminalNode ISEMPTY() { return getToken(DaxParser.ISEMPTY, 0); }
		public TerminalNode ISERROR() { return getToken(DaxParser.ISERROR, 0); }
		public TerminalNode ISEVEN() { return getToken(DaxParser.ISEVEN, 0); }
		public TerminalNode ISFILTERED() { return getToken(DaxParser.ISFILTERED, 0); }
		public TerminalNode ISINSCOPE() { return getToken(DaxParser.ISINSCOPE, 0); }
		public TerminalNode ISLOGICAL() { return getToken(DaxParser.ISLOGICAL, 0); }
		public TerminalNode ISNONTEXT() { return getToken(DaxParser.ISNONTEXT, 0); }
		public TerminalNode ISNUMBER() { return getToken(DaxParser.ISNUMBER, 0); }
		public TerminalNode ISODD() { return getToken(DaxParser.ISODD, 0); }
		public TerminalNode ISONORAFTER() { return getToken(DaxParser.ISONORAFTER, 0); }
		public TerminalNode ISSELECTEDMEASURE() { return getToken(DaxParser.ISSELECTEDMEASURE, 0); }
		public TerminalNode ISSUBTOTAL() { return getToken(DaxParser.ISSUBTOTAL, 0); }
		public TerminalNode ISTEXT() { return getToken(DaxParser.ISTEXT, 0); }
		public TerminalNode NONVISUAL() { return getToken(DaxParser.NONVISUAL, 0); }
		public TerminalNode SELECTEDMEASURE() { return getToken(DaxParser.SELECTEDMEASURE, 0); }
		public TerminalNode SELECTEDMEASUREFORMATSTRING() { return getToken(DaxParser.SELECTEDMEASUREFORMATSTRING, 0); }
		public TerminalNode SELECTEDMEASURENAME() { return getToken(DaxParser.SELECTEDMEASURENAME, 0); }
		public TerminalNode USERCULTURE() { return getToken(DaxParser.USERCULTURE, 0); }
		public TerminalNode USERNAME() { return getToken(DaxParser.USERNAME, 0); }
		public TerminalNode USEROBJECTID() { return getToken(DaxParser.USEROBJECTID, 0); }
		public TerminalNode USERPRINCIPALNAME() { return getToken(DaxParser.USERPRINCIPALNAME, 0); }
		public TerminalNode AND() { return getToken(DaxParser.AND, 0); }
		public TerminalNode BITAND() { return getToken(DaxParser.BITAND, 0); }
		public TerminalNode BITLSHIFT() { return getToken(DaxParser.BITLSHIFT, 0); }
		public TerminalNode BITOR() { return getToken(DaxParser.BITOR, 0); }
		public TerminalNode BITRSHIFT() { return getToken(DaxParser.BITRSHIFT, 0); }
		public TerminalNode BITXOR() { return getToken(DaxParser.BITXOR, 0); }
		public TerminalNode COALESCE() { return getToken(DaxParser.COALESCE, 0); }
		public TerminalNode FALSE() { return getToken(DaxParser.FALSE, 0); }
		public TerminalNode IF() { return getToken(DaxParser.IF, 0); }
		public TerminalNode IFDOTEAGER() { return getToken(DaxParser.IFDOTEAGER, 0); }
		public TerminalNode IFERROR() { return getToken(DaxParser.IFERROR, 0); }
		public TerminalNode NOT() { return getToken(DaxParser.NOT, 0); }
		public TerminalNode OR() { return getToken(DaxParser.OR, 0); }
		public TerminalNode SWITCH() { return getToken(DaxParser.SWITCH, 0); }
		public TerminalNode TRUE() { return getToken(DaxParser.TRUE, 0); }
		public TerminalNode ABS() { return getToken(DaxParser.ABS, 0); }
		public TerminalNode ACOS() { return getToken(DaxParser.ACOS, 0); }
		public TerminalNode ACOSH() { return getToken(DaxParser.ACOSH, 0); }
		public TerminalNode ACOT() { return getToken(DaxParser.ACOT, 0); }
		public TerminalNode ACOTH() { return getToken(DaxParser.ACOTH, 0); }
		public TerminalNode ASIN() { return getToken(DaxParser.ASIN, 0); }
		public TerminalNode ASINH() { return getToken(DaxParser.ASINH, 0); }
		public TerminalNode ATAN() { return getToken(DaxParser.ATAN, 0); }
		public TerminalNode ATANH() { return getToken(DaxParser.ATANH, 0); }
		public TerminalNode CEILING() { return getToken(DaxParser.CEILING, 0); }
		public TerminalNode CONVERT() { return getToken(DaxParser.CONVERT, 0); }
		public TerminalNode COS() { return getToken(DaxParser.COS, 0); }
		public TerminalNode COSH() { return getToken(DaxParser.COSH, 0); }
		public TerminalNode COT() { return getToken(DaxParser.COT, 0); }
		public TerminalNode COTH() { return getToken(DaxParser.COTH, 0); }
		public TerminalNode CURRENCY() { return getToken(DaxParser.CURRENCY, 0); }
		public TerminalNode DEGREES() { return getToken(DaxParser.DEGREES, 0); }
		public TerminalNode DIVIDE() { return getToken(DaxParser.DIVIDE, 0); }
		public TerminalNode EVEN() { return getToken(DaxParser.EVEN, 0); }
		public TerminalNode EXP() { return getToken(DaxParser.EXP, 0); }
		public TerminalNode FACT() { return getToken(DaxParser.FACT, 0); }
		public TerminalNode FLOOR() { return getToken(DaxParser.FLOOR, 0); }
		public TerminalNode GCD() { return getToken(DaxParser.GCD, 0); }
		public TerminalNode INT() { return getToken(DaxParser.INT, 0); }
		public TerminalNode ISODOTCEILING() { return getToken(DaxParser.ISODOTCEILING, 0); }
		public TerminalNode LCM() { return getToken(DaxParser.LCM, 0); }
		public TerminalNode LN() { return getToken(DaxParser.LN, 0); }
		public TerminalNode LOG() { return getToken(DaxParser.LOG, 0); }
		public TerminalNode LOG10() { return getToken(DaxParser.LOG10, 0); }
		public TerminalNode MOD() { return getToken(DaxParser.MOD, 0); }
		public TerminalNode MROUND() { return getToken(DaxParser.MROUND, 0); }
		public TerminalNode ODD() { return getToken(DaxParser.ODD, 0); }
		public TerminalNode PI() { return getToken(DaxParser.PI, 0); }
		public TerminalNode POWER() { return getToken(DaxParser.POWER, 0); }
		public TerminalNode QUOTIENT() { return getToken(DaxParser.QUOTIENT, 0); }
		public TerminalNode RADIANS() { return getToken(DaxParser.RADIANS, 0); }
		public TerminalNode RAND() { return getToken(DaxParser.RAND, 0); }
		public TerminalNode RANDBETWEEN() { return getToken(DaxParser.RANDBETWEEN, 0); }
		public TerminalNode ROUND() { return getToken(DaxParser.ROUND, 0); }
		public TerminalNode ROUNDDOWN() { return getToken(DaxParser.ROUNDDOWN, 0); }
		public TerminalNode ROUNDUP() { return getToken(DaxParser.ROUNDUP, 0); }
		public TerminalNode SIGN() { return getToken(DaxParser.SIGN, 0); }
		public TerminalNode SIN() { return getToken(DaxParser.SIN, 0); }
		public TerminalNode SINH() { return getToken(DaxParser.SINH, 0); }
		public TerminalNode SQRT() { return getToken(DaxParser.SQRT, 0); }
		public TerminalNode SQRTPI() { return getToken(DaxParser.SQRTPI, 0); }
		public TerminalNode TAN() { return getToken(DaxParser.TAN, 0); }
		public TerminalNode TANH() { return getToken(DaxParser.TANH, 0); }
		public TerminalNode TRUNC() { return getToken(DaxParser.TRUNC, 0); }
		public TerminalNode BLANK() { return getToken(DaxParser.BLANK, 0); }
		public TerminalNode ERROR() { return getToken(DaxParser.ERROR, 0); }
		public TerminalNode EVALUATEANDLOG() { return getToken(DaxParser.EVALUATEANDLOG, 0); }
		public TerminalNode TOCSV() { return getToken(DaxParser.TOCSV, 0); }
		public TerminalNode TOJSON() { return getToken(DaxParser.TOJSON, 0); }
		public TerminalNode PATH() { return getToken(DaxParser.PATH, 0); }
		public TerminalNode PATHCONTAINS() { return getToken(DaxParser.PATHCONTAINS, 0); }
		public TerminalNode PATHITEM() { return getToken(DaxParser.PATHITEM, 0); }
		public TerminalNode PATHITEMREVERSE() { return getToken(DaxParser.PATHITEMREVERSE, 0); }
		public TerminalNode PATHLENGTH() { return getToken(DaxParser.PATHLENGTH, 0); }
		public TerminalNode CROSSFILTER() { return getToken(DaxParser.CROSSFILTER, 0); }
		public TerminalNode RELATED() { return getToken(DaxParser.RELATED, 0); }
		public TerminalNode RELATEDTABLE() { return getToken(DaxParser.RELATEDTABLE, 0); }
		public TerminalNode USERELATIONSHIP() { return getToken(DaxParser.USERELATIONSHIP, 0); }
		public TerminalNode BETADOTDIST() { return getToken(DaxParser.BETADOTDIST, 0); }
		public TerminalNode BETADOTINV() { return getToken(DaxParser.BETADOTINV, 0); }
		public TerminalNode CHISQDOTDIST() { return getToken(DaxParser.CHISQDOTDIST, 0); }
		public TerminalNode CHISQDOTDISTDOTRT() { return getToken(DaxParser.CHISQDOTDISTDOTRT, 0); }
		public TerminalNode CHISQDOTINV() { return getToken(DaxParser.CHISQDOTINV, 0); }
		public TerminalNode CHISQDOTINVDOTRT() { return getToken(DaxParser.CHISQDOTINVDOTRT, 0); }
		public TerminalNode COMBIN() { return getToken(DaxParser.COMBIN, 0); }
		public TerminalNode COMBINA() { return getToken(DaxParser.COMBINA, 0); }
		public TerminalNode CONFIDENCEDOTNORM() { return getToken(DaxParser.CONFIDENCEDOTNORM, 0); }
		public TerminalNode CONFIDENCEDOTT() { return getToken(DaxParser.CONFIDENCEDOTT, 0); }
		public TerminalNode EXPONDOTDIST() { return getToken(DaxParser.EXPONDOTDIST, 0); }
		public TerminalNode GEOMEAN() { return getToken(DaxParser.GEOMEAN, 0); }
		public TerminalNode GEOMEANX() { return getToken(DaxParser.GEOMEANX, 0); }
		public TerminalNode LINEST() { return getToken(DaxParser.LINEST, 0); }
		public TerminalNode LINESTX() { return getToken(DaxParser.LINESTX, 0); }
		public TerminalNode MEDIAN() { return getToken(DaxParser.MEDIAN, 0); }
		public TerminalNode MEDIANX() { return getToken(DaxParser.MEDIANX, 0); }
		public TerminalNode NORMDOTDIST() { return getToken(DaxParser.NORMDOTDIST, 0); }
		public TerminalNode NORMDOTINV() { return getToken(DaxParser.NORMDOTINV, 0); }
		public TerminalNode NORMDOTSDOTDIST() { return getToken(DaxParser.NORMDOTSDOTDIST, 0); }
		public TerminalNode NORMDOTSDOTINV() { return getToken(DaxParser.NORMDOTSDOTINV, 0); }
		public TerminalNode PERCENTILEDOTEXC() { return getToken(DaxParser.PERCENTILEDOTEXC, 0); }
		public TerminalNode PERCENTILEDOTINC() { return getToken(DaxParser.PERCENTILEDOTINC, 0); }
		public TerminalNode PERCENTILEXDOTEXC() { return getToken(DaxParser.PERCENTILEXDOTEXC, 0); }
		public TerminalNode PERCENTILEXDOTINC() { return getToken(DaxParser.PERCENTILEXDOTINC, 0); }
		public TerminalNode PERMUT() { return getToken(DaxParser.PERMUT, 0); }
		public TerminalNode POISSONDOTDIST() { return getToken(DaxParser.POISSONDOTDIST, 0); }
		public TerminalNode RANKDOTEQ() { return getToken(DaxParser.RANKDOTEQ, 0); }
		public TerminalNode RANKX() { return getToken(DaxParser.RANKX, 0); }
		public TerminalNode SAMPLE() { return getToken(DaxParser.SAMPLE, 0); }
		public TerminalNode SAMPLECARTESIANPOINTSBYCOVER() { return getToken(DaxParser.SAMPLECARTESIANPOINTSBYCOVER, 0); }
		public TerminalNode STDEVDOTS() { return getToken(DaxParser.STDEVDOTS, 0); }
		public TerminalNode STDEVDOTP() { return getToken(DaxParser.STDEVDOTP, 0); }
		public TerminalNode STDEVXDOTS() { return getToken(DaxParser.STDEVXDOTS, 0); }
		public TerminalNode STDEVXDOTP() { return getToken(DaxParser.STDEVXDOTP, 0); }
		public TerminalNode TDOTDIST() { return getToken(DaxParser.TDOTDIST, 0); }
		public TerminalNode TDOTDISTDOT2T() { return getToken(DaxParser.TDOTDISTDOT2T, 0); }
		public TerminalNode TDOTDISTDOTRT() { return getToken(DaxParser.TDOTDISTDOTRT, 0); }
		public TerminalNode TDOTINV() { return getToken(DaxParser.TDOTINV, 0); }
		public TerminalNode TDOTINVDOT2T() { return getToken(DaxParser.TDOTINVDOT2T, 0); }
		public TerminalNode VARDOTS() { return getToken(DaxParser.VARDOTS, 0); }
		public TerminalNode VARDOTP() { return getToken(DaxParser.VARDOTP, 0); }
		public TerminalNode VARXDOTS() { return getToken(DaxParser.VARXDOTS, 0); }
		public TerminalNode VARXDOTP() { return getToken(DaxParser.VARXDOTP, 0); }
		public TerminalNode ADDCOLUMNS() { return getToken(DaxParser.ADDCOLUMNS, 0); }
		public TerminalNode ADDMISSINGITEMS() { return getToken(DaxParser.ADDMISSINGITEMS, 0); }
		public TerminalNode CROSSJOIN() { return getToken(DaxParser.CROSSJOIN, 0); }
		public TerminalNode CURRENTGROUP() { return getToken(DaxParser.CURRENTGROUP, 0); }
		public TerminalNode DATATABLE() { return getToken(DaxParser.DATATABLE, 0); }
		public TerminalNode DETAILROWS() { return getToken(DaxParser.DETAILROWS, 0); }
		public TerminalNode DISTINCT() { return getToken(DaxParser.DISTINCT, 0); }
		public TerminalNode EXCEPT() { return getToken(DaxParser.EXCEPT, 0); }
		public TerminalNode FILTERS() { return getToken(DaxParser.FILTERS, 0); }
		public TerminalNode GENERATE() { return getToken(DaxParser.GENERATE, 0); }
		public TerminalNode GENERATEALL() { return getToken(DaxParser.GENERATEALL, 0); }
		public TerminalNode GENERATESERIES() { return getToken(DaxParser.GENERATESERIES, 0); }
		public TerminalNode GROUPBY() { return getToken(DaxParser.GROUPBY, 0); }
		public TerminalNode IGNORE() { return getToken(DaxParser.IGNORE, 0); }
		public TerminalNode INTERSECT() { return getToken(DaxParser.INTERSECT, 0); }
		public TerminalNode NATURALINNERJOIN() { return getToken(DaxParser.NATURALINNERJOIN, 0); }
		public TerminalNode NATURALLEFTOUTERJOIN() { return getToken(DaxParser.NATURALLEFTOUTERJOIN, 0); }
		public TerminalNode ROLLUP() { return getToken(DaxParser.ROLLUP, 0); }
		public TerminalNode ROLLUPADDISSUBTOTAL() { return getToken(DaxParser.ROLLUPADDISSUBTOTAL, 0); }
		public TerminalNode ROLLUPGROUP() { return getToken(DaxParser.ROLLUPGROUP, 0); }
		public TerminalNode ROLLUPISSUBTOTAL() { return getToken(DaxParser.ROLLUPISSUBTOTAL, 0); }
		public TerminalNode ROW() { return getToken(DaxParser.ROW, 0); }
		public TerminalNode SELECTCOLUMNS() { return getToken(DaxParser.SELECTCOLUMNS, 0); }
		public TerminalNode SUBSTITUTEWITHINDEX() { return getToken(DaxParser.SUBSTITUTEWITHINDEX, 0); }
		public TerminalNode SUMMARIZE() { return getToken(DaxParser.SUMMARIZE, 0); }
		public TerminalNode SUMMARIZECOLUMNS() { return getToken(DaxParser.SUMMARIZECOLUMNS, 0); }
		public TerminalNode TOPN() { return getToken(DaxParser.TOPN, 0); }
		public TerminalNode TREATAS() { return getToken(DaxParser.TREATAS, 0); }
		public TerminalNode UNION() { return getToken(DaxParser.UNION, 0); }
		public TerminalNode VALUES() { return getToken(DaxParser.VALUES, 0); }
		public TerminalNode COMBINEVALUES() { return getToken(DaxParser.COMBINEVALUES, 0); }
		public TerminalNode CONCATENATE() { return getToken(DaxParser.CONCATENATE, 0); }
		public TerminalNode CONCATENATEX() { return getToken(DaxParser.CONCATENATEX, 0); }
		public TerminalNode EXACT() { return getToken(DaxParser.EXACT, 0); }
		public TerminalNode FIND() { return getToken(DaxParser.FIND, 0); }
		public TerminalNode FIXED() { return getToken(DaxParser.FIXED, 0); }
		public TerminalNode FORMAT() { return getToken(DaxParser.FORMAT, 0); }
		public TerminalNode LEFT() { return getToken(DaxParser.LEFT, 0); }
		public TerminalNode LEN() { return getToken(DaxParser.LEN, 0); }
		public TerminalNode LOWER() { return getToken(DaxParser.LOWER, 0); }
		public TerminalNode MID() { return getToken(DaxParser.MID, 0); }
		public TerminalNode REPLACE() { return getToken(DaxParser.REPLACE, 0); }
		public TerminalNode REPT() { return getToken(DaxParser.REPT, 0); }
		public TerminalNode RIGHT() { return getToken(DaxParser.RIGHT, 0); }
		public TerminalNode SEARCH() { return getToken(DaxParser.SEARCH, 0); }
		public TerminalNode SUBSTITUTE() { return getToken(DaxParser.SUBSTITUTE, 0); }
		public TerminalNode TRIM() { return getToken(DaxParser.TRIM, 0); }
		public TerminalNode UNICHAR() { return getToken(DaxParser.UNICHAR, 0); }
		public TerminalNode UNICODE() { return getToken(DaxParser.UNICODE, 0); }
		public TerminalNode UPPER() { return getToken(DaxParser.UPPER, 0); }
		public TerminalNode VALUE() { return getToken(DaxParser.VALUE, 0); }
		public TerminalNode CLOSINGBALANCEMONTH() { return getToken(DaxParser.CLOSINGBALANCEMONTH, 0); }
		public TerminalNode CLOSINGBALANCEQUARTER() { return getToken(DaxParser.CLOSINGBALANCEQUARTER, 0); }
		public TerminalNode CLOSINGBALANCEYEAR() { return getToken(DaxParser.CLOSINGBALANCEYEAR, 0); }
		public TerminalNode DATEADD() { return getToken(DaxParser.DATEADD, 0); }
		public TerminalNode DATESBETWEEN() { return getToken(DaxParser.DATESBETWEEN, 0); }
		public TerminalNode DATESINPERIOD() { return getToken(DaxParser.DATESINPERIOD, 0); }
		public TerminalNode DATESMTD() { return getToken(DaxParser.DATESMTD, 0); }
		public TerminalNode DATESQTD() { return getToken(DaxParser.DATESQTD, 0); }
		public TerminalNode DATESYTD() { return getToken(DaxParser.DATESYTD, 0); }
		public TerminalNode ENDOFMONTH() { return getToken(DaxParser.ENDOFMONTH, 0); }
		public TerminalNode ENDOFQUARTER() { return getToken(DaxParser.ENDOFQUARTER, 0); }
		public TerminalNode ENDOFYEAR() { return getToken(DaxParser.ENDOFYEAR, 0); }
		public TerminalNode FIRSTDATE() { return getToken(DaxParser.FIRSTDATE, 0); }
		public TerminalNode LASTDATE() { return getToken(DaxParser.LASTDATE, 0); }
		public TerminalNode NEXTDAY() { return getToken(DaxParser.NEXTDAY, 0); }
		public TerminalNode NEXTMONTH() { return getToken(DaxParser.NEXTMONTH, 0); }
		public TerminalNode NEXTQUARTER() { return getToken(DaxParser.NEXTQUARTER, 0); }
		public TerminalNode NEXTYEAR() { return getToken(DaxParser.NEXTYEAR, 0); }
		public TerminalNode OPENINGBALANCEMONTH() { return getToken(DaxParser.OPENINGBALANCEMONTH, 0); }
		public TerminalNode OPENINGBALANCEQUARTER() { return getToken(DaxParser.OPENINGBALANCEQUARTER, 0); }
		public TerminalNode OPENINGBALANCEYEAR() { return getToken(DaxParser.OPENINGBALANCEYEAR, 0); }
		public TerminalNode PARALLELPERIOD() { return getToken(DaxParser.PARALLELPERIOD, 0); }
		public TerminalNode PREVIOUSDAY() { return getToken(DaxParser.PREVIOUSDAY, 0); }
		public TerminalNode PREVIOUSMONTH() { return getToken(DaxParser.PREVIOUSMONTH, 0); }
		public TerminalNode PREVIOUSQUARTER() { return getToken(DaxParser.PREVIOUSQUARTER, 0); }
		public TerminalNode PREVIOUSYEAR() { return getToken(DaxParser.PREVIOUSYEAR, 0); }
		public TerminalNode SAMEPERIODLASTYEAR() { return getToken(DaxParser.SAMEPERIODLASTYEAR, 0); }
		public TerminalNode STARTOFMONTH() { return getToken(DaxParser.STARTOFMONTH, 0); }
		public TerminalNode STARTOFQUARTER() { return getToken(DaxParser.STARTOFQUARTER, 0); }
		public TerminalNode STARTOFYEAR() { return getToken(DaxParser.STARTOFYEAR, 0); }
		public TerminalNode TOTALMTD() { return getToken(DaxParser.TOTALMTD, 0); }
		public TerminalNode TOTALQTD() { return getToken(DaxParser.TOTALQTD, 0); }
		public TerminalNode TOTALYTD() { return getToken(DaxParser.TOTALYTD, 0); }
		public DaxFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_daxFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DaxListener ) ((DaxListener)listener).enterDaxFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DaxListener ) ((DaxListener)listener).exitDaxFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaxVisitor ) return ((DaxVisitor<? extends T>)visitor).visitDaxFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DaxFunctionContext daxFunction() throws RecognitionException {
		DaxFunctionContext _localctx = new DaxFunctionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_daxFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			_la = _input.LA(1);
			if ( !(((((_la - 32)) & ~0x3f) == 0 && ((1L << (_la - 32)) & ((1L << (APPROXIMATEDISTINCTCOUNT - 32)) | (1L << (AVERAGE - 32)) | (1L << (AVERAGEA - 32)) | (1L << (AVERAGEX - 32)) | (1L << (COUNT - 32)) | (1L << (COUNTA - 32)) | (1L << (COUNTAX - 32)) | (1L << (COUNTBLANK - 32)) | (1L << (COUNTROWS - 32)) | (1L << (COUNTX - 32)) | (1L << (DISTINCTCOUNT - 32)) | (1L << (DISTINCTCOUNTNOBLANK - 32)) | (1L << (MAX - 32)) | (1L << (MAXA - 32)) | (1L << (MAXX - 32)) | (1L << (MIN - 32)) | (1L << (MINA - 32)) | (1L << (MINX - 32)) | (1L << (PRODUCT - 32)) | (1L << (PRODUCTX - 32)) | (1L << (SUM - 32)) | (1L << (SUMX - 32)) | (1L << (CALENDAR - 32)) | (1L << (CALENDARAUTO - 32)) | (1L << (DATE - 32)) | (1L << (DATEDIFF - 32)) | (1L << (DATEVALUE - 32)) | (1L << (DAY - 32)) | (1L << (EDATE - 32)) | (1L << (EOMONTH - 32)) | (1L << (HOUR - 32)) | (1L << (MINUTE - 32)) | (1L << (MONTH - 32)) | (1L << (NETWORKDAYS - 32)) | (1L << (NOW - 32)) | (1L << (QUARTER - 32)) | (1L << (SECOND - 32)) | (1L << (TIME - 32)) | (1L << (TIMEVALUE - 32)) | (1L << (TODAY - 32)) | (1L << (UTCNOW - 32)) | (1L << (UTCTODAY - 32)) | (1L << (WEEKDAY - 32)) | (1L << (WEEKNUM - 32)) | (1L << (YEAR - 32)) | (1L << (YEARFRAC - 32)) | (1L << (ALL - 32)) | (1L << (ALLCROSSFILTERED - 32)) | (1L << (ALLEXCEPT - 32)) | (1L << (ALLNOBLANKROW - 32)) | (1L << (ALLSELECTED - 32)) | (1L << (CALCULATE - 32)) | (1L << (CALCULATETABLE - 32)) | (1L << (EARLIER - 32)) | (1L << (EARLIEST - 32)) | (1L << (FILTER - 32)) | (1L << (FIRSTNONBLANK - 32)) | (1L << (FIRSTNONBLANKVALUE - 32)) | (1L << (INDEX - 32)) | (1L << (KEEPFILTERS - 32)) | (1L << (LASTNONBLANK - 32)) | (1L << (LASTNONBLANKVALUE - 32)) | (1L << (LOOKUPVALUE - 32)) | (1L << (MATCHBY - 32)))) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (MOVINGAVERAGE - 96)) | (1L << (OFFSET - 96)) | (1L << (ORDERBY - 96)) | (1L << (PARTITIONBY - 96)) | (1L << (RANGE - 96)) | (1L << (RANK - 96)) | (1L << (REMOVEFILTERS - 96)) | (1L << (ROWNUMBER - 96)) | (1L << (RUNNINGSUM - 96)) | (1L << (SELECTEDVALUE - 96)) | (1L << (WINDOW - 96)) | (1L << (ACCRINT - 96)) | (1L << (ACCRINTM - 96)) | (1L << (AMORDEGRC - 96)) | (1L << (AMORLINC - 96)) | (1L << (COUPDAYBS - 96)) | (1L << (COUPDAYS - 96)) | (1L << (COUPDAYSNC - 96)) | (1L << (COUPNCD - 96)) | (1L << (COUPNUM - 96)) | (1L << (COUPPCD - 96)) | (1L << (CUMIPMT - 96)) | (1L << (CUMPRINC - 96)) | (1L << (DB - 96)) | (1L << (DDB - 96)) | (1L << (DISC - 96)) | (1L << (DOLLARDE - 96)) | (1L << (DOLLARFR - 96)) | (1L << (DURATION - 96)) | (1L << (EFFECT - 96)) | (1L << (FV - 96)) | (1L << (INTRATE - 96)) | (1L << (IPMT - 96)) | (1L << (ISPMT - 96)) | (1L << (MDURATION - 96)) | (1L << (NOMINAL - 96)) | (1L << (NPER - 96)) | (1L << (ODDFPRICE - 96)) | (1L << (ODDFYIELD - 96)) | (1L << (ODDLPRICE - 96)) | (1L << (ODDLYIELD - 96)) | (1L << (PDURATION - 96)) | (1L << (PMT - 96)) | (1L << (PPMT - 96)) | (1L << (PRICE - 96)) | (1L << (PRICEDISC - 96)) | (1L << (PRICEMAT - 96)) | (1L << (PV - 96)) | (1L << (RATE - 96)) | (1L << (RECEIVED - 96)) | (1L << (RRI - 96)) | (1L << (SLN - 96)) | (1L << (SYD - 96)) | (1L << (TBILLEQ - 96)) | (1L << (TBILLPRICE - 96)) | (1L << (TBILLYIELD - 96)) | (1L << (VDB - 96)) | (1L << (XIRR - 96)) | (1L << (XNPV - 96)) | (1L << (YIELD - 96)) | (1L << (YIELDDISC - 96)) | (1L << (YIELDMAT - 96)) | (1L << (COLUMNSTATISTICS - 96)) | (1L << (CONTAINS - 96)))) != 0) || ((((_la - 160)) & ~0x3f) == 0 && ((1L << (_la - 160)) & ((1L << (CONTAINSROW - 160)) | (1L << (CONTAINSSTRING - 160)) | (1L << (CONTAINSSTRINGEXACT - 160)) | (1L << (CUSTOMDATA - 160)) | (1L << (HASONEFILTER - 160)) | (1L << (HASONEVALUE - 160)) | (1L << (ISAFTER - 160)) | (1L << (ISBLANK - 160)) | (1L << (ISCROSSFILTERED - 160)) | (1L << (ISEMPTY - 160)) | (1L << (ISERROR - 160)) | (1L << (ISEVEN - 160)) | (1L << (ISFILTERED - 160)) | (1L << (ISINSCOPE - 160)) | (1L << (ISLOGICAL - 160)) | (1L << (ISNONTEXT - 160)) | (1L << (ISNUMBER - 160)) | (1L << (ISODD - 160)) | (1L << (ISONORAFTER - 160)) | (1L << (ISSELECTEDMEASURE - 160)) | (1L << (ISSUBTOTAL - 160)) | (1L << (ISTEXT - 160)) | (1L << (NONVISUAL - 160)) | (1L << (SELECTEDMEASURE - 160)) | (1L << (SELECTEDMEASUREFORMATSTRING - 160)) | (1L << (SELECTEDMEASURENAME - 160)) | (1L << (USERCULTURE - 160)) | (1L << (USERNAME - 160)) | (1L << (USEROBJECTID - 160)) | (1L << (USERPRINCIPALNAME - 160)) | (1L << (AND - 160)) | (1L << (BITAND - 160)) | (1L << (BITLSHIFT - 160)) | (1L << (BITOR - 160)) | (1L << (BITRSHIFT - 160)) | (1L << (BITXOR - 160)) | (1L << (COALESCE - 160)) | (1L << (FALSE - 160)) | (1L << (IF - 160)) | (1L << (IFDOTEAGER - 160)) | (1L << (IFERROR - 160)) | (1L << (NOT - 160)) | (1L << (OR - 160)) | (1L << (SWITCH - 160)) | (1L << (TRUE - 160)) | (1L << (ABS - 160)) | (1L << (ACOS - 160)) | (1L << (ACOSH - 160)) | (1L << (ACOT - 160)) | (1L << (ACOTH - 160)) | (1L << (ASIN - 160)) | (1L << (ASINH - 160)) | (1L << (ATAN - 160)) | (1L << (ATANH - 160)) | (1L << (CEILING - 160)) | (1L << (CONVERT - 160)) | (1L << (COS - 160)) | (1L << (COSH - 160)) | (1L << (COT - 160)) | (1L << (COTH - 160)) | (1L << (CURRENCY - 160)) | (1L << (DEGREES - 160)) | (1L << (DIVIDE - 160)) | (1L << (EVEN - 160)))) != 0) || ((((_la - 224)) & ~0x3f) == 0 && ((1L << (_la - 224)) & ((1L << (EXP - 224)) | (1L << (FACT - 224)) | (1L << (FLOOR - 224)) | (1L << (GCD - 224)) | (1L << (INT - 224)) | (1L << (ISODOTCEILING - 224)) | (1L << (LCM - 224)) | (1L << (LN - 224)) | (1L << (LOG - 224)) | (1L << (LOG10 - 224)) | (1L << (MOD - 224)) | (1L << (MROUND - 224)) | (1L << (ODD - 224)) | (1L << (PI - 224)) | (1L << (POWER - 224)) | (1L << (QUOTIENT - 224)) | (1L << (RADIANS - 224)) | (1L << (RAND - 224)) | (1L << (RANDBETWEEN - 224)) | (1L << (ROUND - 224)) | (1L << (ROUNDDOWN - 224)) | (1L << (ROUNDUP - 224)) | (1L << (SIGN - 224)) | (1L << (SIN - 224)) | (1L << (SINH - 224)) | (1L << (SQRT - 224)) | (1L << (SQRTPI - 224)) | (1L << (TAN - 224)) | (1L << (TANH - 224)) | (1L << (TRUNC - 224)) | (1L << (BLANK - 224)) | (1L << (ERROR - 224)) | (1L << (EVALUATEANDLOG - 224)) | (1L << (TOCSV - 224)) | (1L << (TOJSON - 224)) | (1L << (PATH - 224)) | (1L << (PATHCONTAINS - 224)) | (1L << (PATHITEM - 224)) | (1L << (PATHITEMREVERSE - 224)) | (1L << (PATHLENGTH - 224)) | (1L << (CROSSFILTER - 224)) | (1L << (RELATED - 224)) | (1L << (RELATEDTABLE - 224)) | (1L << (USERELATIONSHIP - 224)) | (1L << (BETADOTDIST - 224)) | (1L << (BETADOTINV - 224)) | (1L << (CHISQDOTDIST - 224)) | (1L << (CHISQDOTDISTDOTRT - 224)) | (1L << (CHISQDOTINV - 224)) | (1L << (CHISQDOTINVDOTRT - 224)) | (1L << (COMBIN - 224)) | (1L << (COMBINA - 224)) | (1L << (CONFIDENCEDOTNORM - 224)) | (1L << (CONFIDENCEDOTT - 224)) | (1L << (EXPONDOTDIST - 224)) | (1L << (GEOMEAN - 224)) | (1L << (GEOMEANX - 224)) | (1L << (LINEST - 224)) | (1L << (LINESTX - 224)) | (1L << (MEDIAN - 224)) | (1L << (MEDIANX - 224)) | (1L << (NORMDOTDIST - 224)) | (1L << (NORMDOTINV - 224)) | (1L << (NORMDOTSDOTDIST - 224)))) != 0) || ((((_la - 288)) & ~0x3f) == 0 && ((1L << (_la - 288)) & ((1L << (NORMDOTSDOTINV - 288)) | (1L << (PERCENTILEDOTEXC - 288)) | (1L << (PERCENTILEDOTINC - 288)) | (1L << (PERCENTILEXDOTEXC - 288)) | (1L << (PERCENTILEXDOTINC - 288)) | (1L << (PERMUT - 288)) | (1L << (POISSONDOTDIST - 288)) | (1L << (RANKDOTEQ - 288)) | (1L << (RANKX - 288)) | (1L << (SAMPLE - 288)) | (1L << (SAMPLECARTESIANPOINTSBYCOVER - 288)) | (1L << (STDEVDOTS - 288)) | (1L << (STDEVDOTP - 288)) | (1L << (STDEVXDOTS - 288)) | (1L << (STDEVXDOTP - 288)) | (1L << (TDOTDIST - 288)) | (1L << (TDOTDISTDOT2T - 288)) | (1L << (TDOTDISTDOTRT - 288)) | (1L << (TDOTINV - 288)) | (1L << (TDOTINVDOT2T - 288)) | (1L << (VARDOTS - 288)) | (1L << (VARDOTP - 288)) | (1L << (VARXDOTS - 288)) | (1L << (VARXDOTP - 288)) | (1L << (ADDCOLUMNS - 288)) | (1L << (ADDMISSINGITEMS - 288)) | (1L << (CROSSJOIN - 288)) | (1L << (CURRENTGROUP - 288)) | (1L << (DATATABLE - 288)) | (1L << (DETAILROWS - 288)) | (1L << (DISTINCT - 288)) | (1L << (EXCEPT - 288)) | (1L << (FILTERS - 288)) | (1L << (GENERATE - 288)) | (1L << (GENERATEALL - 288)) | (1L << (GENERATESERIES - 288)) | (1L << (GROUPBY - 288)) | (1L << (IGNORE - 288)) | (1L << (INTERSECT - 288)) | (1L << (NATURALINNERJOIN - 288)) | (1L << (NATURALLEFTOUTERJOIN - 288)) | (1L << (ROLLUP - 288)) | (1L << (ROLLUPADDISSUBTOTAL - 288)) | (1L << (ROLLUPGROUP - 288)) | (1L << (ROLLUPISSUBTOTAL - 288)) | (1L << (ROW - 288)) | (1L << (SELECTCOLUMNS - 288)) | (1L << (SUBSTITUTEWITHINDEX - 288)) | (1L << (SUMMARIZE - 288)) | (1L << (SUMMARIZECOLUMNS - 288)) | (1L << (TOPN - 288)) | (1L << (TREATAS - 288)) | (1L << (UNION - 288)) | (1L << (VALUES - 288)) | (1L << (COMBINEVALUES - 288)) | (1L << (CONCATENATE - 288)) | (1L << (CONCATENATEX - 288)) | (1L << (EXACT - 288)) | (1L << (FIND - 288)) | (1L << (FIXED - 288)) | (1L << (FORMAT - 288)) | (1L << (LEFT - 288)) | (1L << (LEN - 288)) | (1L << (LOWER - 288)))) != 0) || ((((_la - 352)) & ~0x3f) == 0 && ((1L << (_la - 352)) & ((1L << (MID - 352)) | (1L << (REPLACE - 352)) | (1L << (REPT - 352)) | (1L << (RIGHT - 352)) | (1L << (SEARCH - 352)) | (1L << (SUBSTITUTE - 352)) | (1L << (TRIM - 352)) | (1L << (UNICHAR - 352)) | (1L << (UNICODE - 352)) | (1L << (UPPER - 352)) | (1L << (VALUE - 352)) | (1L << (CLOSINGBALANCEMONTH - 352)) | (1L << (CLOSINGBALANCEQUARTER - 352)) | (1L << (CLOSINGBALANCEYEAR - 352)) | (1L << (DATEADD - 352)) | (1L << (DATESBETWEEN - 352)) | (1L << (DATESINPERIOD - 352)) | (1L << (DATESMTD - 352)) | (1L << (DATESQTD - 352)) | (1L << (DATESYTD - 352)) | (1L << (ENDOFMONTH - 352)) | (1L << (ENDOFQUARTER - 352)) | (1L << (ENDOFYEAR - 352)) | (1L << (FIRSTDATE - 352)) | (1L << (LASTDATE - 352)) | (1L << (NEXTDAY - 352)) | (1L << (NEXTMONTH - 352)) | (1L << (NEXTQUARTER - 352)) | (1L << (NEXTYEAR - 352)) | (1L << (OPENINGBALANCEMONTH - 352)) | (1L << (OPENINGBALANCEQUARTER - 352)) | (1L << (OPENINGBALANCEYEAR - 352)) | (1L << (PARALLELPERIOD - 352)) | (1L << (PREVIOUSDAY - 352)) | (1L << (PREVIOUSMONTH - 352)) | (1L << (PREVIOUSQUARTER - 352)) | (1L << (PREVIOUSYEAR - 352)) | (1L << (SAMEPERIODLASTYEAR - 352)) | (1L << (STARTOFMONTH - 352)) | (1L << (STARTOFQUARTER - 352)) | (1L << (STARTOFYEAR - 352)) | (1L << (TOTALMTD - 352)) | (1L << (TOTALQTD - 352)) | (1L << (TOTALYTD - 352)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class IdentifierContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(DaxParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(DaxParser.IDENTIFIER, i);
		}
		public TerminalNode LBRACK() { return getToken(DaxParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(DaxParser.RBRACK, 0); }
		public TerminalNode SINGLE_QUOTED_IDENTIFIER() { return getToken(DaxParser.SINGLE_QUOTED_IDENTIFIER, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DaxListener ) ((DaxListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DaxListener ) ((DaxListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaxVisitor ) return ((DaxVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_identifier);
		try {
			setState(115);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				match(IDENTIFIER);
				setState(104);
				match(LBRACK);
				setState(105);
				match(IDENTIFIER);
				setState(106);
				match(RBRACK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				match(SINGLE_QUOTED_IDENTIFIER);
				setState(108);
				match(LBRACK);
				setState(109);
				match(IDENTIFIER);
				setState(110);
				match(RBRACK);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(111);
				match(LBRACK);
				setState(112);
				match(IDENTIFIER);
				setState(113);
				match(RBRACK);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(114);
				match(IDENTIFIER);
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

	public static class NumericLiteralContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(DaxParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(DaxParser.DIGIT, i);
		}
		public NumericLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DaxListener ) ((DaxListener)listener).enterNumericLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DaxListener ) ((DaxListener)listener).exitNumericLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaxVisitor ) return ((DaxVisitor<? extends T>)visitor).visitNumericLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericLiteralContext numericLiteral() throws RecognitionException {
		NumericLiteralContext _localctx = new NumericLiteralContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_numericLiteral);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(118); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(117);
					match(DIGIT);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(120); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(128);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(122);
				match(DOT);
				setState(124); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(123);
						match(DIGIT);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(126); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class StringLiteralContext extends ParserRuleContext {
		public StringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DaxListener ) ((DaxListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DaxListener ) ((DaxListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DaxVisitor ) return ((DaxVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringLiteralContext stringLiteral() throws RecognitionException {
		StringLiteralContext _localctx = new StringLiteralContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_stringLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(T__0);
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << SINGLE_QUOTED_IDENTIFIER) | (1L << MEASURE_ASSIGNMENT) | (1L << EQUALS) | (1L << PLUS) | (1L << MINUS) | (1L << TIMES) | (1L << DIVIDE_OP) | (1L << POWER_OP) | (1L << ARE_EQUAL_OP) | (1L << GREATER_THAN_EQUALS_OP) | (1L << LESS_THAN_EQUALS_OP) | (1L << NOT_EQUAL_OP) | (1L << GREATER_THAN_OP) | (1L << LESS_THAN_OP) | (1L << CONCATENATE_OP) | (1L << LOGICAL_AND) | (1L << LOGICAL_OR) | (1L << LOGICAL_IN) | (1L << LPAREN) | (1L << RPAREN) | (1L << LCURLY) | (1L << RCURLY) | (1L << LBRACK) | (1L << RBRACK) | (1L << SINGLE_QUOTE) | (1L << COMMA) | (1L << DOT) | (1L << BOOLEAN) | (1L << ORDERING) | (1L << APPROXIMATEDISTINCTCOUNT) | (1L << AVERAGE) | (1L << AVERAGEA) | (1L << AVERAGEX) | (1L << COUNT) | (1L << COUNTA) | (1L << COUNTAX) | (1L << COUNTBLANK) | (1L << COUNTROWS) | (1L << COUNTX) | (1L << DISTINCTCOUNT) | (1L << DISTINCTCOUNTNOBLANK) | (1L << MAX) | (1L << MAXA) | (1L << MAXX) | (1L << MIN) | (1L << MINA) | (1L << MINX) | (1L << PRODUCT) | (1L << PRODUCTX) | (1L << SUM) | (1L << SUMX) | (1L << CALENDAR) | (1L << CALENDARAUTO) | (1L << DATE) | (1L << DATEDIFF) | (1L << DATEVALUE) | (1L << DAY) | (1L << EDATE) | (1L << EOMONTH) | (1L << HOUR) | (1L << MINUTE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (MONTH - 64)) | (1L << (NETWORKDAYS - 64)) | (1L << (NOW - 64)) | (1L << (QUARTER - 64)) | (1L << (SECOND - 64)) | (1L << (TIME - 64)) | (1L << (TIMEVALUE - 64)) | (1L << (TODAY - 64)) | (1L << (UTCNOW - 64)) | (1L << (UTCTODAY - 64)) | (1L << (WEEKDAY - 64)) | (1L << (WEEKNUM - 64)) | (1L << (YEAR - 64)) | (1L << (YEARFRAC - 64)) | (1L << (ALL - 64)) | (1L << (ALLCROSSFILTERED - 64)) | (1L << (ALLEXCEPT - 64)) | (1L << (ALLNOBLANKROW - 64)) | (1L << (ALLSELECTED - 64)) | (1L << (CALCULATE - 64)) | (1L << (CALCULATETABLE - 64)) | (1L << (EARLIER - 64)) | (1L << (EARLIEST - 64)) | (1L << (FILTER - 64)) | (1L << (FIRSTNONBLANK - 64)) | (1L << (FIRSTNONBLANKVALUE - 64)) | (1L << (INDEX - 64)) | (1L << (KEEPFILTERS - 64)) | (1L << (LASTNONBLANK - 64)) | (1L << (LASTNONBLANKVALUE - 64)) | (1L << (LOOKUPVALUE - 64)) | (1L << (MATCHBY - 64)) | (1L << (MOVINGAVERAGE - 64)) | (1L << (OFFSET - 64)) | (1L << (ORDERBY - 64)) | (1L << (PARTITIONBY - 64)) | (1L << (RANGE - 64)) | (1L << (RANK - 64)) | (1L << (REMOVEFILTERS - 64)) | (1L << (ROWNUMBER - 64)) | (1L << (RUNNINGSUM - 64)) | (1L << (SELECTEDVALUE - 64)) | (1L << (WINDOW - 64)) | (1L << (ACCRINT - 64)) | (1L << (ACCRINTM - 64)) | (1L << (AMORDEGRC - 64)) | (1L << (AMORLINC - 64)) | (1L << (COUPDAYBS - 64)) | (1L << (COUPDAYS - 64)) | (1L << (COUPDAYSNC - 64)) | (1L << (COUPNCD - 64)) | (1L << (COUPNUM - 64)) | (1L << (COUPPCD - 64)) | (1L << (CUMIPMT - 64)) | (1L << (CUMPRINC - 64)) | (1L << (DB - 64)) | (1L << (DDB - 64)) | (1L << (DISC - 64)) | (1L << (DOLLARDE - 64)) | (1L << (DOLLARFR - 64)) | (1L << (DURATION - 64)) | (1L << (EFFECT - 64)) | (1L << (FV - 64)) | (1L << (INTRATE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (IPMT - 128)) | (1L << (ISPMT - 128)) | (1L << (MDURATION - 128)) | (1L << (NOMINAL - 128)) | (1L << (NPER - 128)) | (1L << (ODDFPRICE - 128)) | (1L << (ODDFYIELD - 128)) | (1L << (ODDLPRICE - 128)) | (1L << (ODDLYIELD - 128)) | (1L << (PDURATION - 128)) | (1L << (PMT - 128)) | (1L << (PPMT - 128)) | (1L << (PRICE - 128)) | (1L << (PRICEDISC - 128)) | (1L << (PRICEMAT - 128)) | (1L << (PV - 128)) | (1L << (RATE - 128)) | (1L << (RECEIVED - 128)) | (1L << (RRI - 128)) | (1L << (SLN - 128)) | (1L << (SYD - 128)) | (1L << (TBILLEQ - 128)) | (1L << (TBILLPRICE - 128)) | (1L << (TBILLYIELD - 128)) | (1L << (VDB - 128)) | (1L << (XIRR - 128)) | (1L << (XNPV - 128)) | (1L << (YIELD - 128)) | (1L << (YIELDDISC - 128)) | (1L << (YIELDMAT - 128)) | (1L << (COLUMNSTATISTICS - 128)) | (1L << (CONTAINS - 128)) | (1L << (CONTAINSROW - 128)) | (1L << (CONTAINSSTRING - 128)) | (1L << (CONTAINSSTRINGEXACT - 128)) | (1L << (CUSTOMDATA - 128)) | (1L << (HASONEFILTER - 128)) | (1L << (HASONEVALUE - 128)) | (1L << (ISAFTER - 128)) | (1L << (ISBLANK - 128)) | (1L << (ISCROSSFILTERED - 128)) | (1L << (ISEMPTY - 128)) | (1L << (ISERROR - 128)) | (1L << (ISEVEN - 128)) | (1L << (ISFILTERED - 128)) | (1L << (ISINSCOPE - 128)) | (1L << (ISLOGICAL - 128)) | (1L << (ISNONTEXT - 128)) | (1L << (ISNUMBER - 128)) | (1L << (ISODD - 128)) | (1L << (ISONORAFTER - 128)) | (1L << (ISSELECTEDMEASURE - 128)) | (1L << (ISSUBTOTAL - 128)) | (1L << (ISTEXT - 128)) | (1L << (NONVISUAL - 128)) | (1L << (SELECTEDMEASURE - 128)) | (1L << (SELECTEDMEASUREFORMATSTRING - 128)) | (1L << (SELECTEDMEASURENAME - 128)) | (1L << (USERCULTURE - 128)) | (1L << (USERNAME - 128)) | (1L << (USEROBJECTID - 128)) | (1L << (USERPRINCIPALNAME - 128)) | (1L << (AND - 128)) | (1L << (BITAND - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (BITLSHIFT - 192)) | (1L << (BITOR - 192)) | (1L << (BITRSHIFT - 192)) | (1L << (BITXOR - 192)) | (1L << (COALESCE - 192)) | (1L << (FALSE - 192)) | (1L << (IF - 192)) | (1L << (IFDOTEAGER - 192)) | (1L << (IFERROR - 192)) | (1L << (NOT - 192)) | (1L << (OR - 192)) | (1L << (SWITCH - 192)) | (1L << (TRUE - 192)) | (1L << (ABS - 192)) | (1L << (ACOS - 192)) | (1L << (ACOSH - 192)) | (1L << (ACOT - 192)) | (1L << (ACOTH - 192)) | (1L << (ASIN - 192)) | (1L << (ASINH - 192)) | (1L << (ATAN - 192)) | (1L << (ATANH - 192)) | (1L << (CEILING - 192)) | (1L << (CONVERT - 192)) | (1L << (COS - 192)) | (1L << (COSH - 192)) | (1L << (COT - 192)) | (1L << (COTH - 192)) | (1L << (CURRENCY - 192)) | (1L << (DEGREES - 192)) | (1L << (DIVIDE - 192)) | (1L << (EVEN - 192)) | (1L << (EXP - 192)) | (1L << (FACT - 192)) | (1L << (FLOOR - 192)) | (1L << (GCD - 192)) | (1L << (INT - 192)) | (1L << (ISODOTCEILING - 192)) | (1L << (LCM - 192)) | (1L << (LN - 192)) | (1L << (LOG - 192)) | (1L << (LOG10 - 192)) | (1L << (MOD - 192)) | (1L << (MROUND - 192)) | (1L << (ODD - 192)) | (1L << (PI - 192)) | (1L << (POWER - 192)) | (1L << (QUOTIENT - 192)) | (1L << (RADIANS - 192)) | (1L << (RAND - 192)) | (1L << (RANDBETWEEN - 192)) | (1L << (ROUND - 192)) | (1L << (ROUNDDOWN - 192)) | (1L << (ROUNDUP - 192)) | (1L << (SIGN - 192)) | (1L << (SIN - 192)) | (1L << (SINH - 192)) | (1L << (SQRT - 192)) | (1L << (SQRTPI - 192)) | (1L << (TAN - 192)) | (1L << (TANH - 192)) | (1L << (TRUNC - 192)) | (1L << (BLANK - 192)) | (1L << (ERROR - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (EVALUATEANDLOG - 256)) | (1L << (TOCSV - 256)) | (1L << (TOJSON - 256)) | (1L << (PATH - 256)) | (1L << (PATHCONTAINS - 256)) | (1L << (PATHITEM - 256)) | (1L << (PATHITEMREVERSE - 256)) | (1L << (PATHLENGTH - 256)) | (1L << (CROSSFILTER - 256)) | (1L << (RELATED - 256)) | (1L << (RELATEDTABLE - 256)) | (1L << (USERELATIONSHIP - 256)) | (1L << (BETADOTDIST - 256)) | (1L << (BETADOTINV - 256)) | (1L << (CHISQDOTDIST - 256)) | (1L << (CHISQDOTDISTDOTRT - 256)) | (1L << (CHISQDOTINV - 256)) | (1L << (CHISQDOTINVDOTRT - 256)) | (1L << (COMBIN - 256)) | (1L << (COMBINA - 256)) | (1L << (CONFIDENCEDOTNORM - 256)) | (1L << (CONFIDENCEDOTT - 256)) | (1L << (EXPONDOTDIST - 256)) | (1L << (GEOMEAN - 256)) | (1L << (GEOMEANX - 256)) | (1L << (LINEST - 256)) | (1L << (LINESTX - 256)) | (1L << (MEDIAN - 256)) | (1L << (MEDIANX - 256)) | (1L << (NORMDOTDIST - 256)) | (1L << (NORMDOTINV - 256)) | (1L << (NORMDOTSDOTDIST - 256)) | (1L << (NORMDOTSDOTINV - 256)) | (1L << (PERCENTILEDOTEXC - 256)) | (1L << (PERCENTILEDOTINC - 256)) | (1L << (PERCENTILEXDOTEXC - 256)) | (1L << (PERCENTILEXDOTINC - 256)) | (1L << (PERMUT - 256)) | (1L << (POISSONDOTDIST - 256)) | (1L << (RANKDOTEQ - 256)) | (1L << (RANKX - 256)) | (1L << (SAMPLE - 256)) | (1L << (SAMPLECARTESIANPOINTSBYCOVER - 256)) | (1L << (STDEVDOTS - 256)) | (1L << (STDEVDOTP - 256)) | (1L << (STDEVXDOTS - 256)) | (1L << (STDEVXDOTP - 256)) | (1L << (TDOTDIST - 256)) | (1L << (TDOTDISTDOT2T - 256)) | (1L << (TDOTDISTDOTRT - 256)) | (1L << (TDOTINV - 256)) | (1L << (TDOTINVDOT2T - 256)) | (1L << (VARDOTS - 256)) | (1L << (VARDOTP - 256)) | (1L << (VARXDOTS - 256)) | (1L << (VARXDOTP - 256)) | (1L << (ADDCOLUMNS - 256)) | (1L << (ADDMISSINGITEMS - 256)) | (1L << (CROSSJOIN - 256)) | (1L << (CURRENTGROUP - 256)) | (1L << (DATATABLE - 256)) | (1L << (DETAILROWS - 256)) | (1L << (DISTINCT - 256)) | (1L << (EXCEPT - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (FILTERS - 320)) | (1L << (GENERATE - 320)) | (1L << (GENERATEALL - 320)) | (1L << (GENERATESERIES - 320)) | (1L << (GROUPBY - 320)) | (1L << (IGNORE - 320)) | (1L << (INTERSECT - 320)) | (1L << (NATURALINNERJOIN - 320)) | (1L << (NATURALLEFTOUTERJOIN - 320)) | (1L << (ROLLUP - 320)) | (1L << (ROLLUPADDISSUBTOTAL - 320)) | (1L << (ROLLUPGROUP - 320)) | (1L << (ROLLUPISSUBTOTAL - 320)) | (1L << (ROW - 320)) | (1L << (SELECTCOLUMNS - 320)) | (1L << (SUBSTITUTEWITHINDEX - 320)) | (1L << (SUMMARIZE - 320)) | (1L << (SUMMARIZECOLUMNS - 320)) | (1L << (TOPN - 320)) | (1L << (TREATAS - 320)) | (1L << (UNION - 320)) | (1L << (VALUES - 320)) | (1L << (COMBINEVALUES - 320)) | (1L << (CONCATENATE - 320)) | (1L << (CONCATENATEX - 320)) | (1L << (EXACT - 320)) | (1L << (FIND - 320)) | (1L << (FIXED - 320)) | (1L << (FORMAT - 320)) | (1L << (LEFT - 320)) | (1L << (LEN - 320)) | (1L << (LOWER - 320)) | (1L << (MID - 320)) | (1L << (REPLACE - 320)) | (1L << (REPT - 320)) | (1L << (RIGHT - 320)) | (1L << (SEARCH - 320)) | (1L << (SUBSTITUTE - 320)) | (1L << (TRIM - 320)) | (1L << (UNICHAR - 320)) | (1L << (UNICODE - 320)) | (1L << (UPPER - 320)) | (1L << (VALUE - 320)) | (1L << (CLOSINGBALANCEMONTH - 320)) | (1L << (CLOSINGBALANCEQUARTER - 320)) | (1L << (CLOSINGBALANCEYEAR - 320)) | (1L << (DATEADD - 320)) | (1L << (DATESBETWEEN - 320)) | (1L << (DATESINPERIOD - 320)) | (1L << (DATESMTD - 320)) | (1L << (DATESQTD - 320)) | (1L << (DATESYTD - 320)) | (1L << (ENDOFMONTH - 320)) | (1L << (ENDOFQUARTER - 320)) | (1L << (ENDOFYEAR - 320)) | (1L << (FIRSTDATE - 320)) | (1L << (LASTDATE - 320)) | (1L << (NEXTDAY - 320)) | (1L << (NEXTMONTH - 320)) | (1L << (NEXTQUARTER - 320)) | (1L << (NEXTYEAR - 320)) | (1L << (OPENINGBALANCEMONTH - 320)) | (1L << (OPENINGBALANCEQUARTER - 320)) | (1L << (OPENINGBALANCEYEAR - 320)))) != 0) || ((((_la - 384)) & ~0x3f) == 0 && ((1L << (_la - 384)) & ((1L << (PARALLELPERIOD - 384)) | (1L << (PREVIOUSDAY - 384)) | (1L << (PREVIOUSMONTH - 384)) | (1L << (PREVIOUSQUARTER - 384)) | (1L << (PREVIOUSYEAR - 384)) | (1L << (SAMEPERIODLASTYEAR - 384)) | (1L << (STARTOFMONTH - 384)) | (1L << (STARTOFQUARTER - 384)) | (1L << (STARTOFYEAR - 384)) | (1L << (TOTALMTD - 384)) | (1L << (TOTALQTD - 384)) | (1L << (TOTALYTD - 384)) | (1L << (COLUMN - 384)) | (1L << (DEFINE - 384)) | (1L << (EVALUATE - 384)) | (1L << (MEASURE - 384)) | (1L << (MPARAMETER - 384)) | (1L << (ORDER_BY - 384)) | (1L << (RETURN - 384)) | (1L << (START_AT - 384)) | (1L << (TABLE - 384)) | (1L << (VAR - 384)) | (1L << (DIGIT - 384)) | (1L << (IDENTIFIER - 384)) | (1L << (ASC - 384)) | (1L << (DEC - 384)) | (1L << (WS - 384)))) != 0)) {
				{
				setState(133);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(131);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==T__0) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
					break;
				case 2:
					{
					setState(132);
					match(T__1);
					}
					break;
				}
				}
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(138);
			match(T__0);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 6:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u019c\u008f\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3-\n\3\3\4\3\4\3\4\3\4\5\4\63\n\4\3\5"+
		"\6\5\66\n\5\r\5\16\5\67\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\5\bH\n\b\3\b\3\b\3\b\3\b\7\bN\n\b\f\b\16\bQ\13\b\3\t\3\t\3"+
		"\t\3\t\3\n\3\n\3\n\5\nZ\n\n\3\n\3\n\3\13\3\13\3\13\7\13a\n\13\f\13\16"+
		"\13d\13\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\5\16v\n\16\3\17\6\17y\n\17\r\17\16\17z\3\17\3\17\6\17"+
		"\177\n\17\r\17\16\17\u0080\5\17\u0083\n\17\3\20\3\20\3\20\7\20\u0088\n"+
		"\20\f\20\16\20\u008b\13\20\3\20\3\20\3\20\2\3\16\21\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36\2\5\3\2\b\26\3\2\"\u018d\3\2\3\3\u0092\2 \3\2\2"+
		"\2\4,\3\2\2\2\6\62\3\2\2\2\b\65\3\2\2\2\n9\3\2\2\2\f>\3\2\2\2\16G\3\2"+
		"\2\2\20R\3\2\2\2\22V\3\2\2\2\24]\3\2\2\2\26e\3\2\2\2\30g\3\2\2\2\32u\3"+
		"\2\2\2\34x\3\2\2\2\36\u0084\3\2\2\2 !\5\4\3\2!\"\7\2\2\3\"\3\3\2\2\2#"+
		"$\5\32\16\2$%\7\6\2\2%&\5\6\4\2&-\3\2\2\2\'(\5\32\16\2()\7\7\2\2)*\5\6"+
		"\4\2*-\3\2\2\2+-\5\6\4\2,#\3\2\2\2,\'\3\2\2\2,+\3\2\2\2-\5\3\2\2\2./\5"+
		"\b\5\2/\60\5\f\7\2\60\63\3\2\2\2\61\63\5\16\b\2\62.\3\2\2\2\62\61\3\2"+
		"\2\2\63\7\3\2\2\2\64\66\5\n\6\2\65\64\3\2\2\2\66\67\3\2\2\2\67\65\3\2"+
		"\2\2\678\3\2\2\28\t\3\2\2\29:\7\u0197\2\2:;\5\32\16\2;<\7\7\2\2<=\5\16"+
		"\b\2=\13\3\2\2\2>?\7\u0194\2\2?@\5\16\b\2@\r\3\2\2\2AB\b\b\1\2BH\5\22"+
		"\n\2CH\5\32\16\2DH\5\34\17\2EH\5\36\20\2FH\5\20\t\2GA\3\2\2\2GC\3\2\2"+
		"\2GD\3\2\2\2GE\3\2\2\2GF\3\2\2\2HO\3\2\2\2IJ\f\3\2\2JK\5\26\f\2KL\5\16"+
		"\b\4LN\3\2\2\2MI\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2P\17\3\2\2\2QO\3"+
		"\2\2\2RS\7\27\2\2ST\5\16\b\2TU\7\30\2\2U\21\3\2\2\2VW\5\30\r\2WY\7\27"+
		"\2\2XZ\5\24\13\2YX\3\2\2\2YZ\3\2\2\2Z[\3\2\2\2[\\\7\30\2\2\\\23\3\2\2"+
		"\2]b\5\16\b\2^_\7\36\2\2_a\5\16\b\2`^\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3"+
		"\2\2\2c\25\3\2\2\2db\3\2\2\2ef\t\2\2\2f\27\3\2\2\2gh\t\3\2\2h\31\3\2\2"+
		"\2ij\7\u0199\2\2jk\7\33\2\2kl\7\u0199\2\2lv\7\34\2\2mn\7\5\2\2no\7\33"+
		"\2\2op\7\u0199\2\2pv\7\34\2\2qr\7\33\2\2rs\7\u0199\2\2sv\7\34\2\2tv\7"+
		"\u0199\2\2ui\3\2\2\2um\3\2\2\2uq\3\2\2\2ut\3\2\2\2v\33\3\2\2\2wy\7\u0198"+
		"\2\2xw\3\2\2\2yz\3\2\2\2zx\3\2\2\2z{\3\2\2\2{\u0082\3\2\2\2|~\7\37\2\2"+
		"}\177\7\u0198\2\2~}\3\2\2\2\177\u0080\3\2\2\2\u0080~\3\2\2\2\u0080\u0081"+
		"\3\2\2\2\u0081\u0083\3\2\2\2\u0082|\3\2\2\2\u0082\u0083\3\2\2\2\u0083"+
		"\35\3\2\2\2\u0084\u0089\7\3\2\2\u0085\u0088\n\4\2\2\u0086\u0088\7\4\2"+
		"\2\u0087\u0085\3\2\2\2\u0087\u0086\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087"+
		"\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008c\3\2\2\2\u008b\u0089\3\2\2\2\u008c"+
		"\u008d\7\3\2\2\u008d\37\3\2\2\2\17,\62\67GOYbuz\u0080\u0082\u0087\u0089";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}