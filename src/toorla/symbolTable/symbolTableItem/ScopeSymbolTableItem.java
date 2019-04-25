package toorla.symbolTable.symbolTableItem;

import toorla.symbolTable.SymbolTable;

public class ScopeSymbolTableItem extends SymbolTableItem {
    public SymbolTable symbolTable = new SymbolTable();

    public ScopeSymbolTableItem(String name) {
        this.name = name;
    }

    public String getKey() {
        return name;
    }
}
