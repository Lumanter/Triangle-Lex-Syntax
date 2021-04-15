/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

/**
 *
 * @author liugu
 */
public class FunctionProcFuncDeclaration extends ProcFuncDeclaration{
    public FunctionProcFuncDeclaration(Identifier iAST, FormalParameterSequence fAST, 
                                        TypeDenoter tAST,Expression eAST, SourcePosition declarationPos) {
        super(declarationPos);
        I = iAST;
        F = fAST;
        T = tAST;
        E = eAST;
    }

    public Object visit(Visitor v, Object o) {
        return v.visitFunctionProcFuncDeclaration(this,o);
    }
    
    public Identifier I;
    public FormalParameterSequence F;
    public TypeDenoter T;
    public Expression E;
}
