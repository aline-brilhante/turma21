package lista2;

import java.util.Scanner;

public class Tarefa1 {

	public static void main(String[] args) {
		
		 //Faça um programa que receba três inteiros e diga qual deles é o maior.
		
		Scanner leia = new Scanner(System.in);
		
		int[] numeros = new int[3];
		int maiorNumero = 0;
		
		
		
		
		 for (int i = 0; i < 3; i++)
		 {
			 System.out.println("Digite um número: ");
			 numeros[i] = leia.nextInt();
				
	            if (numeros[i] > maiorNumero) 
	            {
	            	maiorNumero = numeros[i];
	            }
	         
	        }
		 
		 System.out.println("\nMaior número: "+ maiorNumero);

	}

}
