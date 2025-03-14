package com.example

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.antlr.v4.runtime.misc.ParseCancellationException
import org.junit.jupiter.api.Assertions.*

class DaxLexerDebuggerTest {
    // TODO: create tests for different functions name (names with ".")

    @Test
    fun `test lexer on DAX expression`() {
        val daxCode = "CALCULATE(SUM(Sales[Amount]))"
        val lexerDebugger = DaxLexerDebugger(daxCode)
        lexerDebugger.debug()
    }

    @Test
    fun `test lexer table with quotes`() {
        val daxCode = "CALCULATE(SUM('Sales'[Amount]))"
        val lexerDebugger = DaxLexerDebugger(daxCode)
        lexerDebugger.debug()
    }

    @Test
    fun `test lexer with unknown token`() {
        val daxCode = "CALCULATE ?? SUM(Sales[Amount])"
        val lexerDebugger = DaxLexerDebugger(daxCode)
        val exception = assertThrows<ParseCancellationException> {
            lexerDebugger.debug()
        }
        assertTrue(exception.message!!.contains("token recognition error at: '?'"))
    }
}