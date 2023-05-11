/* Nome do Aluno: Eduardo Muller da Rosa
* RA:1292315363
* Nome do Programa:Crie um programa que lê um número entre 1 e 12, correspondendo
a um dos meses do ano onde o mês 1 é Janeiro e 12 é dezembro.
Ao final, o programa deve imprimir uma mensagem identificando,
com base no número digitado, o nome do mês e a estação. 
* Data:10/05/2023
*/


import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
       
        int a;

        Scanner teclado = new Scanner(System.in);
      
        System.out.println("Digite o mês");
       
        a = teclado.nextInt();
        teclado.close();

        switch(a) {
            case 1: System.out.println("Janeiro - Verão");
                    break;
            case 2: System.out.println("Fevereiro - Verão");
                    break;
            case 3: System.out.println("Março - Verão");
                    break;
            case 4: System.out.println("Abril - Outono");
                    break;
            case 5: System.out.println("Maio - Outono");
                    break;
            case 6: System.out.println("Junho - Outono");
                    break;
            case 7: System.out.println("Julho - Inverno");
                    break;
            case 8: System.out.println("Agosto - Inverno");
                    break;       
            case 9: System.out.println("Setembro - Inverno");
                    break;
            case 10: System.out.println("Outubho - Primavera");
                    break;
            case 11: System.out.println("Novembro - Primavera");
                    break;
            case 12: System.out.println("Dezembro - Primavera");
                    break;
                    default: System.out.println("Não existe esse mês");
        }

    }
}