package bootcamp.ejercicio3;

import bootcamp.ejercicio3.interfaces.Carnivoro;

public class Gato extends Animal implements Carnivoro {

    @Override
    public void comerAnimal() {
        comerCarne();
    }

    @Override
    public void comerCarne() {
        System.out.println("Como ratones");
    }
}