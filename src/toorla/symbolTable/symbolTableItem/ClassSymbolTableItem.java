package toorla.symbolTable.symbolTableItem;

import toorla.symbolTable.SymbolTable;

public class ClassSymbolTableItem extends SymbolTableItem {
//    private String father;
    public SymbolTable symbolTable = new SymbolTable();

    public ClassSymbolTableItem(String name) {
        this.name = name;
    }

    public String getKey() {
        return name;
    }
}
