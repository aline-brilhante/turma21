package lista2;

import java.util.Arrays;
import java.util.Scanner;

public class Tarefa2 {

	public static void main(String[] args) {
		//Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.

		Scanner leia = new Scanner(System.in);

		int[] numeros = new int[3];
		
		for (int i = 0; i < numeros.length; i++)
		{
			System.out.println("Digite um n�mero: ");
			 numeros[i] = leia.nextInt();
			 
		}
		
		Arrays.sort(numeros);
		
		System.out.println("Ordem crescente dos n�meros ");
		
		for(int i = 0; i < numeros.length; i++) 
		{
			System.out.print(numeros[i]);	
		}
		
		
	}

}
