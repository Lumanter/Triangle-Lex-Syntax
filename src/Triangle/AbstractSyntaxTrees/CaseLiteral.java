
package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;


/**
 * Case literal AST node.
 * @author Luis Mariano Ramirez Segura (@github marianosegura) 
 */
public abstract class CaseLiteral extends AST {
    
    /**
     * AST constructor.
     * @param pos Code line position inside source file
     */
    public CaseLiteral(SourcePosition pos) {
        super(pos);
    }
}
