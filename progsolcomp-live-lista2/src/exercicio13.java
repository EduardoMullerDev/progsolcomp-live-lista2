/* Nome do Aluno: Eduardo Muller da Rosa
* RA:1292315363
* Nome do Programa:Faça um programa que some os números de 1 a 100 e imprima somente o valor total da soma
* Data:11/05/2023
*/

public class exercicio13 {
    public static void main(String[] args) {
        
        double soma = 0;
        double i = 1;

        while(i <= 100){
            soma = i + soma;
            i = i+1;
        }
         System.out.println(soma);

    }
    
}