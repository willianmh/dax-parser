package com.example

import org.antlr.v4.runtime.*
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.api.assertDoesNotThrow
import org.junit.jupiter.api.fail

class DaxAnalyzerTest {

    private fun parseDax(input: String): DaxParser.DaxExpressionContext {
        val lexer = DaxLexer(CharStreams.fromString(input))
        val tokens = CommonTokenStream(lexer)
        val parser = DaxParser(tokens)

        parser.removeErrorListeners() // Remove default console logging
        parser.addErrorListener(object : BaseErrorListener() {
            override fun syntaxError(
                recognizer: Recognizer<*, *>?,
                offendingSymbol: Any?,
                line: Int,
                charPositionInLine: Int,
                msg: String?,
                e: RecognitionException?
            ) {
                fail("Syntax error at line $line:$charPositionInLine -> $msg")
            }
        })

        return parser.daxExpression()
    }

    @Test
    fun `test valid DAX expression`() {
        val daxCode = "CALCULATE(SUM(Sales[Amount]))"
        assertDoesNotThrow { parseDax(daxCode) }
    }

    @Test
    fun `test invalid DAX expression`() {
        val daxCode = "CALCULATE(SUM(Sales[Amount])" // Missing closing parenthesis
        val exception = assertThrows<AssertionError> {
            parseDax(daxCode)
        }
        assertTrue(exception.message!!.contains("Syntax error"))
    }

    @Test
    fun `test dependency extraction`() {
        val daxCode = "CALCULATE(SUM(Sales[Amount]))"
        val tree = parseDax(daxCode)

        val visitor = DaxDependencyVisitor()
        visitor.visit(tree)
        val dependencies = visitor.getDependencies()

        assertEquals(listOf("Sales[Amount]"), dependencies)
    }
}