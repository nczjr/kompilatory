import org.antlr.v4.runtime.RuleContext;

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
    public Variable visitMath_operation(GnocchiParser.Math_operationContext ctx) {
        OperationHandler handler = new OperationHandler();
        fileGenerator.write("System.out.println(" + handler.parseMathOperation(ctx) + ");");
        return super.visitMath_operation(ctx);
    }

    @Override
    public Variable visitReturningFunctionDeclaration(GnocchiParser.ReturningFunctionDeclarationContext ctx) {
        clearVariables();
        String identifier = ctx.identifier().getText();
        List<String> arguments = ctx.parameterList() != null ?
                ctx.parameterList().identifier().stream()
                                                .map(parameter -> parameter.getText())
                                                .collect(Collectors.toList()) : Collections.emptyList();
        String[] argArray = new String[arguments.size()];
        fileGenerator.writeReturnFunctionWith(identifier, arguments.toArray(argArray), getReturnTypeAndValue(ctx).get(0));
        super.visitReturningFunctionDeclaration(ctx);
        fileGenerator.writeln(" return " + getReturnTypeAndValue(ctx).get(1) + ";");
        fileGenerator.writeln("   }");
        return null;
    }

    @Override
    public Variable visitMath_operation(GnocchiParser.Math_operationContext ctx) {
        String[] numbers = ctx.getText().split("[+-]");
        return super.visitMath_operation(ctx);
    }

    @Override
    public Variable visitMath_operator(GnocchiParser.Math_operatorContext ctx) {
        fileGenerator.write(ctx.getText());
        return super.visitMath_operator(ctx);
    }

    private List<String> getReturnTypeAndValue(GnocchiParser.ReturningFunctionDeclarationContext ctx) {
        List<String> result = new ArrayList<>();
        String returnIdentifier = ctx.functionBody().values().identifier() != null ?
                ctx.functionBody().values().identifier().getText() : null;
        String mathOperationValue = ctx.functionBody().values().math_operation() != null ?
                ctx.functionBody().values().math_operation().getText() : null;
        String value = ctx.functionBody().values().value() != null ? ctx.functionBody().values().value().getText() : null;
        String type = returnIdentifier != null ? variables.stream()
                                                    .filter(variable -> variable.getIdentifier().equals(returnIdentifier))
                                                    .findAny().get().getType().name().toLowerCase() :
                (value != null ? Util.getTypeOfValue(value) : Util.getTypeOfValue(mathOperationValue));
        result.add(type);
        String valueToReturn = returnIdentifier != null ? returnIdentifier :
                (value != null ? value : mathOperationValue);
        result.add(valueToReturn);
        return result;
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


    @Override
    public Variable visitFunctionCall(GnocchiParser.FunctionCallContext ctx) {
        String function = ctx.identifier().getText();
        List<String> arguments = ctx.value().stream().map(RuleContext::getText).collect(Collectors.toList());
        fileGenerator.writeFunctionCall(function, arguments);
        return super.visitFunctionCall(ctx);
    }

    @Override
    public Variable visitForCondition(GnocchiParser.ForConditionContext ctx) {
        fileGenerator.writeln("");
        fileGenerator.write("for(");
        super.visitForCondition(ctx);
        fileGenerator.write(")");
        return null;
    }

    @Override
    public Variable visitLogical_operation(GnocchiParser.Logical_operationContext ctx) {
        fileGenerator.write(ctx.getText());
        fileGenerator.write(";");
        return super.visitLogical_operation(ctx);
    }

    @Override
    public Variable visitUnaryExpression(GnocchiParser.UnaryExpressionContext ctx) {
        fileGenerator.write(ctx.getText());
        return super.visitUnaryExpression(ctx);
    }

    private void clearVariables() {
        variables.clear();
    }
}