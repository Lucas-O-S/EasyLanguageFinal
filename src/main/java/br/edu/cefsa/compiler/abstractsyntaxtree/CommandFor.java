package br.edu.cefsa.compiler.abstractsyntaxtree;

import java.util.ArrayList;

public class CommandFor extends  AbstractCommand{

    private String varName;
    private String condition;
    private String nextIteration;
    private ArrayList<AbstractCommand> loopCommands;

    public CommandFor(
            String varName,
            String condition,
            String nextIteration,
            ArrayList<AbstractCommand>loopCommands
        ) {
        this.varName = varName;
        this.condition = condition;
        this.nextIteration = nextIteration;
        this.loopCommands = loopCommands;

    }

    @Override
    public String generateJavaCode() {
        StringBuilder str = new StringBuilder();
        str.append("for ( " + varName + " ; " + condition + " ; "  + nextIteration + ") \n {");

        for(AbstractCommand cmd : loopCommands){
            str.append(cmd.generateJavaCode());
        }

        str.append("} \n");
        
        
        return str.toString();
    }

    @Override
    public String toString() {
        return "CommandFor[var=" + varName + ", start=" + condition + ", end=" + nextIteration + "]";
    }


}
