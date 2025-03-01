package com.example

import org.antlr.v4.runtime.*
import org.antlr.v4.runtime.misc.ParseCancellationException

class DaxLexerDebugger(private val input: String) {

    fun debug() {
        val lexer = DaxLexer(CharStreams.fromString(input))

        // Capture errors
        lexer.removeErrorListeners()
        lexer.addErrorListener(object : BaseErrorListener() {
            override fun syntaxError(
                recognizer: Recognizer<*, *>?,
                offendingSymbol: Any?,
                line: Int,
                charPositionInLine: Int,
                msg: String?,
                e: RecognitionException?
            ) {
                throw ParseCancellationException("Lexer Error at line $line:$charPositionInLine -> $msg")
            }
        })

        val tokenStream = CommonTokenStream(lexer)
        tokenStream.fill()

        println("🔎 **LEXER DEBUG OUTPUT** 🔎")
        for (token in tokenStream.tokens) {
            val tokenName = DaxLexer.VOCABULARY.getSymbolicName(token.type) ?: "UNKNOWN"
            println("[${tokenName}] '${token.text}' at line ${token.line}, position ${token.charPositionInLine}")
        }
        println("✅ **Lexing Complete**")
    }
}