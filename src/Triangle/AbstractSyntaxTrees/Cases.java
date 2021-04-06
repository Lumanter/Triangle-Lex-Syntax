
package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;


/**
 * Cases AST node.
 * @author Luis Mariano Ramirez Segura (@github marianosegura) 
 */
public class Cases extends AST {

    /**
     * AST constructor.
     * @param caseSequenceAST Sequence of cases
     * @param elseCommandAST Else command
     * @param pos Code line position inside source file
     */
    public Cases (CaseSequence caseSequenceAST, Command elseCommandAST, SourcePosition pos) {
        super (pos);
        caseSequence = caseSequenceAST;
        elseCommand = elseCommandAST;
    }

    
    /**
     * Implementation of AST visit method, calls the visitor method for this class.
     * @param v Visitor entity
     * @param o Generic object used by the caller
     * @return Result of calling the visitor method for this class
     */
    public Object visit(Visitor v, Object o) {
        return v.visitCases(this, o);
    }
    
  
  /* Sequence of cases */
  public CaseSequence caseSequence;
  
  /* Else command */
  public Command elseCommand;
}
