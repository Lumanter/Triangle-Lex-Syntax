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
public class PackageIdentifierSimple extends PackageIdentifier{
    
    //Fields
    public Identifier I;
    
    //Constructor
    public PackageIdentifierSimple(Identifier identifier, SourcePosition thePosition) {
        super(thePosition);
        
        this.I = identifier;
    }
    
    //Visitor
    public Object visit(Visitor v, Object o) {
    return v.visitPackageIdentifierSimple(this, o);
    }
}
