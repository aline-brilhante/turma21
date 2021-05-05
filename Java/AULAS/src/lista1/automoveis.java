package lista1;

import java.util.Scanner;

public class automoveis {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double fab;
		double distribuidor;
		double impostos;
		double consumidor;
		
		System.out.println("Insira o valor de fábrica do automóvel:");
		fab = leia.nextDouble();
		
		distribuidor=(fab*0.28);
		impostos = (fab*0.45);
		consumidor = fab+distribuidor+impostos;
		
		System.out.println("O valor do automóvel para o consumidor é de "+consumidor+"reais.");
		
	}

}
