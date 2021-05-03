programa
{
	
	funcao inicio()
	{
		 inteiro anos
		 inteiro meses
		 inteiro dias
		 inteiro xdias

		 escreva("Quantos anos você tem?\n")
		 leia(anos)
		 escreva("E quantos meses?\n")
		 leia(meses)
		 escreva("E quantos dias?\n")
		 leia(dias)
		 
		 xdias= dias + (meses*30) + (anos*365)

		 escreva("Sua idade é de "+xdias+" dias!")
		 
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 356; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */