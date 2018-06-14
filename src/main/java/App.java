import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class App {
    public static void main(String[] args) {
        String s = "func main() {  var zmienna: Int = 3; zmienna = zmienna + 3; }";
        GnocchiLexer gnocchiLexer = new GnocchiLexer(new ANTLRInputStream(s));
        CommonTokenStream tokens = new CommonTokenStream(gnocchiLexer);

        GnocchiParser parser = new GnocchiParser(tokens);
        GnocchiParser.StartContext context = parser.start();

        ParseTreeWalker walker = new ParseTreeWalker();
        GnocchiBaseListener listener = new GnocchiBaseListener();

        walker.walk(listener, context);
    }
}
