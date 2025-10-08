package br.edu.cefsa.compiler.abstractsyntaxtree;

import java.util.ArrayList;

public class CommandFor extends  AbstractCommand{

    private String varName;
    private String startExpr;
    private String endExpr;
    private ArrayList<AbstractCommand> loopCommands;

    public CommandFor(String varName, String startExpr,String endExpr, ArrayList<AbstractCommand>loopCommands) {
        this.varName = varName;
        this.startExpr = startExpr;
        this.endExpr = endExpr;
        this.loopCommands = loopCommands;
    }

    @Override
    public String generateJavaCode() {
        StringBuilder str = new StringBuilder();
        
        
        return  str.toString();
    }


}
