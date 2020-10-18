#language: pt
#encoding: utf-8

Funcionalidade: Subtrair

  Esquema do Cenario: Subtrair dois numeros
    Dado que acesso a calculadora para realizar uma subtracao
    E insiro o minuendo <num1>
    E clico em subtrair
    E insiro o subtraendo <num2>
    Quando eu clicar no igual
    Entao exibe o resto <resultado>

    Exemplos:
      | num1 | num2 | resultado |
      | "5"  | "3"  | "2"       |
      | "7"  | "2"  | "5"       |
      | "8"  | "5"  | "3"       |