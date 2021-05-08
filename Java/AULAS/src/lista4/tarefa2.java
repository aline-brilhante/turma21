package lista4;

import java.util.Scanner;

public class tarefa2 {

	public static void main(String[] args) {
/*2- Faça um programa que receba 6 números inteiros e mostre: 
• Os números pares digitados;  
• A soma dos números pares digitados; 
• Os números ímpares digitados; 
• A quantidade de números ímpares digitados.
*/
		Scanner leia = new Scanner(System.in);

		int vetor[] = new int [6];
		int par [] = new int [6];
		int somaPar=0;
		int impar [] = new int [6];
		int impares=0;
		
		for (int i=0; i<vetor.length; i++) 
		{
			System.out.println("Digite um número inteiro: ");
			vetor[i] = leia.nextInt();
			
			if ((vetor[i]%2)==0) 
			{
				par [i] = vetor[i];
				somaPar = somaPar + vetor [i];
				
			}
			else
			{
				impares++;
				impar [i] = vetor[i];
			}
		}
		
		System.out.println("\nNúmeros pares: ");
		
		for (int i : par) 
		{
			if (i != 0)
			{
				System.out.printf("%d ", i);
			}
					
		}
		
		System.out.println("\nNúmeros ímpares: ");
		
		for (int i : impar) 
		{
			if (i != 0)
			{
				System.out.printf(" %d ", i);
			}
					
		}
		
		System.out.printf("\nSoma dos números pares: %d", somaPar);
		System.out.printf("\nQtde de números ímpares: %d", impares);
		
	}
}