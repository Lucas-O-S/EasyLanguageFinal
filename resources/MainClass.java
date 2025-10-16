import java.util.Scanner;
public class MainClass{ 
 public static void main(String args[]){
   Scanner _key = new Scanner(System.in);

	int a;

	boolean flag;

	double soma;

	char v;

	int vetor;

	double i;

	String nome;
	a = 2;
	v = 'c';
	nome = _key.nextLine();
	System.out.println(nome);

	soma = 0;
	flag = true;
	vetor[0] = 10;
	vetor[1] = 20;
	vetor[2] = 30;

	for ( i = 0 ; i <= 2 ; i += 1) 
	{

		System.out.println(vetor[i]);

	}

	soma = vetor[0] + vetor[1];

	if (soma<100 && !flag==true) 
	{
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

 }}