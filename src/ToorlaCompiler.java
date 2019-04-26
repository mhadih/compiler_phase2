import javafx.util.Pair;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import toorla.ast.Program;
import toorla.visitor.InheritCheck;
import toorla.visitor.NameAnalayzer;
import toorla.visitor.TreePrinter;
import toorla.visitor.Visitor;

import java.util.ArrayList;
import java.util.Comparator;

public class ToorlaCompiler {
    public ArrayList<Pair<Integer , String >> error = new ArrayList<>();

    public void compile(CharStream textStream) {
        ToorlaLexer toorlaLexer = new ToorlaLexer( textStream );
        CommonTokenStream tokenStream = new CommonTokenStream( toorlaLexer );
        ToorlaParser toorlaParser = new ToorlaParser( tokenStream );
        Program toorlaASTCode = toorlaParser.program().mProgram;
        NameAnalayzer nameAnalayzer = new NameAnalayzer(error);
        toorlaASTCode.accept( nameAnalayzer);
        InheritCheck inheritCheck = new InheritCheck(nameAnalayzer.symbolTable, error);
        inheritCheck.check(toorlaASTCode);
        error.sort(Comparator.comparing(Pair::getKey));
        for (Pair<Integer, String> itٍError: error)
            System.out.println(itٍError.getValue());
        if (nameAnalayzer.hasError || inheritCheck.hasError)
            return;
        Visitor<Void> treePrinter = new TreePrinter();
        toorlaASTCode.accept(treePrinter);
    }
}
