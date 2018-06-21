package util;

import parser.GnocchiParser;

import java.util.ArrayList;
import java.util.List;

public class OperationHandler {

    private List<String> newOperatosList = new ArrayList<>();
    private List<String> newArgumentsList = new ArrayList<>();

    public String parseLogicalOperation(GnocchiParser.LogicalOperationContext ctx) {
        String chain = "";
        switch (ctx.logicalOperator().getText()) {
            case ("=="): {
                chain = "equal(" + ctx.op(0).getText() + ", " + ctx.op(1).getText() + ")";
                break;
            }
            case ("!="): {
                chain = "notEqual(" + ctx.op(0).getText() + ", " + ctx.op(1).getText() + ")";
                break;
            }
            case (">"): {
                chain = "greater(" + ctx.op(0).getText() + ", " + ctx.op(1).getText() + ")";
                break;
            }
            case ("<"): {
                chain = "lower(" + ctx.op(0).getText() + ", " + ctx.op(1).getText() + ")";
                break;
            }
            case (">="): {
                chain = "greaterEqual(" + ctx.op(0).getText() + ", " + ctx.op(1).getText() + ")";
                break;
            }
            case ("<="): {
                chain = "lowerEqual(" + ctx.op(0).getText() + ", " + ctx.op(1).getText() + ")";
                break;
            }
        }
        return chain;
    }

    public String parseMathOperation(GnocchiParser.MathOperationContext ctx) {
        int numberOfOpenBrackets = 0;
        String currentOpertionChain = new String();
        for (int i = ctx.mathOperator().size() - 1  ; i >= 0; i--) {
            switch (ctx.mathOperator(i).getText()) {
                case ("*"): {
                    currentOpertionChain += "multiply(" + ctx.op(i+1).getText() + ", ";
                    currentOpertionChain += i == 0 ? ctx.op(i).getText() : "";
                    numberOfOpenBrackets++;
                    break;
                }
                case ("/"): {
                    currentOpertionChain += "divide(" + ctx.op(i+1).getText() + ", ";
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
                    operationChain += "add(" + newArgumentsList.get(i) + ", ";
                    operationChain += i == newOperatosList.size() - 1 ? newArgumentsList.get(i+1) : "";
                    break;
                }
                case ("-"): {
                    operationChain += "subtract(" + newArgumentsList.get(i) + ", ";
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
