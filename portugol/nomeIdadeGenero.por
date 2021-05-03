programa
{
	
	funcao inicio()
	{
		cadeia nome
		caracter genero
		inteiro anoNascimento
		inteiro idade
		
		escreva("Digite seu nome: \n")
		leia(nome)

		escreva("Digite uma letra para o seu gênero, M para Masculino, F para Feminino, ou O para Outro: \n")
		leia(genero)

		escreva("Digite seu ano de nascimento: \n")
		leia(anoNascimento)

		idade= 2021-anoNascimento

		se (idade<=18){
			escreva(nome+", você tem"+idade+"e é jovem!")
		}

		se (idade>18 e idade<=50){
			se(genero=='M' ou genero== 'm'){
				escreva(nome+", você tem "+idade+" anos e é adulto!")
			}
			senao se(genero=='F' ou genero=='f'){
				escreva(nome+", você tem "+idade+" anos e é adulta!")
			}
			senao se(genero=='O' ou genero=='o'){
				escreva(nome+", você tem "+idade+" anos e é adulte!")
			}
			senao{
				escreva("Você não digitou seu gênero corretamente.")
			}
		
		}
		se (idade>50){
			se(genero=='M' ou genero=='m'){
				escreva(nome+", você tem "+idade+" anos e é idoso!")
			}
			se(genero=='F' ou genero=='f'){
				escreva(nome+", você tem "+" anos e é idosa!")
			}
			se(genero=='O' ou genero=='o'){
				escreva(nome+", você tem "+idade+" anos e é idose!")
			}
			senao{
				escreva("Você não digitou seu gênero corretamente.")
			}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1145; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */