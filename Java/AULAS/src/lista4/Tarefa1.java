package lista4;

import java.util.Scanner;

public class Tarefa1 {

	public static void main(String[] args) {
/*1- Fa�a um programa que possua um vetor denominado A que armazene 6 n�meros inteiros.
 *  O programa deve executar os seguintes passos: 
(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. 
(b) Armazene em uma vari�vel inteira (simples) a soma entre os valores das posi��es
 A[0], A[1] e A[5] do vetor e mostre na tela esta soma. 
(c) Modifique o vetor na posi��o 4, atribuindo a esta posi��o o valor 100. 
(d) Mostre na tela cada valor do vetor A, um em cada linha.*/
		
		Scanner leia = new Scanner(System.in);

		int A [] = {1, 0, 5, -2, -5, 7};
		int soma = 0;
		
		System.out.println("Valores do Vetor A\n");
		
		for(int i=0; i<6 ; i++)
		{
			System.out.println(A[i]);
		}
		
		soma = (A[0] + A[1] + A[5]);		
		A[4] = 100;
		
		System.out.println("\nValores do vetor A ap�s altera��o:");
		
		for(int i=0; i<6 ; i++)
		{
			System.out.println(A[i]);
		}
		
		System.out.println("\nSoma dos vetores A[0], A[1] e A[5]:"+soma);
		
	}

}
