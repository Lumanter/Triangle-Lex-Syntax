package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

/**
 * Single case literals sequence's AST node.
 * @author Luis Mariano Ramirez Segura (@github marianosegura) 
 */
public class CaseLiteralsSequenceSingle extends CaseLiteralsSequence {
    
    /**
     * AST constructor.
     * @param caseRangeAST Case range AST node
     * @param pos Code line position inside source file
     */
    public CaseLiteralsSequenceSingle (CaseRange caseRangeAST, SourcePosition pos) {
        super(pos);
        caseRange = caseRangeAST;
    }

    
    /**
     * Implementation of AST visit method, calls the visitor method for this class.
     * @param v Visitor entity
     * @param o Generic object used by the caller
     * @return Result of calling the visitor method for this class
     */
    public Object visit(Visitor v, Object o) {
        return v.visitCaseLiteralsSequenceSingle(this, o);
    }
    
    
    /* Case range AST node */
    public CaseRange caseRange;
}

