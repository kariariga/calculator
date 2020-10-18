#language: pt
#encoding: utf-8

Funcionalidade: Dividir

  Esquema do Cenario: Dividir dois numeros
    Dado que acesso a calculadora para realizar uma divisao
    E insiro o dividendo <num1>
    E clico em dividir
    E insiro o divisor <num2>
    Quando eu clicar em igual
    Entao exibe o quociente <resultado>

    Exemplos:
      | num1 | num2 | resultado |
      | "50" | "5"  | "10"      |
      | "27" | "3"  | "9"       |
      | "78" | "6"  | "13"      |