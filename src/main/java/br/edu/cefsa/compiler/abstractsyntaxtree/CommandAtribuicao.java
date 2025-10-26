package br.edu.cefsa.compiler.abstractsyntaxtree;

import br.edu.cefsa.compiler.datastructures.Variable;
public class CommandAtribuicao extends AbstractCommand {

    private String id;
    private String expr;
    private Variable.Type tipo; // <-- adiciona

    // Construtor para variáveis locais com tipo
    public CommandAtribuicao(String id, String expr, Variable.Type tipo) {
        this.id = id;
        this.expr = expr;
        this.tipo = tipo;
    }

    // Construtor antigo (atribuição simples)
    public CommandAtribuicao(String id, String expr) {
        this(id, expr, null);
    }

    public String getVarName() { return id; }
    public String getExpression() { return expr; }

    public String getTypeString() {
        if (tipo == null) return ""; // sem tipo
        switch (tipo) {
            case DECIMAL: return "double";
            case TEXT: return "String";
            case BOOLEAN: return "boolean";
            case INTEGER: return "int";
            case CHAR: return "char";
            default: return "";
        }
    }

    @Override
    public String generateJavaCode() {
        if (tipo != null) {
            return getTypeString() + " " + id + " = " + expr + ";";
        } else {
            return id + " = " + expr + ";";
        }
    }

    @Override
    public String toString() {
        return "CommandAtribuicao [id=" + id + ", expr=" + expr + ", tipo=" + tipo + "]";
    }
}
