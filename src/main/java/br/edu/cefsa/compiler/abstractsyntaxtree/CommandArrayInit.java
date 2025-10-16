package br.edu.cefsa.compiler.abstractsyntaxtree;

import java.util.List;

import br.edu.cefsa.compiler.datastructures.Variable;

public class CommandArrayInit extends AbstractCommand {
    private String name;
    private List<String> values;
    private Variable var; // referência à variável da SymbolTable

    public CommandArrayInit(String name, List<String> values, Variable var) {
        this.name = name;
        this.values = values;
        this.var = var;
    }

    // Overloaded constructor used by the parser (grammar) which only supplies name and values
    public CommandArrayInit(String name, List<String> values) {
        this.name = name;
        this.values = values;
        this.var = null;
    }

    @Override
    public String generateJavaCode() {
        String strType = null;
        boolean isArray = true;

        if (var != null) {
            // Use var info when available
            switch (var.getType()) {
                case NUMBER: strType = "double"; break;
                case INTEGER: strType = "int"; break;
                case BOOLEAN: strType = "boolean"; break;
                case TEXT: strType = "String"; break;
                case CHAR: strType = "char"; break;
                default: strType = "Object"; break;
            }
            isArray = var.isArray();
        } else {
            // Infer type from provided values when Variable not provided by parser
            if (values != null && !values.isEmpty()) {
                for (String v : values) {
                    String lit = v.trim();
                    if (lit.startsWith("'") && lit.endsWith("'")) {
                        strType = "char";
                        break;
                    }
                    if (lit.startsWith("\"") && lit.endsWith("\"")) {
                        strType = "String";
                        break;
                    }
                    if (lit.equalsIgnoreCase("true") || lit.equalsIgnoreCase("false")) {
                        strType = "boolean";
                        break;
                    }
                    if (lit.contains(".")) {
                        strType = "double";
                        // continue checking for other types
                    } else {
                        if (strType == null) strType = "int";
                    }
                }
                if (strType == null) strType = "Object";
            } else {
                // no var info and no init values: unknown array -> fallback to Object[]
                strType = "Object";
            }
        }

        StringBuilder sb = new StringBuilder();
        if (!isArray) {
            throw new RuntimeException("Variable " + name + " is not an array");
        }

        // Se valores iniciais foram fornecidos
        if (values != null && !values.isEmpty()) {
            sb.append(strType)
              .append("[] ")
              .append(name)
              .append(" = new ")
              .append(strType)
              .append("[]{");

            for (int i = 0; i < values.size(); i++) {
                sb.append(values.get(i));
                if (i < values.size() - 1) sb.append(",");
            }
            sb.append("};");
        } else {
            // apenas declara o array com tamanho definido
            sb.append(strType)
              .append("[] ")
              .append(name);
            if (var != null && var.getArraySize() > 0) {
                sb.append(" = new ").append(strType).append("[").append(var.getArraySize()).append("]");
            }
            sb.append(";");
        }

        return sb.toString();
    }
}
