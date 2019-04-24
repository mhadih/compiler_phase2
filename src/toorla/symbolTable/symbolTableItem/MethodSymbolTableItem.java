package toorla.symbolTable.symbolTableItem;

import toorla.symbolTable.symbolTableItem.varItems.VarSymbolTableItem;
import toorla.types.Type;

import java.util.ArrayList;


public class MethodSymbolTableItem  extends SymbolTableItem {
    private String name;
    private Type methodType;
    private ArrayList <Type> parameters;
    private Integer counter;

    public MethodSymbolTableItem(String name,Type methodType,ArrayList <Type> parameters) {
        this.name=name;
        this.methodType=methodType;
        this.parameters=parameters;
    }

    public String getKey() {
        return name;
    }

    public Type getMethodType() {
        return methodType;
    }

    public ArrayList <Type> getParameters() {
        return parameters;
    }

    public void increaseCounter() {
        counter += 1;
    }

    public Integer getCounter() {
        return counter;
    }
}
