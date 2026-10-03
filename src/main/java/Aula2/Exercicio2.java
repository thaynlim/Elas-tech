package Aula2;

public class Exercicio2 {
    static void main() {
        //Atividade 2 - Crie variáveis para o nome de um produto ("Caneca"), o preço (12.50) e a quantidade (4). Mostre: "Comprei 4 unidades de Caneca por R$ 12.5 cada. Total: R$ 50.0"

        String name = "Caneca";
        double preco = 12.50;
        int quantidade = 4;
        double total = 50.00;

        System.out.println(" Comprei " + quantidade + " unidades de " + name + " por R$ " + preco + " cada. Total de R$ " + total);
    }
}
