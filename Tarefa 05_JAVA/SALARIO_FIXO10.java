package core_5_atividades;

import java.util.Scanner;

public class SALARIO_FIXO10 {

	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Digite o salário fixo do vendedor: ");
        double salarioFixo = scanner.nextDouble();
        
        System.out.println("Digite o valor das vendas efetuadas pelo vendedor: ");
        double valorVendas = scanner.nextDouble();
        
        
        double limiteComissao3Porcento = 1500.00;
        
      
        double comissao;
        if (valorVendas <= limiteComissao3Porcento) {
            comissao = valorVendas * 0.03; // 
        } else {
            comissao = limiteComissao3Porcento * 0.03 + (valorVendas - limiteComissao3Porcento) * 0.05;
            
        }
        
      
        double salarioTotal = salarioFixo + comissao;
        
       
        System.out.println("O salário total do vendedor é: R$ " + salarioTotal);
        
        
        scanner.close();
    }
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

