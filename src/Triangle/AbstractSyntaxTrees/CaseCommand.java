/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

/**
 * Case command's AST node.
 * @author Luis Mariano Ramirez Segura (@github marianosegura) 
 */
public class CaseCommand extends Command {

    /**
     * AST constructor.
     * @param expressionAST Case expression being compared
     * @param casesAST Cases ast with the cases and else command
     * @param pos Code line position inside source file
     */
    public CaseCommand (Expression expressionAST, Cases casesAST, SourcePosition pos) {
        super (pos);
        expression = expressionAST;
        cases = casesAST;
    }

    
    /**
     * Implementation of AST visit method, calls the visitor method for this class.
     * @param v Visitor entity
     * @param o Generic object used by the caller
     * @return Result of calling the visitor method for this class
     */
    public Object visit(Visitor v, Object o) {
        return v.visitCaseCommand(this, o);
    }


  /* Case expression being compared */
  public Expression expression;
 
    
  /*  Cases ast with the cases and else command */
  public Cases cases;
}

