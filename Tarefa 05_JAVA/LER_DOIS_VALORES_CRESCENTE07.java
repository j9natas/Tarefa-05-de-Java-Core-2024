package core_5_atividades;

import java.util.Scanner;

public class LER_DOIS_VALORES_CRESCENTE07 {

	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("Digite o primeiro valor: ");
        double valor1 = scanner.nextDouble();
        
        System.out.println("Digite o segundo valor: ");
        double valor2 = scanner.nextDouble();
        
        
        if (valor1 > valor2) {
            double temp = valor1;
            valor1 = valor2;
            valor2 = temp;
        }
        
        
        System.out.println("Os valores em ordem crescente são: " + valor1 + ", " + valor2);
        
       
        scanner.close();
    }
}
	
	
	
	
	
	
	
	
	
	
	
	

