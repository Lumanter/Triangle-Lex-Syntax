package Triangle.AbstractSyntaxTrees;


import Triangle.SyntacticAnalyzer.SourcePosition;


/**
 * Two literals case range AST node.
 * @author Luis Mariano Ramirez Segura (@github marianosegura) 
 */
public class CaseRangeTwo extends CaseRange {

    /**
     * AST constructor
     * @param fromAST Left range value case literal ast
     * @param toAST Right range value case literal ast
     * @param pos Code line position inside source file
     */
    public CaseRangeTwo(CaseLiteral fromAST, CaseLiteral toAST, 
            SourcePosition pos) {
        super(pos);
        from = fromAST;
        to = toAST;
    }

    
    /**
     * Implementation of AST visit method, calls the visitor method for this class.
     * @param v Visitor entity
     * @param o Generic object used by the caller
     * @return Result of calling the visitor method for this class
     */
    public Object visit(Visitor v, Object o) {
        return v.visitCaseRangeTwo(this, o);
    }
    

    /* Left range value case literal ast */
    public CaseLiteral from;
    
    /* Right range value case literal ast */
    public CaseLiteral to;
}




