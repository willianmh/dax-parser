package com.example.dax.service

import com.example.DaxBaseVisitor
import com.example.DaxParser

data class TableFieldDependency(
    val table: String?,
    val field: String
)

/**
 * A visitor that collects references in the form of <table, field>,
 * skipping single-identifier references (likely local vars).
 */
class DependencyVisitor : DaxBaseVisitor<Unit>() {

    private val _dependencies = mutableListOf<TableFieldDependency>()
    val dependencies: List<TableFieldDependency> get() = _dependencies

    /**
     * We'll override visitExpression so that whenever the expression is just an identifier,
     * we parse it to see if it's a <table, field> or a measure reference.
     */
    override fun visitExpression(ctx: DaxParser.ExpressionContext) {
        // If this expression is just an identifier, parse it.
        // expression: ... | identifier | ...
        val idCtx = ctx.identifier()
        if (idCtx != null) {
            val maybeDependency = parseIdentifierToTableField(idCtx)
            if (maybeDependency != null) {
                _dependencies.add(maybeDependency)
            }
        }

        // Continue visiting other children (function calls, sub-expressions, etc.)
        super.visitExpression(ctx)
    }

    /**
     * parseIdentifierToTableField inspects the identifier context to see
     * if it is table[column], [measure], or a single local var.
     * Returns null for single local var references.
     */
    private fun parseIdentifierToTableField(idCtx: DaxParser.IdentifierContext): TableFieldDependency? {
        /*
          The grammar for identifier is:

            identifier
                : IDENTIFIER LBRACK IDENTIFIER RBRACK
                | '\'' IDENTIFIER '\'' LBRACK IDENTIFIER RBRACK
                | LBRACK IDENTIFIER RBRACK
                | IDENTIFIER
                ;

          We'll match these possibilities:

          1) IDENTIFIER LBRACK IDENTIFIER RBRACK
             => table = first IDENTIFIER, field = second IDENTIFIER
          2) '\'' IDENTIFIER '\'' LBRACK IDENTIFIER RBRACK
             => table = "'My Table'", field = second IDENTIFIER
          3) LBRACK IDENTIFIER RBRACK
             => table = null, field = measure name
          4) IDENTIFIER
             => single local variable => we skip (return null)
        */

        val text = idCtx.text

        // Check the number of child tokens
        // e.g., for [MyMeasure], we'll have LBRACK, IDENTIFIER, RBRACK => 3 children
        // for Table[Column], we might have IDENTIFIER, LBRACK, IDENTIFIER, RBRACK => 4 children
        // for 'My Table'[Column], we get 5 children (quoted identifier, LBRACK, identifier, RBRACK).
        val childCount = idCtx.childCount

        return when (childCount) {
            // e.g. single identifier => local variable => skip
            1 -> null

            // e.g. LBRACK IDENTIFIER RBRACK => measure
            3 -> {
                val measureName = idCtx.getChild(1).text  // The middle child = IDENTIFIER
                TableFieldDependency(null, measureName)
            }

            // e.g. TableName[Column], or 'My Table'[Column]
            4, 5 -> {
                // the grammar might produce slightly different indexes, so let's parse carefully
                // approach #1: parse them by rule context
                val table = extractTableName(idCtx)
                val field = extractFieldName(idCtx)
                TableFieldDependency(table, field)
            }

            else -> {
                // In case the grammar changes or we have an unexpected form
                null
            }
        }
    }

    /**
     * Extract the table portion from an identifier context with bracket notation.
     * e.g. Table[Column], or 'My Table'[Column].
     */
    private fun extractTableName(ctx: DaxParser.IdentifierContext): String? {
        // If childCount == 3 => measure => returns null anyway
        // If childCount == 4 => TableName LBRACK ColumnName RBRACK
        // If childCount == 5 => 'My Table' LBRACK ColumnName RBRACK
        // We'll check the first or second child for the table name.

        if (ctx.childCount == 4) {
            // e.g. TableName [ ColumnName ]
            return ctx.getChild(0).text // the first child is the table name
        } else if (ctx.childCount == 5) {
            // e.g. 'My Table' [ ColumnName ]
            return ctx.getChild(0).text + ctx.getChild(1).text + ctx.getChild(2).text
            // ^ This might yield "'My Table'", or you might want to parse out the quotes
            //   if you prefer the raw table name without them.
        }
        return null
    }

    /**
     * Extract the field portion (column/measure name) from bracket notation.
     * This is typically the second IDENTIFIER in the sequence.
     */
    private fun extractFieldName(ctx: DaxParser.IdentifierContext): String {
        // For table[column], childCount=4 => child(2) is the field name
        // For 'My Table'[Column], childCount=5 => child(3) is the field name
        return if (ctx.childCount == 4) {
            ctx.getChild(2).text // e.g. "ColumnName"
        } else {
            ctx.getChild(3).text // e.g. "ColumnName"
        }
    }
}