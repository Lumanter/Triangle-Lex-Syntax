package Triangle.AbstractSyntaxTrees;


import Triangle.SyntacticAnalyzer.SourcePosition;


/**
 * Character case literal AST node.
 * @author Luis Mariano Ramirez Segura (@github marianosegura) 
 */
public class CaseLiteralCharacter extends CaseLiteral {

    /**
     * AST constructor.
     * @param charLiteralAST Character literal ast
     * @param pos Code line position inside source file
     */
    public CaseLiteralCharacter (CharacterLiteral charLiteralAST, SourcePosition pos) {
        super(pos);
        charLiteral = charLiteralAST;
    }

    
    /**
     * Implementation of AST visit method, calls the visitor method for this class.
     * @param v Visitor entity
     * @param o Generic object used by the caller
     * @return Result of calling the visitor method for this class
     */
    public Object visit(Visitor v, Object o) {
        return v.visitCaseLiteralCharacter(this, o);
    }
    

    /* Character literal ast */
    public CharacterLiteral charLiteral;
}



