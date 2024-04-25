package core_5_atividades;

import java.util.Scanner;

public class JORNADA_DE_TRABLHO09 {

	
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.println("Digite o número de horas trabalhadas em um mês: ");
        int horasTrabalhadas = scanner.nextInt();
        
        System.out.println("Digite o salário por hora: ");
        double salarioHora = scanner.nextDouble();
       
        
        int jornadaSemanal = 40;
        int semanasPorMes = 4;
        
       
        double salarioTotalSemExtras = horasTrabalhadas * salarioHora;
        
   
        int horasExtras = Math.max(horasTrabalhadas - (jornadaSemanal * semanasPorMes), 0);
        
     
        double salarioTotalComExtras = salarioTotalSemExtras + (horasExtras * salarioHora * 1.5);
        
        
        System.out.println("O salário total do funcionário é: R$ " + salarioTotalComExtras);
        
      
        scanner.close();
    }
}
	
	
	
	
	
	
	
	
	
	

