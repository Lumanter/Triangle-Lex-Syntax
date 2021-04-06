
package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

/**
 * Case sequence AST node.
 * @author Luis Mariano Ramirez Segura (@github marianosegura) 
 */
public abstract class CaseSequence extends AST {
    
    /**
     * AST constructor.
     * @param pos Code line position inside source file
     */
    public CaseSequence (SourcePosition pos) {
        super(pos);
    }
}
