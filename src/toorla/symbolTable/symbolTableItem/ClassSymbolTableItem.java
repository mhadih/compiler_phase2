package toorla.symbolTable.symbolTableItem;

public class ClassSymbolTableItem extends SymbolTableItem {
//    private String father;

    public ClassSymbolTableItem(String name) {
        this.name = name;
    }

    public String getKey() {
        return name;
    }
}
