package lista1;

import java.util.Scanner;

public class mediaponderada {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double nota2;
		double nota3;
		double nota5;
		double notaFinal;
		
		System.out.println("Digite a nota de peso 2: ");
		nota2 = leia.nextInt();
		
		System.out.println("Digite a nota de peso 3: ");
		nota3 = leia.nextInt();
		
		System.out.println("Digite a nota de peso 5: ");
		nota5 = leia.nextInt();
		
		notaFinal = (nota2*2+nota3*3+nota5*5)/(2+3+5);
		
		System.out.println("A nota média do aluno é "+notaFinal);
		
	}

}
