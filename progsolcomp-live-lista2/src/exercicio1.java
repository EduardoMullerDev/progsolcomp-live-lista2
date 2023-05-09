/* Nome do Aluno: Eduardo Muller da Rosa
* RA:1292315363
* Nome do Programa:Faça um programa que leia dois números A e B e imprima o maior
deles.
* Data:08/05/2023
*/
import java.util.Scanner;
public class exercicio1 {
    
    public static void main(String[] args) throws Exception {
    
        Scanner teclado = new Scanner(System.in);

    System.out.println("Digite o primeiro número");
    int a = teclado.nextInt();
    
    System.out.println("Digite o segundo número");
    int b = teclado.nextInt();

if (a >= b){
    System.out.println("o maior número é: " + a);
}
else {
    System.out.println("o maior número é: " + b);
}

}
}

