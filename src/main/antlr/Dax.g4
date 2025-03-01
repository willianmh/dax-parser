grammar Dax;
@header {
    package com.example;
}
// ===================
// Parser Rules
// ===================

daxExpression
    : expression EOF
    ;

// This is a simplified expression rule. In a real grammar,
// you'd want to handle more operator precedence and structures.
expression
    : functionCall
    | identifier
    | numericLiteral
    | stringLiteral
    | parenthesizedExpression
    ;

// Parenthesized sub-expression
parenthesizedExpression
    : LPAREN expression RPAREN
    ;

// Basic function call rule with variable argument list
functionCall
    : daxFunction LPAREN argumentList? RPAREN
    ;

argumentList
    : expression (COMMA expression)*
    ;

daxFunction
    : CALCULATE
    | CALCULATETABLE
    | SUM
    | SUMX
    ;

// Identifiers: could be a normal identifier or a bracketed reference like Table[Column]
identifier
    : TABLE_COLUMN_REF
    | IDENTIFIER
    ;

// ===================
// Lexer Rules
// ===================

// --- Common DAX Keywords (case-insensitive) ---

CALCULATE   : [Cc] [Aa] [Ll] [Cc] [Uu] [Ll] [Aa] [Tt] [Ee] ;

CALCULATETABLE
    : [Cc] [Aa] [Ll] [Cc] [Uu] [Ll] [Aa] [Tt] [Ee]
      [Tt] [Aa] [Bb] [Ll] [Ee]
    ;

SUM
    : [Ss] [Uu] [Mm]
    ;

SUMX
    : [Ss] [Uu] [Mm] [Xx]
    ;

AVERAGE
    : [Aa] [Vv] [Ee] [Rr] [Aa] [Gg] [Ee]
    ;

AVERAGEX
    : [Aa] [Vv] [Ee] [Rr] [Aa] [Gg] [Ee] [Xx]
    ;

COUNT
    : [Cc] [Oo] [Uu] [Nn] [Tt]
    ;

COUNTROWS
    : [Cc] [Oo] [Uu] [Nn] [Tt] [Rr] [Oo] [Ww] [Ss]
    ;

FILTER
    : [Ff] [Ii] [Ll] [Tt] [Ee] [Rr]
    ;

VALUES
    : [Vv] [Aa] [Ll] [Uu] [Ee] [Ss]
    ;

SWITCH
    : [Ss] [Ww] [Ii] [Tt] [Cc] [Hh]
    ;

SELECTEDVALUE
    : [Ss] [Ee] [Ll] [Ee] [Cc] [Tt] [Ee] [Dd]
      [Vv] [Aa] [Ll] [Uu] [Ee]
    ;

IF
    : [Ii] [Ff]
    ;

VAR
    : [Vv] [Aa] [Rr]
    ;

// --- Add more DAX keywords or built-in functions as needed ---

// ===================
// Other tokens
// ===================

// Fragments for reuse
DIGIT : [0-9] ;

// Table/column reference pattern: e.g. Sales[Amount], 'My Table'[Column], etc.
// This is simplified. Real usage might need more nuance for escaping, etc.
TABLE_COLUMN_REF
    : IDENTIFIER '[' IDENTIFIER ']'
    | '\'' IDENTIFIER '\'' '[' IDENTIFIER ']'  // Support for 'Table'[Column]
    ;

// Generic identifier. Must come AFTER keywords so it doesn't catch them.
IDENTIFIER
    : [a-zA-Z_] [a-zA-Z0-9_]*
    ;

// Numeric literal (simplified).
numericLiteral
    : DIGIT+ ( '.' DIGIT+ )?
    ;

// Simple string literal in double quotes
stringLiteral
    : '"' ( ~'"' | '""' )* '"'
    ;

// Operators, punctuation
LPAREN : '(' ;
RPAREN : ')' ;
COMMA  : ',' ;

// Whitespace
WS : [ \t\r\n]+ -> skip ;


