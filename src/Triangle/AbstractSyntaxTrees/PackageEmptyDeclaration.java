/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Triangle.AbstractSyntaxTrees;
import Triangle.SyntacticAnalyzer.SourcePosition;
/**
 *
 * @author karol
 */
public class PackageEmptyDeclaration extends PackageDeclaration{
    
    //Fields
    
    //Constructor
    public PackageEmptyDeclaration(SourcePosition thePosition) {
        super(thePosition);
    }
    
    //Visitor
    public Object visit(Visitor v, Object o) {
    return v.visitPackageEmptyDeclaration(this, o);
    }
}
