package lista2;

import java.util.Scanner;

public class Tarefa4 {

	public static void main(String[] args) {
		
		/*Fa�a um programa em que permita a entrada de um n�mero qualquer
		 *  e exiba se este n�mero � par ou �mpar. Se for par exiba tamb�m
		 *   a raiz quadrada do mesmo; se for �mpar exiba o n�mero elevado ao quadrado.
		 */
		
		Scanner leia = new Scanner(System.in);
		
		double numero;
		double raiz;
		double quadrado;
		
		System.out.println("Digite um n�mero: ");
		numero = leia.nextDouble();
		
		if  (numero%2==0) {
			raiz  = Math.sqrt(numero);
			System.out.printf ("Este n�mero � par e sua raiz quadrada � %.2f",raiz);
		}
		else {
			quadrado = (numero*numero);
			System.out.printf("Este n�mero � �mpar e elevado ao quadrado resulta em %.2f", quadrado);
		}
		
	}

}
