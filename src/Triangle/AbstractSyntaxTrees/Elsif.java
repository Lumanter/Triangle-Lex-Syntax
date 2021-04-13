
package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;


/**
 * Elsif expression's AST node.
 * @author Luis Mariano Ramirez Segura (@github marianosegura) 
 */
public class Elsif extends AST {

    /**
     * AST constructor.
     * @param eAST Conditional expression to execute the command
     * @param cAST Conditional command
     * @param pos Code line position inside source file
     */
    public Elsif (Expression eAST, Command cAST, SourcePosition pos) {
        super(pos);
        E = eAST;
        C = cAST;
    }

    /**
     * Implementation of AST visit method, calls the visitor method for this class.
     * @param v Visitor entity
     * @param o Generic object used by the caller
     * @return Result of calling the visitor method for this class
     */
    public Object visit(Visitor v, Object o) {
        return v.visitElsif(this, o);
    }

    
    /* Conditional expression to execute the command */
    public Expression E;
    
    /* Conditional command */
    public Command C;
}
