package Aula3;

public class Aritmeticos1 {
    static void main() {
        // 1- Crie variáveis para dois números inteiros de valor a = 10 e b = 3 e mostre na tela: soma, subtração, multiplicação, divisão e resto.

        int a = 10;
        int b = 3;
        int soma = 0;
        System.out.println(soma);
        int subtracao = 0;
        System.out.println(subtracao);
        int multiplicacao =0;
        System.out.println(multiplicacao);
        int divisao =0;
        System.out.println(divisao);
        int resto =0;
        System.out.println(resto);

        soma = a + b;
        System.out.println("soma " + soma);
        subtracao = a - b;
        System.out.println("subtracao " + subtracao);
        multiplicacao = a*b;
        System.out.println("multiplicacao " + multiplicacao);
        divisao = a/b;
        System.out.println("divisao " + divisao);
        resto = a%b;
        System.out.println ("Resto " + resto);
    }
}
