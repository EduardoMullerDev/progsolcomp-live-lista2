/* Nome do Aluno: Eduardo Muller da Rosa
* RA:1292315363
* Nome do Programa:Faça um programa para imprimir o conceito de um aluno. O
conceito é calculado em função da nota do aluno que varia de 0
a 100. As faixas da correlação são mostradas abaixo:
Nota Conceito
0 a 49 Insuficiente
50 a 64 Regular
65 a 84 Bom
85 100 Ótimo
* Data:08/05/2023
*/
import java.util.Scanner;
public class exercicio6 {
    
    public static void main(String[] args){

    Scanner teclado = new Scanner(System.in);

double nota;

System.out.println("Digite a nota do aluno");
nota = teclado.nextDouble();
teclado.close();

if (nota > 0 && nota <= 49){
    System.out.println("Insuficiente");
}
else if (nota >= 50 && nota <= 64){
    System.out.println("Regular");
}
if (nota >= 65 && nota <= 84){
    System.out.println("Bom");
}
else if(nota >= 85 && nota <= 100){
    System.out.println("Ótimo");
}

}
}





