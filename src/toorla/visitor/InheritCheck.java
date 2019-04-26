package toorla.visitor;

import javafx.util.Pair;
import toorla.ast.Program;
import toorla.ast.declaration.classDecs.ClassDeclaration;
import toorla.ast.declaration.classDecs.classMembersDecs.ClassMemberDeclaration;
import toorla.ast.declaration.classDecs.classMembersDecs.FieldDeclaration;
import toorla.ast.declaration.classDecs.classMembersDecs.MethodDeclaration;
import toorla.symbolTable.SymbolTable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class InheritCheck {

    static public int MAX_CLASS = 1000;

    SymbolTable symbolTable;
    Map<String, String> parent;
    Boolean[] markBlack = new Boolean[1000];
    Integer classCounter;
    Map<String, ClassDeclaration> classNameMap;
    public ArrayList< Pair <Integer , String > > error;
    public Boolean hasError;
    HashSet<String> uniqueField, uniqueMethod;

    public InheritCheck(SymbolTable symbolTable, ArrayList< Pair <Integer , String > > error) {
        this.symbolTable = symbolTable;
        classCounter = 0;
        parent = new HashMap<>();
        classNameMap = new HashMap<>();
        hasError = false;
        this.error = error;
    }

    public String getClassMemberName(ClassMemberDeclaration member) {
        if (member instanceof FieldDeclaration) {
            FieldDeclaration field = (FieldDeclaration) member;
            return field.getIdentifier().getName();
        }
        if (member instanceof MethodDeclaration) {
            MethodDeclaration method = (MethodDeclaration) member;
            return method.getName().getName();
        }
        return "";
    }

    public void getParentPath(String str) {
        uniqueField = new HashSet<>();
        uniqueMethod = new HashSet<>();
//        System.out.println("#" + str);
        if (!parent.containsKey(str))
            return;
        String par = parent.get(str);
        while (!par.equals(str)) {
//            System.out.println(par);
            for (ClassMemberDeclaration memberChild : classNameMap.get(str).getClassMembers())
                for (ClassMemberDeclaration memberPar: classNameMap.get(par).getClassMembers()) {
                    if (memberChild instanceof FieldDeclaration) {
                        FieldDeclaration field = (FieldDeclaration)memberChild;
//                        System.out.println(field.getIdentifier().getName());
//                        System.out.println(getClassMemberName(memberPar));
                        if (field.getIdentifier().getName().equals(getClassMemberName(memberPar)) && !uniqueField.contains(field.getIdentifier().getName())) {
//                            System.out.println("##########");
                            Pair<Integer,String> err =
                                    new Pair<>(field.getIdentifier().line, "Error:Line:" + field.getIdentifier().line + ":Redefinition of Field " + field.getIdentifier().getName());
                            error.add(err);
                            hasError = true;
                            uniqueField.add(field.getIdentifier().getName());
                        }
                    }
                    if (memberChild instanceof MethodDeclaration) {
                        MethodDeclaration method = (MethodDeclaration)memberChild;
                        if (method.getName().getName().equals(getClassMemberName(memberPar)) && !uniqueField.contains(method.getName().getName())) {
                            Pair<Integer, String> err =
                                    new Pair<>(method.getName().line, "Error:Line:" + method.getName().line + ":Redefinition of method " + method.getName().getName());
                            error.add(err);
                            hasError = true;
                            uniqueMethod.add(method.getName().getName());
                        }
                    }
                }
            if (!parent.containsKey(par))
                return;
            par = parent.get(par);
        }
    }

//    public Integer getIndex(String str) {
//        if (!classIndexMap.containsKey(str) {
//            classIndexMap.put(str, classCounter);
//            classCounter += 1;
//        }
//        return classIndexMap.get(str);
//    }

    public void addEdge(Program toorlaASTCode) {
        for (ClassDeclaration itrClass : toorlaASTCode.getClasses())
            if (itrClass.getParentName().getName() != null)
            {
                parent.put(itrClass.getName().getName(), itrClass.getParentName().getName());
//                System.out.println(itrClass.getParentName().getName());
            }
    }

    public void check(Program toorlaASTCode) {
        for (ClassDeclaration itrClass : toorlaASTCode.getClasses()) {
//            System.out.println(itrClass.getName().getName());
            classNameMap.put(itrClass.getName().getName(), itrClass);
        }
        addEdge(toorlaASTCode);
        for (ClassDeclaration itrClass : toorlaASTCode.getClasses())
            getParentPath(itrClass.getName().getName());
    }
}
