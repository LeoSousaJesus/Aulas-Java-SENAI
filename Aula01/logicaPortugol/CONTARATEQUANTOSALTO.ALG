Algoritmo "contarAteQuantoSalto"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 04/06/2025
Var
// Seção de Declarações das variáveis
valor, salto, contador: inteiro


Inicio
// Seção de Comandos, procedimento, funções, operadores, etc...
  contador <- 0
  escreval("Quer contar até quanto?")
  leia (valor)
   escreval("Qual será o valor do salto?")
  leia (salto)
  enquanto (contador <= valor) faca
  escreva (contador)
  contador <- contador + salto
  fimenquanto
Fimalgoritmo