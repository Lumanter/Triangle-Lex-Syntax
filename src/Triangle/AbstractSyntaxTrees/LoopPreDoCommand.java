
package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;


/**
 * Loop pre do command's AST node. 
 * @author Luis Mariano Ramirez Segura (@github marianosegura) 
 */
public class LoopPreDoCommand extends Command {
    
    /**
     * AST constructor
     * @param commandAST Looped command
     * @param conditionalAST Conditional keyword to loop the command
     * @param expressionAST Conditional expression to loop command
     * @param pos Code line position inside source file
     */
    public LoopPreDoCommand(Command commandAST, LoopConditional conditionalAST, 
                            Expression expressionAST, SourcePosition pos) {
        super(pos);
        C = commandAST;
        LC = conditionalAST;
        E = expressionAST;
    }
    
    
    /**
     * Implementation of AST visit method, calls the visitor method for this class.
     * @param v Visitor entity
     * @param o Generic object used by the caller
     * @return Result of calling the visitor method for this class
     */
    public Object visit(Visitor v, Object o) {
        return v.visitLoopPreDoCommand(this, o);
    }
    
    
    /* Looped command */
    public Command C;
    
    /* Conditional keyword to loop the command */
    public LoopConditional LC;
    
    /* Conditional expression to loop command */
    public Expression E;
}
