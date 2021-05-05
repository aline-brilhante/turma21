package lista2;

import java.util.Arrays;
import java.util.Scanner;

public class Tarefa2 {

	public static void main(String[] args) {
		//Faça um programa que entre com três números e coloque em ordem crescente.

		Scanner leia = new Scanner(System.in);

		int[] numeros = new int[3];
		
		for (int i = 0; i < numeros.length; i++)
		{
			System.out.println("Digite um número: ");
			 numeros[i] = leia.nextInt();
			 
		}
		
		Arrays.sort(numeros);
		
		System.out.println("Ordem crescente dos números ");
		
		for(int i = 0; i < numeros.length; i++) 
		{
			System.out.print(numeros[i]);	
		}
		
		
	}

}
