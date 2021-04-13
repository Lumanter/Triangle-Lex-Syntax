package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

/**
 * Single elsif sequence's AST node.
 * @author Luis Mariano Ramirez Segura (@github marianosegura) 
 */
public class ElsifSequenceSingle extends ElsifSequence {
    
    /**
     * AST constructor.
     * @param eAST Elsif AST node
     * @param pos Code line position inside source file
     */
    public ElsifSequenceSingle (Elsif eAST, SourcePosition pos) {
        super(pos);
        E = eAST;
    }

    
    /**
     * Implementation of AST visit method, calls the visitor method for this class.
     * @param v Visitor entity
     * @param o Generic object used by the caller
     * @return Result of calling the visitor method for this class
     */
    public Object visit(Visitor v, Object o) {
        return v.visitElsifSequenceSingle(this, o);
    }
    
    
    /* Elsif AST node */
    public Elsif E;
}
