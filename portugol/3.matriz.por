

programa
{
	
	funcao inicio()
	{

		inteiro N1[2][3]
		inteiro N2[2][3]
		inteiro M1[2][3]
		inteiro M2[2][3]

		para (inteiro linha = 0; linha < 2; linha++){
			para(inteiro coluna = 0; coluna < 3; coluna++){
				escreva("Digite os valores da matriz N1: ")
		 		leia (N1[linha][coluna])	
			}
		}

		limpa()
		
		escreva("\nA matriz de N1é:\n")
		para (inteiro linha=0; linha<2; linha++){
			para(inteiro coluna=0; coluna<3; coluna++){
				se(coluna<2) {
					escreva(N1[linha][coluna], " | ")
				}
				senao{
					escreva(N1[linha][coluna],"\n")
				}
			}
		}

		para (inteiro linha = 0; linha < 2; linha++){
			para(inteiro coluna = 0; coluna < 3; coluna++){
				escreva("Digite os valores da matriz N2: ")
		 		leia (N2[linha][coluna])	
			}
		}

		limpa()
		
		escreva("\nA matriz de N2é:\n")
		para (inteiro linha=0; linha<2; linha++){
			para(inteiro coluna=0; coluna<3; coluna++){
				se(coluna<2) {
					escreva(N2[linha][coluna], " | ")
				}
				senao{
					escreva(N2[linha][coluna],"\n")
				}
			}
		}
		
		para (inteiro linha = 0; linha < 2; linha++){
			para(inteiro coluna = 0; coluna < 3; coluna++){
		 		M1[linha][coluna] = N1[linha][coluna] + N2[linha][coluna]
			}
		}


		escreva("\nA matriz M1 é:\n")
		para (inteiro linha = 0; linha < 2; linha++){
			para(inteiro coluna = 0; coluna < 3; coluna++){
		 		se(coluna < 2 ){
		 			escreva(M1[linha][coluna], " | ")
		 		}
		 		senao{
		 			escreva(M1[linha][coluna], "\n")
		 		}
			}
		}

		para (inteiro linha = 0; linha < 2; linha++){
			para(inteiro coluna=0; coluna<3; coluna++){
				M2[linha][coluna]= N1[linha][coluna] - N2[linha][coluna]
				}
			}

		
		escreva("\nA matriz de M2é:\n")
		para (inteiro linha=0; linha<2; linha++){
			para(inteiro coluna=0; coluna<3; coluna++){
				se(coluna<2) {
					escreva(M2[linha][coluna], " | ")
				}
				senao{
					escreva(M2[linha][coluna],"\n")
				}
			}
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