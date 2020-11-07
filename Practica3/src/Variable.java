enum dataTypes {
    bool,
    num
}

public class Variable {

    private String name;
    private Object value;
    private dataTypes dataType;

    Variable(String name, Object value, String dataType) {
        this.name = name;
        this.value = value;
        this.dataType = Enum.valueOf(dataTypes.class, dataType);
    }

    Variable(String name, String dataType) {
        this.name = name;
        this.value = null;
        this.dataType = Enum.valueOf(dataTypes.class, dataType);
    }

    public String getName() {
        return this.name;
    }

    public Object getValue() {
        return this.value;
    }

    public dataTypes getDataType() {
        return this.dataType;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Variable) {
            return this.name.equals(((Variable)obj).name);
        }
        return false;
    }
}
