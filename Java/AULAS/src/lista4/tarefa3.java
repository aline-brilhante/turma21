package lista4;

import java.util.Random;

public class tarefa3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.
		
		Random random = new Random();
		int[][] matriz = new int[3][3];
		int maior10 = 0;
		
		System.out.println("Valores da matriz: ");
		for (int linha = 0; linha < 3; linha++) 
		{
			for (int coluna = 0; coluna < 3; coluna++) 
			{
				matriz[linha][coluna]=random.nextInt(20);
				System.out.print(matriz[linha][coluna] + "\t");
			}
			System.out.println();
		}
		
		for (int linha = 0; linha < 3; linha++) 
		{
			for (int coluna = 0; coluna < 3; coluna++) 
			{
				if (matriz[linha][coluna] > 10) {
					maior10++;
				}	
			}
		}
		
		System.out.printf("\nA matriz 3 x 3 possui %d valores maiores que 10",maior10);
 }
}
