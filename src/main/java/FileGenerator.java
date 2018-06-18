import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class FileGenerator {

    private PrintWriter writer;

    FileGenerator(String destinationPath) {
        try {
            this.writer = new PrintWriter(destinationPath, "UTF-8");
        } catch (IOException e) {
            System.out.println("no cusz");
        }
    }

    void writeFunctionWith(String identifier, String[] arguments) {
        writer.print("Variable " + identifier + " (");
        for (String argument: arguments) {
          writer.print("Variable " + argument + ", ");
        }
        writer.print(")");
    }

    void write(String text) {
        writer.println(text);
    }

    void writeMain() {
        writer.println("public class AppGnocchi {");
        writer.println("    public static void main(String[] args) {");
    }

    void closeWriter() {
        writer.print("}");
        writer.close();
    }
}
