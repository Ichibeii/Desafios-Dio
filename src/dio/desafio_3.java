/*Você está desenvolvendo um programa simples em Java para verificar se um cliente é elegível para criar uma conta bancária. 
 *A condição é que o cliente deve ter pelo menos 18 anos de idade.
 */

package dio;

import java.util.Scanner;

public class desafio_3 {

	public static void main(String[] args) { 
        Scanner teclado = new Scanner(System.in); 

        int idade = teclado.nextInt(); 
  if (idade <=17) {
    System.out.println("Voce nao esta elegivel para criar uma conta bancaria.");
  } else {
	  System.out.println("Voce esta elegivel para criar uma conta bancaria.");
        teclado.close(); 
    }
}
}
