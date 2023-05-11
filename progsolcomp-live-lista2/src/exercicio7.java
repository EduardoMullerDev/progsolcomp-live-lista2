/* Nome do Aluno: Eduardo Muller da Rosa
* RA:1292315363
* Nome do Programa:Faça um programa calcula o total de uma hospedagem em um
hotel. Ele cobra R$ 60.00 a diária e mais uma taxa de serviço:
R$ 5.50 por diária, se o número de diárias for maior que 15;
R$ 6.00 por diária, se o número de diárias for igual a 15;
R$ 8.00 por diária, se o número de diárias for menor que 15.
* Data:09/05/2023
*/

import java.util.Scanner;

class exercicio7{
	public static void main(String[] args){
		
        double valor = 60, valorMais15Dias = 5.5, valor15Dias = 6.0, valorMenos15Dias = 8.0; 
		int diarias = 0; 
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o número de diárias : ");
		diarias = teclado.nextInt();
		teclado.close();

		valor *= diarias;
		if(diarias > 15){
			valor += (diarias * valorMais15Dias);
		}	
		else if(diarias == 15){
			valor += (diarias * valor15Dias);
		}
		else{
			valor += (diarias * valorMenos15Dias);
		}
		System.out.println("Valor a ser cobrado : " + valor);
	}
}
