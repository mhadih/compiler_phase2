package toorla.visitor;

//import jdk.internal.util.xml.impl.Pair;
import toorla.ast.Program;
import toorla.ast.declaration.classDecs.ClassDeclaration;
import toorla.ast.declaration.classDecs.EntryClassDeclaration;
import toorla.ast.declaration.classDecs.classMembersDecs.ClassMemberDeclaration;
import toorla.ast.declaration.classDecs.classMembersDecs.FieldDeclaration;
import toorla.ast.declaration.classDecs.classMembersDecs.MethodDeclaration;
import toorla.ast.declaration.localVarDecs.ParameterDeclaration;
import toorla.ast.expression.*;
import toorla.ast.expression.binaryExpression.*;
import toorla.ast.expression.unaryExpression.Neg;
import toorla.ast.expression.unaryExpression.Not;
import toorla.ast.expression.value.BoolValue;
import toorla.ast.expression.value.IntValue;
import toorla.ast.expression.value.StringValue;
import toorla.ast.statement.*;
import toorla.ast.statement.localVarStats.LocalVarDef;
import toorla.ast.statement.localVarStats.LocalVarsDefinitions;
import toorla.ast.statement.returnStatement.Return;
import toorla.symbolTable.SymbolTable;
import toorla.symbolTable.exceptions.ItemAlreadyExistsException;
import toorla.symbolTable.symbolTableItem.ClassSymbolTableItem;
import toorla.symbolTable.symbolTableItem.FieldSymbolTableItem;
import toorla.symbolTable.symbolTableItem.MethodSymbolTableItem;
import toorla.symbolTable.symbolTableItem.ScopeSymbolTableItem;
import toorla.types.Type;
import toorla.visitor.Visitor;
import toorla.symbolTable.*;
import toorla.symbolTable.symbolTableItem.varItems.*;
import javafx.util.Pair;
import java.util.ArrayList;


public class NameAnalayzer implements Visitor<Void> {
    public SymbolTable symbolTable;
    private Integer counter;
    private Integer blockCnt;
    public Boolean hasError;
    public ArrayList< Pair <Integer , String > > error;


    public NameAnalayzer() {
        symbolTable = new SymbolTable();
        SymbolTable.root = symbolTable;
        SymbolTable.push(symbolTable);
        blockCnt = 0;
        hasError = false;
    }

    @Override
    public Void visit(PrintLine printLine) {
        printLine.getArg().accept(this);
        return null;
    }

    @Override
    public Void visit(Assign assign) {
        assign.getLvalue().accept(this);
        assign.getRvalue().accept(this);
        return null;
    }

    @Override
    public Void visit(Block block) {
        try {
            ScopeSymbolTableItem newBlock = new ScopeSymbolTableItem("Block" + blockCnt);
            blockCnt += 1;
            SymbolTable.top.put(newBlock);
            newBlock.symbolTable.setPreSymbolTable(SymbolTable.top);
            SymbolTable.push(newBlock.symbolTable);
        } catch (ItemAlreadyExistsException exception) {
            // nothing
        }
        for (Statement s : block.body)
            s.accept(this);
        SymbolTable.pop();
        return null;
    }

    @Override
    public Void visit(Conditional conditional) {
        conditional.getCondition().accept(this);
        conditional.getThenStatement().accept(this);
        conditional.getElseStatement().accept(this);
        return null;
    }

    @Override
    public Void visit(While whileStat) {
        whileStat.expr.accept(this);
        whileStat.body.accept(this);
        return null;
    }

    @Override
    public Void visit(Return returnStat) {
        returnStat.getReturnedExpr().accept(this);
        return null;
    }

    @Override
    public Void visit(Plus plusExpr) {
        plusExpr.getLhs().accept(this);
        plusExpr.getRhs().accept(this);
        return null;
    }

    @Override
    public Void visit(Minus minusExpr) {
        minusExpr.getLhs().accept(this);
        minusExpr.getRhs().accept(this);
        return null;
    }

    @Override
    public Void visit(Times timesExpr) {
        timesExpr.getLhs().accept(this);
        timesExpr.getRhs().accept(this);
        return null;
    }

    @Override
    public Void visit(Division divisionExpr) {
        divisionExpr.getLhs().accept(this);
        divisionExpr.getRhs().accept(this);
        return null;
    }

    @Override
    public Void visit(Modulo moduloExpr) {
        moduloExpr.getLhs().accept(this);
        moduloExpr.getRhs().accept(this);
        return null;
    }

    @Override
    public Void visit(Equals equalsExpr) {
        equalsExpr.getLhs().accept(this);
        equalsExpr.getRhs().accept(this);
        return null;
    }

    @Override
    public Void visit(GreaterThan gtExpr) {
        gtExpr.getLhs().accept(this);
        gtExpr.getRhs().accept(this);
        return null;
    }

    @Override
    public Void visit(LessThan ltExpr) {
        ltExpr.getLhs().accept(this);
        ltExpr.getRhs().accept(this);
        return null;
    }

    @Override
    public Void visit(And andExpr) {
        andExpr.getLhs().accept(this);
        andExpr.getRhs().accept(this);
        return null;
    }

    @Override
    public Void visit(Or orExpr) {
        orExpr.getLhs().accept(this);
        orExpr.getRhs().accept(this);
        return null;
    }

    @Override
    public Void visit(Neg negExpr) {
        negExpr.getExpr().accept(this);
        return null;
    }

    @Override
    public Void visit(Not notExpr) {
        notExpr.getExpr().accept(this);
        return null;
    }

    @Override
    public Void visit(MethodCall methodCall) {
        methodCall.getInstance().accept(this);
        methodCall.getMethodName().accept(this);
        for (Expression arg : methodCall.getArgs()) {
            arg.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(Identifier identifier) {
        return null;
    }

    @Override
    public Void visit(Self self) {
        return null;
    }

    @Override
    public Void visit(Break breakStat) {
        return null;
    }

    @Override
    public Void visit(Continue continueStat) {
        return null;
    }

    @Override
    public Void visit(Skip skip) {
        return null;
    }

    @Override
    public Void visit(IntValue intValue) {
        return null;
    }

    @Override
    public Void visit(NewArray newArray) {

        newArray.getLength().accept(this);
        return null;
    }

    @Override
    public Void visit(BoolValue booleanValue) {
        return null;
    }

    @Override
    public Void visit(StringValue stringValue) {
        return null;
    }

    @Override
    public Void visit(NewClassInstance newClassInstance) {
        newClassInstance.getClassName().accept(this);
        return null;
    }

    @Override
    public Void visit(FieldCall fieldCall) {
        fieldCall.getInstance().accept(this);
        fieldCall.getField().accept(this);
        return null;
    }

    @Override
    public Void visit(ArrayCall arrayCall) {
        arrayCall.getInstance().accept(this);
        arrayCall.getIndex().accept(this);
        return null;
    }

    @Override
    public Void visit(NotEquals notEquals) {
        notEquals.getLhs().accept(this);
        notEquals.getRhs().accept(this);
        return null;
    }

    @Override
    public Void visit(LocalVarDef localVarDef) {
        try{
            LocalVariableSymbolTableItem variable = new LocalVariableSymbolTableItem(localVarDef.getLocalVarName().getName());
            SymbolTable.top.put(variable);
            localVarDef.getLocalVarName().setIndex(counter);
            counter += 1;
        }
        catch(ItemAlreadyExistsException exception){
//            System.out.println("Error:Line:" + localVarDef.line + ":Redefinition of Local Variable " +  localVarDef.getLocalVarName().getName() + " in current scope");
            Pair <Integer,String> err =
                        new Pair<Integer,String>(localVarDef.line,"Error:Line:" + localVarDef.line + ":Redefinition of Local Variable " +  localVarDef.getLocalVarName().getName() + " in current scope");
            error.add(err);
            hasError = true;
        }
        localVarDef.getLocalVarName().accept(this);
        localVarDef.getInitialValue().accept(this);
        return null;
    }

    @Override
    public Void visit(IncStatement incStatement) {
        incStatement.getOperand().accept(this);
        return null;
    }

    @Override
    public Void visit(DecStatement decStatement) {
        decStatement.getOperand().accept(this);
        return null;
    }

    @Override
    public Void visit(ClassDeclaration classDeclaration) {
        try{
            ClassSymbolTableItem newClass = new ClassSymbolTableItem(classDeclaration.getName().getName());
            SymbolTable.top.put(newClass);
            newClass.symbolTable.setPreSymbolTable(SymbolTable.top);
            SymbolTable.push(newClass.symbolTable);

        }
        catch(ItemAlreadyExistsException exception){
//            System.out.println("Error:Line:" + classDeclaration.line + ":Redefinition of Class " + classDeclaration.getName());
            Pair <Integer,String> err =
                    new Pair<Integer,String>(classDeclaration.line,"Error:Line:" + classDeclaration.line + ":Redefinition of Class " + classDeclaration.getName());
            error.add(err);
            hasError = true;
        }
        classDeclaration.getName().accept(this);
        if (classDeclaration.getParentName().getName() != null) {
            classDeclaration.getParentName().accept(this);
        }
        for (ClassMemberDeclaration md : classDeclaration.getClassMembers())
            md.accept(this);
        SymbolTable.pop();
        return null;
    }

    @Override
    public Void visit(EntryClassDeclaration entryClassDeclaration) {

        try{
            ClassSymbolTableItem newClass = new ClassSymbolTableItem(entryClassDeclaration.getName().getName());
            SymbolTable.top.put(newClass);
            newClass.symbolTable.setPreSymbolTable(SymbolTable.top);
            SymbolTable.push(newClass.symbolTable);
        }
        catch(ItemAlreadyExistsException exception){
//            System.out.println("Error:Line:" + entryClassDeclaration.line + ":Redefinition of Class " + entryClassDeclaration.getName());
            Pair <Integer,String> err =
                    new Pair<Integer,String>(entryClassDeclaration.line,"Error:Line:" + entryClassDeclaration.line + ":Redefinition of Class " + entryClassDeclaration.getName());
            error.add(err);
            hasError = true;
        }

        entryClassDeclaration.getName().accept(this);
        if (entryClassDeclaration.getParentName().getName() != null) {
            entryClassDeclaration.getParentName().accept(this);
        }
        for (ClassMemberDeclaration md : entryClassDeclaration.getClassMembers())
            md.accept(this);
        SymbolTable.pop();
        return null;
    }

    @Override
    public Void visit(FieldDeclaration fieldDeclaration) {
        if (fieldDeclaration.getIdentifier().getName().equals("length")) {
            System.out.println("Error:line:" + fieldDeclaration.line + ":Definition of length as field of a class");
        }
        else {
            try {
                FieldSymbolTableItem field = new FieldSymbolTableItem(fieldDeclaration.getIdentifier().getName(), fieldDeclaration.getType());
                SymbolTable.top.put(field);
            } catch (ItemAlreadyExistsException exception) {
//                System.out.println("Error:Line:" + fieldDeclaration.line + ":Redefinition of Field " + fieldDeclaration.getIdentifier().getName());
                Pair <Integer,String> err =
                        new Pair<Integer,String>(fieldDeclaration.line,"Error:Line:" + fieldDeclaration.line + ":Redefinition of Field " + fieldDeclaration.getIdentifier().getName());
                error.add(err);
                hasError = true;
            }
        }
        fieldDeclaration.getIdentifier().accept(this);
        return null;
    }

    @Override
    public Void visit(ParameterDeclaration parameterDeclaration) {
        try {
            LocalVariableSymbolTableItem parameter = new LocalVariableSymbolTableItem(parameterDeclaration.getIdentifier().getName(), parameterDeclaration.getType());
            SymbolTable.top.put(parameter);
            parameterDeclaration.getIdentifier().setIndex(counter);
            counter +=1;
        }
        catch(ItemAlreadyExistsException exception) {
//            System.out.println("Error:Line:" + parameterDeclaration.line + ":Redefinition of Local Variable" +  parameterDeclaration.getIdentifier().getName() + "in current scope");
            Pair <Integer,String> err =
                    new Pair<Integer,String>(parameterDeclaration.line,"Error:Line:" + parameterDeclaration.line + ":Redefinition of Local Variable" +  parameterDeclaration.getIdentifier().getName() + "in current scope");
            error.add(err);
            hasError = true;
        }
        parameterDeclaration.getIdentifier().accept(this);
        return null;
    }

    @Override
    public Void visit(MethodDeclaration methodDeclaration) {
        methodDeclaration.getName().accept(this);
        counter = 0;
        ArrayList<Type> paramType = new ArrayList<>();
        for (ParameterDeclaration pd : methodDeclaration.getArgs()) {
            paramType.add(pd.getType());
        }
        try {
            MethodSymbolTableItem method = new MethodSymbolTableItem(methodDeclaration.getName().getName(), methodDeclaration.getReturnType(), paramType);
            SymbolTable.top.put(method);
            method.symbolTable.setPreSymbolTable(SymbolTable.top);
            SymbolTable.push(method.symbolTable);
        } catch (ItemAlreadyExistsException exception) {
//            System.out.println("Error:Line:" + methodDeclaration.line + ":Redefinition of Field " + methodDeclaration.getName().getName());
            Pair <Integer,String> err =
                    new Pair<Integer,String>(methodDeclaration.line,"Error:Line:" + methodDeclaration.line + ":Redefinition of Field " + methodDeclaration.getName().getName());
            error.add(err);
            hasError = true;
        }
        for (ParameterDeclaration pd : methodDeclaration.getArgs()) {
            pd.accept(this);
        }
        for (Statement stmt : methodDeclaration.getBody())
            stmt.accept(this);
        SymbolTable.pop();
        return null;
    }

    @Override
    public Void visit(LocalVarsDefinitions localVarsDefinitions) {
        for (LocalVarDef lvd : localVarsDefinitions.getVarDefinitions())
            lvd.accept(this);
        return null;
    }

    @Override
    public Void visit(Program program) {
        for (ClassDeclaration cd : program.getClasses())
            cd.accept(this);
        return null;
    }
}
