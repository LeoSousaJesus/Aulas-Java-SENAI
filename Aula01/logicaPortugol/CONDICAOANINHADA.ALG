Algoritmo "CondicaoAninhada"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 03/06/2025
Var
// Seção de Declarações das variáveis 
dinheiro: real

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
escreval("Informe quanto você tem de dinheiro: ")
leia(dinheiro)

se(dinheiro >= 10000) entao
escreval("Partiu Disney!")
senao
se(dinheiro >= 5000) e (dinheiro < 10000) entao
escreva("Visitar família!")
senao
escreva("#Chateado!")
fimse
fimse
Fimalgoritmo