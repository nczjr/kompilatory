public class Variable {

    String identifier;
    Type type;

    public Variable(){};

    public Variable(String identifier, Type type) {
        this.identifier = identifier;
        this.type = type;
    }


    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Variable{" +
                "identifier='" + identifier + '\'' +
                ", type=" + type +
                '}';
    }
}
