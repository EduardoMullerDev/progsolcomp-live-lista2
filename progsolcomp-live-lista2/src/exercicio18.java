/* Nome do Aluno: Eduardo Muller da Rosa
* RA:1292315363
* Nome do Programa:Faça um programa que determine o fatorial de um número. Para
este problema, tem-se como entrada o valor do número do qual
se deseja calcular o fatorial. O fatorial de 0 é igual a 1. O
fatorial de um número N (N!) é definido conforme a seguir
(utilize for):
i. N! = 1 * 2 * 3 * 4 * ... * (N-1) * N
* Data:11/05/2023
*/


import java.util.Scanner;
public class exercicio18 {
    
    public static void main(String[] args) throws Exception {

        //fatorial de 5= 1 * 2 * 3 * 4 * 5
       
        Scanner teclado = new Scanner(System.in);
        
        int fatorial=1;
        int i;
        int n;

        System.out.println("Digite um numero:");
      n = teclado.nextInt();
      teclado.close();

      for(i = 1;   i<= n;   i = i +1 ){
        fatorial = fatorial * i;
        }
        System.out.println("o fatorial é " + fatorial);
    }
}
