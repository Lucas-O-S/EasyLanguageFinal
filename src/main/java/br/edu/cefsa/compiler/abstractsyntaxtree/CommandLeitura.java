package br.edu.cefsa.compiler.abstractsyntaxtree;

import br.edu.cefsa.compiler.datastructures.Variable;

public class CommandLeitura extends AbstractCommand {

    private String id;
    private Variable var;

    public CommandLeitura(String id, Variable var) {
        this.id = id;
        this.var = var;
    }

@Override
public String generateJavaCode() {
    String inputCode;

    switch (var.getType()) {
        case DECIMAL:
        case INTEGER:
            inputCode = "_key.nextDouble();";
            break;
        case BOOLEAN:
        case TEXT:
        case CHAR:
        default:
            inputCode = "_key.nextLine();";
            break;
    }

    return "\t" + id + " = " + inputCode;
}


    @Override
    public String toString() {
        return "CommandLeitura [id=" + id + "]";
    }

}
