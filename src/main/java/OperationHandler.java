import java.util.ArrayList;
import java.util.List;

public class OperationHandler {

    private List<String> newOperatosList = new ArrayList<>();
    private List<String> newArgumentsList = new ArrayList<>();

    String parseMathOperation(GnocchiParser.Math_operationContext ctx) {
        int numberOfOpenBrackets = 0;
        String currentOpertionChain = new String();
        for (int i = ctx.math_operator().size() - 1  ; i >= 0; i--) {
            switch (ctx.math_operator(i).getText()) {
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
                    newOperatosList.add(ctx.math_operator(i).getText());
                    newArgumentsList.add(argument);
                    currentOpertionChain = "";
                }
            }
        }
        currentOpertionChain += getBrackets(numberOfOpenBrackets);
        String argument = currentOpertionChain.isEmpty() ? ctx.op(0).getText() : currentOpertionChain;
        newArgumentsList.add(argument);

        System.out.println(newArgumentsList);
        System.out.println(newOperatosList);
        System.out.println(currentOpertionChain);

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
        System.out.println(operationChain);
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
