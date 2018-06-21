package util;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class FileGenerator {

    private PrintWriter writer;

    public FileGenerator(String destinationPath) {
        try {
            this.writer = new PrintWriter(destinationPath, "UTF-8");
        } catch (IOException e) {
            System.out.println("no cusz");
        }
    }

    public void writeIfStatment(String statment) {
        writer.println("if (" + statment + ") {");
    }

    public void writePrint(String text) {
        writer.println("System.out.println( " +  text + ");");
    }

    public void writeVoidFunctionWith(String identifier, String[] arguments) {
        writer.print(" static void " + identifier + "(");
        for (int i= 0; i<arguments.length; i++) {
            if (i!= 0) writer.print(", ");
            writer.print("Object" + " " + arguments[i] );
        }
        writer.println(") {");
    }

    public void writeReturnFunctionWith(String identifier, String[] arguments, String returnType) {
        writer.print(" static " + returnType + " " + identifier + "(");
        for (int i= 0; i<arguments.length; i++) {
            if (i!= 0) writer.print(", ");
            writer.print("Object" + " " + arguments[i] );

        }
        writer.println(") {");
    }

     public Variable variableDeclaration(String identifer, String initValue) {
        writer.println("Object " + identifer + " = " + initValue + ";");
        return new Variable(identifer, "Object");


    }

    public void writeVariableAssigment(String identifer, String value) {
        writer.println(identifer + " = " + value + ";");
    }

    public void writeln(String text) {
        writer.println(text);
    }

    public void write(String text) {
        writer.print(text);
    }

    public void writeMain() {
        writer.println("import static util.Math.*;");
        writer.println("public class AppGnocchi {");
        writer.println("    public static void main(String[] args) {");
    }

    public void closeWriter() {
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
        writer.println(");");
    }
}
