package Aula2;

public class DesafioConcatenacao {
    static void main() {
        // Desafio: Crie uma variável com 3785 segundos. Mostre quantos minutos inteiros isso dá e quantos segundos sobram.
        //
        //Dica: segundos/60 dá os minutos. segundos % 60 mostra os segundos restantes.

        int segundos = 3785;
        System.out.println("Minutos inteiros " + (segundos / 60) + " e sobram: " + (segundos % 60));
    }
}
