package java.poo.objetos;

import java.util.Scanner;

public class ClienteObjeto {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		Cliente novo = new Cliente();
		
		
		
		
		{
			System.out.print("Qual seu nome? ");
			novo.nome = leia.nextLine();
			
			System.out.print("Em que ano nasceu? ");
			novo.anoNascimento = leia.nextInt();
			
			System.out.print("Como você se identifica? [M - Masculino | F - feminino | O - outro] ");
			novo.genero = leia.next().toUpperCase().charAt(0);
			
			System.out.println();
			
			System.out.printf("Nome: %s\n", novo.nome);
			novo.calculaIdade();
			System.out.printf("\nGenero: %c\n", novo.genero);
			
			leia.close();

	}

}
