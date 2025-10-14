package br.edu.cefsa.compiler.datastructures;
public abstract class Symbol {

    protected String name;

    public Symbol(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract String generateJavaCode();

    @Override
    public String toString() {
        return "EasySymbol [name=" + name + "]";
    }
}
