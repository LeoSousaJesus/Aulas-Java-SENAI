Algoritmo "CalculoIdade"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Antonio Carlos Nicolodi 
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 03/06/2025
Var
// Se��o de Declara��es das vari�veis 
 anoAtual, anoNascimento, idade: inteiro

Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc... 
escreval("Informe o ano do seu nascimento: ")
leia(anoNascimento)
escreval("Informe o ano atual: ")
leia(anoAtual)
idade <- (anoAtual - anoNascimento)
se(idade >= 18) entao
escreva("Voc� � maior, sua idade �: ",idade," anos!")
senao
escreva("Voc� � menor, sua idade �: ",idade," anos!")
fimse
Fimalgoritmo