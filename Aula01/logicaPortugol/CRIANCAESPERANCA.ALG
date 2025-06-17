Algoritmo "CriancaEsperanca"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 03/06/2025
Var
// Seção de Declarações das variáveis 
 tipoDoacao: inteiro
 valor: real

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
escreval("-----------------------------------------------------------------")
escreval("-----------------------CRIANÇA ESPERANÇA-------------------------")
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
      escreval("Qual o valor da doação?")
      leia(valor)
      
 caso 5
      valor <- 0

fimescolha
escreval("----------------------------------------------------------------")
escreval("-------------SUA DOAÇÃO FOI DE R$",valor:3:2," REAIS------------")
escreval("-----------------------MUITO OBRIGADO!--------------------------")
escreval("----------------------------------------------------------------")
Fimalgoritmo