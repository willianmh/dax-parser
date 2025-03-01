package com.example

import org.springframework.web.bind.annotation.*
import org.antlr.v4.runtime.*
import org.antlr.v4.runtime.CharStreams


@RestController
@RequestMapping("/api/dax")
class DaxAnalyzerController {

    @PostMapping("/analyze")
    fun analyzeDax(@RequestBody request: DaxRequest): DaxResponse {
        val code = request.daxCode
        val inputStream = CharStreams.fromString(code)
        val lexer = DaxLexer(inputStream)
        val tokens = CommonTokenStream(lexer)
        val parser = DaxParser(tokens)

        val errors = mutableListOf<String>()

        // Collect syntax/lexical errors
        parser.removeErrorListeners()
        parser.addErrorListener(object : BaseErrorListener() {
            override fun syntaxError(
                recognizer: Recognizer<*, *>?,
                offendingSymbol: Any?,
                line: Int,
                charPositionInLine: Int,
                msg: String?,
                e: RecognitionException?
            ) {
                errors.add("line $line:$charPositionInLine $msg")
            }
        })

        // Parse the expression
        val tree = parser.daxExpression()

        // If syntax errors occurred, return them
        if (errors.isNotEmpty()) {
            return DaxResponse(
                validSyntax = false,
                dependencies = emptyList(),
                syntaxErrors = errors
            )
        }

        // If valid syntax, analyze dependencies
        val visitor = DaxDependencyVisitor()
        visitor.visit(tree)
        val dependencies = visitor.getDependencies()

        return DaxResponse(
            validSyntax = true,
            dependencies = dependencies,
            syntaxErrors = emptyList()
        )
    }
}

data class DaxRequest(
    val daxCode: String
)

data class DaxResponse(
    val validSyntax: Boolean,
    val dependencies: List<String>,
    val syntaxErrors: List<String>
)