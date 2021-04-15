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
public class RecursiveCompoundDeclaration extends CompoundDeclaration{
    public RecursiveCompoundDeclaration(ProcFuncSDeclaration d1AST,SourcePosition thePosition){
        super(thePosition);
        D1 = d1AST;
    }
    
    public Object visit(Visitor v, Object o) {
        return v.visitRecursiveCompoundDeclaration(this,o);
    }
    
    public ProcFuncSDeclaration D1;
}
