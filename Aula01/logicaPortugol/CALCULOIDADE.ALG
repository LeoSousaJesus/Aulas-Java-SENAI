Algoritmo "CalculoIdade"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 03/06/2025
Var
// Seção de Declarações das variáveis 
 anoAtual, anoNascimento, idade: inteiro

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
escreval("Informe o ano do seu nascimento: ")
leia(anoNascimento)
escreval("Informe o ano atual: ")
leia(anoAtual)
idade <- (anoAtual - anoNascimento)
se(idade >= 18) entao
escreva("Você é maior, sua idade é: ",idade," anos!")
senao
escreva("Você é menor, sua idade é: ",idade," anos!")
fimse
Fimalgoritmo