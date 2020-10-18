#language: pt
#encoding: utf-8

Funcionalidade: Multiplicar

  Esquema do Cenario: Multiplicar dois numeros
    Dado que acesso a calculadora para realizar uma multiplicacao
    E insiro o multiplicando <num1>
    E clico em multiplicar
    E insiro o multiplicador <num2>
    Quando eu clicar no botao igual
    Entao exibe o produto <resultado>

    Exemplos:
      | num1 | num2 | resultado |
      | "5"  | "3"  | "15"      |
      | "7"  | "2"  | "14"      |
      | "8"  | "5"  | "40"      |