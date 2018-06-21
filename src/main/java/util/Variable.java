package util;

public class Variable {

    String identifier;
    String type;

    public Variable(){};

    public Variable(String identifier, String type) {
        this.identifier = identifier;
        this.type = type;
    }


    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "util.Variable{" +
                "identifier='" + identifier + '\'' +
                ", type=" + type +
                '}';
    }
}
