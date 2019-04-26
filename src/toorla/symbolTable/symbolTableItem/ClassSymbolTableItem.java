package toorla.symbolTable.symbolTableItem;

import javafx.util.Pair;
import toorla.ast.declaration.classDecs.classMembersDecs.ClassMemberDeclaration;
import toorla.ast.declaration.classDecs.classMembersDecs.FieldDeclaration;
import toorla.symbolTable.SymbolTable;
import toorla.symbolTable.exceptions.ItemAlreadyExistsException;

public class ClassSymbolTableItem extends SymbolTableItem {
//    private String father;
    public SymbolTable symbolTable = new SymbolTable();

    public ClassSymbolTableItem(String name) {
        this.name = name;
    }

//    public void addItemToSymbol(ClassMemberDeclaration member) {
//        if (member instanceof FieldDeclaration) {
//            FieldDeclaration field = (FieldDeclaration)member;
//            try {
//                FieldSymbolTableItem newField = new FieldSymbolTableItem(field.getIdentifier().getName(), field.getType());
//                SymbolTable.top.put(newField);
//            } catch (ItemAlreadyExistsException exception) {
//                Pair<Integer,String> err =
//                        new Pair<Integer,String>(fieldDeclaration.line,"Error:Line:" + fieldDeclaration.line + ":Redefinition of Field " + fieldDeclaration.getIdentifier().getName());
//                error.add(err);
//                hasError = true;
//            }
//        }
//    }

    public String getKey() {
        return name;
    }
}
