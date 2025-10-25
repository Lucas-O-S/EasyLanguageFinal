package br.edu.cefsa.compiler.abstractsyntaxtree;

public class CommandReturn extends AbstractCommand {

    private String returnValue;

    public CommandReturn(String returnValue) {
        this.returnValue = returnValue;
    }

    @Override
    public String generateJavaCode() {
        // Gera o comando de retorno no Java
        return "return " + returnValue + ";";
    }

    @Override
    public String toString() {
        return "CommandReturn{returnValue='" + returnValue + "'}";
    }
}
