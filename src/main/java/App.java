import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class App {
    public static void main(String[] args) {
        String s = "func main() {  var zmienna: Int = 3;  var b: Int = 9; zmienna = b / 4; }";
        GnocchiLexer gnocchiLexer = new GnocchiLexer(new ANTLRInputStream(s));
        CommonTokenStream tokens = new CommonTokenStream(gnocchiLexer);

        GnocchiParser parser = new GnocchiParser(tokens);
        ParseTree parseTree = parser.start();
        Visitor visitor = new Visitor();
        visitor.visit(parseTree);
        System.out.println(Handler.getVariables());
//        GnocchiParser.StartContext context = parser.start();
//
//        ParseTreeWalker walker = new ParseTreeWalker();
//        GnocchiBaseListener listener = new GnocchiBaseListener();
//        walker.walk(listener, context);
    }
}
