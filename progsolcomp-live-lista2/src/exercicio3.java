/* Nome do Aluno: Eduardo Muller da Rosa
* RA:1292315363
* Nome do Programa:Elabore um programa que lê dois valores A e B e os escreve com
a mensagem: “São múltiplos” ou “Não são múltiplos”.
* Data:08/05/2023
*/
import java.util.Scanner;
public class exercicio3 {
    public static void main(String[] args) throws Exception { 
        
        Scanner teclado = new Scanner(System.in);

    System.out.println("digite o primeiro número");
int a = teclado.nextInt();
    System.out.println("digite o segundo número");
int b = teclado.nextInt();
teclado.close();

if (b % a== 0 ){
    System.out.println(a +" e " + b +" São multiplos!");
}
else 
    System.out.println(a + " e " + b + " Não são multiplos!");

}
}