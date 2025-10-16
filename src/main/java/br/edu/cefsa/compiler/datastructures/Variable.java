package br.edu.cefsa.compiler.datastructures;

// Classe para variáveis, com enum de tipos
public class Variable extends Symbol {

    public enum Type {
        NUMBER, TEXT, BOOLEAN, INTEGER, CHAR
    }

    private Type type;
    private String value; 
    private boolean isArray = false;
    private int arraySize = -1;

    public boolean isArray() { return isArray; }
    public int getArraySize() { return arraySize; }


    public Variable(String name, Type type, String value) {
        super(name);
        this.type = type;
        this.value = value;
        this.isArray = false;
    }
    
    public Variable(String name, Type type, int size) {
        super(name);
        this.type = type;
        this.isArray = true;
        this.arraySize = size; 
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

    @Override
    public String generateJavaCode() {
        String strType;
        switch (type) {
            case NUMBER: strType = "double"; break;
            case INTEGER: strType = "int"; break;
            case BOOLEAN: strType = "boolean"; break;
            case TEXT: strType = "String"; break;
            case CHAR: strType = "char"; break;
            default: strType = "Object"; break;
        }

        // --- Tratamento de arrays ---
        if (isArray) {
            if (arraySize > 0) {
                return "\n\t" + strType + "[] " + name + " = new " + strType + "[" + arraySize + "];";
            } else {
                return "\n\t" + strType + "[] " + name + ";";
            }
        }

        // --- Variável normal ---
        if (value != null) {
            return "\n\t" + strType + " " + name + " = " + value + ";";
        } else {
            return "\n\t" + strType + " " + name + ";";
        }
    }



    @Override
    public String toString() {
        if (isArray) {
            return "EasyArray [name=" + name + ", type=" + type + ", size=" + arraySize + "]";
        } else {
            return "EasyVariable [name=" + name + ", type=" + type + ", value=" + value + "]";
        }
    }
}
