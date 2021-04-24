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
public class Vname extends AST{
    
    //Fields
    public PackageIdentifier PI;
    public VarName VRN;
    
    //Constructor
    public Vname(PackageIdentifier packageIdentifier, VarName varName, SourcePosition thePosition) {
        super(thePosition);
        
        this.PI = packageIdentifier;
        this.VRN = varName;
    }
    
    //Visitor
    public Object visit (Visitor v, Object o) {
    return v.visitVname(this, o);
    }
}
