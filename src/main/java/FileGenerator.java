import org.apache.commons.lang3.math.NumberUtils;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import static org.apache.commons.lang3.StringUtils.isNumeric;

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
        writer.print("  Variable " + identifier + "(");
        for (String argument: arguments) {
          writer.print("Variable " + argument + ", ");
        }
        writer.print(") {");
    }

    void writeVariableDeclaration(String identifer, String initValue) {
        writer.print(NumberUtils.isNumber(initValue) ? (isInteger(initValue) ? "int " : "double ") : "String " );
        writer.println(identifer + " = " + initValue + ";");
    }

    void writeVariableAssigment(String identifer, String value) {
        writer.println(identifer + " = " + value + ";");
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

    public static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
        } catch(NumberFormatException e) {
            return false;
        }
        return true;
    }
}
