package toorla.symbolTable.symbolTableItem;

public class ScopeSymbolTableItem extends SymbolTableItem {
    public ScopeSymbolTableItem(String name) {
        this.name = name;
    }

    public String getKey() {
        return name;
    }
}
