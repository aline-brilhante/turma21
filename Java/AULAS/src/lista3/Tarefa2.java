package lista3;

import java.util.Scanner;

public class Tarefa2 {

	public static void main(String[] args) {
		//Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)

		Scanner leia = new Scanner(System.in);

		int numero= 0;
		int par=0;
		int impar=0;
		int pares=0;
		int impares=0;
		
		for (int x=0; x<3; x++) {
		
		System.out.println("\nDigite um n�mero: ");
		numero = leia.nextInt();
		
		if ((numero%2)==0)
		{
			par++;
			
			
		} else
		{
			impar++;
		}
		}
		
		pares = (par + pares);
		impares = (impar + impares);

		
		System.out.printf("\nN�meros pares: %d",pares);
		System.out.printf("\nN�meros �mpares: %d",impares);

	}

}
