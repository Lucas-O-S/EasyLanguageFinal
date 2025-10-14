import java.util.Scanner;
public class MainClass{ 
 public static void main(String args[]){
   Scanner _key = new Scanner(System.in);

	boolean  flag;

	double  soma;

	double  i;
	soma = 0;
	flag = true;

	for ( i = 1 ; i <= 10 ; i += 2) 
	{

		System.out.println(i);

	}


	if (soma<100 && flag==true) 
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