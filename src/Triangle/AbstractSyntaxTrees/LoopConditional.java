
package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;


/**
 * Loop conditional's AST node, can hold a while or until keyword.
 * @author Luis Mariano Ramirez Segura (@github marianosegura) 
 */
public class LoopConditional extends Terminal {
    
    /**
     * AST constructor.
     * @param spelling Loop conditional keyword spelling 
     * @param pos Code line position inside source file
     */
    public LoopConditional (String spelling, SourcePosition pos) {
        super(spelling, pos);
    }
    
    /**
     * Implementation of AST visit method, calls the visitor method for this class.
     * @param v Visitor entity
     * @param o Generic object used by the caller
     * @return Result of calling the visitor method for this class
     */
    public Object visit(Visitor v, Object o) {
        return v.visitLoopConditional(this, o);
    }
}
