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
}