Algoritmo "ProcedimentoBasca"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Antonio Carlos Nicolodi 
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 04/06/2025
Var
// Se��o de Declara��es das vari�veis 
 a, b, c, delta, x1, x2: real
 procedimento baskara (A, B, C: real)
 inicio
delta <- (b ^ 2) - 4 * a * c
x1 <- (-b + raizq (delta))/(2 * a)
x2 <- (-b - raizq (delta))/(2 * a)
escreval("Delta: ",delta:2:2)
escreval("X1: ",x1:2:2)
escreval("X2: ",x2:2:2)
fimprocedimento
Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc... 
escreval("Informe o valor de A")
leia(a)
escreval("Informe o valor de B")
leia(b)
escreval("Informe o valor de C")
leia(c)
baskara(a, b, c)
Fimalgoritmo