
package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;


/**
 * Multiple case literals sequence's AST node.
 * @author Luis Mariano Ramirez Segura (@github marianosegura) 
 */
public class CaseLiteralsSequenceMultiple extends CaseLiteralsSequence {

    /**
     * AST constructor.
     * @param caseRangeAST Case range AST node
     * @param sequenceAST Case literals sequence AST node
     * @param pos Code line position inside source file
     */
    public CaseLiteralsSequenceMultiple (CaseRange caseRangeAST, CaseLiteralsSequence sequenceAST,
                                   SourcePosition pos) {
        super (pos);
        caseRange = caseRangeAST;
        sequence = sequenceAST;
    }
    
    
    /**
     * Implementation of AST visit method, calls the visitor method for this class.
     * @param v Visitor entity
     * @param o Generic object used by the caller
     * @return Result of calling the visitor method for this class
     */
    public Object visit(Visitor v, Object o) {
        return v.visitCaseLiteralsSequenceMultiple(this, o);
    }
    
    
    /* Case range AST node */
    public CaseRange caseRange;
    
    /* Case literals sequence AST node */
    public CaseLiteralsSequence sequence;
}
