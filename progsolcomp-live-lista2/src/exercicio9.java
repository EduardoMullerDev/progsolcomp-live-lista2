/* Nome do Aluno: Eduardo Muller da Rosa
* RA:1292315363
* Nome do Programa:Faça um programa que receba o valor da venda, escolha a
condição de pagamento no menu e mostre o total da venda final
conforme condições a seguir:
Venda a Vista - desconto de 10%
Venda a Prazo 30 dias - desconto de 5%
Venda a Prazo 60 dias - mesmo preço
Venda a Prazo 90 dias - acréscimo de 5%
Venda com cartão de débito - desconto de 8%
Venda com cartão de crédito - desconto de 7%
* Data:11/04/2023
*/

import java.util.Scanner;
public class exercicio9 {
    public static void main(String[] args) {

double valordavenda;
double desconto10;
double desconto5_30;
double semdesconto;
double acrecimo5_90;
double desconto8;
double desconto7;
String opcao;
double valortotal;

Scanner teclado = new Scanner(System.in);
System.out.println("Digite o valor da venda:");
valordavenda = teclado.nextDouble();

System.out.println("Escolha a condição de pagamento:");
opcao = teclado.nextLine();

System.out.println("1 - Escolha a condição de pagamento:");
System.out.println("2 - Venda a Vista - desconto de 10%");
System.out.println("3 - Venda a Prazo 30 dias - desconto de 5%");
System.out.println("4 - Venda a Prazo 60 dias - mesmo preço");
System.out.println("5 - Venda a Prazo 90 dias - acréscimo de 5%");
System.out.println("6 - Venda com cartão de débito - desconto de 8%");
System.out.println("7 - Venda com cartão de crédito - desconto de 7%");

System.out.println("Qual sua escolha?");
opcao = teclado.nextLine();

desconto10 = (valordavenda*10)/100;
desconto5_30 = (valordavenda*5)/100;
semdesconto = valordavenda;
acrecimo5_90 = (valordavenda*5)/100;
desconto8 = (valordavenda*8)/100;
desconto7 = (valordavenda*7)/100;

teclado.close();

if(opcao.equals ("1")){
    valortotal= valordavenda -(desconto10);
    System.out.println("valor da sua compra é: " + valortotal);
}
else if(opcao.equals("2")){
    valortotal = valordavenda - (desconto5_30);
    System.out.println("valor da sua compra é: " + valortotal);
}
if (opcao.equals("3")){
    valortotal = valordavenda = semdesconto;
    System.out.println("valor da sua compra é: " + valortotal);
}
else if (opcao.equals("4")){
    valortotal = valordavenda + (acrecimo5_90);
    System.out.println("valor da sua compra é: " + valortotal);
}
if (opcao.equals("5")){
    valortotal = valordavenda - (desconto8);
    System.out.println("valor da sua compra é: " + valortotal);
}
else if (opcao.equals("6")){
    valortotal = valordavenda - (desconto7);
    System.out.println("valor da sua compra é: " + valortotal);
}


    }
}