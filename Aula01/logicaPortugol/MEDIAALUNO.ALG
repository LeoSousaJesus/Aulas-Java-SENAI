Algoritmo "MediaAluno"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Antonio Carlos Nicolodi 
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 03/06/2025
Var
// Se��o de Declara��es das vari�veis 
nota1, nota2, media:real

Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc... 
escreva("Informe duas notas: ")
leia(nota1)
leia(nota2)
media <- (nota1 + nota2)/2
se(media >= 7) entao
escreva("Aluno Aprovado!")
senao
se(media >= 5) e (media < 7) entao
escreva("Aluno em recupera��o!")
senao
escreva("Aluno reprovado!")
fimse
fimse
fimalgoritmo