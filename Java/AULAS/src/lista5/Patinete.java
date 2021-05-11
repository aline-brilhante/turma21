package lista5;

import java.util.Scanner;

import lista5objetos.PatineteObjeto;

public class Patinete {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		PatineteObjeto patinete1 = new PatineteObjeto();
		
		System.out.println("\nQual a cor do patinete? ");
		patinete1.cor = leia.next();
		
		System.out.println("\nPossui motor? (1 - SIM | 2 - NÃO): ");
		patinete1.motor = leia.nextInt() == 1 ? true : false;
		
		System.out.println("\nPossui guidão? (1 - SIM | 2 - NÃO): ");
		patinete1.guidao = leia.nextInt() == 1 ? true : false;
		
		System.out.println("Quantas rodas o patinete possui? ");
		patinete1.rodas = leia.nextInt();
		
		System.out.println("Quantos kilômetros já percorreu em velocidade máxima? ");
		patinete1.distancia = leia.nextDouble();
		
		System.out.println("Em quantas horas? ");
		patinete1.tempo = leia.nextDouble();
		
		System.out.println();
		
		System.out.println("\nA cor do patinete é " + patinete1.cor);
		System.out.println( patinete1.motor ? "\nMotor: SIM" : "\nMotor: NÃO");
		System.out.println(patinete1.guidao ? "\nGuidão: SIM" : "\nGuidão: NÃO");
		System.out.println("\nO patinete possui " + patinete1.rodas + " rodas");
		patinete1.velocidade();
		
	}

}
