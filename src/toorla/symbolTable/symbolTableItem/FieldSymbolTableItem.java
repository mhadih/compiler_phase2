package toorla.symbolTable.symbolTableItem;

import toorla.symbolTable.symbolTableItem.varItems.VarSymbolTableItem;
import toorla.types.Type;

public class FieldSymbolTableItem extends VarSymbolTableItem {
    private Type type;

    public FieldSymbolTableItem(String name , Type type) {
        this.name=name;
        this.type=type;
    }

    public String getKey() {
        return name;
    }

    public Type getType() {
        return type;
    }

}
