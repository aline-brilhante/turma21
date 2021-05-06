package lista3;

import java.util.Scanner;

public class Tarefa2 {

	public static void main(String[] args) {
		//Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)

		Scanner leia = new Scanner(System.in);

		int numero= 0;
		int par=0;
		int impar=0;
		int pares=0;
		int impares=0;
		
		for (int x=0; x<3; x++) {
		
		System.out.println("\nDigite um número: ");
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

		
		System.out.printf("\nNúmeros pares: %d",pares);
		System.out.printf("\nNúmeros ímpares: %d",impares);

	}

}
