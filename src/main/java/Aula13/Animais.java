package Aula13;

import java.util.ArrayList;

public class Animais {
    static void main() {
        //1
        Cachorro cachorro = new Cachorro();
        cachorro.emitirSom();
        //2
        Gato gato = new Gato();
        gato.emitirSom();
        System.out.println();
        //3
        ArrayList<Animal> animais = new ArrayList<>();
        animais.add (new Cachorro());
        animais.add (new Gato());

        for(Animal animal: animais){
            animal.emitirSom();
        }


    }
}


