Algoritmo "MediaAluno"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 03/06/2025
Var
// Seção de Declarações das variáveis 
nota1, nota2, media:real

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
escreva("Informe duas notas: ")
leia(nota1)
leia(nota2)
media <- (nota1 + nota2)/2
se(media >= 7) entao
escreva("Aluno Aprovado!")
senao
se(media >= 5) e (media < 7) entao
escreva("Aluno em recuperação!")
senao
escreva("Aluno reprovado!")
fimse
fimse
fimalgoritmo