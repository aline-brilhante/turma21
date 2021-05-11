package lista5;

import java.util.Scanner;

import lista5objetos.ClienteObjeto;

public class Cliente {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		ClienteObjeto cliente1 = new ClienteObjeto();
		
		System.out.println("Nome do cliente: ");
		cliente1.nome = leia.nextLine();
		
		System.out.println("CPF do cliente: ");
		cliente1.cpf = leia.nextLine();
		
		System.out.println("Gastos do primeiro mês: ");
		cliente1.mes1 = leia.nextInt();
		
		System.out.println("Gastos do segundo mês: ");
		cliente1.mes2 = leia.nextInt();
		
		System.out.println();
		
		cliente1.mostraNome();
		cliente1.mostraCpf();
		cliente1.totalCompras();
		
	}

}
