package lista1;

import java.util.Scanner;

public class distancia {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		

		double x1;
		double x2;
		double y1;
		double y2;
		double parenteses1;
		double parenteses2;
		double parenteses;
		double d;
		
		System.out.println("Digite o valor do ponto x1: ");
		x1 = leia.nextInt();
		System.out.println("Digite o valor do ponto x2: ");
		x2 = leia.nextInt();
		System.out.println("Digite o valor do ponto y1: ");
		y1 = leia.nextInt();
		System.out.println("Digite o valor do ponto y2: ");
		y2 = leia.nextInt();
		
		
		parenteses1= (x2-x1)*(x2-x1);
		parenteses2= (y2-y1)*(y2-y1);
		parenteses= parenteses1+parenteses2;
		d= Math.sqrt(parenteses);
		
		System.out.println("A distância entre os pontos x e y é "+d+" metros.");
		
	}

}
