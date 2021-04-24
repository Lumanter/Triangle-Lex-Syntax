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
public class PackageCallDeclaration extends PackageDeclaration{
    
    //Fields
    public PackageIdentifier PI;
    public Declaration D;
    
    //Constructor
    public PackageCallDeclaration(PackageIdentifier packageIdentifier, Declaration declaration, SourcePosition thePosition) {
        super(thePosition);
        
        this.PI = packageIdentifier;
        this.D = declaration;
    }
    
    //Visitor
    public Object visit(Visitor v, Object o) {
    return v.visitPackageCallDeclaration(this, o);
    }
}
