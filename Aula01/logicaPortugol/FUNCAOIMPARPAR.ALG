Algoritmo "FuncaoImparPar"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 04/06/2025

var
    n: inteiro
    resultado: caractere

funcao parOuImpar(numero: inteiro): caractere
inicio
    se (numero mod 2 = 0) entao
        retorne "Par"
    senao
        retorne "Ímpar"
    fimse
fimfuncao

inicio
    escreva("Digite um número: ")
    leia(n)

    // Chamada da função para verificar par ou ímpar
    resultado <- parOuImpar(n)

    escreval("O número ", n, " é ", resultado)

fimalgoritmo