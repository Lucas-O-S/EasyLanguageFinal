package br.edu.cefsa.compiler.abstractsyntaxtree;

import java.util.List;

import br.edu.cefsa.compiler.datastructures.Variable;

public class CommandArrayInit extends AbstractCommand {
    private final String name;      // nome do array
    private final List<String> values; // valores iniciais, se houver
    private final Variable var;        // referência à variável na SymbolTable

    // Novo construtor compatível com grammar antigo
    public CommandArrayInit(String name, Variable var) {
        this.name = name;
        this.var = var;
        this.values = null; // sem valores iniciais
    }

    // Construtor antigo (opcional, se quiser manter a versão completa)
    public CommandArrayInit(String name, List<String> values, Variable var) {
        this.name = name;
        this.values = values;
        this.var = var;
    }

    @Override
    public String generateJavaCode() {
        if (var == null) {
            throw new RuntimeException("Variable reference is null for array " + name);
        }

        String javaType;
        switch (var.getType()) {
            case DECIMAL: javaType = "double"; break;
            case INTEGER: javaType = "int"; break;
            case BOOLEAN: javaType = "boolean"; break;
            case TEXT: javaType = "String"; break;
            case CHAR: javaType = "char"; break;
            case ARRAY: javaType = "Object"; break; // fallback se tipo ARRAY genérico
            default: javaType = "Object"; break;
        }

        StringBuilder sb = new StringBuilder();
        sb.append(javaType).append("[] ").append(name);

        if (values != null && !values.isEmpty()) {
            sb.append(" = new ").append(javaType).append("[]{");
            for (int i = 0; i < values.size(); i++) {
                sb.append(values.get(i));
                if (i < values.size() - 1) sb.append(", ");
            }
            sb.append("};");
        } else {
            // declaração com tamanho definido na Variable
            sb.append(" = new ").append(javaType).append("[").append(var.getArraySize()).append("];");
        }

        return sb.toString();
    }

    public String getName() { return name; }
    public List<String> getValues() { return values; }
    public Variable getVar() { return var; }
}
