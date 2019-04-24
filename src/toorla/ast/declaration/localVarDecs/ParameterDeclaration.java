package toorla.ast.declaration.localVarDecs;

import toorla.ast.declaration.TypedVariableDeclaration;
import toorla.ast.expression.Identifier;
import toorla.types.Type;
import toorla.visitor.Visitor;

public class ParameterDeclaration extends TypedVariableDeclaration {
    private Integer index;
    public ParameterDeclaration(Identifier name, Type type) {
        this.identifier = name;
        this.type = type;
    }

    @Override
    public <R> R accept(Visitor<R> visitor) {
        return visitor.visit(this);
    }

    @Override
    public String toString() {
        return "Parameter";
    }

    public void  setIndex(Integer index) {
        this.index = index;
    }
}