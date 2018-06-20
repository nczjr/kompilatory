import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.*;

public class App {

    private static final String path = "C:\\Users\\User.DESKTOP-57LLUVE\\IdeaProjects\\kompilatory\\src\\main\\java\\";
//    private static final String path = "/Users/marcinwloczko/IdeaProjects/kompilatory/src/main/java/";

    public static void main(String[] args) throws IOException {
        GnocchiLexer gnocchiLexer = new GnocchiLexer(new ANTLRInputStream( readFileAsString(path + "File.gnocchi")));
        CommonTokenStream tokens = new CommonTokenStream(gnocchiLexer);
        FileGenerator generator = new FileGenerator(path + "AppGnocchi.java" );
        FileGenerator functionGenerator = new FileGenerator(path + "FunctionGnocchi.java" );
        GnocchiParser parser = new GnocchiParser(tokens);
        ParseTree parseTree = parser.start();
        Visitor visitor = new Visitor(generator,functionGenerator);
        visitor.visit(parseTree);
        GnocchiParser.StartContext context = parser.start();

        functionGenerator.closeWriter();
    }

    public static String readFileAsString(String filePath) throws IOException {
        FileInputStream fis = new FileInputStream(filePath);
        InputStreamReader isr = new InputStreamReader(fis, "UTF8");
        StringBuffer stringBuffer = new StringBuffer();
        Reader in = new BufferedReader(isr);
        int ch;
        while ((ch = in.read()) > -1) {
            stringBuffer.append((char)ch);
        }
        in.close();
        return stringBuffer.toString();
    }
}
