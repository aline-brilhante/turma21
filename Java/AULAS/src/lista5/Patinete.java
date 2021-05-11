package lista5;

import java.util.Scanner;

import lista5objetos.PatineteObjeto;

public class Patinete {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		PatineteObjeto patinete1 = new PatineteObjeto();
		
		System.out.println("\nQual a cor do patinete? ");
		patinete1.cor = leia.next();
		
		System.out.println("\nPossui motor? (1 - SIM | 2 - N�O): ");
		patinete1.motor = leia.nextInt() == 1 ? true : false;
		
		System.out.println("\nPossui guid�o? (1 - SIM | 2 - N�O): ");
		patinete1.guidao = leia.nextInt() == 1 ? true : false;
		
		System.out.println("Quantas rodas o patinete possui? ");
		patinete1.rodas = leia.nextInt();
		
		System.out.println("Quantos kil�metros j� percorreu em velocidade m�xima? ");
		patinete1.distancia = leia.nextDouble();
		
		System.out.println("Em quantas horas? ");
		patinete1.tempo = leia.nextDouble();
		
		System.out.println();
		
		System.out.println("\nA cor do patinete � " + patinete1.cor);
		System.out.println( patinete1.motor ? "\nMotor: SIM" : "\nMotor: N�O");
		System.out.println(patinete1.guidao ? "\nGuid�o: SIM" : "\nGuid�o: N�O");
		System.out.println("\nO patinete possui " + patinete1.rodas + " rodas");
		patinete1.velocidade();
		
	}

}
