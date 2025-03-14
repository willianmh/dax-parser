package com.example

import com.example.DaxParser

/**
 * Visitor that extracts table/column references from a parse tree.
 */
class DaxDependencyVisitor : DaxBaseVisitor<Unit>() {

    private val dependencies = mutableListOf<String>()

    fun getDependencies(): List<String> = dependencies.toList()

    override fun visitIdentifier(ctx: DaxParser.IdentifierContext) {
        // If it's recognized as TABLE_COLUMN_REF or just IDENTIFIER
        if (ctx.TABLE_COLUMN_REF() != null) {
            val ref = ctx.TABLE_COLUMN_REF().text
            dependencies.add(ref)
        } else if (ctx.IDENTIFIER() != null) {
            val ref = ctx.IDENTIFIER().text
            // Possibly check if it's actually referencing a measure or a column
            dependencies.add(ref)
        }
        super.visitIdentifier(ctx)
    }

    override fun visitFunctionCall(ctx: DaxParser.FunctionCallContext) {
        // The function name is also an identifier
        // If you want to note function usage as a dependency:
        val functionName = ctx.daxFunction().text
        // Add logic if you want to treat function usage as a "dependency" or keep track separately
        // dependencies.add("FUNC:$functionName")

        return super.visitFunctionCall(ctx)
    }
}