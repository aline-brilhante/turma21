package lista2;

import java.util.Arrays;
import java.util.Scanner;

public class teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
