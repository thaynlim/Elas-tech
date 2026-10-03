package Aula3;

public class Aritmeticos2 {
    static void main() {
        //2- Crie variáveis para dois números decimais de valor a = 10 e b = 3 e mostre na tela: soma, subtração, multiplicação, divisão e resto.

        double a = 10;
        double b = 3;
        double soma = 0;
        System.out.println(soma);
        double subtracao = 0;
        System.out.println(subtracao);
        double multiplicacao = 0;
        System.out.println(multiplicacao);
        double divisao = 0;
        System.out.println(divisao);
        double resto = 0;
        System.out.println(resto);

        soma = a + b;
        System.out.println("soma " + soma);
        subtracao = a - b;
        System.out.println("subtracao " + subtracao);
        multiplicacao = a * b;
        System.out.println("multiplicacao " + multiplicacao);
        divisao = a / b;
        System.out.println("divisao " + divisao);
        resto = a % b;
        System.out.println("Resto " + resto);
    }
}
