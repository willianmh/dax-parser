package com.example.dax.service

import org.antlr.v4.runtime.Parser
import org.antlr.v4.runtime.tree.ParseTree
import org.antlr.v4.runtime.tree.Trees

/**
 * Recursively builds a pretty-printed, indented string representation of an ANTLR parse tree.
 */
fun parseTreeToPrettyString(tree: ParseTree, parser: Parser, level: Int = 0): String {
    val indent = "  ".repeat(level)
    // Retrieve the text for the current node (e.g., "daxExpression", "identifier", etc.)
    val nodeText = Trees.getNodeText(tree, parser)

    val sb = StringBuilder("$indent$nodeText")

    // If this node has children, we print them within braces
    if (tree.childCount > 0) {
        sb.append(" {\n")
        for (i in 0 until tree.childCount) {
            sb.append(parseTreeToPrettyString(tree.getChild(i), parser, level + 1))
            // Separate child lines with a newline
            if (i < tree.childCount - 1) {
                sb.append("\n")
            }
        }
        sb.append("\n$indent}")
    }

    return sb.toString()
}