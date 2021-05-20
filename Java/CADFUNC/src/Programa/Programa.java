package Programa;

import java.util.Scanner;

import Classes.Funcionario;
import Classes.Terceiro;



public class Programa {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		Funcionario funcionario = new Funcionario(null, null);
		Terceiro terceiro = new Terceiro (null, null, 0, 0, 0);
		
		
		System.out.println("Digite o nome:");
		String nome=leia.next();
		System.out.println("Digite a matrícula:");
		String matricula=leia.next();
		System.out.println("Digite o número de horas trabalhadas:");
		int horasTrabalhadas=leia.nextInt();
		System.out.println("Digite o valor da hora:");
		double salario=leia.nextDouble();
		
		System.out.println(funcionario.getNome());
		funcionario.salario();
		
		System.out.println(terceiro.getNome());
		terceiro.salario();
	}	
	

}
