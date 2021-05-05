package lista1;

import java.util.Scanner;

public class idadedias {
	public static void main(String[] args) {
			  Scanner leia = new Scanner(System.in);
			    
			  int anos;
			  int meses;
			  int dias;
			  int xdias;

			  System.out.println("Quantos anos você tem? ");
			  anos = leia.nextInt();

			  System.out.println("E quantos meses? ");
			  meses = leia.nextInt();

			  System.out.println("E quantos dias? ");
			  dias = leia.nextInt();
			  
			  xdias = dias + (meses*30) + (anos*365);
			  System.out.println("Sua idade em dias é "+xdias+" dias!");;
		

	}
}
