package br.edu.cefsa.compiler.datastructures;

import java.util.ArrayList;

import br.edu.cefsa.compiler.abstractsyntaxtree.AbstractCommand;

public class Function {
    private String name;
    private SymbolTable localTable;
    private ArrayList<Variable> parameters;
    private ArrayList<AbstractCommand> commands;
    private Variable.Type returnType;

    public Function(String name, Variable.Type type, ArrayList<Variable> parametros, SymbolTable localTable, ArrayList<AbstractCommand> commands) {
        this.name = name;
        this.returnType = type;
        this.localTable = localTable;
        this.commands = commands;
        this.parameters = parametros; 
    }

    public SymbolTable getLocalTable() { return localTable; }
    public ArrayList<Variable> getParameters() { return parameters; }
    public ArrayList<AbstractCommand> getCommands() { return commands; }
    public Variable.Type getReturnType() { return returnType; }
    public String getName() { return name; }

}
