package lista2;

import java.util.Scanner;

public class Tarefa4 {

	public static void main(String[] args) {
		
		/*Faça um programa em que permita a entrada de um número qualquer
		 *  e exiba se este número é par ou ímpar. Se for par exiba também
		 *   a raiz quadrada do mesmo; se for ímpar exiba o número elevado ao quadrado.
		 */
		
		Scanner leia = new Scanner(System.in);
		
		double numero;
		double raiz;
		double quadrado;
		
		System.out.println("Digite um número: ");
		numero = leia.nextDouble();
		
		if  (numero%2==0) {
			raiz  = Math.sqrt(numero);
			System.out.printf ("Este número é par e sua raiz quadrada é %.2f",raiz);
		}
		else {
			quadrado = (numero*numero);
			System.out.printf("Este número é ímpar e elevado ao quadrado resulta em %.2f", quadrado);
		}
		
	}

}
