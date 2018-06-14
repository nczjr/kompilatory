import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Handler {

    private static List<Variable> variables = new ArrayList<>();

    private static Map<String, List<Variable>> arraysMap = new HashMap<>();


    public static void put(String identifier, String value, String type) {
        variables.add(new Variable(identifier, value, Type.valueOf(type.toUpperCase())));

    }

    public static Variable get(String identifier) {
        return variables.stream()
                .filter(variable -> variable.identifier.equals(identifier))
                .findAny()
                .get();
    }


}
