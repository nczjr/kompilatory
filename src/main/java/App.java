import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class App {
    public static void main(String[] args) {
        String s = "func main() {  zmienna = 3.0;  s = \"bbbb\" ; b = 2; zmienna = b / 4; zmienna = 3  + 5 - 7 * 2;} func nazwa() { zmienna = 3  + 5 - 7 * 2; }";
        GnocchiLexer gnocchiLexer = new GnocchiLexer(new ANTLRInputStream(s));
        CommonTokenStream tokens = new CommonTokenStream(gnocchiLexer);
        String natka = "C:\\Users\\User.DESKTOP-57LLUVE\\IdeaProjects\\kompilatory\\src\\main\\java\\AppGnocchi.java";
        String macion = "/Users/marcinwloczko/IdeaProjects/kompilatory/src/main/java/AppGnocchi.java";
        FileGenerator generator = new FileGenerator(macion);
        GnocchiParser parser = new GnocchiParser(tokens);
        ParseTree parseTree = parser.start();
        Visitor visitor = new Visitor(generator);
        visitor.visit(parseTree);
        GnocchiParser.StartContext context = parser.start();

        generator.closeWriter();


        Object a = 3;
        Object b = 6;
        System.out.println(Util.divide(a,b));

    }
}
