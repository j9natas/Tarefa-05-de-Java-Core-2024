package core_5_atividades;

import java.util.Scanner;

public class INICIO_FIM08 {

	
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        

	        System.out.println("Digite a hora de início do jogo (entre 0 e 23): ");
	        int horaInicio = scanner.nextInt();
	        
	        System.out.println("Digite a hora de fim do jogo (entre 0 e 23): ");
	        int horaFim = scanner.nextInt();
	        
	        int duracao;
	        if (horaInicio <= horaFim) {
	            duracao = horaFim - horaInicio;
	        } else {
	            duracao = (24 - horaInicio) + horaFim;
	        }
	        
	        
	        System.out.println("A duração do jogo é de " + duracao + " horas.");
	        
	      
	        scanner.close();
	    }
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

