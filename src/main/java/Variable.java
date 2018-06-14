public class Variable {

    String identifier;
    Object value;
    Type type;


    public Variable(String identifier, Object value, Type type) {
        this.identifier = identifier;
        this.value = value;
        this.type = type;
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
}
