package br.edu.cefsa.compiler.abstractsyntaxtree;

public class CommandEscrita extends AbstractCommand {

    private String id;

    public CommandEscrita(String id) {
        this.id = id;
    }

    @Override
    public String generateJavaCode() {
        // TODO Auto-generated method stub
        return "\tSystem.out.println(" + id + ");\n";
    }

    @Override
    public String toString() {
        return "CommandEscrita [id=" + id + "]";
    }

}
