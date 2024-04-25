package core_5_atividades;

import java.util.Scanner;

public class LER_NOTAS04 {

	
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        
	        System.out.println("Digite a nota da 1ª avaliação: ");
	        double nota1 = scanner.nextDouble();
	        
	        System.out.println("Digite a nota da 2ª avaliação: ");
	        double nota2 = scanner.nextDouble();
	        
	        
	        double media = (nota1 + nota2) / 2;
	        
	      
	        if (media >= 6.0) {
	            System.out.println("Parabéns! Você foi aprovado.");
	        } else {
	            System.out.println("Você não foi aprovado.");
	        }
	        
	      
	        System.out.println("Média: " + media);
	        
	       
	        scanner.close();
	    }
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

