import org.apache.commons.lang3.math.NumberUtils;

public class Util {

    public static String getTypeOfValue(String value ) {
        return NumberUtils.isNumber(value) ? (isInteger(value) ? "int" : "double") : "String";
    }

    private static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
        } catch(NumberFormatException e) {
            return false;
        }
        return true;
    }
    public void performMathOperation(String mathOperationString) {
        String[] numbers = mathOperationString.split("[/]");
        for (int i=0; i<numbers.length ; i++) {


        }
    }

    public Double divide(Double... doubles) {
        Double result = Double.valueOf(0);
        for (Double d: doubles) {

        }
        return result;
    }
}
