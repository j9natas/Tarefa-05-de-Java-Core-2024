package core_5_atividades;

import java.util.Scanner;

public class LER_DOIS_VALORES06 {

	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.println("Digite o primeiro valor: ");
        double valor1 = scanner.nextDouble();
        
        System.out.println("Digite o segundo valor: ");
        double valor2 = scanner.nextDouble();
        

        double maiorValor;
        if (valor1 > valor2) {
            maiorValor = valor1;
        } else {
            maiorValor = valor2;
        }
        
       
        System.out.println("O maior valor é: " + maiorValor);
        
    
        scanner.close();
    }
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

