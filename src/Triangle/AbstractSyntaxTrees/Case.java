
package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;


/**
 * Case AST node.
 * @author Luis Mariano Ramirez Segura (@github marianosegura) 
 */
public class Case extends AST {

    /**
     * AST constructor.
     * @param caseLiteralsAST Case literals AST node
     * @param commandAST Case command AST node
     * @param pos Code line position inside source file
     */
    public Case(CaseLiteralsSequence caseLiteralsAST, Command commandAST, SourcePosition pos) {
        super (pos);
        caseLiterals = caseLiteralsAST;
        command = commandAST;
    }
    
    
    /**
     * Implementation of AST visit method, calls the visitor method for this class.
     * @param v Visitor entity
     * @param o Generic object used by the caller
     * @return Result of calling the visitor method for this class
     */
    public Object visit(Visitor v, Object o) {
        return v.visitCase(this, o);
    }
    
    
    
    /* Case literals AST node */
    public CaseLiteralsSequence caseLiterals;
    
    /* Case command AST node */
    public Command command;
}
