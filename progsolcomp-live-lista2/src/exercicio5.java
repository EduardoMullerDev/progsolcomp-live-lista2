/* Nome do Aluno: Eduardo Muller da Rosa
* RA:1292315363
* Nome do Programa:Faça um programa que leia o nome, o sobrenome, a idade, em
anos, e a naturalidade (cidade de nascimento) de uma pessoa.
Depois, o programa deve dar a seguinte opção “Deseja
visualizar dados completos?”. Se o caractere digitado pelo
usuário for ‘S’ o programa deve imprimir na tela Nome,
Sobrenome, idade e naturalidade. Se o caractere digitado pelo
usuário for ‘N’ o programa deve imprimir o Nome e a idade. Se
o caractere não for nenhuma das outras opções acima o programa
deve imprimir “Digitação errada. Tente Novamente”.
* Data:08/05/2023
*/


import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        
    
        Scanner teclado = new Scanner(System.in);
        System.out.println("Por favor, digite seu nome ");
        String nome = teclado.next();
        System.out.println("Por favor, digite seu sobrenome ");
        String sobrenome = teclado.next();
        System.out.println("Por favor, digite sua idade ");
        int idade = teclado.nextInt();
        System.out.println("Por favor, digite onde você nasceu(cidade) ");
        String naturaliadade = teclado.next();
        System.out.println("Deseja visualizar dados completos? escreva (S) pra sim e (N) pra não");
        String opcao = teclado.next();
    
        teclado.close();

    
        if(opcao.equals("s")){
            System.out.println(nome + " " + sobrenome);
            System.out.println(naturaliadade);
            System.out.println(idade + " anos");
        }
        
        else if (opcao.equals("n")){
            System.out.println(nome);
            System.out.println(idade + " anos");
        }
        
        else{
            System.out.println("Digitação errada. Tente Novamente");
        }
        
        
    }
    
}