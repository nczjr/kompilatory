import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class App {
    public static void main(String[] args) {
        String s = "func nazwa() {} func main() {  zmienna = 3;  b = 9; zmienna = b / 4; }";
        GnocchiLexer gnocchiLexer = new GnocchiLexer(new ANTLRInputStream(s));
        CommonTokenStream tokens = new CommonTokenStream(gnocchiLexer);

        FileGenerator generator = new FileGenerator("/Users/marcinwloczko/IdeaProjects/kompilatory/src/main/java/AppGnocchi.java");
        GnocchiParser parser = new GnocchiParser(tokens);
        ParseTree parseTree = parser.start();
        Visitor visitor = new Visitor(generator);
        visitor.visit(parseTree);
        System.out.println(Handler.getVariables());
        GnocchiParser.StartContext context = parser.start();

        generator.closeWriter();
    }
}
