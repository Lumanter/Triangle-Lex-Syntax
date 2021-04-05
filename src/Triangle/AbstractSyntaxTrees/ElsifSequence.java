
package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

/**
 * Elsif sequence AST node.
 * @author Luis Mariano Ramirez Segura (@github marianosegura) 
 */
public abstract class ElsifSequence extends AST {
    
    /**
     * AST constructor.
     * @param pos Code line position inside source file
     */
    public ElsifSequence (SourcePosition pos) {
        super(pos);
    }
}
