package lista4;

import java.util.Scanner;

public class tarefa4 {

	public static void main(String[] args) {
		/*4- Faça um programa que leia duas matrizes 2 x 2 com valores reais. Ofereça ao usuário um
		menu de opções:
			(1) somar as duas matrizes
			(2) subtrair a primeira matriz da segunda
			(3) adicionar uma constante as duas matrizes
			(4) imprimir as matrizes
			Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada. Na terceira opção o valor
			da constante deve ser lido e o resultado da adição da constante deve ser armazenado na
			própria matriz.*/
		Scanner leia = new Scanner(System.in);
		
		double matriz[][] = new double [2][2];
		double matriz2[][] = new double [2][2];
		double matriz3[][] = new double [2][2];
		double matriz4[][] = new double [2][2];
		
		char op;
		System.out.println("Insira os valores da matriz 1: ");
		
		for(int linha=0; linha <2; linha++) 
		{
			for(int coluna=0;coluna<2;coluna++)
			{
				matriz[linha][coluna]=leia.nextDouble();
			}
			
		}
		System.out.println("Insira os valores da matriz 2: ");
		
		for(int linha=0; linha <2; linha++) 
		{
			for(int coluna=0;coluna<2;coluna++)
			{
				matriz2[linha][coluna]=leia.nextDouble();
			}
			
		}
		do
		{
		System.out.println("\nDigite um número para:\n1 - somar as duas matrizes \n2 - subtrair a primeira da segunda matriz\n3 - adicionar uma constante as duas matrizes\n4 - imprimir as matrizes:\t");
		op = leia.next().toUpperCase().charAt(0);
		if(op == '1')
		{
			System.out.println("Resultado da soma: ");
			
			for(int linha=0; linha <2; linha++) 
			{
				System.out.print("\t");
				for(int coluna=0;coluna<2;coluna++)
				{
					
					matriz3[linha][coluna]= matriz[linha][coluna]+matriz2[linha][coluna];
					System.out.print(matriz3[linha][coluna]+"\t");
				}
				
			}
			
		}
		else if(op =='2')
		{
			System.out.println("Resultado da subtração: ");
		
			for(int linha=0; linha <2; linha++) 
			{
				System.out.print("[\t");
				for(int coluna=0;coluna<2;coluna++)
				{
					
					matriz4[linha][coluna]= matriz[linha][coluna]-matriz2[linha][coluna];
					System.out.print(matriz4[linha][coluna]+"\t");
				}

			}
			
		}
		else if(op =='3')
		{
			System.out.print("Digite o valor da constante: ");
			final double VALOR = leia.nextDouble();
			for (int linha=0;linha<2; linha++) 
			{
				for (int coluna = 0; coluna<2; coluna++) 
				{
					matriz[linha][coluna]+=VALOR;
					matriz2[linha][coluna]+=VALOR;
				}
			}
			
			
		}
		
		else if(op =='4')
		{System.out.println("Matriz 1:");
			for(int linha=0; linha <2; linha++) 
			{
				System.out.print(" ");
				
				for(int coluna=0;coluna<2;coluna++)
				{
					System.out.print(matriz[linha][coluna]+"  ");
					
				}
				System.out.print(" ");
				System.out.print("\n");
			}
			
			
			System.out.println("\nMatriz 2:");
			for(int linha=0; linha <2; linha++) 
			{
				System.out.print(" ");
				for(int coluna=0;coluna<2;coluna++)
				{
					System.out.print(matriz2[linha][coluna]+"  ");
				}
				System.out.print(" ");
				System.out.print("\n");
			}
			
			System.out.println("\nMatriz 3:");
			for(int linha=0; linha <2; linha++) 
			{
				System.out.print(" ");
				for(int coluna=0;coluna<2;coluna++)
				{
					System.out.print(matriz3[linha][coluna]+"  ");
				}
				System.out.print(" ");
				System.out.print("\n");
				
			}
			System.out.println("\nMatriz 4:");
			for(int linha=0; linha <2; linha++) 
			{
				
				System.out.print(" ");
				for(int coluna=0;coluna<2;coluna++)
				{
					System.out.print(matriz4[linha][coluna]+"  ");
				}
				System.out.print(" ");
				System.out.print("\n");
			}
			break;
		}
	}
		while(op <1 || op >4);
		



	}

}
