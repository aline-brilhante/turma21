package lista4;

import java.util.Scanner;

public class tarefa2 {

	public static void main(String[] args) {
/*2- Fa�a um programa que receba 6 n�meros inteiros e mostre: 
� Os n�meros pares digitados;  
� A soma dos n�meros pares digitados; 
� Os n�meros �mpares digitados; 
� A quantidade de n�meros �mpares digitados.
*/
		Scanner leia = new Scanner(System.in);

		int vetor[] = new int [6];
		int par [] = new int [6];
		int somaPar=0;
		int impar [] = new int [6];
		int impares=0;
		
		for (int i=0; i<vetor.length; i++) 
		{
			System.out.println("Digite um n�mero inteiro: ");
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
		
		System.out.println("\nN�meros pares: ");
		
		for (int i : par) 
		{
			if (i != 0)
			{
				System.out.printf("%d ", i);
			}
					
		}
		
		System.out.println("\nN�meros �mpares: ");
		
		for (int i : impar) 
		{
			if (i != 0)
			{
				System.out.printf(" %d ", i);
			}
					
		}
		
		System.out.printf("\nSoma dos n�meros pares: %d", somaPar);
		System.out.printf("\nQtde de n�meros �mpares: %d", impares);
		
	}
}