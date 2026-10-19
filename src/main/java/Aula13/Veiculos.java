package Aula13;

import java.util.ArrayList;

public class Veiculos {
    static void main() {

        ArrayList<Veiculo> veiculos = new ArrayList<>();
        veiculos.add(new Carro());;
        veiculos.add(new Moto());

        for (Veiculo veiculo : veiculos) {
            veiculo.ligar();
            veiculo.acelerar();
            System.out.println();
        }
    }
}

