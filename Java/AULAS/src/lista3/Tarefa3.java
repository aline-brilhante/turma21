package lista3;

import java.util.Scanner;

public class Tarefa3 {

	public static void main(String[] args) {
		/* Solicitar a idade de várias pessoas e imprimir:
		 * Total de pessoas com menos de 21 anos. Total de pessoas
		 * com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)
		 */
		Scanner leia = new Scanner(System.in);
		
		int idade=0;
		int totalPessoas21=0;
		int totalPessoas50=0;
		
		while (idade != -99)
		{
			System.out.println("Digite sua idade: ");
			idade = leia.nextInt();
			
			if (idade < 21)
			{
				totalPessoas21 ++;

				
			} else if (idade > 50)
			{
				totalPessoas50++;
			}
		}
		
		System.out.printf("Pessoa com menos de 21: %d", totalPessoas21);
		System.out.printf("\nPessoa com mais de 50: %d", totalPessoas50);


	}

}
