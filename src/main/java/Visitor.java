import org.antlr.v4.runtime.RuleContext;

import java.util.List;
import java.util.stream.Collectors;

public class Visitor extends GnocchiBaseVisitor<Variable> {
    @Override
    public Variable visitStart(GnocchiParser.StartContext ctx) {
        return super.visitStart(ctx);
    }

    @Override
    public Variable visitIdentifier(GnocchiParser.IdentifierContext ctx) {
        return super.visitIdentifier(ctx);
    }

    @Override
    public Variable visitFunctionDeclaration(GnocchiParser.FunctionDeclarationContext ctx) {
        return super.visitFunctionDeclaration(ctx);
    }

    @Override
    public Variable visitFunctionMain(GnocchiParser.FunctionMainContext ctx) {
        return super.visitFunctionMain(ctx);
    }

    @Override
    public Variable visitFunctionIdentifier(GnocchiParser.FunctionIdentifierContext ctx) {
        return super.visitFunctionIdentifier(ctx);
    }

    @Override
    public Variable visitFunctionCall(GnocchiParser.FunctionCallContext ctx) {
        return super.visitFunctionCall(ctx);
    }

    @Override
    public Variable visitParameters(GnocchiParser.ParametersContext ctx) {
        return super.visitParameters(ctx);
    }

    @Override
    public Variable visitParameterList(GnocchiParser.ParameterListContext ctx) {
        return super.visitParameterList(ctx);
    }

    @Override
    public Variable visitBody(GnocchiParser.BodyContext ctx) {
        return super.visitBody(ctx);
    }

    @Override
    public Variable visitVariableOperations(GnocchiParser.VariableOperationsContext ctx) {
        return super.visitVariableOperations(ctx);
    }

    @Override
    public Variable visitVariableDeclaration(GnocchiParser.VariableDeclarationContext ctx) {
        String identifier = ctx.identifier().getText();
        String value = ctx.value().getText();
        String type = ctx.basicType().getText();
        Handler.put(identifier, value, type);
        return super.visitVariableDeclaration(ctx);
    }

    @Override
    public Variable visitVariableAssigment(GnocchiParser.VariableAssigmentContext ctx) {
        String identifier1 = ctx.identifier().getText();
        Variable variable =  this.visit(ctx.values());
        Handler.put(identifier1, variable.getValue().toString(), variable.getType().toString());
        return super.visitVariableAssigment(ctx);
    }

    @Override
    public Variable visitValues(GnocchiParser.ValuesContext ctx) {
           return this.visit(ctx.math_operation());
    }

    @Override
    public Variable visitArrayValue(GnocchiParser.ArrayValueContext ctx) {
        return super.visitArrayValue(ctx);
    }

    @Override
    public Variable visitSelectionStatement(GnocchiParser.SelectionStatementContext ctx) {
        return super.visitSelectionStatement(ctx);
    }

    @Override
    public Variable visitIterationStatement(GnocchiParser.IterationStatementContext ctx) {
        return super.visitIterationStatement(ctx);
    }

    @Override
    public Variable visitForCondition(GnocchiParser.ForConditionContext ctx) {
        return super.visitForCondition(ctx);
    }

    @Override
    public Variable visitUnaryExpression(GnocchiParser.UnaryExpressionContext ctx) {
        return super.visitUnaryExpression(ctx);
    }

    @Override
    public Variable visitType(GnocchiParser.TypeContext ctx) {
        return super.visitType(ctx);
    }

    @Override
    public Variable visitBasicType(GnocchiParser.BasicTypeContext ctx) {
        return super.visitBasicType(ctx);
    }

    @Override
    public Variable visitArrayType(GnocchiParser.ArrayTypeContext ctx) {
        return super.visitArrayType(ctx);
    }

    @Override
    public Variable visitValue(GnocchiParser.ValueContext ctx) {
        return super.visitValue(ctx);
    }

    @Override
    public Variable visitExpression(GnocchiParser.ExpressionContext ctx) {
        return super.visitExpression(ctx);
    }

    @Override
    public Variable visitOperation(GnocchiParser.OperationContext ctx) {
        return super.visitOperation(ctx);
    }

    @Override
    public Variable visitLogical_operation(GnocchiParser.Logical_operationContext ctx) {
        return super.visitLogical_operation(ctx);
    }

    @Override
    public Variable visitMath_operation(GnocchiParser.Math_operationContext ctx) {
        String mathOperator = ctx.math_operator().get(0).getText();
        List<String> identifiers = ctx.identifier().stream()
                .map(RuleContext::getText)
                .collect(Collectors.toList());
        List<String> values = ctx.value().stream()
                .map(RuleContext::getText)
                .collect(Collectors.toList());
        return Handler.performMathOperation(identifiers, values, mathOperator);
    }

    @Override
    public Variable visitMath_operator(GnocchiParser.Math_operatorContext ctx) {
        return super.visitMath_operator(ctx);
    }

    @Override
    public Variable visitLogical_operator(GnocchiParser.Logical_operatorContext ctx) {
        return super.visitLogical_operator(ctx);
    }
}
