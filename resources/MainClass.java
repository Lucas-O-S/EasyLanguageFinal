import java.util.Scanner;
public class MainClass{ 
 public static void main(String args[]){
   Scanner _key = new Scanner(System.in);

	int a;

	int[] meuvetor = new int[2];

	boolean flag;

	double soma;

	char v;

	double i;

	String nome;
	a = 2;
	v = 'c';
	nome = _key.nextLine();
	System.out.println(nome);

	soma = 0;
	flag = true;\
int[] meuvetor = new int[2];

	for ( i = 1 ; i <= 10 ; i += 2) 
	{

		System.out.println(i);

	}


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