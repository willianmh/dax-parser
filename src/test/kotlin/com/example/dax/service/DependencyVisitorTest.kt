package com.example.dax.service

import com.example.DaxLexer
import com.example.DaxLexerDebugger
import com.example.DaxParser
import com.example.dax.service.DependencyVisitor
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.junit.jupiter.api.Test

class DependencyVisitorTest {
    @Test
    fun `test lexer table with quotes`() {
        val daxCode = "CALCULATE(SUM('Sales'[Amount]))"
        val lexer = DaxLexer(CharStreams.fromString(daxCode))
        val lexerDebugger = DaxLexerDebugger(daxCode)
        lexerDebugger.debug()

        // 2. Create tokens
        val tokens = CommonTokenStream(lexer)

        // 3. Create Parser
        val parser = DaxParser(tokens)

        // 4. Get parse tree (entry point rule = daxExpression)
        val tree = parser.daxExpression()

        // 5. Traverse tree with DependencyVisitor
        val visitor = DependencyVisitor()
        visitor.visit(tree)

        val dependencies = visitor.dependencies
        println(dependencies)
    }
}