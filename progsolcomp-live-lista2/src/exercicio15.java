/* Nome do Aluno: Eduardo Muller da Rosa
* RA:1292315363
* Nome do Programa:Faça um programa que preencha com zeros todas as posições de
uma matriz com 10 linha e 10 colunas
* Data:11/05/2023
*/

public class exercicio15 {   
        
    public static void main(String[] args) {
        
        int[][] matriz;
        matriz = new int[10][10];
      int i;
      int j;
        for (i = 0; i < 10; i++) {
            for (j = 0; j < 10; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}