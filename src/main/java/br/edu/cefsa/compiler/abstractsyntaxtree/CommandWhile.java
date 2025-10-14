package br.edu.cefsa.compiler.abstractsyntaxtree;

import java.util.ArrayList;

public class CommandWhile extends AbstractCommand {
    private String condition;
    private ArrayList<AbstractCommand> loopCommand;

    public CommandWhile(String condition, ArrayList<AbstractCommand> loopCommand){
        this.condition = condition;
        this.loopCommand = loopCommand;
    }

    @Override
    public String generateJavaCode(){
        StringBuilder str = new StringBuilder();
        str.append("\n\twhile (" + condition + ") \n\t{");
        for(AbstractCommand cmd : loopCommand){
            str.append("\n\t" + cmd.generateJavaCode());
        }
        str.append("\n\t}\n");
        return  str.toString();
    }
    
    @Override
    public String toString() {
        return "CommandWhile[condition=" + condition + "]";
    }
}
