Algoritmo "FuncaoImparPar"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Antonio Carlos Nicolodi
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
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
        retorne "�mpar"
    fimse
fimfuncao

inicio
    escreva("Digite um n�mero: ")
    leia(n)

    // Chamada da fun��o para verificar par ou �mpar
    resultado <- parOuImpar(n)

    escreval("O n�mero ", n, " � ", resultado)

fimalgoritmo