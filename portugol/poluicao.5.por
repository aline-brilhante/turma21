programa
{
	
	funcao inicio()
	{
		real poluicao
		
		escreva("Digite o índice de poluição medido:\n")
		leia(poluicao)

		se (poluicao<=0.25) {
			escreva("Índice de poluição aceitável.")
		}
		senao se(poluicao>0.25 e poluicao<0.3){
			escreva("Índice de poulição acima do aceitável.")
		}
		senao se(poluicao>=0.3 e poluicao <0.4){
			escreva("As indúdtrias do 1º grupo devem suspender atividades.")
		}
		senao se(poluicao>=0.4 e poluicao <0.5){
			escreva("As indúdtrias do 1º e do 2º grupo devem suspender atividades.")
		}
		senao se(poluicao>=0.5){
			escreva("As indúdtrias do 1º, 2º e 3º grupo devem suspender atividades.")
		}
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 0; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */