// Generated from Dax.g4 by ANTLR 4.5

    package com.example;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DaxParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DaxVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DaxParser#daxExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDaxExpression(DaxParser.DaxExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaxParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(DaxParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaxParser#parenthesizedExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedExpression(DaxParser.ParenthesizedExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaxParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(DaxParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaxParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(DaxParser.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaxParser#daxFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDaxFunction(DaxParser.DaxFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaxParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(DaxParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaxParser#numericLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericLiteral(DaxParser.NumericLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link DaxParser#stringLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(DaxParser.StringLiteralContext ctx);
}