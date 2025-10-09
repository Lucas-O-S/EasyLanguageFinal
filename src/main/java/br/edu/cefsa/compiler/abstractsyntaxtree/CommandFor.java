package br.edu.cefsa.compiler.abstractsyntaxtree;

import java.util.ArrayList;

public class CommandFor extends  AbstractCommand{

    private String varName;
    private String startExpr;
    private String endExpr;
    private String comparator;
    private String leftCondition;
    private String rightCondition;
    private String nextIteration;
    private ArrayList<AbstractCommand> loopCommands;

    public CommandFor(
            String varName,
            String startExpr,
            String endExpr,
            String stopExpr,
            String leftCondition,
            String rightCondition,
            String comparator,
            String nextIteration,
            ArrayList<AbstractCommand>loopCommands
        ) {
        this.varName = varName;
        this.startExpr = startExpr;
        this.endExpr = endExpr;
        this.comparator = comparator;
        this.leftCondition = leftCondition;
        this.rightCondition = rightCondition;
        this.nextIteration = nextIteration;
        this.loopCommands = loopCommands;

    }

    @Override
    public String generateJavaCode() {
        StringBuilder str = new StringBuilder();
        str.append("for ( int " + varName + " = " + startExpr + " ; " + leftCondition + comparator + " " + rightCondition + " " + endExpr + " ; " + " "  + nextIteration + ") \n {");

        for(AbstractCommand cmd : loopCommands){
            str.append(cmd.generateJavaCode());
        }

        str.append("} \n");
        
        
        return str.toString();
    }

    @Override
    public String toString() {
        return "CommandFor[var=" + varName + ", start=" + startExpr + ", end=" + endExpr + "]";
    }


}
