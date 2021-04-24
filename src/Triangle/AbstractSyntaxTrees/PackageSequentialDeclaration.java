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
public class PackageSequentialDeclaration extends PackageDeclaration{
    
    //Fields
    public PackageDeclaration PD1;
    public PackageDeclaration PD2;
    
    //Constructor
    public PackageSequentialDeclaration(PackageDeclaration packageDeclaration1, PackageDeclaration packageDeclaration2, SourcePosition thePosition) {
        super(thePosition);
        
        this.PD1 = packageDeclaration1;
        this.PD2 = packageDeclaration2;
    }
    
    //Visitor
    public Object visit(Visitor v, Object o) {
    return v.visitPackageSequentialDeclaration(this, o);
    }
    
}
