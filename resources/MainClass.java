import java.util.Scanner;
public class MainClass{ 
 public static void main(String args[]){
   Scanner _key = new Scanner(System.in);
double  soma;
double  i;
String  nome;
nome= _key.nextLine();
System.out.println(nome);
soma = 0;
System.out.println(soma);
for ( i = 1 ; i <= 10 ; i += 2) {
    System.out.println(i);    soma = soma+i;} 

for ( i = 10 ; i >= 0 ; i -= 1) {
    System.out.println(i);} 

while (soma<20 && soma<15) {
soma = soma+2;System.out.println(soma);
}

 }}