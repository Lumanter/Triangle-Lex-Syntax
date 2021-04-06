package Triangle.AbstractSyntaxTrees;


import Triangle.SyntacticAnalyzer.SourcePosition;


/**
 * Integer case literal AST node.
 * @author Luis Mariano Ramirez Segura (@github marianosegura) 
 */
public class CaseLiteralInteger extends CaseLiteral {

    /**
     * AST constructor.
     * @param intLiteralAST Integer literal ast
     * @param pos Code line position inside source file
     */
    public CaseLiteralInteger (IntegerLiteral intLiteralAST, SourcePosition pos) {
        super(pos);
        intLiteral = intLiteralAST;
    }

    
    /**
     * Implementation of AST visit method, calls the visitor method for this class.
     * @param v Visitor entity
     * @param o Generic object used by the caller
     * @return Result of calling the visitor method for this class
     */
    public Object visit(Visitor v, Object o) {
        return v.visitCaseLiteralInteger(this, o);
    }
    

    /* Integer literal ast */
    public IntegerLiteral intLiteral;
}



