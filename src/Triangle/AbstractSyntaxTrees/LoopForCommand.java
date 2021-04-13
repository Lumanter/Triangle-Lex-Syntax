
package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;


/**
 * Loop for command's AST node. 
 * @author Luis Mariano Ramirez Segura (@github marianosegura) 
 */
public class LoopForCommand extends Command {
    
    /**
     * AST constructor
     * @param identifier Loop identifier
     * @param from Loop identifier initial value expression
     * @param to Loop identifier final value expressio
     * @param command Looped command
     * @param pos Code line position inside source file
     */
    public LoopForCommand(Identifier identifier, Expression from, Expression to, 
                          Command command, SourcePosition pos) {
        super(pos);
        this.identifier = identifier;
        this.from = from;
        this.to = to;
        this.command = command;
    }
    
    /**
     * Implementation of AST visit method, calls the visitor method for this class.
     * @param v Visitor entity
     * @param o Generic object used by the caller
     * @return Result of calling the visitor method for this class
     */
    public Object visit(Visitor v, Object o) {
        return v.visitLoopForCommand(this, o);
    }
    
     /* Loop identifier */
    public Identifier identifier;
    
    /* Loop identifier initial value expression */
    public Expression from;
    
    /* Loop identifier final value expression */
    public Expression to;
    
    /* Looped command */
    public Command command;
}
