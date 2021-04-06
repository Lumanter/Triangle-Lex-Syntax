
package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;


/**
 * Case range AST node.
 * @author Luis Mariano Ramirez Segura (@github marianosegura) 
 */
public abstract class CaseRange extends AST {
    
    /**
     * AST constructor.
     * @param pos Code line position inside source file
     */
    public CaseRange(SourcePosition pos) {
        super(pos);
    }
}
