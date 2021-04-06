
package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;


/**
 * Multiple case sequence's AST node.
 * @author Luis Mariano Ramirez Segura (@github marianosegura) 
 */
public class CaseSequenceMultiple extends CaseSequence {

    /**
     * AST constructor.
     * @param caseAST Case AST node
     * @param sequenceAST Case sequence AST node
     * @param pos Code line position inside source file
     */
    public CaseSequenceMultiple (Case caseAST, CaseSequence sequenceAST, SourcePosition pos) {
        super (pos);
        this.caseAST = caseAST;
        sequence = sequenceAST;
    }
    
    
    /**
     * Implementation of AST visit method, calls the visitor method for this class.
     * @param v Visitor entity
     * @param o Generic object used by the caller
     * @return Result of calling the visitor method for this class
     */
    public Object visit(Visitor v, Object o) {
        return v.visitCaseSequenceMultiple(this, o);
    }
    
    
    /* Case range AST node */
    public Case caseAST;
    
    /* Case literals sequence AST node */
    public CaseSequence sequence;
}
