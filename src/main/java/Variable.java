public class Variable {

    String identifier;
    Object value;
    Type type;

    public Variable(){};

    public Variable(String identifier, Object value, Type type) {
        this.identifier = identifier;
        this.value = value;
        this.type = type;
    }

    public Variable(Integer value, String identifier) {
        this.identifier = identifier;
        this.value = value;
        this.type = Type.INT;
    }

    public Variable(Double value, String identifier) {
        this.identifier = identifier;
        this.value = value;
        this.type = Type.DOUBLE;
    }

    public Variable(String value, String identifier) {
        this.identifier = identifier;
        this.value = value;
        this.type = Type.STRING;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
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
                ", value=" + value +
                ", type=" + type +
                '}';
    }
}
