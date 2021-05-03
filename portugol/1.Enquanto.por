programa
{
	
	funcao inicio()
	{	

		
		
		inteiro numero=0, soma=0, media=0, contador=0


		enquanto (numero>=0){
			escreva("Digite um número positivo para obter a sucessiva soma e média,\ncaso deseje parar, digite um número negativo:\n")
			leia(numero)
			soma= soma + numero

			se (numero>=0){
				contador++
			}
		}
		
		media= soma / contador
		
		
		escreva("Soma dos números: "+soma)
		escreva("\nQuantidade de números somados: "+contador)
		escreva("\nMédia da soma: "+media)
			
	
			
			

		
		
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