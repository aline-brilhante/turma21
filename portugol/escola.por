programa
{
	
	funcao inicio()
	
	{
		caracter tipo
		inteiro notaTotal=0
		inteiro matricula=0
		inteiro cpf=0
		inteiro status=0
		inteiro pontos [10]
		
		
		
		
		
		
		
		escreva("ESCOLA...")
		escreva("\nSlogan...")
		escreva("\n1 - BÁSICO\n2 - MÉDIO\n3 - GRADUAÇÃO\n4 - PÓS\n5 - MESTRADO\n6 - SAIR\n")
		escreva("DIGITE O CÓDIGO DA OPÇÃO SELECIONADA: ")
		leia(tipo)

		limpa()

		
		escreva("ESCOLA...")
		escreva("\nSlogan...\n")
		tipoEnsino(tipo)
		escreva("\nMatrícula: ")
		leia(matricula)
		escreva("\nCPF: ")
		leia(cpf)
		
		escreva("\nStatus: 1 - Ativa 2 - Inativa")
		leia(status)

		se (status==1){
			escreva("\nTotal atual: "+notaTotal)
			escreva("\nMOVIMENTO: I-inclusão ou R-retirada de nota: ")
			escreva("\nValor movimento: ")
			escreva("\nContinuar S/N: ")
			
		}
		senao {
			
		}
		
		
		

		
	}
	
		funcao tipoEnsino(caracter tipo){
		escolha (tipo)
		{
			caso '1':		
			escreva ("ENSINO BÁSICO")
			pare
	
			caso '2':		
			escreva ("ENSINO MÉDIO")
			pare
	
			caso '3':		
			escreva ("GRADUAÇÃO")
			pare
	
			caso '4':		
			escreva ("\nPÓS GRADUAÇÃO")
			pare
	
			caso '5':		
			escreva ("\nMESTRADO")
			pare
			
			caso contrario:
			escreva ("Saindo do sistema de pontos da escola")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 762; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */