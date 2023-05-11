/* Nome do Aluno: Eduardo Muller da Rosa
* RA:1292315363
* Nome do Programa:Escreva um programa que, dada a carga máxima de um elevador e
a quantidade máxima de pessoas digitadas pelo usuário, leia o
peso de cada pessoa, também digitada pelo usuário, que entra
no elevador até que a carga máxima seja atingida ou o número
máximo de pessoas seja atingido (utilize do / while).
* Data:11/05/2023
*/

import java.util.Scanner;

public class exercicio20 {
    
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);
   
int pessoasMaxima;
int cargaMaxima;
int carga = 0;
int pessoa= 0 ;
int pesopessoa;


System.out.print("Digite a carga máxima do elevador em kg: ");
        cargaMaxima = teclado.nextInt();
        
        System.out.print("Digite a quantidade máxima de pessoas no elevador: ");
        pessoasMaxima = teclado.nextInt();


do {
    System.out.print("digite o peso da pessoaem Kg:");
pesopessoa = teclado.nextInt();

if(carga + pesopessoa <= cargaMaxima && pessoa <= pessoasMaxima){
    carga += pesopessoa;
    pessoa ++;
}
else{ 
    System.out.println("o elevador excedeu seu limite!!!");
break;
}
}
while(carga + pesopessoa <= cargaMaxima && pessoa <= pessoasMaxima);

System.out.printf("O elevador está com %d pessoas e %d kg de carga.",pessoa,carga);
teclado.close();
}
    }
