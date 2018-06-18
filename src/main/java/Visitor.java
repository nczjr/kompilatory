import org.antlr.v4.runtime.RuleContext;

import java.util.List;
import java.util.stream.Collectors;

public class Visitor extends GnocchiBaseVisitor<Variable> {

    private FileGenerator fileGenerator;

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
        System.out.println("tutaj");
        String identifier = ctx.functionIdentifier().identifier().getText();
        String[] arguments = {};
        fileGenerator.writeFunctionWith(identifier, arguments);
        return super.visitVoidFunctionDeclaration(ctx);
    }

    @Override
    public Variable visitFunctionIdentifier(GnocchiParser.FunctionIdentifierContext ctx) {
        return super.visitFunctionIdentifier(ctx);
    }
}