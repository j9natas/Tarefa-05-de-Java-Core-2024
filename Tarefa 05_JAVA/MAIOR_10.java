package core_5_atividades;

import java.util.Scanner;

public class MAIOR_10 {

	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        
        
        if(scanner.hasNextInt()) {
            int numero = scanner.nextInt();
            
            if(numero > 10) {
                System.out.println("É MAIOR QUE 10!");
            } else {
                System.out.println("NÃO É MAIOR QUE 10!");
            }
        } else {
            System.out.println("Por favor, insira um número inteiro válido.");
        }
        
        
        scanner.close();
    }
}

