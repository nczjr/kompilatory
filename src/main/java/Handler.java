import java.util.*;
import java.util.stream.Collectors;

public class Handler {

    private static List<Variable> variables = new ArrayList<>();

    private static Map<String, List<Variable>> arraysMap = new HashMap<>();


    public static void put(String identifier, String value, String type) {
        Optional<Variable> variable = variables.stream().filter(v -> v.getIdentifier().equals(identifier)).findAny();
        if (variable.isPresent())
            variable.get().setValue(value);
        else
            variables.add(new Variable(identifier, value, Type.valueOf(type.toUpperCase())));

    }

    public static Variable get(String identifier) {
        return variables.stream()
                .filter(variable -> variable.identifier.equals(identifier))
                .findAny()
                .get();
    }


    public static Variable performMathOperation(List<String> identifiers, List<String> values, String mathOperator) {
        Object result = null;
        Type type = null;
        if (!identifiers.isEmpty()) {
            List<Variable> operationVariables = new ArrayList<>();
            for (String identifier : identifiers) {
                operationVariables.add(variables.stream()
                                                .filter(variable -> variable.getIdentifier().equals(identifier))
                                                .findAny()
                                                .get());
            }
            type = operationVariables.get(0).getType();
            Object operationVariableValue = null;
            Object value = null;
            switch (operationVariables.get(0).getType()) {
                case INT: operationVariableValue = operationVariables.stream()
                                                        .mapToInt(variable -> Integer.parseInt((String) variable.getValue()))
                                                        .sum();
                           value = values.stream()
                                            .mapToInt(Integer::parseInt).sum();
                           result = mathOperator.equals("+") ? (Integer) value +  (Integer) operationVariableValue :
                                    mathOperator.equals("-") ? (Integer) value -  (Integer) operationVariableValue :
                                    mathOperator.equals("*") ? (Integer) value *  (Integer) operationVariableValue :
                                                   (Integer) value / (Integer) operationVariableValue;
                    break;
                case DOUBLE: operationVariableValue = operationVariables.stream()
                                                        .mapToDouble(variable -> Double.parseDouble((String) variable.getValue()))
                                                        .sum();
                            value = values.stream().mapToDouble(Double::parseDouble).sum();
                            result = mathOperator.equals("+") ? (Double) value +  (Double) operationVariableValue :
                            mathOperator.equals("-") ? (Double) value -  (Double) operationVariableValue :
                            mathOperator.equals("*") ? (Double) value *  (Double) operationVariableValue :
                                            (Double) value / (Double) operationVariableValue;
                break;
            }
            System.out.println("result" + result);

        }
        return new Variable("result",result, type);
    }



    public static List<Variable> getVariables() {
        return variables;
    }

    public static Map<String, List<Variable>> getArraysMap() {
        return arraysMap;
    }
}
