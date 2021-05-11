package lista5;

import java.util.Scanner;

public class desafioRetangulo {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);

		int altura1 = 3;
		int base1 = 2;
		int altura2 = 4;
		int base2 = 3;
		int retangulo1 = 0;
		int retangulo2 = 0;
		int maior = 0;
		
		
		retangulo1 = altura1 * base1;
		retangulo2 = altura2 * base2;
		
		if (retangulo1 > retangulo2) {
			System.out.println("O retângulo 1 é maior que o retângulo 2");
		} else if (retangulo2 > retangulo1) {
			System.out.println("O retângulo 2 é maior que o retângulo 1");
		}
		
		

	}

}
