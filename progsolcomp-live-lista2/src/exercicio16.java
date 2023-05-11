/* Nome do Aluno: Eduardo Muller da Rosa
* RA:1292315363
* Nome do Programa:Faça um programa que solicite ao usuário que digite um número
até que ele digite um número menor que 0 (utilize while)
* Data:11/05/2023
*/


import java.util.Scanner;
public class exercicio16 {
    
    public static void main(String[] args) throws Exception {

Scanner teclado = new Scanner(System.in);

int num;

do{
System.out.println("Digite um numero:");
num= teclado.nextInt();
}

while ( num>=0);
teclado.close();
    }

}
