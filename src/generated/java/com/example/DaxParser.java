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
		T__0=1, T__1=2, T__2=3, CALCULATE=4, CALCULATETABLE=5, SUM=6, SUMX=7, 
		AVERAGE=8, AVERAGEX=9, COUNT=10, COUNTROWS=11, FILTER=12, VALUES=13, SWITCH=14, 
		SELECTEDVALUE=15, IF=16, VAR=17, DIGIT=18, TABLE_COLUMN_REF=19, IDENTIFIER=20, 
		LPAREN=21, RPAREN=22, COMMA=23, WS=24;
	public static final int
		RULE_daxExpression = 0, RULE_expression = 1, RULE_parenthesizedExpression = 2, 
		RULE_functionCall = 3, RULE_argumentList = 4, RULE_daxFunction = 5, RULE_identifier = 6, 
		RULE_numericLiteral = 7, RULE_stringLiteral = 8;
	public static final String[] ruleNames = {
		"daxExpression", "expression", "parenthesizedExpression", "functionCall", 
		"argumentList", "daxFunction", "identifier", "numericLiteral", "stringLiteral"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'.'", "'\"'", "'\"\"'", null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, "'('", "')'", 
		"','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "CALCULATE", "CALCULATETABLE", "SUM", "SUMX", 
		"AVERAGE", "AVERAGEX", "COUNT", "COUNTROWS", "FILTER", "VALUES", "SWITCH", 
		"SELECTEDVALUE", "IF", "VAR", "DIGIT", "TABLE_COLUMN_REF", "IDENTIFIER", 
		"LPAREN", "RPAREN", "COMMA", "WS"
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
			setState(18);
			expression();
			setState(19);
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
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expression);
		try {
			setState(26);
			switch (_input.LA(1)) {
			case CALCULATE:
			case CALCULATETABLE:
			case SUM:
			case SUMX:
				enterOuterAlt(_localctx, 1);
				{
				setState(21);
				functionCall();
				}
				break;
			case TABLE_COLUMN_REF:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(22);
				identifier();
				}
				break;
			case DIGIT:
				enterOuterAlt(_localctx, 3);
				{
				setState(23);
				numericLiteral();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 4);
				{
				setState(24);
				stringLiteral();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 5);
				{
				setState(25);
				parenthesizedExpression();
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
		enterRule(_localctx, 4, RULE_parenthesizedExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			match(LPAREN);
			setState(29);
			expression();
			setState(30);
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
		enterRule(_localctx, 6, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			daxFunction();
			setState(33);
			match(LPAREN);
			setState(35);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << CALCULATE) | (1L << CALCULATETABLE) | (1L << SUM) | (1L << SUMX) | (1L << DIGIT) | (1L << TABLE_COLUMN_REF) | (1L << IDENTIFIER) | (1L << LPAREN))) != 0)) {
				{
				setState(34);
				argumentList();
				}
			}

			setState(37);
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
		enterRule(_localctx, 8, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			expression();
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(40);
				match(COMMA);
				setState(41);
				expression();
				}
				}
				setState(46);
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

	public static class DaxFunctionContext extends ParserRuleContext {
		public TerminalNode CALCULATE() { return getToken(DaxParser.CALCULATE, 0); }
		public TerminalNode CALCULATETABLE() { return getToken(DaxParser.CALCULATETABLE, 0); }
		public TerminalNode SUM() { return getToken(DaxParser.SUM, 0); }
		public TerminalNode SUMX() { return getToken(DaxParser.SUMX, 0); }
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
		enterRule(_localctx, 10, RULE_daxFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CALCULATE) | (1L << CALCULATETABLE) | (1L << SUM) | (1L << SUMX))) != 0)) ) {
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
		public TerminalNode TABLE_COLUMN_REF() { return getToken(DaxParser.TABLE_COLUMN_REF, 0); }
		public TerminalNode IDENTIFIER() { return getToken(DaxParser.IDENTIFIER, 0); }
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
		enterRule(_localctx, 12, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			_la = _input.LA(1);
			if ( !(_la==TABLE_COLUMN_REF || _la==IDENTIFIER) ) {
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
		enterRule(_localctx, 14, RULE_numericLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(51);
				match(DIGIT);
				}
				}
				setState(54); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
			setState(62);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(56);
				match(T__0);
				setState(58); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(57);
					match(DIGIT);
					}
					}
					setState(60); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DIGIT );
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
		enterRule(_localctx, 16, RULE_stringLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(T__1);
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << CALCULATE) | (1L << CALCULATETABLE) | (1L << SUM) | (1L << SUMX) | (1L << AVERAGE) | (1L << AVERAGEX) | (1L << COUNT) | (1L << COUNTROWS) | (1L << FILTER) | (1L << VALUES) | (1L << SWITCH) | (1L << SELECTEDVALUE) | (1L << IF) | (1L << VAR) | (1L << DIGIT) | (1L << TABLE_COLUMN_REF) | (1L << IDENTIFIER) | (1L << LPAREN) | (1L << RPAREN) | (1L << COMMA) | (1L << WS))) != 0)) {
				{
				setState(67);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(65);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==T__1) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
					break;
				case 2:
					{
					setState(66);
					match(T__2);
					}
					break;
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(72);
			match(T__1);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\32M\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\3\3\5\3\35\n\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\5\5&\n\5\3"+
		"\5\3\5\3\6\3\6\3\6\7\6-\n\6\f\6\16\6\60\13\6\3\7\3\7\3\b\3\b\3\t\6\t\67"+
		"\n\t\r\t\16\t8\3\t\3\t\6\t=\n\t\r\t\16\t>\5\tA\n\t\3\n\3\n\3\n\7\nF\n"+
		"\n\f\n\16\nI\13\n\3\n\3\n\3\n\2\2\13\2\4\6\b\n\f\16\20\22\2\5\3\2\6\t"+
		"\3\2\25\26\3\2\4\4N\2\24\3\2\2\2\4\34\3\2\2\2\6\36\3\2\2\2\b\"\3\2\2\2"+
		"\n)\3\2\2\2\f\61\3\2\2\2\16\63\3\2\2\2\20\66\3\2\2\2\22B\3\2\2\2\24\25"+
		"\5\4\3\2\25\26\7\2\2\3\26\3\3\2\2\2\27\35\5\b\5\2\30\35\5\16\b\2\31\35"+
		"\5\20\t\2\32\35\5\22\n\2\33\35\5\6\4\2\34\27\3\2\2\2\34\30\3\2\2\2\34"+
		"\31\3\2\2\2\34\32\3\2\2\2\34\33\3\2\2\2\35\5\3\2\2\2\36\37\7\27\2\2\37"+
		" \5\4\3\2 !\7\30\2\2!\7\3\2\2\2\"#\5\f\7\2#%\7\27\2\2$&\5\n\6\2%$\3\2"+
		"\2\2%&\3\2\2\2&\'\3\2\2\2\'(\7\30\2\2(\t\3\2\2\2).\5\4\3\2*+\7\31\2\2"+
		"+-\5\4\3\2,*\3\2\2\2-\60\3\2\2\2.,\3\2\2\2./\3\2\2\2/\13\3\2\2\2\60.\3"+
		"\2\2\2\61\62\t\2\2\2\62\r\3\2\2\2\63\64\t\3\2\2\64\17\3\2\2\2\65\67\7"+
		"\24\2\2\66\65\3\2\2\2\678\3\2\2\28\66\3\2\2\289\3\2\2\29@\3\2\2\2:<\7"+
		"\3\2\2;=\7\24\2\2<;\3\2\2\2=>\3\2\2\2><\3\2\2\2>?\3\2\2\2?A\3\2\2\2@:"+
		"\3\2\2\2@A\3\2\2\2A\21\3\2\2\2BG\7\4\2\2CF\n\4\2\2DF\7\5\2\2EC\3\2\2\2"+
		"ED\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2HJ\3\2\2\2IG\3\2\2\2JK\7\4\2\2"+
		"K\23\3\2\2\2\n\34%.8>@EG";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}