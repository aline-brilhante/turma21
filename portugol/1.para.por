/*1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, coletando dados sobre o salário e número de filhos. 
 * A prefeitura deseja saber:   
a) média do salário da população; 
b) média do número de filhos; 
c) maior salário; 
d) percentual de pessoas com salário até R$100,00.*/

programa
{

    funcao inicio()
    {
        real salarioFixo=0.00
        real filhos=0.00
        real resultadoSalario=0.00
        real resultadoFilhos=0.00
        real mediaSalario=0.00
        real mediaFilhos=0.00
        real maiorSalario=0.00
        real ate100=0.00
        real pAte100=0.00

        para (real x=0.00; x<2; x++){
            escreva("Digite seu salário:")
            leia(salarioFixo)
            resultadoSalario=salarioFixo + resultadoSalario

            escreva("Quantos filhos você tem?")
            leia(filhos)
            resultadoFilhos=filhos + resultadoFilhos


            se(salarioFixo > maiorSalario){
                maiorSalario = salarioFixo 
            }
            se(salarioFixo <=100){
                ate100++ 
            }
        }

        mediaSalario= resultadoSalario / 2
        mediaFilhos= resultadoFilhos / 2
        pAte100= (ate100 / 2) * 100
        escreva("\nA média salarial da população é de ",mediaSalario)
        escreva("\nA média do nº de filhos é ",mediaFilhos)
        escreva("\nMaior o maior salário digitado é ",maiorSalario)
        escreva("\nPercentual de pessoas com salário menor que 100: ",ate100,"%")

    }
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1506; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */