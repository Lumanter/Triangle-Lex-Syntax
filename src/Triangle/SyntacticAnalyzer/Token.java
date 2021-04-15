/*
 * @(#)Token.java                        2.1 2003/10/07
 *
 * Copyright (C) 1999, 2003 D.A. Watt and D.F. Brown
 * Dept. of Computing Science, University of Glasgow, Glasgow G12 8QQ Scotland
 * and School of Computer and Math Sciences, The Robert Gordon University,
 * St. Andrew Street, Aberdeen AB25 1HG, Scotland.
 * All rights reserved.
 *
 * This software is provided free for educational use only. It may
 * not be used for commercial purposes without the prior written permission
 * of the authors.
 */

package Triangle.SyntacticAnalyzer;


final class Token extends Object {

  protected int kind;
  protected String spelling;
  protected SourcePosition position;

  public Token(int kind, String spelling, SourcePosition position) {

    if (kind == Token.IDENTIFIER) {
      int currentKind = firstReservedWord;
      boolean searching = true;

      while (searching) {
        int comparison = tokenTable[currentKind].compareTo(spelling);
        if (comparison == 0) {
          this.kind = currentKind;
          searching = false;
        } else if (comparison > 0 || currentKind == lastReservedWord) {
          this.kind = Token.IDENTIFIER;
          searching = false;
        } else {
          currentKind ++;
        }
      }
    } else
      this.kind = kind;

    this.spelling = spelling;
    this.position = position;

  }

  public static String spell (int kind) {
    return tokenTable[kind];
  }

  public String toString() {
    return "Kind=" + kind + ", spelling=" + spelling +
      ", position=" + position;
  }

  // Token classes...

  public static final int

    // literals, identifiers, operators...
    INTLITERAL	= 0,
    CHARLITERAL	= 1,
    IDENTIFIER	= 2,
    OPERATOR	= 3,

    // reserved words - must be in alphabetical order...
    ARRAY		= 4,
    CHOOSE              = 5,
    CONST		= 6,
    DO			= 7,
    ELSE		= 8,
    ELSIF               = 9,
    END			= 10,
    FOR			= 11,
    FROM                = 12,
    FUNC		= 13,
    IF			= 14,
    IN			= 15,
    LET			= 16,
    LOOP                = 17,
    NOTHING             = 18,
    OF			= 19,
    PRIVATE             = 20,
    PROC		= 21,
    RECORD		= 22,
    RECURSIVE           = 23,
    THEN		= 22,
    TO   		= 23,
    TYPE		= 24,
    UNTIL               = 25,
    VAR			= 26,
    WHEN		= 27,
    WHILE		= 28,

    // punctuation...
    DOT			= 29,
    TWODOTS             = 30,
    COLON		= 31,
    SEMICOLON	        = 32,
    COMMA		= 33,
    BECOMES		= 34,
    IS			= 35,
    OR                  = 36,

    // brackets...
    LPAREN		= 37,
    RPAREN		= 38,
    LBRACKET            = 39,
    RBRACKET            = 40,
    LCURLY		= 41,
    RCURLY		= 42,

    // special tokens...
    EOT			= 43,
    ERROR		= 44;

  private static String[] tokenTable = new String[] {
    "<int>",
    "<char>",
    "<identifier>",
    "<operator>",
    "array",
    "choose",
    "const",
    "do",
    "else",
    "elsif",
    "end",
    "for",
    "from",
    "func",
    "if",
    "in",
    "let",
    "loop",
    "nothing",
    "of",
    "proc",
    "record",
    "then",
    "to",
    "type",
    "until",
    "var",
    "when",
    "while",
    ".",
    "..",
    ":",
    ";",
    ",",
    ":=",
    "~",
    "|",
    "(",
    ")",
    "[",
    "]",
    "{",
    "}",
    "",
    "<error>"
  };

  private final static int	firstReservedWord = Token.ARRAY,
  				lastReservedWord  = Token.WHILE;

}
