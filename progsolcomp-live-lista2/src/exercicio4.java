/* Nome do Aluno: Eduardo Muller da Rosa
* RA:1292315363
* Nome do Programa:Faça um programa que leia um número inteiro e mostre uma mensagem indicando se este 
número é par ou ímpar e se é positivo ou negativo.
* Data:08/05/2023
*/
import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args){

        //entrada
        Scanner teclado = new Scanner(System.in);

        System.out.println("Seja bem vindo ao é Par OU Impar / Positivo OU Negativo");

        System.out.println("Escreva um número:");
        int numero = teclado.nextInt();
        teclado.close();

if (numero >= 0){
    System.out.println("O numero é positivo");
}
else {System.out.println("O número é negativo");
}

if (numero % 2 ==0){
    System.out.print ("O numero é par");
} else{
    System.out.print("O numero é impar");
}




    }
}