package exemplos;

import java.util.Scanner;

public class desafioescola {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		
		int tipo;
		int notaTotal=0;
		int matricula=0;
		int cpf=0;
		int status=0;
		int pontos[] = new int [10];
		
		
		
		
		System.out.println("ESCOLA...");
		System.out.println("\nSlogan...");
		System.out.println("\n1 - B�SICO\n2 - M�DIO\n3 - GRADUA��O\n4 - P�S\n5 - MESTRADO\n6 - SAIR\n");
		System.out.println("DIGITE O C�DIGO DA OP��O SELECIONADA: ");
		tipo = leia.nextInt();
		
		System.out.println();

		System.out.println("ESCOLA...");
		System.out.println("\nSlogan...\n");
		System.out.println(tipo);
		
		System.out.println("\nMatr�cula: ");
		matricula = leia.nextInt();
		System.out.println("\nCPF: ");
		cpf = leia.nextInt();
		
		System.out.println("\nStatus: 1 - Ativa 2 - Inativa");
		status = leia.nextInt();
		
		if (status==1){
			System.out.println("\nTotal atual: "+notaTotal);
			System.out.println("\nMOVIMENTO: I-inclus�o ou R-retirada de nota: ");
			System.out.println("\nValor movimento: ");
			System.out.println("\nContinuar S/N: ");
			
		}
		else {
			
		}
		
		do {
			switch (tipo)
		
			{
				case '1':		
				System.out.println("ENSINO B�SICO");
				break;
		
				case '2':		
				System.out.println("ENSINO M�DIO");
				break;
		
				case '3':		
				System.out.println("GRADUA��O");
				break;
		
				case '4':		
				System.out.println("\nP�S GRADUA��O");
				break;
		
				case '5':		
				System.out.println("\nMESTRADO");
				break;
				
				case '6':
				System.out.println("Saindo do sistema de pontos da escola");
			}
			
		 } while (tipo >=1 && tipo >=6);
		
		
	}

}
