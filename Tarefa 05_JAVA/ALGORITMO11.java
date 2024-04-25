package core_5_atividades;

import java.util.Scanner;

public class ALGORITMO11 {

	
	
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o número da conta do cliente: ");
        String numeroConta = scanner.next();
        
        System.out.println("Digite o saldo do cliente: ");
        double saldo = scanner.nextDouble();
        
        System.out.println("Digite o débito do cliente: ");
        double debito = scanner.nextDouble();
        
        System.out.println("Digite o crédito do cliente: ");
        double credito = scanner.nextDouble();
        
        double saldoAtual = saldo - debito + credito;
        
        if (saldoAtual >= 0) {
            System.out.println("Saldo Positivo");
        } else {
            System.out.println("Saldo Negativo");
        }
        
        System.out.println("O saldo atual da conta é: " + saldoAtual);
        
        scanner.close();
    }
}
	
	
	
	
	
	
	
	
	

