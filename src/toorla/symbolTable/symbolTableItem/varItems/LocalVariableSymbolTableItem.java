package toorla.symbolTable.symbolTableItem.varItems;

import toorla.types.Type;
import toorla.types.AnonymousType;

public class LocalVariableSymbolTableItem extends VarSymbolTableItem {
    private Type varType;
//    private int index;
    public LocalVariableSymbolTableItem(String name){
        this.name=name;
        this.varType = new AnonymousType();
//        this.index = index;
    }

    public LocalVariableSymbolTableItem(String name,Type varType){
        this.name = name;
        this.varType = varType;
    }

    @Override
    public String getKey() {
        return name;
    }

//    public int getIndex() {
//        return index;
//    }

    public Type getVarType() {
        return varType;
    }

    public void setVarType(Type varType) {
        this.varType = varType;
    }
}
