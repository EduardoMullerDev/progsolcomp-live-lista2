/* Nome do Aluno: Eduardo Muller da Rosa
* RA:1292315363
* Nome do Programa:Construa um programa que receba como entrada três valores A, B
e C e os imprima em ordem crescente.
* Data:08/05/2023
*/
import java.util.Scanner;
public class exercicio2 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o primeiro número");
        int a = teclado.nextInt();
        
        System.out.println("Digite o segundo número");
        int b = teclado.nextInt();
        
        System.out.println("Digite o terceiro número");
        int c = teclado.nextInt();
        teclado.close();
     
    if (a <= b && b <= c)
    {
        System.out.printf("A ordem crescente: %d %d %d\n", a, b, c);
    }

  else if (a <= c && c <= b)
    {
        System.out.printf("A ordem crescente: %d %d %d\n",a, c, b);
    }

  else if (b <= a && a <= c)
    {
        System.out.printf("A ordem crescente: %d %d %d\n", b, a, c);
    }

  else if (b <= c && c <= a) 
    {
        System.out.printf("A ordem crescente: %d %d %d\n", b, c, a);
    }

  else if (c <= a && a <= b) 
    {
        System.out.printf("A ordem crescente: %d %d %d\n", c, a, b);
    }

  else 
    {
        System.out.printf("A ordem crescente: %d %d %d\n", c, b, a );
    }
   
   
    }
}
