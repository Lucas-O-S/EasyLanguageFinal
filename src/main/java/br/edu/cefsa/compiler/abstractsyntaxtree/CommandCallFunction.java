package br.edu.cefsa.compiler.abstractsyntaxtree;

import java.util.ArrayList;

/**
 * Representa a chamada de uma função em EasyLanguage.
 */
public class CommandCallFunction extends AbstractCommand {

    private String functionName;
    private ArrayList<String> arguments;

    public CommandCallFunction(String functionName, ArrayList<String> arguments) {
        this.functionName = functionName;
        this.arguments = arguments;
    }

    @Override
    public String generateJavaCode() {
        StringBuilder sb = new StringBuilder();

        sb.append(functionName).append("(");

        if (arguments != null && !arguments.isEmpty()) {
            for (int i = 0; i < arguments.size(); i++) {
                sb.append(arguments.get(i));
                if (i < arguments.size() - 1) {
                    sb.append(", ");
                }
            }
        }

        sb.append(");");
        return sb.toString();
    }

    // Getters e setters
    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    public ArrayList<String> getArguments() {
        return arguments;
    }

    public void setArguments(ArrayList<String> arguments) {
        this.arguments = arguments;
    }
}
