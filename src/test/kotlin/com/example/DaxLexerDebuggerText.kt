package com.example

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.antlr.v4.runtime.misc.ParseCancellationException
import org.junit.jupiter.api.Assertions.*

class DaxLexerDebuggerTest {

    @Test
    fun `test lexer on DAX expression`() {
        val daxCode = "CALCULATE(SUM(Sales[Amount]))"
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