package toorla.visitor;

import javafx.util.Pair;
import toorla.ast.Program;
import toorla.ast.declaration.classDecs.ClassDeclaration;
import toorla.ast.declaration.classDecs.classMembersDecs.ClassMemberDeclaration;
import toorla.ast.declaration.classDecs.classMembersDecs.FieldDeclaration;
import toorla.ast.declaration.classDecs.classMembersDecs.MethodDeclaration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class InheritCheck {

    static public int MAX_CLASS = 1000;

    Map<String, String> parent;
    Boolean[] markBlack = new Boolean[1000];
    Integer classCounter;
    Map<String, ClassDeclaration> classNameMap;
    public ArrayList< Pair <Integer , String > > error;
    public Boolean hasError;
    HashSet<String> uniqueField, uniqueMethod;

    public InheritCheck(ArrayList< Pair <Integer , String > > error) {
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
        if (!parent.containsKey(str))
            return;
        String par = parent.get(str);
        while (!par.equals(str)) {
            if (!classNameMap.containsKey(par))
                return;
            for (ClassMemberDeclaration memberChild : classNameMap.get(str).getClassMembers())
                for (ClassMemberDeclaration memberPar: classNameMap.get(par).getClassMembers()) {
                    if (memberChild instanceof FieldDeclaration) {
                        FieldDeclaration field = (FieldDeclaration)memberChild;
                        if (memberPar instanceof  FieldDeclaration && field.getIdentifier().getName().equals(getClassMemberName(memberPar)) && !uniqueField.contains(field.getIdentifier().getName())) {
                            Pair<Integer,String> err =
                                    new Pair<>(field.getIdentifier().line, "Error:Line:" + field.getIdentifier().line + ":Redefinition of Field " + field.getIdentifier().getName());
                            error.add(err);
                            hasError = true;
                            uniqueField.add(field.getIdentifier().getName());
                        }
                    }
                    if (memberChild instanceof MethodDeclaration) {
                        MethodDeclaration method = (MethodDeclaration)memberChild;
                        if (memberPar instanceof MethodDeclaration && method.getName().getName().equals(getClassMemberName(memberPar)) && !uniqueMethod.contains(method.getName().getName())) {
                            Pair<Integer, String> err =
                                    new Pair<>(method.getName().line, "Error:Line:" + method.getName().line + ":Redefinition of Method " + method.getName().getName());
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

    public void addEdge(Program toorlaASTCode) {
        for (ClassDeclaration itrClass : toorlaASTCode.getClasses())
            if (itrClass.getParentName().getName() != null)
            {
                parent.put(itrClass.getName().getName(), itrClass.getParentName().getName());
            }
    }

    public void check(Program toorlaASTCode) {
        for (ClassDeclaration itrClass : toorlaASTCode.getClasses())
            if ( !classNameMap.containsKey(itrClass.getName().getName()) )
                classNameMap.put(itrClass.getName().getName(), itrClass);
        addEdge(toorlaASTCode);
        for (ClassDeclaration itrClass : toorlaASTCode.getClasses())
            getParentPath(itrClass.getName().getName());
    }
}
