/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Triangle.XML;

import Triangle.AbstractSyntaxTrees.AST;
import Triangle.AbstractSyntaxTrees.AnyTypeDenoter;
import Triangle.AbstractSyntaxTrees.ArrayExpression;
import Triangle.AbstractSyntaxTrees.ArrayTypeDenoter;
import Triangle.AbstractSyntaxTrees.AssignCommand;
import Triangle.AbstractSyntaxTrees.BinaryExpression;
import Triangle.AbstractSyntaxTrees.BinaryOperatorDeclaration;
import Triangle.AbstractSyntaxTrees.BoolTypeDenoter;
import Triangle.AbstractSyntaxTrees.CallCommand;
import Triangle.AbstractSyntaxTrees.CallExpression;
import Triangle.AbstractSyntaxTrees.Case;
import Triangle.AbstractSyntaxTrees.CaseCommand;
import Triangle.AbstractSyntaxTrees.CaseLiteralCharacter;
import Triangle.AbstractSyntaxTrees.CaseLiteralInteger;
import Triangle.AbstractSyntaxTrees.CaseLiteralsSequenceMultiple;
import Triangle.AbstractSyntaxTrees.CaseLiteralsSequenceSingle;
import Triangle.AbstractSyntaxTrees.CaseRangeOne;
import Triangle.AbstractSyntaxTrees.CaseRangeTwo;
import Triangle.AbstractSyntaxTrees.CaseSequenceMultiple;
import Triangle.AbstractSyntaxTrees.CaseSequenceSingle;
import Triangle.AbstractSyntaxTrees.Cases;
import Triangle.AbstractSyntaxTrees.CharTypeDenoter;
import Triangle.AbstractSyntaxTrees.CharacterExpression;
import Triangle.AbstractSyntaxTrees.CharacterLiteral;
import Triangle.AbstractSyntaxTrees.CompoundDeclaration;
import Triangle.AbstractSyntaxTrees.ConstActualParameter;
import Triangle.AbstractSyntaxTrees.ConstDeclaration;
import Triangle.AbstractSyntaxTrees.ConstFormalParameter;
import Triangle.AbstractSyntaxTrees.DotVname;
import Triangle.AbstractSyntaxTrees.Elsif;
import Triangle.AbstractSyntaxTrees.ElsifSequenceEmpty;
import Triangle.AbstractSyntaxTrees.ElsifSequenceMultiple;
import Triangle.AbstractSyntaxTrees.ElsifSequenceSingle;
import Triangle.AbstractSyntaxTrees.EmptyActualParameterSequence;
import Triangle.AbstractSyntaxTrees.EmptyCommand;
import Triangle.AbstractSyntaxTrees.EmptyExpression;
import Triangle.AbstractSyntaxTrees.EmptyFormalParameterSequence;
import Triangle.AbstractSyntaxTrees.ErrorTypeDenoter;
import Triangle.AbstractSyntaxTrees.ExpressionVarDeclaration;
import Triangle.AbstractSyntaxTrees.FuncActualParameter;
import Triangle.AbstractSyntaxTrees.FuncDeclaration;
import Triangle.AbstractSyntaxTrees.FuncFormalParameter;
import Triangle.AbstractSyntaxTrees.FunctionProcFuncDeclaration;
import Triangle.AbstractSyntaxTrees.Identifier;
import Triangle.AbstractSyntaxTrees.IfCommand;
import Triangle.AbstractSyntaxTrees.IfExpression;
import Triangle.AbstractSyntaxTrees.IntTypeDenoter;
import Triangle.AbstractSyntaxTrees.IntegerExpression;
import Triangle.AbstractSyntaxTrees.IntegerLiteral;
import Triangle.AbstractSyntaxTrees.LetCommand;
import Triangle.AbstractSyntaxTrees.LetExpression;
import Triangle.AbstractSyntaxTrees.LoopConditional;
import Triangle.AbstractSyntaxTrees.LoopForCommand;
import Triangle.AbstractSyntaxTrees.LoopPostDoCommand;
import Triangle.AbstractSyntaxTrees.LoopPreDoCommand;
import Triangle.AbstractSyntaxTrees.MultipleActualParameterSequence;
import Triangle.AbstractSyntaxTrees.MultipleArrayAggregate;
import Triangle.AbstractSyntaxTrees.MultipleFieldTypeDenoter;
import Triangle.AbstractSyntaxTrees.MultipleFormalParameterSequence;
import Triangle.AbstractSyntaxTrees.MultipleRecordAggregate;
import Triangle.AbstractSyntaxTrees.Operator;
import Triangle.AbstractSyntaxTrees.PrivateCompoundDeclaration;
import Triangle.AbstractSyntaxTrees.ProcActualParameter;
import Triangle.AbstractSyntaxTrees.ProcDeclaration;
import Triangle.AbstractSyntaxTrees.ProcFormalParameter;
import Triangle.AbstractSyntaxTrees.ProcFuncDeclaration;
import Triangle.AbstractSyntaxTrees.ProcFuncSDeclaration;
import Triangle.AbstractSyntaxTrees.ProcedureProcFuncDeclaration;
import Triangle.AbstractSyntaxTrees.Program;
import Triangle.AbstractSyntaxTrees.RecordExpression;
import Triangle.AbstractSyntaxTrees.RecordTypeDenoter;
import Triangle.AbstractSyntaxTrees.RecursiveCompoundDeclaration;
import Triangle.AbstractSyntaxTrees.SequentialCommand;
import Triangle.AbstractSyntaxTrees.SequentialDeclaration;
import Triangle.AbstractSyntaxTrees.SimpleTypeDenoter;
import Triangle.AbstractSyntaxTrees.SimpleVname;
import Triangle.AbstractSyntaxTrees.SingleActualParameterSequence;
import Triangle.AbstractSyntaxTrees.SingleArrayAggregate;
import Triangle.AbstractSyntaxTrees.SingleFieldTypeDenoter;
import Triangle.AbstractSyntaxTrees.SingleFormalParameterSequence;
import Triangle.AbstractSyntaxTrees.SingleRecordAggregate;
import Triangle.AbstractSyntaxTrees.SubscriptVname;
import Triangle.AbstractSyntaxTrees.TypeDeclaration;
import Triangle.AbstractSyntaxTrees.UnaryExpression;
import Triangle.AbstractSyntaxTrees.UnaryOperatorDeclaration;
import Triangle.AbstractSyntaxTrees.VarActualParameter;
import Triangle.AbstractSyntaxTrees.VarDeclaration;
import Triangle.AbstractSyntaxTrees.VarFormalParameter;
import Triangle.AbstractSyntaxTrees.Visitor;
import Triangle.AbstractSyntaxTrees.VnameExpression;

//<Import Packages Clases>
import Triangle.AbstractSyntaxTrees.PackageIdentifier;

import Triangle.AbstractSyntaxTrees.PackageCallDeclaration;
import Triangle.AbstractSyntaxTrees.PackageSequentialDeclaration;
import Triangle.AbstractSyntaxTrees.PackageEmptyDeclaration;

//<Import Long Identifier>
import Triangle.AbstractSyntaxTrees.LongIdentifier;

/**
 *
 * @author zhong
 */
public class XMLVisitor implements Visitor{
    
    public XMLVisitor(){
        
    }
    
    // <editor-fold defaultstate="collapsed" desc=" Packages "> 
    
    public Object visitPackageIdentifier(PackageIdentifier ast, Object o) { 
      
      return(xmlUnary("Package Identifier", ast.I));
    }
    
    public Object visitPackageCallDeclaration(PackageCallDeclaration ast, Object o) { 
      
      return(xmlBinary("PackageCallDeclaration", ast.PI, ast.D));
    }
    
    public Object visitPackageSequentialDeclaration(PackageSequentialDeclaration ast, Object o) { 
      
      return(xmlBinary("PackageSequentialDeclaration", ast.PD1, ast.PD2));
    }
    
    public Object visitPackageEmptyDeclaration(PackageEmptyDeclaration ast, Object o) { 
        
      return(xmlNullary("PackageEmptyDeclaration"));
    }
    
    // </editor-fold>
    
    @Override
    public Object visitAssignCommand(AssignCommand ast, Object o) {
        return xmlBinary("AssignCommand",ast.V,ast.E);
    }

    @Override
    public Object visitCallCommand(CallCommand ast, Object o) {
        return xmlBinary("CallCommand", ast.I, ast.APS);
    }

    @Override
    public Object visitEmptyCommand(EmptyCommand ast, Object o) {
        return xmlNullary("EmptyCommand"); }

    @Override
    public Object visitIfCommand(IfCommand ast, Object o) {
        return xmlTernary("IfCommand", ast.E, ast.C1, ast.C2);
    }

    @Override
    public Object visitLetCommand(LetCommand ast, Object o) {
        return xmlBinary("LetCommand", ast.D, ast.C);
    }

    @Override
    public Object visitSequentialCommand(SequentialCommand ast, Object o) {
        return xmlBinary("SequentialCommand", ast.C1, ast.C2);
    }

    //Expresiones
    @Override
    public Object visitArrayExpression(ArrayExpression ast, Object o) {
        return xmlUnary("ArrayExpression", ast.AA);
    }

    @Override
    public Object visitBinaryExpression(BinaryExpression ast, Object o) {
        return xmlTernary("BinaryExpression", ast.E1, ast.O, ast.E2);
    }

    @Override
    public Object visitCallExpression(CallExpression ast, Object o) {
        return xmlBinary("CallExpression", ast.I, ast.APS);
    }

    @Override
    public Object visitCharacterExpression(CharacterExpression ast, Object o) {
        return xmlUnary("CharacterExpression", ast.CL);
    }

    @Override
    public Object visitEmptyExpression(EmptyExpression ast, Object o) {
        return xmlNullary("EmptyExpression");
    }

    @Override
    public Object visitIfExpression(IfExpression ast, Object o) {
        return xmlTernary("IfExpression", ast.E1, ast.E2, ast.E3);
    }

    @Override
    public Object visitIntegerExpression(IntegerExpression ast, Object o) {
        return xmlUnary("IntegerExpression", ast.IL);
    }

    @Override
    public Object visitLetExpression(LetExpression ast, Object o) {
        return xmlBinary("LetExpression", ast.D, ast.E);
    }

    @Override
    public Object visitRecordExpression(RecordExpression ast, Object o) {
        return xmlUnary("RecordExpression", ast.RA);
    }

    @Override
    public Object visitUnaryExpression(UnaryExpression ast, Object o) {
        return xmlBinary("UnaryExpression", ast.O, ast.E);
    }

    @Override
    public Object visitVnameExpression(VnameExpression ast, Object o) {
        return xmlUnary("VnameExpression", ast.V);
    }

    //// Declaraciones
    @Override
    public Object visitBinaryOperatorDeclaration(BinaryOperatorDeclaration ast, Object o) {
        return xmlQuaternary("BinaryOperatorDeclaration", ast.O, ast.ARG1, ast.ARG2, ast.RES);
    }

    @Override
    public Object visitConstDeclaration(ConstDeclaration ast, Object o) {
        return xmlBinary("ConstDeclaration", ast.I, ast.E);
    }

    @Override
    public Object visitFuncDeclaration(FuncDeclaration ast, Object o) {
        return xmlQuaternary("FuncDeclaration", ast.I, ast.FPS, ast.T, ast.E);
    }

    @Override
    public Object visitProcDeclaration(ProcDeclaration ast, Object o) {
        return xmlTernary("ProcDeclaration", ast.I, ast.FPS, ast.C);
    }

    @Override
    public Object visitSequentialDeclaration(SequentialDeclaration ast, Object o) {
        return xmlBinary("SequentialDeclaration", ast.D1, ast.D2);
    }

    @Override
    public Object visitTypeDeclaration(TypeDeclaration ast, Object o) {
        return xmlBinary("TypeDeclaration", ast.I, ast.T);
    }

    @Override
    public Object visitUnaryOperatorDeclaration(UnaryOperatorDeclaration ast, Object o) {
        return xmlTernary("UnaryOperatorDeclaration", ast.O, ast.ARG, ast.RES);
    }

    @Override
    public Object visitVarDeclaration(VarDeclaration ast, Object o) {
        return xmlBinary("VarDeclaration", ast.I, ast.T);
    }

    @Override
    public Object visitProcedureProcFuncDeclaration(ProcedureProcFuncDeclaration aThis, Object o) {
        return (xmlTernary("ProcedureProcedure-FunctionDeclaration",aThis.I,aThis.F,aThis.C));
    }

    @Override
    public Object visitFunctionProcFuncDeclaration(FunctionProcFuncDeclaration aThis, Object o) {
        return (xmlQuaternary("FunctionProcedure-FunctionDeclaration",aThis.I,aThis.F,aThis.T,aThis.E));
    }

    @Override
    public Object visitPrivateCompoundDeclaration(PrivateCompoundDeclaration aThis, Object o) {
        return (xmlBinary("PrivateCompoundDeclaration",aThis.D1,aThis.D2));
    }

    @Override
    public Object visitRecursiveCompoundDeclaration(RecursiveCompoundDeclaration aThis, Object o) {
        return (xmlUnary("Recursive CompoundDeclaration",aThis.D1));
    }

    @Override
    public Object visitProcFuncSDeclaration(ProcFuncSDeclaration aThis, Object o) {
        return (xmlBinary("Procedures-FunctionsDeclaration",aThis.D1,aThis.D2));
    }

    @Override
    public Object visitExpressionVarDeclaration(ExpressionVarDeclaration aThis, Object o) {
        return (xmlBinary("ExpressionVariableDeclaration",aThis.I,aThis.E));
    }
    
    //// Array Aggregates
    @Override
    public Object visitMultipleArrayAggregate(MultipleArrayAggregate ast, Object o) {
        return xmlBinary("MultipleArrayAggregate", ast.E, ast.AA);
    }

    @Override
    public Object visitSingleArrayAggregate(SingleArrayAggregate ast, Object o) {
        return xmlUnary("SingleArrayAggregate", ast.E);
    }

    @Override
    public Object visitMultipleRecordAggregate(MultipleRecordAggregate ast, Object o) {
        return xmlTernary("MultipleRecordAggregate", ast.I, ast.E, ast.RA);
    }

    @Override
    public Object visitSingleRecordAggregate(SingleRecordAggregate ast, Object o) {
        return xmlBinary("SingleRecordAggregate", ast.I, ast.E);
    }

    //// Parametros Formales
    @Override
    public Object visitConstFormalParameter(ConstFormalParameter ast, Object o) {
        return xmlBinary("ConstFormalParameter", ast.I, ast.T);
    }

    @Override
    public Object visitFuncFormalParameter(FuncFormalParameter ast, Object o) {
        return xmlTernary("FuncFormalParameter", ast.I, ast.FPS, ast.T);
    }

    @Override
    public Object visitProcFormalParameter(ProcFormalParameter ast, Object o) {
        return xmlBinary("ProcFormalParameter", ast.I, ast.FPS);
    }

    @Override
    public Object visitVarFormalParameter(VarFormalParameter ast, Object o) {
        return xmlBinary("VarFormalParameter", ast.I, ast.T);
    }

    @Override
    public Object visitEmptyFormalParameterSequence(EmptyFormalParameterSequence ast, Object o) {
        return xmlNullary("EmptyFormalParameterSequence");
    }

    @Override
    public Object visitMultipleFormalParameterSequence(MultipleFormalParameterSequence ast, Object o) {
        return xmlBinary("MultipleFormalParameterSequence", ast.FP, ast.FPS);
    }

    @Override
    public Object visitSingleFormalParameterSequence(SingleFormalParameterSequence ast, Object o) {
        return xmlUnary("SingleFormalParameterSequence", ast.FP);
    }
    
    //// Parametros actuales
    @Override
    public Object visitConstActualParameter(ConstActualParameter ast, Object o) {
        return xmlUnary("ConstActualParameter", ast.E);
    }

    @Override
    public Object visitFuncActualParameter(FuncActualParameter ast, Object o) {
        return xmlUnary("FuncActualParameter", ast.I);
    }

    @Override
    public Object visitProcActualParameter(ProcActualParameter ast, Object o) {
        return xmlUnary("ProcActualParameter", ast.I);
    }

    @Override
    public Object visitVarActualParameter(VarActualParameter ast, Object o) {
        return xmlUnary("VarActualParameter", ast.V);
    }

    @Override
    public Object visitEmptyActualParameterSequence(EmptyActualParameterSequence ast, Object o) {
        return xmlNullary("EmptyActualParameterSequence");
    }

    @Override
    public Object visitMultipleActualParameterSequence(MultipleActualParameterSequence ast, Object o) {
        return xmlBinary("MultipleActualParameterSequence", ast.AP, ast.APS);
    }

    @Override
    public Object visitSingleActualParameterSequence(SingleActualParameterSequence ast, Object o) {
        return xmlUnary("SingleActualParameterSequence", ast.AP);
    }

    
    //// Especificaciones de Tipos
    @Override
    public Object visitAnyTypeDenoter(AnyTypeDenoter ast, Object o) {
        return xmlNullary("AnyTypeDenoter");
    }

    @Override
    public Object visitArrayTypeDenoter(ArrayTypeDenoter ast, Object o) {
        return xmlBinary("ArrayTypeDenoter", ast.IL, ast.T);
    }

    @Override
    public Object visitBoolTypeDenoter(BoolTypeDenoter ast, Object o) {
        return xmlNullary("BoolTypeDenoter");
    }

    @Override
    public Object visitCharTypeDenoter(CharTypeDenoter ast, Object o) {
        return xmlNullary("CharTypeDenoter");
    }

    @Override
    public Object visitErrorTypeDenoter(ErrorTypeDenoter ast, Object o) {
        return xmlNullary("ErrorTypeDenoter");
    }

    @Override
    public Object visitSimpleTypeDenoter(SimpleTypeDenoter ast, Object o) {
        return xmlUnary("SimpleTypeDenoter", ast.I);
    }

    @Override
    public Object visitIntTypeDenoter(IntTypeDenoter ast, Object o) {
        return xmlNullary("IntTypeDenoter");
    }

    @Override
    public Object visitRecordTypeDenoter(RecordTypeDenoter ast, Object o) {
        return xmlUnary("RecordTypeDenoter", ast.FT);
    }

    @Override
    public Object visitMultipleFieldTypeDenoter(MultipleFieldTypeDenoter ast, Object o) {
        return xmlTernary("MultipleFieldTypeDenoter", ast.I, ast.T, ast.FT);
    }

    @Override
    public Object visitSingleFieldTypeDenoter(SingleFieldTypeDenoter ast, Object o) {
        return xmlBinary("SingleFieldTypeDenoter", ast.I, ast.T);
    }
    
    
    //// Identificadores, literales y operadores
    @Override
    public Object visitCharacterLiteral(CharacterLiteral ast, Object o) {
        return xmlNullary("CharacterLiteral " + ast.spelling);
    }
    
    public Object visitLongIdentifier(LongIdentifier ast, Object o) {             
      
      return(xmlBinary("LongIdentifier", ast.PI, ast.I));
  }

    @Override
    public Object visitIdentifier(Identifier ast, Object o) {
        return xmlNullary("Identifer " + ast.spelling);
    }

    @Override
    public Object visitIntegerLiteral(IntegerLiteral ast, Object o) {
        return xmlNullary("IntegerLiteral " + ast.spelling);
    }

    @Override
    public Object visitOperator(Operator ast, Object o) {
        return xmlNullary("Operator " + ast.spelling);
    }

    
    //// Nombres de variables o valores
    @Override
    public Object visitDotVname(DotVname ast, Object o) {
        return xmlBinary("DotVname", ast.I, ast.V);
    }

    @Override
    public Object visitSimpleVname(SimpleVname ast, Object o) {
        return xmlUnary("SimpleVname", ast.I);
    }

    @Override
    public Object visitSubscriptVname(SubscriptVname ast, Object o) {
        return xmlBinary("SubscriptVname",ast.V, ast.E);
    }

    ////Programa
    @Override
    public Object visitProgram(Program ast, Object o) {
        return xmlBinary("Program",ast.PD , ast.C);
    }
    
    private XMLTree xmlCaption(String name){
        return new XMLTree(name);
    }
    
    private XMLTree xmlNullary(String name){
        return this.xmlCaption(name);
    }
    
    private XMLTree xmlUnary(String name, AST child1){
        XMLTree xm_Top = xmlCaption(name);
        XMLTree xm_1 = (XMLTree) child1.visit(this, null);
        xm_Top.setChildren(new XMLTree[] {xm_1});
        //attachParent(xm_Top);
        return xm_Top;
    }
    
    private XMLTree xmlBinary(String name, AST child1,AST child2){
        XMLTree xm_Top = xmlCaption(name);
        XMLTree xm_1 = (XMLTree) child1.visit(this, null);
        XMLTree xm_2 = (XMLTree) child2.visit(this, null);
        xm_Top.setChildren(new XMLTree[] {xm_1,xm_2});
        //attachParent(xm_Top);
        return xm_Top;
    }
    
    private XMLTree xmlTernary(String name, AST child1,AST child2,
                                            AST child3){
        XMLTree xm_Top = xmlCaption(name);
        XMLTree xm_1 = (XMLTree) child1.visit(this, null);
        XMLTree xm_2 = (XMLTree) child2.visit(this, null);
        XMLTree xm_3 = (XMLTree) child3.visit(this, null);
        xm_Top.setChildren(new XMLTree[] {xm_1,xm_2,xm_3});
        //attachParent(xm_Top);
        return xm_Top;
    }
    
    private XMLTree xmlQuaternary(String name, AST child1,AST child2,
                                            AST child3,AST child4){
        XMLTree xm_Top = xmlCaption(name);
        XMLTree xm_1 = (XMLTree) child1.visit(this, null);
        XMLTree xm_2 = (XMLTree) child2.visit(this, null);
        XMLTree xm_3 = (XMLTree) child3.visit(this, null);
        XMLTree xm_4 = (XMLTree) child4.visit(this, null);
        xm_Top.setChildren(new XMLTree[] {xm_1,xm_2,xm_3,xm_4});
        //attachParent(xm_Top);
        return xm_Top;
    }

    @Override
    public Object visitElsif(Elsif ast, Object o) {
        return xmlBinary("ElseIfExpression", ast.E, ast.C);
    }

    @Override
    public Object visitElsifSequenceEmpty(ElsifSequenceEmpty ast, Object o) {
        return xmlNullary("EmptyElseIfSequence"); 
    }

    @Override
    public Object visitElsifSequenceSingle(ElsifSequenceSingle ast, Object o){
        return xmlUnary("SingleElseIfSequence", ast.E);
    }

    @Override
    public Object visitElsifSequenceMultiple(ElsifSequenceMultiple ast, Object o) {
        return xmlBinary("MultipleElseIfSequence", ast.E, ast.ES); 
    }

    @Override
    public Object visitLoopConditional(LoopConditional ast, Object o) {
        return xmlNullary(ast.spelling);
    }

    @Override
    public Object visitLoopPostDoCommand(LoopPostDoCommand ast, Object o) {
        return xmlTernary("LoopPostDoCommand", ast.LC, ast.E, ast.C);
    }

    @Override
    public Object visitLoopPreDoCommand(LoopPreDoCommand ast, Object o) {
        return xmlTernary("LoopPreDoCommand",ast.C,ast.LC,ast.E);
    }

    @Override
    public Object visitLoopForCommand(LoopForCommand ast, Object o) {
        return xmlQuaternary("LoopForCommand",ast.identifier,ast.from,ast.to,ast.command);
    }

    @Override
    public Object visitCaseLiteralCharacter(CaseLiteralCharacter ast, Object o) {
        return xmlUnary("CaseLiteralCharacter",ast.charLiteral);
    }

    @Override
    public Object visitCaseLiteralInteger(CaseLiteralInteger ast, Object o) {
        return xmlUnary("CaseLiteralInteger",ast.intLiteral);
    }

    @Override
    public Object visitCaseRangeOne(CaseRangeOne ast, Object o) {
        return xmlUnary("CaseRangeOne",ast.caseLiteral);
    }

    @Override
    public Object visitCaseRangeTwo(CaseRangeTwo ast, Object o) {
        return xmlBinary("CaseRangeTwo",ast.from,ast.to);
    }

    @Override
    public Object visitCaseLiteralsSequenceSingle(CaseLiteralsSequenceSingle ast, Object o) {
        return xmlUnary("CaseLiteralSequenceSingle",ast.caseRange);
    }

    @Override
    public Object visitCaseLiteralsSequenceMultiple(CaseLiteralsSequenceMultiple ast, Object o) {
        return xmlBinary("CaseLiteralSequenceMultiple",ast.caseRange,ast.sequence);
    }

    @Override
    public Object visitCase(Case ast, Object o) {
        return xmlBinary("Case",ast.caseLiterals,ast.command);
    }

    @Override
    public Object visitCaseSequenceSingle(CaseSequenceSingle ast, Object o) {
        return xmlUnary("CaseSequenceSingle",ast.caseAST);
    }

    @Override
    public Object visitCaseSequenceMultiple(CaseSequenceMultiple ast, Object o) {
        return xmlBinary("CaseSequenceMultiple",ast.caseAST,ast.sequence);
    }

    @Override
    public Object visitCases(Cases ast, Object o) {
        return xmlBinary("Cases",ast.caseSequence,ast.elseCommand);
    }

    @Override
    public Object visitCaseCommand(CaseCommand ast, Object o) {
        return xmlBinary("CaseCommand",ast.expression,ast.cases);
    }

    @Override
    public Object visitCompoundDeclaration(CompoundDeclaration aThis, Object o) {
        return xmlNullary("CompoundDeclaration");
    }

    @Override
    public Object visitProcFuncDeclaration(ProcFuncDeclaration aThis, Object o) {
        return xmlNullary("ProcFuncDeclaration");
    }
}
