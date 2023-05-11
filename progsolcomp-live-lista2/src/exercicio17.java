/* Nome do Aluno: Eduardo Muller da Rosa
* RA:1292315363
* Nome do Programa: * Faça um programa que imprima os múltiplos negativos de 7,
superiores a -1000. (utilize do / while)
* Data:11/05/2023
*/


public class exercicio17 {
    
    
        public static void main(String[] args) {
    
            int i= -1;
            
            do{
                if(i % 7 == 0){
                    System.out.print(i + " ");
                }
               
                i = i-1;
            } 
            while (i > -1000) ;
            
        }
    }


