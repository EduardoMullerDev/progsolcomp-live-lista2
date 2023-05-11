/* Nome do Aluno: Eduardo Muller da Rosa
* RA:1292315363
* Nome do Programa:Faça um programa que imprima todos os números pares de 1 a 100.
* Data:11/05/2023
*/


public class exercicio10 {
    public static void main(String[] args) {

        int numero = 0;
        int i = 0;

        while((i < 50)) {
            numero = numero + 2;
            System.out.print(numero);
            System.out.print("  ");
            i = i+1;
        }
    }
}