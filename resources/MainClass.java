import java.util.Scanner;
public class MainClass {
public static double dobrar(double valor) {
    double resultado;
    resultado = valor * 2;
    return resultado;
}


public static String saudacao(String pessoa, double abs) {
    String mensagem;
    mensagem = "Olá, " + pessoa + "!";
    return mensagem;
}


	public static void main(String args[]) {
	Scanner _key = new Scanner(System.in);

	int a;

	String[] meuvetor = new String[2];

	boolean flag;

	double soma;

	char v;

	double i;

	String nome;
a = 2;
v = 'c';
	nome = _key.nextLine();
soma = 0;
flag = true;
	meuvetor[1] = "A";

	for ( i = 1 ; i <= 10 ; i += 2) 
	{

		System.out.println("Valor de i: ");

		System.out.println(i);

		System.out.println(" Dobrado: ");

	}


	if (soma<100 && !flag==true) 
	{
		System.out.println("Soma ainda menor que 100");
		System.out.println(soma);

	}

	else 
	{

		System.out.println(0);

	}


	while (soma<100 || flag==false) 
	{
	soma = soma + 10;
	}

	System.out.println("Fim do programa!");

    _key.close();
    }
}
