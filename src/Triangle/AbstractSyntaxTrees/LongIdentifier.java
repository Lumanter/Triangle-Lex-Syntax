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
public class LongIdentifier extends AST{
    
    //Fields
    public PackageIdentifier PI;
    public Identifier I;
    
    //Constructor
    public LongIdentifier(PackageIdentifier packageIdentifier, Identifier identifier, SourcePosition thePosition) {
        super(thePosition);
        
        this.PI = packageIdentifier;
        this.I = identifier;
    }
    
    //Visitor
    public Object visit(Visitor v, Object o) {
    return v.visitLongIdentifier(this, o);
    }
}
