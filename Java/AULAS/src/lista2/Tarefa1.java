package lista2;

import java.util.Scanner;

public class Tarefa1 {

	public static void main(String[] args) {
		
		 //Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
		
		Scanner leia = new Scanner(System.in);
		
		int[] numeros = new int[3];
		int maiorNumero = 0;
		
		
		
		
		 for (int i = 0; i < 3; i++)
		 {
			 System.out.println("Digite um n�mero: ");
			 numeros[i] = leia.nextInt();
				
	            if (numeros[i] > maiorNumero) 
	            {
	            	maiorNumero = numeros[i];
	            }
	         
	        }
		 
		 System.out.println("\nMaior n�mero: "+ maiorNumero);

	}

}
