programa
{
	inclua biblioteca Matematica -->mat
	
	 funcao inicio () {
	
	
		real x1
		real x2
		real y1
		real y2
		real parenteses1
		real parenteses2
		real parenteses
		real d

		escreva("Digite o valor do ponto x1: ")
		leia(x1)
		escreva("Digite o valor do ponto x2: ")
		leia(x2)
		escreva("Digite o valor do ponto y1: ")
		leia(y1)
		escreva("Digite o valor do ponto y2: ")
		leia(y2)
		
		
		parenteses1= (x2-x1)*(x2-x1)
		parenteses2= (y2-y1)*(y2-y1)
		parenteses= parenteses1+parenteses2
		d= mat.raiz (parenteses, 2.0)

		escreva("A distância entre os pontos x e y é "+d+" metros.")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 602; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */