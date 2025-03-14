// Generated from Dax.g4 by ANTLR 4.5

    package com.example;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DaxParser}.
 */
public interface DaxListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DaxParser#daxExpression}.
	 * @param ctx the parse tree
	 */
	void enterDaxExpression(DaxParser.DaxExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DaxParser#daxExpression}.
	 * @param ctx the parse tree
	 */
	void exitDaxExpression(DaxParser.DaxExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DaxParser#measureAssignment}.
	 * @param ctx the parse tree
	 */
	void enterMeasureAssignment(DaxParser.MeasureAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link DaxParser#measureAssignment}.
	 * @param ctx the parse tree
	 */
	void exitMeasureAssignment(DaxParser.MeasureAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link DaxParser#daxStatement}.
	 * @param ctx the parse tree
	 */
	void enterDaxStatement(DaxParser.DaxStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DaxParser#daxStatement}.
	 * @param ctx the parse tree
	 */
	void exitDaxStatement(DaxParser.DaxStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DaxParser#evaluateBlock}.
	 * @param ctx the parse tree
	 */
	void enterEvaluateBlock(DaxParser.EvaluateBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link DaxParser#evaluateBlock}.
	 * @param ctx the parse tree
	 */
	void exitEvaluateBlock(DaxParser.EvaluateBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link DaxParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(DaxParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DaxParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(DaxParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DaxParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(DaxParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DaxParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(DaxParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DaxParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(DaxParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DaxParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(DaxParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DaxParser#parenthesizedExpression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedExpression(DaxParser.ParenthesizedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DaxParser#parenthesizedExpression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedExpression(DaxParser.ParenthesizedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DaxParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(DaxParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link DaxParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(DaxParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link DaxParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(DaxParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DaxParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(DaxParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DaxParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(DaxParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DaxParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(DaxParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DaxParser#daxFunction}.
	 * @param ctx the parse tree
	 */
	void enterDaxFunction(DaxParser.DaxFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DaxParser#daxFunction}.
	 * @param ctx the parse tree
	 */
	void exitDaxFunction(DaxParser.DaxFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DaxParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(DaxParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link DaxParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(DaxParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link DaxParser#numericLiteral}.
	 * @param ctx the parse tree
	 */
	void enterNumericLiteral(DaxParser.NumericLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link DaxParser#numericLiteral}.
	 * @param ctx the parse tree
	 */
	void exitNumericLiteral(DaxParser.NumericLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link DaxParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(DaxParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link DaxParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(DaxParser.StringLiteralContext ctx);
}