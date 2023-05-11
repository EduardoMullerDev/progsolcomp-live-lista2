/* Nome do Aluno: Eduardo Muller da Rosa
* RA:1292315363
* Nome do Programa:Um determinado gás duplica seu volume a cada segundo. Dada um
volume inicial, em centímetros cúbicos, digitado pelo usuário
faça um programa que determine o tempo necessário para que
esse volume se torne maior que 1000 centímetros cúbicos.
(utilize while)
* Data:21/04/2023
*/

import java.util.Scanner;

public class exercicio19 {
    
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

int volumeinicial;
int volume;
int segundos = 0;

System.out.println("Digite o volume inicial em centimetros cúbicos");
volumeinicial = teclado.nextInt();
volume = volumeinicial;
teclado.close();

while (volume < 1000){
    volume *= 2;
segundos += 1;
}

System.out.printf("O volume inicial de %d cm³ se tornou maior que 1000 cm³ depois de %d segundos.", volumeinicial, segundos);

    }
}