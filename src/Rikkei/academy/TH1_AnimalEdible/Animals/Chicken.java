package Rikkei.academy.TH1_AnimalEdible.Animals;

import Rikkei.academy.TH1_AnimalEdible.Ediable.Ediable;

public class Chicken extends Animal implements Ediable {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
