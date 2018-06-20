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
    public Variable visitIfStatement(GnocchiParser.IfStatementContext ctx) {
        fileGenerator.write("if (");
        super.visitIfStatement(ctx);
        fileGenerator.write(") {");
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
    public Variable visitLogicalOperation(GnocchiParser.LogicalOperationContext ctx) {
        OperationHandler handler = new OperationHandler();
        fileGenerator.write(handler.parseLogicalOperation(ctx));
        return super.visitLogicalOperation(ctx);
    }

    @Override
    public Variable visitMathOperation(GnocchiParser.MathOperationContext ctx) {
        OperationHandler handler = new OperationHandler();
        fileGenerator.writeln("System.out.println(" + handler.parseMathOperation(ctx) + ");");
        return super.visitMathOperation(ctx);
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
    public Variable visitIterationStatement(GnocchiParser.IterationStatementContext ctx) {
        return super.visitIterationStatement(ctx);
    }



    private List<String> getReturnTypeAndValue(GnocchiParser.ReturningFunctionDeclarationContext ctx) {
        List<String> result = new ArrayList<>();
        String returnIdentifier = ctx.functionBody().values().identifier() != null ?
                ctx.functionBody().values().identifier().getText() : null;
        //MARK:- jakby tpy nie działały to tu zmieniałem
        String mathOperationValue = ctx.functionBody().values().mathOperation() != null ?
                ctx.functionBody().values().mathOperation().getText() : null;
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
        visitVariableDeclaration(ctx.variableDeclaration());
        visitLogicalOperation(ctx.logicalOperation());
        fileGenerator.write(";");
        visitUnaryExpression(ctx.unaryExpression());
        fileGenerator.write(") { ");
        visitBody(ctx.body());
        fileGenerator.writeln("}");

        return null;
    }

    @Override
    public Variable visitWhileCondition(GnocchiParser.WhileConditionContext ctx) {
        fileGenerator.write("while (");
        visitLogicalOperation(ctx.logicalOperation());
        fileGenerator.write(") {");
        visitBody(ctx.body());
        fileGenerator.writeln("}");
        return null;
    }

    @Override
    public Variable visitDoCondition(GnocchiParser.DoConditionContext ctx) {
        fileGenerator.write("do { ");
        visitBody(ctx.body());
        fileGenerator.write(" } while ( ");
        visitLogicalOperation(ctx.logicalOperation());
        fileGenerator.write(");");
        return null;
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