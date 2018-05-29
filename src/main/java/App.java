import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class App {
    public static void main(String[] args) {
        String s = " func chuj(var cipka: Int) => Int" ;
        GnocchiLexer gnocchiLexer = new GnocchiLexer(new ANTLRInputStream(s));
        CommonTokenStream tokens = new CommonTokenStream(gnocchiLexer);

        // Pass the tokens to the parser
        GnocchiParser parser = new GnocchiParser(tokens);

        // Specify our entry point
        ParseTree tree = parser.start();
        System.out.println();
        System.out.println(tree.toStringTree(parser)); // print LISP-style tree

    }
}
