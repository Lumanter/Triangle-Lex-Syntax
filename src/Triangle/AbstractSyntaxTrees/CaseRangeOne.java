package Triangle.AbstractSyntaxTrees;


import Triangle.SyntacticAnalyzer.SourcePosition;


/**
 * One literal case range AST node.
 * @author Luis Mariano Ramirez Segura (@github marianosegura) 
 */
public class CaseRangeOne extends CaseRange {

    /**
     * AST constructor.
     * @param caseLiteralAST Case literal ast
     * @param pos Code line position inside source file
     */
    public CaseRangeOne (CaseLiteral caseLiteralAST, SourcePosition pos) {
        super(pos);
        caseLiteral = caseLiteralAST;
    }

    
    /**
     * Implementation of AST visit method, calls the visitor method for this class.
     * @param v Visitor entity
     * @param o Generic object used by the caller
     * @return Result of calling the visitor method for this class
     */
    public Object visit(Visitor v, Object o) {
        return v.visitCaseRangeOne(this, o);
    }
    

    /* Case literal ast */
    public CaseLiteral caseLiteral;
}




