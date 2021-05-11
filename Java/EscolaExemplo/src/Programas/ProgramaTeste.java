package Programas;

import java.util.Scanner;

import Classes.Basico;
import Classes.Estudante;

public class ProgramaTeste {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		 
		Estudante aluno1 = new Estudante(3, "27152731623");
		Estudante aluno2 = new Estudante(2, "283871313", true);
		
		System.out.println("Digite o nome do aluno 1: ");
		String nome = leia.next();
		aluno1.setNome(nome);
		System.out.println("Digite a nota do aluno 1: ");
		double nota = leia.nextDouble();
		aluno1.adicionarNota(nota);
		System.out.println("Matr�cula: " + aluno1.getMatricula()+"\nNome: "+aluno1.getNome()+ "\nNota: "+ aluno1.getPontos());
	
		
		int tipo;
		int notaTotal=0;
		int matricula=0;
		String cpf;
		int status=0;
		double pontos;
		boolean status1;
		char movimento;
		
		
		
		
		System.out.println("ESCOLA...");
		System.out.println("\nSlogan...");
		System.out.println("\n1 - B�SICO\n2 - M�DIO\n3 - GRADUA��O\n4 - P�S\n5 - MESTRADO\n6 - SAIR\n");
		System.out.println("DIGITE O C�DIGO DA OP��O SELECIONADA: ");
		tipo = leia.nextInt();
		
		System.out.println();

		System.out.println("ESCOLA...");
		System.out.println("\nSlogan...\n");
		System.out.println(tipo);
		
		
		do {
			switch (tipo)
		
			{
				case 1:		
				System.out.println("ENSINO B�SICO");
				System.out.println("\nMatr�cula: ");
				matricula = leia.nextInt();
				System.out.println("\nCPF: ");
				cpf = leia.next();
				System.out.println("\nStatus: 1 - Ativa 2 - Inativa");
				status = leia.nextInt();
				if (status == 1) {
					status1 = true;
				} else {
					status1 = false;
				}
				System.out.println("\nDigite o dia do seu anivers�rio: ");
				int diaAniversario = leia.nextInt();
				Basico alunoBasico = new Basico(matricula, cpf, status1, diaAniversario);
				int movimentos= 1;
				while (movimentos <=10) {
					System.out.printf("\nTotal atual: %.2f ", alunoBasico.getPontos());
					System.out.printf("\nMOVIMENTO  - Digite I (inclus�o de nota) ou R (retirada nota): ");
					movimento = leia.next().toUpperCase().charAt(0);
					System.out.println("Digite o valor do movimento: ");
					pontos = leia.nextDouble();
					if (movimento == 'I') {
						alunoBasico.adicionarNota(pontos);
					} 
					else if(movimento == 'R'){
						alunoBasico.tirarNota(pontos);
					}
					movimentos++;

				}
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
