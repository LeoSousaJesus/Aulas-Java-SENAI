Algoritmo "FuncaoSoma"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Antonio Carlos Nicolodi 
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 04/06/2025
Var
// Se��o de Declara��es das vari�veis 
V1, V2, S: inteiro

funcao Soma(X, Y: inteiro): inteiro
inicio
      Retorne X + Y
fimfuncao
Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc... 
escrevaL("Digite o primeiro valor: ")
leia(V1)
escrevaL("Digite o segundo valor: ")
leia(V2)
S  <- Soma (V1, V2)
escreval("A soma entre ", V1, " e ", V2, " � igual a ", S)
Fimalgoritmo