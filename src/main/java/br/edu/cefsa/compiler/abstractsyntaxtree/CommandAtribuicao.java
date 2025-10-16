package br.edu.cefsa.compiler.abstractsyntaxtree;

public class CommandAtribuicao extends AbstractCommand {

    private String id;
    private String expr;
    private String index; // optional index for array assignment (e.g., id[index])

    public CommandAtribuicao(String id, String expr) {
        this.id = id;
        this.expr = expr;
        this.index = null;
    }

    // constructor for indexed assignment
    public CommandAtribuicao(String id, String expr, String index) {
        this.id = id;
        this.expr = expr;
        this.index = index;
    }

    @Override
    public String generateJavaCode() {
        if (index != null) {
            return "\t" + id + "[" + index + "] = " + expr + ";";
        }
        return "\t" + id + " = " + expr + ";";
    }

    @Override
    public String toString() {
        if (index != null) {
            return "CommandAtribuicao [id=" + id + ", index=" + index + ", expr=" + expr + "]";
        }
        return "CommandAtribuicao [id=" + id + ", expr=" + expr + "]";
    }

}
