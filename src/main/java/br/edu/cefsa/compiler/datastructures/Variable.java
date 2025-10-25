package br.edu.cefsa.compiler.datastructures;

public class Variable extends Symbol {

    public enum Type {
        NUMBER, TEXT, BOOLEAN, INTEGER, CHAR, ARRAY, VOID
    }

    private Type type;
    private String value; 
    private int arraySize; 

    // Construtor para variável simples com valor
    public Variable(String name, Type type, String value) {
        super(name);
        this.type = type;
        this.value = value;
        this.arraySize = 0;
    }
    
    // Construtor para array
    public Variable(String name, Type type, int arraySize) {
        super(name);
        this.type = type;
        this.arraySize = arraySize;
        this.value = null; 
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getArraySize() {
        return arraySize;
    }

    public void setArraySize(int arraySize) {
        this.arraySize = arraySize;
    }

    public boolean isArray() {
        return arraySize > 0;
    }

    @Override
    public String toString() {
        if (isArray()) {
            return "Variable [name=" + name + ", type=" + type + ", arraySize=" + arraySize + "]";
        }
        return "Variable [name=" + name + ", type=" + type + ", value=" + value + "]";
    }

    @Override
    public String generateJavaCode() {
        String strType;
        switch (type) {
            case NUMBER: strType = "double"; break;
            case INTEGER: strType = "int"; break;
            case BOOLEAN: strType = "boolean"; break;
            case TEXT: strType = "String"; break;
            case CHAR: strType = "char"; break;
            case ARRAY: strType = "array"; break;
            case VOID: strType = "void"; break;
            default: strType = "Object"; break;
        }

        if (isArray()) {
            return "\n\t" + strType + "[] " + name + " = new " + strType + "[" + arraySize + "];";
        } else if (value != null) {
            return "\n\t" + strType + " " + name + " = " + value + ";";
        } else {
            return "\n\t" + strType + " " + name + ";";
        }
    }
}
