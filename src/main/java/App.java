import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class App {
    public static void main(String[] args) {
        String s = " func slonecznaFunkcja(promyk1 : Int) => String {}" +
                "func main() {}";
        GnocchiLexer gnocchiLexer = new GnocchiLexer(new ANTLRInputStream(s));
        CommonTokenStream tokens = new CommonTokenStream(gnocchiLexer);

        GnocchiParser parser = new GnocchiParser(tokens);
        parser.addParseListener(new GnocchiBaseListener());

        ParseTree tree = parser.start();
        System.out.println();
        System.out.println(tree.toStringTree(parser));

    }
}
