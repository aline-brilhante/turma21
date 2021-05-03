programa
{
	
	funcao inicio()
	{

	inteiro x=0
	inteiro soma=0
	inteiro contador=1
	inteiro resultado=0
	
	escreva("Digite um número que será somado pelos seus antecessores (desde 1):\n")
	leia (x)
	

	faca {
		
		soma= x + soma
		se (contador < x)
		contador ++
		
		} enquanto (contador > 1 )
	

	escreva("A soma é "+soma) 
	
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