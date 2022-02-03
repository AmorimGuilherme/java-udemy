package desafios_udemy;

import java.util.Scanner;

public class DesafioConversao {
	
	public static void main(String[] args) {
		
		System.out.println("\n********* DESAFIO CONVERSÃO - MÉDIA SALARIAL TRIMESTRAL *********");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("\nDigite o salário do primeiro mês: R$ ");
		String sal1 = scan.nextLine().replace("," , "."); // .replace altera o que foi pedido na String
		
		System.out.print("Digite o salário do segundo mês: R$ ");
		String sal2 = scan.nextLine().replace("," , "."); // .replace altera o que foi pedido na String
		
		
		System.out.print("Digite o salário do terceiro mês: R$ "); 
		String sal3 = scan.nextLine().replace("," , "."); // .replace altera o que foi pedido na String
		
		
		float salario1 = Float.parseFloat(sal1);
		float salario2 = Float.parseFloat(sal2);
		float salario3 = Float.parseFloat(sal3);
		
		float media = (salario1 + salario2 + salario3) / 3; 
		System.out.println("Média salarial trimestral: R$" + Float.toString(media));
		
		
		scan.close();
		
	}

}
