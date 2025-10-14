package br.edu.cefsa.compiler.datastructures;

// Classe para variáveis, com enum de tipos
public class Variable extends Symbol {

    public enum Type {
        NUMBER, TEXT, BOOLEAN, INTEGER, CHAR
    }

    private Type type;
    private String value; // valor como string para inicialização e geração de código

    public Variable(String name, Type type, String value) {
        super(name);
        this.type = type;
        this.value = value;
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
    public String toString() {
        return "EasyVariable [name=" + name + ", type=" + type + ", value=" + value + "]";
    }

    // Geração de código Java correspondente ao tipo
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

        // Valor inicial, se existir
        if (value != null) {
            return "\n\t" + strType + " " + name + " = " + value + ";";
        } else {
            return "\n\t" + strType + " " + name + ";";
        }
    }
}
