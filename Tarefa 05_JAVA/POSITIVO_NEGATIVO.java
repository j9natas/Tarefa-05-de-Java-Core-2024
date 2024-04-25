package core_5_atividades;

import java.util.Scanner;

public class POSITIVO_NEGATIVO {

	
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Digite um número: ");
	        int numero = scanner.nextInt();
	        
	        if(numero >= 0) {
	            System.out.println("O número é positivo.");
	        } else {
	            System.out.println("O número é negativo.");
	        }
	        
	       
	        scanner.close();
	    }
	}
	
	
	
	
	
	
	
	
	
	
	
	

