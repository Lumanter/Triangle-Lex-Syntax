
package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;


/**
 * Multiple elsif sequence's AST node.
 * @author Luis Mariano Ramirez Segura (@github marianosegura) 
 */
public class ElsifSequenceMultiple extends ElsifSequence {

    /**
     * AST constructor.
     * @param elsifAST Elsif AST node
     * @param sequenceAST Elsif sequence AST node
     * @param pos Code line position inside source file
     */
    public ElsifSequenceMultiple (Elsif elsifAST, ElsifSequence sequenceAST,
                                   SourcePosition pos) {
        super (pos);
        E = elsifAST;
        ES = sequenceAST;
    }
    
    
    /**
     * Implementation of AST visit method, calls the visitor method for this class.
     * @param v Visitor entity
     * @param o Generic object used by the caller
     * @return Result of calling the visitor method for this class
     */
    public Object visit(Visitor v, Object o) {
        return v.visitElsifSequenceMultiple(this, o);
    }
    
    
    /* Elsif AST node */
    public Elsif E;
    
    /* Elsif sequence AST node */
    public ElsifSequence ES;
}
