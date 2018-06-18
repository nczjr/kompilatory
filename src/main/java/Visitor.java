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
        clearVariables();
        fileGenerator.writeMain();
        super.visitFunctionMain(ctx);
        fileGenerator.writeln("   }");
        return null;
    }

    @Override
    public Variable visitVoidFunctionDeclaration(GnocchiParser.VoidFunctionDeclarationContext ctx) {
        clearVariables();
        String identifier = ctx.identifier().getText();
        String[] arguments = {};
        fileGenerator.writeVoidFunctionWith(identifier, arguments);
        super.visitVoidFunctionDeclaration(ctx);
        fileGenerator.writeln("   }");
        return null;
    }

    @Override
    public Variable visitReturningFunctionDeclaration(GnocchiParser.ReturningFunctionDeclarationContext ctx) {
        clearVariables();
        String identifier = ctx.identifier().getText();
        List<String> arguments = ctx.parameterList() != null ? ctx.parameterList().identifier().stream()
                                                                                                            .map(parameter -> parameter.getText())
                                                                                                            .collect(Collectors.toList())
                : Collections.emptyList();
        String[] argArray = new String[arguments.size()];
        fileGenerator.writeReturnFunctionWith(identifier, arguments.toArray(argArray), getReturnType(ctx));
        super.visitReturningFunctionDeclaration(ctx);
        return null;
    }

    private String getReturnType(GnocchiParser.ReturningFunctionDeclarationContext ctx) {
        String returnIdentifier = ctx.functionBody().values().identifier() != null ?
                ctx.functionBody().values().identifier().getText() : null;
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

    private void clearVariables() {
        variables.clear();
    }
}