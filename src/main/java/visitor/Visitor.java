package visitor;

import org.antlr.v4.runtime.RuleContext;
import parser.GnocchiParser;
import util.FileGenerator;
import util.OperationHandler;
import util.Variable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Visitor extends GnocchiBaseVisitor<Variable> {

    private FileGenerator fileGenerator;
    private List<Variable> variables = new ArrayList<>();

    public Visitor(FileGenerator fileGenerator) {
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
        List<String> arguments = ctx.parameterList() != null ?
                ctx.parameterList().identifier().stream()
                        .map(RuleContext::getText)
                        .collect(Collectors.toList()) : Collections.emptyList();
        String[] argArray = new String[arguments.size()];
        fileGenerator.writeVoidFunctionWith(identifier, arguments.toArray(argArray));
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
    public Variable visitIfStatement(GnocchiParser.IfStatementContext ctx) {
        fileGenerator.write("if (");
        visitLogicalOperation(ctx.logicalOperation());
        fileGenerator.write(") {");
        visitBody(ctx.body());
        fileGenerator.write("}");
        visitElsePattern(ctx.elsePattern());
        return null;
    }

    @Override
    public Variable visitElsePattern(GnocchiParser.ElsePatternContext ctx) {
        fileGenerator.write("else {");
        super.visitElsePattern(ctx);
        fileGenerator.write("}");
        return null;
    }

    @Override
    public Variable visitVariableFunctionAssigment(GnocchiParser.VariableFunctionAssigmentContext ctx) {
        String identifier = ctx.identifier().getText();
        fileGenerator.write("Object " + identifier + " = ");
        return super.visitVariableFunctionAssigment(ctx);
    }

    @Override
    public Variable visitMathOperation(GnocchiParser.MathOperationContext ctx) {
        OperationHandler handler = new OperationHandler();
        fileGenerator.writeln(handler.parseMathOperation(ctx) + ";");
        return super.visitMathOperation(ctx);
    }

    @Override
    public Variable visitReturningFunctionDeclaration(GnocchiParser.ReturningFunctionDeclarationContext ctx) {
        clearVariables();
        String identifier = ctx.identifier().getText();
        List<String> arguments = ctx.parameterList() != null ?
                ctx.parameterList().identifier().stream()
                                                .map(RuleContext::getText)
                                                .collect(Collectors.toList()) : Collections.emptyList();
        String[] argArray = new String[arguments.size()];
        fileGenerator.writeReturnFunctionWith(identifier, arguments.toArray(argArray),"Object");
        visitFunctionBody(ctx.functionBody());
        fileGenerator.writeln("   }");
        return null;
    }


    @Override
    public Variable visitFunctionBody(GnocchiParser.FunctionBodyContext ctx) {
        ctx.expression().forEach(ex -> visitExpression(ex));
        if (ctx.values().mathOperation() != null) {
            fileGenerator.writeln("");
            fileGenerator.write("return ");
            visitValues(ctx.values());
        } else if (ctx.values().identifier() != null ) {
            fileGenerator.write("return " + ctx.values().identifier().getText() + ";");
        } else fileGenerator.write("return " + ctx.values().value().getText() + ";");

        return null;
    }

    @Override
    public Variable visitIterationStatement(GnocchiParser.IterationStatementContext ctx) {
        return super.visitIterationStatement(ctx);
    }

    @Override
    public Variable visitVariableDeclaration(GnocchiParser.VariableDeclarationContext ctx) {
        String identifier = ctx.identifier().getText();
        if (ctx.values() != null) {
            if (variables.stream()
                .anyMatch(variable -> variable.getIdentifier().equals(identifier))) {
                if (ctx.values().mathOperation() == null) {
                    fileGenerator.writeln(identifier + " = " + ctx.values().getText() + ";");
                } else {
                    fileGenerator.write(  identifier + " = ");
                    visitValues(ctx.values());
                }
            } else {
                if (ctx.values().mathOperation() == null) {
                    variables.add(fileGenerator.variableDeclaration(identifier, ctx.values().getText()));
                } else {
                    fileGenerator.write("Object " + identifier + " = ");
                    variables.add(new Variable(identifier, "Object"));
                    visitValues(ctx.values());
                }
            }
        } else           fileGenerator.write("Object " + identifier);
        return null;
    }


    @Override
    public Variable visitFunctionCall(GnocchiParser.FunctionCallContext ctx) {
        String function = ctx.identifier().getText();
        //MARK sprawdzi
        List<String> arguments = new ArrayList<>();
        for (int i = 0; i < ctx.values().size(); i++) {
            if ((ctx.values(i).value() != null) || (ctx.values(i).identifier() != null)) {
                arguments.add(ctx.values(i).getText());
            }
        }
        fileGenerator.writeFunctionCall(function, arguments);
        return super.visitFunctionCall(ctx);
    }

    @Override
    public Variable visitForCondition(GnocchiParser.ForConditionContext ctx) {
        fileGenerator.writeln("");
        fileGenerator.write("for(" + "int " + ctx.variableDeclaration().identifier().getText() + " = "
                + ctx.variableDeclaration().values().value().getText() + ";");
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
        fileGenerator.writeln("");
        fileGenerator.write("while (");
        visitLogicalOperation(ctx.logicalOperation());
        fileGenerator.write(") {");
        fileGenerator.writeln("");
        visitBody(ctx.body());
        fileGenerator.writeln("}");
        return null;
    }

    @Override
    public Variable visitDoCondition(GnocchiParser.DoConditionContext ctx) {
        fileGenerator.writeln("do { ");
        visitBody(ctx.body());
        fileGenerator.writeln("");
        fileGenerator.write(" } while ( ");
        visitLogicalOperation(ctx.logicalOperation());
        fileGenerator.write(");");
        fileGenerator.writeln("");
        return null;
    }

    @Override
    public Variable visitUnaryExpression(GnocchiParser.UnaryExpressionContext ctx) {
        fileGenerator.write(ctx.getText());
        return super.visitUnaryExpression(ctx);
    }

    @Override
    public Variable visitPrintExpression(GnocchiParser.PrintExpressionContext ctx) {
        fileGenerator.writePrint(ctx.getText());
        return null;
    }

    private void clearVariables() {
        variables.clear();
    }
}