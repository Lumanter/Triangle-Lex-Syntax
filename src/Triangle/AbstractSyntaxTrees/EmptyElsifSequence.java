
package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

/**
 * Empty elsif sequence's AST node.
 * @author Luis Mariano Ramirez Segura (@github marianosegura) 
 */
public class EmptyElsifSequence extends ElsifSequence {
    
    /**
     * AST constructor.
     * @param pos Code line position inside source file
     */
    public EmptyElsifSequence (SourcePosition pos) {
        super (pos);
    }
    
    
    /**
     * Implementation of AST visit method, calls the visitor method for this class.
     * @param v Visitor entity
     * @param o Generic object used by the caller
     * @return Result of calling the visitor method for this class
     */
    public Object visit(Visitor v, Object o) {
        return v.visitEmptyElsifSequence(this, o);
    }
}
