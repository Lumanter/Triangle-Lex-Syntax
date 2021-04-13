
package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;


/**
 * Loop post do command's AST node. 
 * @author Luis Mariano Ramirez Segura (@github marianosegura) 
 */
public class LoopPostDoCommand extends Command {
    
    /**
     * AST constructor
     * @param conditionalAST Conditional keyword to loop the command
     * @param expressionAST Conditional expression to loop command
     * @param commandAST Looped command
     * @param pos Code line position inside source file
     */
    public LoopPostDoCommand(LoopConditional conditionalAST, Expression expressionAST,
                             Command commandAST, SourcePosition pos) {
        super(pos);
        LC = conditionalAST;
        E = expressionAST;
        C = commandAST;
    }
    
    
    /**
     * Implementation of AST visit method, calls the visitor method for this class.
     * @param v Visitor entity
     * @param o Generic object used by the caller
     * @return Result of calling the visitor method for this class
     */
    public Object visit(Visitor v, Object o) {
        return v.visitLoopPostDoCommand(this, o);
    }
    
    
    /* Conditional keyword to loop the command */
    public LoopConditional LC;
    
    /* Conditional expression to loop command */
    public Expression E;
    
    /* Looped command */
    public Command C;
}
