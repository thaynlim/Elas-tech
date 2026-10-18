package petshop;

public class Pet {
    String nome;
    String especie;
    double peso;
    String porte;
    int opcao =-1;
    int total =0;

     String definirPorte() {
        if (peso < 10) {
            return "Pequeno";
        } else if (peso < 25) {
            return "Médio";
        } else {
            return "Grande";
        }
    }

    void emitirSom() {
        System.out.println(nome + " está emitindo um som ");
    }
}
