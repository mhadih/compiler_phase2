import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import toorla.ast.Program;
import toorla.visitor.NameAnalayzer;
import toorla.visitor.TreePrinter;
import toorla.visitor.Visitor;

public class ToorlaCompiler {
    public void compile(CharStream textStream) {
        ToorlaLexer toorlaLexer = new ToorlaLexer( textStream );
        CommonTokenStream tokenStream = new CommonTokenStream( toorlaLexer );
        ToorlaParser toorlaParser = new ToorlaParser( tokenStream );
        Program toorlaASTCode = toorlaParser.program().mProgram;
        NameAnalayzer nameAnalayzer= new NameAnalayzer();
        toorlaASTCode.accept( nameAnalayzer);
        if(nameAnalayzer.hasError)
            return;
        Visitor<Void> treePrinter = new TreePrinter();
        toorlaASTCode.accept(treePrinter);
    }
}
