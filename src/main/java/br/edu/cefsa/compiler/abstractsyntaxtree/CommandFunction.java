package br.edu.cefsa.compiler.abstractsyntaxtree;

import java.util.ArrayList;

import br.edu.cefsa.compiler.datastructures.Function;
import br.edu.cefsa.compiler.datastructures.Symbol;
import br.edu.cefsa.compiler.datastructures.Variable;

public class CommandFunction extends AbstractCommand {

    private Function function;

    public CommandFunction(Function function) {
        this.function = function;
    }

    @Override
    public String generateJavaCode() {
        StringBuilder sb = new StringBuilder();

        // Tipo de retorno da função
        String javaType = mapType(function.getReturnType());

        // Assinatura do método - estático para poder ser chamado da main
        sb.append("public static ").append(javaType)
          .append(" ").append(function.getName()).append("(");

        // Parâmetros
        ArrayList<Variable> params = function.getParameters();
        for (int i = 0; i < params.size(); i++) {
            Variable p = params.get(i);
            sb.append(mapType(p.getType())).append(" ").append(p.getName());
            if (i < params.size() - 1) sb.append(", ");
        }
        sb.append(") {\n");

        // Declarar variáveis locais (ignorando parâmetros)
        for (Symbol s : function.getLocalTable().getAll()) {
            if (s instanceof Variable v && !isParameter(v, params)) {
                sb.append("    ").append(mapType(v.getType()))
                  .append(" ").append(v.getName()).append(";\n");
            }
        }

        // Corpo da função (comandos)
        for (AbstractCommand c : function.getCommands()) {
            sb.append("    ").append(c.generateJavaCode()).append("\n");
        }

        sb.append("}\n\n"); // fim do método

        return sb.toString();
    }

    private boolean isParameter(Variable v, ArrayList<Variable> params) {
        for (Variable p : params) {
            if (p.getName().equals(v.getName())) return true;
        }
        return false;
    }

    private String mapType(Variable.Type type) {
        return switch (type) {
            case DECIMAL -> "double";
            case TEXT -> "String";
            case BOOLEAN -> "boolean";
            case INTEGER -> "int";
            case CHAR -> "char";
            case VOID  -> "void";
            default -> "void";
        };
    }

    @Override
    public String toString() {
        return "CommandFunction{" +
                "name='" + function.getName() + '\'' +
                ", returnType=" + function.getReturnType() +
                ", parameters=" + function.getParameters() +
                ", localVars=" + function.getLocalTable().getAll() +
                ", commands=" + function.getCommands() +
                '}';
    }

    public Function getFunction() {
        return function;
    }
}
