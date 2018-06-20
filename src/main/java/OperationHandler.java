import java.util.ArrayList;
import java.util.List;

public class OperationHandler {

    private List<String> newOperatosList = new ArrayList<>();
    private List<String> newArgumentsList = new ArrayList<>();

    String parseLogicalOperation(GnocchiParser.LogicalOperationContext ctx) {
        String chain = "";
        switch (ctx.logicalOperator().getText()) {
            case ("=="): {
                chain = "Util.equal(" + ctx.op(0).getText() + ", " + ctx.op(1).getText() + ")";
                break;
            }
            case ("!="): {
                chain = "Util.notEqual(" + ctx.op(0).getText() + ", " + ctx.op(1).getText() + ")";
                break;
            }
            case (">"): {
                chain = "Util.greater(" + ctx.op(0).getText() + ", " + ctx.op(1).getText() + ")";
                break;
            }
            case ("<"): {
                chain = "Util.lower(" + ctx.op(0).getText() + ", " + ctx.op(1).getText() + ")";
                break;
            }
            case (">="): {
                chain = "Util.greaterEqual(" + ctx.op(0).getText() + ", " + ctx.op(1).getText() + ")";
                break;
            }
            case ("<="): {
                chain = "Util.lowerEqual(" + ctx.op(0).getText() + ", " + ctx.op(1).getText() + ")";
                break;
            }
        }
        return chain;
    }

    String parseMathOperation(GnocchiParser.MathOperationContext ctx) {
        int numberOfOpenBrackets = 0;
        String currentOpertionChain = new String();
        for (int i = ctx.mathOperator().size() - 1  ; i >= 0; i--) {
            switch (ctx.mathOperator(i).getText()) {
                case ("*"): {
                    currentOpertionChain += "Util.multiply(" + ctx.op(i+1).getText() + ", ";
                    currentOpertionChain += i == 0 ? ctx.op(i).getText() : "";
                    numberOfOpenBrackets++;
                    break;
                }
                case ("/"): {
                    currentOpertionChain += "Util.divide(" + ctx.op(i+1).getText() + ", ";
                    currentOpertionChain += i == 0 ? ctx.op(i).getText() : "";
                    numberOfOpenBrackets++;
                    break;
                }
                default: {
                    currentOpertionChain += ctx.op(i+1).getText() ;
                    currentOpertionChain += getBrackets(numberOfOpenBrackets);
                    numberOfOpenBrackets = 0;

                    String argument = currentOpertionChain.isEmpty() ? ctx.op(i+1).getText() : currentOpertionChain;
                    newOperatosList.add(ctx.mathOperator(i).getText());
                    newArgumentsList.add(argument);
                    currentOpertionChain = "";
                }
            }
        }
        currentOpertionChain += getBrackets(numberOfOpenBrackets);
        String argument = currentOpertionChain.isEmpty() ? ctx.op(0).getText() : currentOpertionChain;
        newArgumentsList.add(argument);

        return newOperatosList.isEmpty() ? currentOpertionChain : parseAddMinus();
    }

    private String parseAddMinus() {
        String operationChain = "";
        for (int i = 0; i <= newOperatosList.size() - 1; i++) {
            switch (newOperatosList.get(i)) {
                case ("+"): {
                    operationChain += "Util.add(" + newArgumentsList.get(i) + ", ";
                    operationChain += i == newOperatosList.size() - 1 ? newArgumentsList.get(i+1) : "";
                    break;
                }
                case ("-"): {
                    operationChain += "Util.subtract(" + newArgumentsList.get(i) + ", ";
                    operationChain += i == newOperatosList.size() - 1 ? newArgumentsList.get(i+1) : "";
                    break;
                }
            }
        }
        operationChain += getBrackets(newOperatosList.size());
        return operationChain;
    }

    private String getBrackets(int i) {
        String chain = "";
        for (int j = 0; j < i; j++) {
            chain += ")" ;
        }
        return chain;
    }
}
