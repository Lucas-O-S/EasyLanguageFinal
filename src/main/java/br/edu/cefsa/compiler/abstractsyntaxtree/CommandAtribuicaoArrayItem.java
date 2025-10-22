package br.edu.cefsa.compiler.abstractsyntaxtree;

public class CommandAtribuicaoArrayItem extends AbstractCommand {

    private String id;
    private String expr;
    private String position;

    public CommandAtribuicaoArrayItem(String id, String expr, String position) {
        this.id = id;
        this.expr = expr;
        this.position = position;
    }

    @Override
    public String generateJavaCode() {
        return "\t" + id + "[" + position + "]" + " = " + expr + ";" ;
    }

    @Override
    public String toString() {
        return "CommandAtribuicao [id=" + id + ", expr=" + expr + "]";
    }

}
