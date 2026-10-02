package Aula1;

public class Concatenacao {
    static void main() {
        String nome = "Thayna";
        int idade = 28;
        double altura = 1.68;
        String cep = "0820-810";
        boolean ehFumante = false ;
        String cidade = "São Paulo";
        double peso = 75.00;
        String telefone = "(11) 92222-7777";
        boolean carteiraDeMotorista = true;
        String profissao = "Assistente de atendimento";
        int anoDeNascimento = 1998;
        double temperatura = 18;
        int nota = 10;

        System.out.println("Seus dados São: ");
        System.out.println(nome);
        System.out.println(idade);
        System.out.println(altura);
        System.out.println(ehFumante);
        System.out.println(cidade);
        System.out.println(peso);
        System.out.println(telefone);
        System.out.println(carteiraDeMotorista);
        System.out.println(profissao);
        System.out.println(anoDeNascimento);
        System.out.println(temperatura);
        System.out.println(nota);

        System.out.println("Olá " + nome  + " sua nota foi: " + nota );
    }
}
