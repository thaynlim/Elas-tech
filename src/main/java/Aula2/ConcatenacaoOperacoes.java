package Aula2;

public class ConcatenacaoOperacoes {
    static void main() {
        // Atividade 1- Crie variáveis para um nome, uma cidade e uma idade. Mostre em uma única linha: "Meu nome é Ana, moro em Salvador e tenho 28 anos."

        String nome = "Alice";
        String cidade = "Salvador";
        int idade = 32;

        System.out.println("Olá, meu nome é " + nome + ", moro em " +  cidade  + " e tenho " + idade + " anos. ");

        // 0- Rode esse código:
        System.out.println("2 + 2 = " + 3 + 2);
        // Agora rode:
        System.out.println("2 + 2 = " + (2 + 2));
        // Explique em um comentário por que deram resultados diferentes.

        //   /*O resultado foi 22 porque o Java entende o + como concatenação quando estamos trabalhando com uma String, juntando os valores.
        //        Tipo "meu nome é" + nome*/
        //
        //        System.out.println("2 + 2 = " + (2 + 2));
        //        //O resultado foi 4 porque os parênteses fazem o Java calcula primeiro a soma e depois juntar o resultado com o texto.
        //        // Primeiro soma > 4
        //        // depois concatena > "Resultado: 4"

        // comentário de uma única linha
        /* comentário mais de uma linha

         */
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


