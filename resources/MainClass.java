import java.util.Scanner;
public class MainClass {
public static double media(double a, double b, double c) {
    double resultado;
    resultado = (a + b + c) / 3;
    return resultado;
}


public static double multiplicar(double x, double y) {
    double resultado;
    resultado = x * y;
    return resultado;
}


public static String mensagemFinal(double valor) {
    String msg;
    msg = "Média final: " + valor;
    return msg;
}


public static void exibirMensagem(String txt) {
    	System.out.println(txt);

}


	public static void main(String args[]) {
	Scanner _key = new Scanner(System.in);

	String msg;

	double n1;

	double n2;

	double produto;

	double n3;

	boolean aprovado;

	String nome;

	double med;
	System.out.println("Digite o nome do aluno:");

	nome = _key.nextLine();
n1 = 7;
n2 = 8;
n3 = 9;
med = media(n1, n2, n3);
produto = multiplicar(med, 2);

	if (med>=7) 
	{
	aprovado = true;
	}

	else 
	{

	aprovado = false;
	}


	if (aprovado==true) 
	{
	msg = mensagemFinal(produto);	exibirMensagem("Aluno " + nome + " aprovado!");	exibirMensagem(msg);
	}

	else 
	{

	exibirMensagem("Aluno " + nome + " reprovado!");
	}

	System.out.println("Fim da execução");

    _key.close();
    }
}
