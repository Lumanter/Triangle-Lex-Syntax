/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;


public class ProcedureProcFuncDeclaration extends ProcFuncDeclaration {
    public ProcedureProcFuncDeclaration(Identifier iAST, FormalParameterSequence fAST, 
                                        Command cAST, SourcePosition declarationPos) {
        super(declarationPos);
        I = iAST;
        F = fAST;
        C = cAST;
    }

    public Object visit(Visitor v, Object o) {
        return v.visitProcedureProcFuncDeclaration(this,o);
    }
    
    public Identifier I;
    public FormalParameterSequence F;
    public Command C;
}
