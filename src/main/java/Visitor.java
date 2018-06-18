import org.apache.commons.lang3.math.NumberUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Visitor extends GnocchiBaseVisitor<Variable> {

    private FileGenerator fileGenerator;
    private List<Variable> variables = new ArrayList<>();

    Visitor(FileGenerator fileGenerator) {
        this.fileGenerator = fileGenerator;
    }

    @Override
    public Variable visitFunctionMain(GnocchiParser.FunctionMainContext ctx) {
        fileGenerator.writeMain();
        super.visitFunctionMain(ctx);
        fileGenerator.write("   }");
        return null;
    }

    @Override
    public Variable visitVoidFunctionDeclaration(GnocchiParser.VoidFunctionDeclarationContext ctx) {
        String identifier = ctx.identifier().getText();
        String[] arguments = {};
        fileGenerator.writeVoidFunctionWith(identifier, arguments);
        super.visitVoidFunctionDeclaration(ctx);
        fileGenerator.write("   }");
        return null;
    }

    @Override
    public Variable visitReturningFunctionDeclaration(GnocchiParser.ReturningFunctionDeclarationContext ctx) {
        fileGenerator.write(getReturnType(ctx));
        String identifier = ctx.identifier().getText();
        List<String> arguments = ctx.parameterList() != null ? ctx.parameterList().identifier().stream()
                                                                                                            .map(parameter -> parameter.getText())
                                                                                                            .collect(Collectors.toList())
                : Collections.emptyList();
        super.visitReturningFunctionDeclaration(ctx);
        fileGenerator.write(" " + identifier + " (" + arguments + " )");
        fileGenerator.write("   }");
        return null;
    }

    private String getReturnType(GnocchiParser.ReturningFunctionDeclarationContext ctx) {
        String returnIdentifier = ctx.functionBody().values().identifier().getText();
        String mathOperationValue = ctx.functionBody().values().math_operation() != null ?
                ctx.functionBody().values().math_operation().value(0).getText() : null;
        String value = ctx.functionBody().values().value() != null ? ctx.functionBody().values().value().getText() : null;
        return returnIdentifier != null ? variables.stream()
                                                    .filter(variable -> variable.getIdentifier().equals(returnIdentifier))
                                                    .findAny().get().getType().name().toLowerCase() :
                (value != null ? Util.getTypeOfValue(value) : Util.getTypeOfValue(mathOperationValue));
    }

    @Override
    public Variable visitVariableDeclaration(GnocchiParser.VariableDeclarationContext ctx) {
        String identifier = ctx.identifier().getText();
        String value = ctx.value().getText();
        if (variables.contains(identifier)) {
            fileGenerator.writeVariableAssigment(identifier, value);
        } else {
            variables.add(fileGenerator.variableDeclaration(identifier, value));
        }
        return super.visitVariableDeclaration(ctx);
    }
}