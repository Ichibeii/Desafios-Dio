/*Você está desenvolvendo um programa simples em Java para verificar se uma conta bancária ultrapassou o limite do cheque especial. 
 * A aplicação solicitará ao cliente que informe o saldo atual da conta bancária. 
 * Em seguida, o programa pedirá o valor de um saque que o cliente deseja realizar.
 * O limite do cheque especial será definido como 500 unidades monetárias.
 */


package dio;

import java.util.Scanner;

public class desafio_4 {

	public static void main(String[] args) { 
        Scanner teclado = new Scanner(System.in); 

        double saldo = teclado.nextDouble(); 
        double saque = teclado.nextDouble(); 
        double limiteChequeEspecial = 500; 

        if (saque <= saldo) {
        	System.out.println("Transacao realizada com sucesso");
            } else if (saque <= (saldo + limiteChequeEspecial)){
            	System.out.println("Transação realizada com sucesso utilizando o cheque especial.");
            } else {
            	System.out.println("Transação não realizada. Limite do cheque especial excedido.");
            }
        teclado.close();
        }

    }

