package br.edu.cefsa.compiler.abstractsyntaxtree;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

import br.edu.cefsa.compiler.datastructures.Symbol;
import br.edu.cefsa.compiler.datastructures.SymbolTable;
import br.edu.cefsa.compiler.datastructures.Variable;

public class Program {

    private SymbolTable varTable;
    private ArrayList<AbstractCommand> comandos;
    private ArrayList<CommandFunction> functions = new ArrayList<>();
    private String programName;

    public void addFunction(CommandFunction func) {
        functions.add(func);
    }

    public void setFunctions(ArrayList<CommandFunction> functions) {
        this.functions = functions;
    }

   public void generateTarget() {
        StringBuilder str = new StringBuilder();
        str.append("import java.util.Scanner;\n");
        str.append("public class MainClass {\n");

        // 1️⃣ Gerar funções primeiro (fora do main)
        for (CommandFunction func : functions) {
            str.append(func.generateJavaCode()).append("\n");
        }

        // 2️⃣ Início do main
        str.append("\tpublic static void main(String args[]) {\n");
        str.append("\tScanner _key = new Scanner(System.in);\n");

        // 3️⃣ Declarar variáveis globais no main
        for (Symbol symbol : varTable.getAll()) {
            if (symbol instanceof Variable v) {
                str.append(v.generateJavaCode()).append("\n");
            }
        }

        // 4️⃣ Gerar comandos do main (ignorar funções)
        for (AbstractCommand command : comandos) {
            if (!(command instanceof CommandFunction)) {
                str.append(command.generateJavaCode()).append("\n");
            }
        }

        str.append("    _key.close();\n");
        str.append("    }\n"); // fim main
        str.append("}\n");     // fim classe

        try {
            FileWriter fr = new FileWriter(new File("./resources/MainClass.java"));
            fr.write(str.toString());
            fr.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    // Getters e Setters
    public SymbolTable getVarTable() {
        return varTable;
    }

    public void setVarTable(SymbolTable varTable) {
        this.varTable = varTable;
    }

    public ArrayList<AbstractCommand> getComandos() {
        return comandos;
    }

    public void setComandos(ArrayList<AbstractCommand> comandos) {
        this.comandos = comandos;
    }

    public ArrayList<CommandFunction> getFunctions() {
        return functions;
    }

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }
}
