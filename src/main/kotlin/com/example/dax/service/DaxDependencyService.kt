package com.example.dax.service

import com.example.DaxLexer
import com.example.DaxParser
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.Token
import org.springframework.stereotype.Service

@Service
class DaxDependencyService {

    fun findDependencies(daxExpression: String): List<TableFieldDependency> {
        val inputStream = CharStreams.fromString(daxExpression)
        val lexer = DaxLexer(inputStream)
        val tokens = CommonTokenStream(lexer)
        val parser = DaxParser(tokens)
        val tree = parser.daxExpression()

        val visitor = DependencyVisitor()
        visitor.visit(tree)

        return visitor.dependencies  // A list of TableFieldDependency
    }

    fun getTokens(daxExpression: String): List<String> {
        val inputStream = CharStreams.fromString(daxExpression)
        val lexer = DaxLexer(inputStream)
        val tokenStream = CommonTokenStream(lexer)

        tokenStream.fill()

        val result = mutableListOf<String>()
        for (token in tokenStream.tokens) {
            if (token.type != Token.EOF) {
                val tokenName = lexer.vocabulary.getSymbolicName(token.type)
                val tokenText = token.text
                result.add("$tokenName : $tokenText")
            }
        }
        return result
    }

    /**
     * Returns a string representation of the parse tree
     * for the given DAX expression.
     */
    fun getParseTree(daxExpression: String): String {
        val inputStream = CharStreams.fromString(daxExpression)
        val lexer = DaxLexer(inputStream)
        val tokens = CommonTokenStream(lexer)
        val parser = DaxParser(tokens)

        // Parse using the root rule (daxExpression)
        val tree = parser.daxExpression()

        // Return an s-expression representation of the tree
        // e.g.: (daxExpression (expression (functionCall CALCULATE ( ...

        return parseTreeToPrettyString(tree, parser)
    }
}