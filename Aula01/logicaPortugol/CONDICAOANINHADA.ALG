Algoritmo "CondicaoAninhada"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Antonio Carlos Nicolodi 
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 03/06/2025
Var
// Se��o de Declara��es das vari�veis 
dinheiro: real

Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc... 
escreval("Informe quanto voc� tem de dinheiro: ")
leia(dinheiro)

se(dinheiro >= 10000) entao
escreval("Partiu Disney!")
senao
se(dinheiro >= 5000) e (dinheiro < 10000) entao
escreva("Visitar fam�lia!")
senao
escreva("#Chateado!")
fimse
fimse
Fimalgoritmo