Algoritmo "CriancaEsperanca"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Antonio Carlos Nicolodi 
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 03/06/2025
Var
// Se��o de Declara��es das vari�veis 
 tipoDoacao: inteiro
 valor: real

Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc... 
escreval("-----------------------------------------------------------------")
escreval("-----------------------CRIAN�A ESPERAN�A-------------------------")
escreval("-----------------------------------------------------------------")
escreval("                     Muito obrigado por ajudar                   ")
escreval("  [1] para doar R$10.00  ")
escreval("  [2] para doar R$25.00  ")
escreval("  [3] para doar R$50.00  ")
escreval("  [4] para doar outros valores  ")
escreval("  [5] para cancelar  ")
leia (tipoDoacao)
escolha(tipoDoacao)
 caso 1
      valor <- 10
      para
 caso 2
      valor <- 25

 caso 3
      valor <- 50
      
 caso 4
      escreval("Qual o valor da doa��o?")
      leia(valor)
      
 caso 5
      valor <- 0

fimescolha
escreval("----------------------------------------------------------------")
escreval("-------------SUA DOA��O FOI DE R$",valor:3:2," REAIS------------")
escreval("-----------------------MUITO OBRIGADO!--------------------------")
escreval("----------------------------------------------------------------")
Fimalgoritmo