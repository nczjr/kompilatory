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

    void writeIfStatment(String statment) {
        writer.println("if (" + statment + ") {");
    }

    void writeVoidFunctionWith(String identifier, String[] arguments) {
        writer.print("  void " + identifier + "(");
        for (String argument: arguments) {
          writer.print("Variable " + argument + ", ");
        }
        writer.print(") {");
    }

    void writeReturnFunctionWith(String identifier, String[] arguments, String returnType) {
        writer.print("  " + returnType + " " + identifier + "(");
        for (int i= 0; i<arguments.length; i++) {
            if (i!= 0) writer.print(", ");
            writer.print("Object" + " " + arguments[i] );

        }
        writer.print(") {");
    }

     Variable variableDeclaration(String identifer, String initValue) {
        String type = Util.getTypeOfValue(initValue);
        writer.println(type + " " + identifer + " = " + initValue + ";");
        return new Variable(identifer, Type.valueOf(type.toUpperCase()));

    }

    void writeVariableAssigment(String identifer, String value) {
        writer.println(identifer + " = " + value + ";");
    }

    void writeln(String text) {
        writer.println(text);
    }

    void write(String text) {
        writer.print(text);
    }

    void writeMain() {
        writer.println("public class AppGnocchi {");
        writer.println("    public static void main(String[] args) {");
    }

    void closeWriter() {
        writer.print("}");
        writer.close();
    }

    public void writeFunctionCall(String function, List<String> arguments) {
        writer.print(function + "(");
        for(int i=0; i<arguments.size(); i++){
            if (i!=0) {
                writer.print(",");
            }
            writer.print(arguments.get(i));
        }
        writer.print(");");
    }
}
