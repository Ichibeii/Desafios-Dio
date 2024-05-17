/*Você está desenvolvendo um programa simples em Java para auxiliar um cliente a realizar saques de uma conta bancária. 
 *O cliente pode fazer saques até atingir um limite diário predefinido.
 */

package dio;

import java.util.Scanner;

public class desafio_5 {

	public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); 

        double limiteDiario = teclado.nextDouble();
        
        for (double i = 0; i < limiteDiario; i++) {
        	double saque = teclado.nextDouble();
        	if (saque == 0) {
				System.out.println("Transacoes encerradas.");
				i = limiteDiario;
            } else if ( saque > limiteDiario) {
            	System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
            	i = limiteDiario;
        } else {
        	limiteDiario = limiteDiario - saque;
        	System.out.println("Saque realizado. Limite restante: " + limiteDiario);
        }
    }
    teclado.close(); 
}
}
