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
}
