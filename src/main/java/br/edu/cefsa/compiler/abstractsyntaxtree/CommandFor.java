package br.edu.cefsa.compiler.abstractsyntaxtree;

import java.util.ArrayList;

public class CommandFor extends  AbstractCommand{

    private String varName;
    private String startExpr;
    private String operator;
    private String endExpr;
    private String stepExpr;
    private ArrayList<AbstractCommand> loopCommands;

    public CommandFor(
            String varName,
            String startExpr,
            String operator,
            String endExpr,
            String stepExpr,
            ArrayList<AbstractCommand>loopCommands
        ) {
        this.varName = varName;
        this.startExpr = startExpr;
        this.operator = operator;
        this.endExpr = endExpr;
        this.stepExpr = stepExpr;
        this.loopCommands = loopCommands;

    }

    @Override
    public String generateJavaCode() {

        StringBuilder str = new StringBuilder();

        boolean isDecreasing = operator.contains(">");

        str.append("for ( " + varName + " = " + startExpr +  " ; " + 
            varName + " " + operator +  " " + endExpr + " ; " +
             varName + (isDecreasing ? " -= " : " += ") + stepExpr + ") {\n");

        for(AbstractCommand cmd : loopCommands){
            
            str.append("    " + cmd.generateJavaCode());
        
        }

        str.append("} \n");
        
        
        return str.toString();
    }

    @Override
    public String toString() {
        return "CommandFor[var=" + varName +
                ", start=" + startExpr +
                ", op=" + operator +
                ", end=" + endExpr +
                ", step=" + stepExpr + "]";
    }


}
