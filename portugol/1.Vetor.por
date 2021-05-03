programa
{
	
	funcao inicio()
	{
	/*Faça um programa que crie um vetor por leitura com 5 valores 
	de pontuação de uma atividade e o escreva em seguida. 
	Encontre após a maior pontuação e a apresente. */

		//variaveis

		inteiro notas[5]
		inteiro maiorNota = 0

		para (inteiro x=0; x<5; x++){
			escreva("Digite a nota: \n")
			leia(notas[x])
			}

		limpa()

		para(inteiro x=0; x<5; x++){
			se (notas[x]>maiorNota){
				maiorNota = notas[x]
			}

			escreva("\nNota " + (x+1) + ": " + notas[x])
			
		}
		
		escreva("\nMaior nota: "+ maiorNota)

		//entradas
		//processamento
		//saidas
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 490; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */