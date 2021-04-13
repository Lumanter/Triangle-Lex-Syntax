/*
 * @(#)IfCommand.java                        2.1 2003/10/07
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

package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;


// modified by Luis Mariano Ramirez Segura (@github marianosegura) on 04/04/2021
/**
 * If command's AST node.
 * @author Luis Mariano Ramirez Segura (@github marianosegura) 
 */
public class IfCommand extends Command {

    /**
     * AST constructor.
     * @param conditionAST Conditional expression for first if command
     * @param ifCommandAST First if command
     * @param elsifSequenceAST Sequence of chained elsif expressions
     * @param elseCommandAST Else command
     * @param pos Code line position inside source file
     */
    public IfCommand (Expression conditionAST, Command ifCommandAST, ElsifSequence elsifSequenceAST,
                    Command elseCommandAST, SourcePosition pos) {
        super (pos);
        E = conditionAST;
        C1 = ifCommandAST;
        C2 = elseCommandAST;
        S = elsifSequenceAST;
    }

    
    /**
     * Implementation of AST visit method, calls the visitor method for this class.
     * @param v Visitor entity
     * @param o Generic object used by the caller
     * @return Result of calling the visitor method for this class
     */
    public Object visit(Visitor v, Object o) {
        return v.visitIfCommand(this, o);
    }


  /* Conditional expression for first if command */
  public Expression E;
  
  /* First if command */
  public Command C1;
    
  /* Else command */
  public Command C2;
  
  /* Sequence of chained elsif expressions */
  public ElsifSequence S;
}
