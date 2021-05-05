programa
{
	
	funcao inicio()
	{

		real fab
		real distribuidor
		real impostos
		real consumidor
		
		escreva("Insira o valor de fábrica do automóvel:")
		leia(fab)

		distribuidor=(fab*0.28)
		impostos=(fab*0.45)
		consumidor=fab+distribuidor+impostos

		escreva("O valor do automóvel para o consumidor é de "+consumidor+"reais.")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 332; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */