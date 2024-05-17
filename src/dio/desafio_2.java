/*Você está desenvolvendo um programa simples em Java para verificar se um número de conta bancária é válido. 
 *O número da conta deve ter exatamente 8 dígitos.
 */

package dio;

import java.util.Scanner;

public class desafio_2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		try {

			
			String numeroConta = teclado.next();
			verificarNumeroConta(numeroConta);
		} catch (IllegalArgumentException e) {
			System.out.println(e);
		} finally {
			teclado.close();
		}
	}

	private static void verificarNumeroConta(String numeroConta) {
		if (String.valueOf(numeroConta).length() != 8) {
			System.out.println("Erro: Numero da conta invalido. Digite exatamente 8 digitos.");
		} else {
			System.out.println("Numero de conta válido.");
		}
	}
}
