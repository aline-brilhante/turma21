package lista3;

import java.util.Scanner;

public class Tarefa5 {

	public static void main(String[] args) {
		/* Crie um programa que leia um n�mero do teclado 
		 * at� que encontre um n�mero igual a zero. No final, 
		 * mostre a soma dos n�meros digitados.(DO...WHILE)
		 */

		Scanner leia = new Scanner(System.in);

		int numero=1;
		int soma=0;
		
		
		while(numero!=0)
		{
			System.out.println("\nDigite um n�mero diferente de 0: ");
			numero = leia.nextInt();
			soma = numero + soma;
		}
		
		System.out.printf("A soma dos n�meros �: %d", soma);

	}

}
