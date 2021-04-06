
package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

/**
 * Case literals sequence AST node.
 * @author Luis Mariano Ramirez Segura (@github marianosegura) 
 */
public abstract class CaseLiteralsSequence extends AST {
    
    /**
     * AST constructor.
     * @param pos Code line position inside source file
     */
    public CaseLiteralsSequence (SourcePosition pos) {
        super(pos);
    }
}

