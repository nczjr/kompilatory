import org.antlr.v4.runtime.RuleContext;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Visitor extends GnocchiBaseVisitor<Variable> {

    private FileGenerator fileGenerator;
    private List<String> variables = new ArrayList<>();

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
        String identifier = ctx.functionIdentifier().identifier().getText();
        String[] arguments = {};
        fileGenerator.writeFunctionWith(identifier, arguments);
        super.visitVoidFunctionDeclaration(ctx);
        fileGenerator.write("   }");
        return null;
    }

    @Override
    public Variable visitVariableDeclaration(GnocchiParser.VariableDeclarationContext ctx) {
        String identifier = ctx.identifier().getText();
        String value = ctx.value().getText();
        if (variables.contains(identifier)) {
            fileGenerator.writeVariableAssigment(identifier, value);
        } else {
            variables.add(identifier);
            fileGenerator.writeVariableDeclaration(identifier, value);
        }
        return super.visitVariableDeclaration(ctx);
    }

    @Override
    public Variable visitFunctionIdentifier(GnocchiParser.FunctionIdentifierContext ctx) {
        return super.visitFunctionIdentifier(ctx);
    }
}