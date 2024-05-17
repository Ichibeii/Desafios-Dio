/*Você está desenvolvendo um programa simples em Java para simular operações bancárias básicas. 
 *A aplicação deve permitir ao usuário realizar depósitos, saques e consultar o saldo em uma conta bancária virtual.
 */

package dio;

import java.util.Scanner;

public class desafio_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double saldo = 0;

		while (true) {

			int opcao = scanner.nextInt();
			scanner.nextLine();
			switch (opcao) {
			case 1:
				double dep = scanner.nextDouble();
				saldo = saldo + dep;
				System.out.println("Saldo atual: " + saldo);
				break;
			case 2:
				double saq = scanner.nextDouble();
				if (saldo < saq) {
					System.out.println("Saldo insuficiente.");
				} else {
					saldo = saldo - saq;
					System.out.println("Saldo atual: " + saldo);
				}
				break;
			case 3:
				System.out.println("Saldo atual: " + saldo);
				break;
			case 0:
				System.out.println("Programa encerrado.");
				saldo = 0;
				return;

			default:
				System.out.println("Opção inválida. Tente novamente.");
			}
		}
	}
}