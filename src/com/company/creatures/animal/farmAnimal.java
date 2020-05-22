package com.company.creatures.animal;

import com.company.creatures.Human;
import com.company.creatures.animal.Animal;

public class farmAnimal extends Animal {
    public farmAnimal(String species) {
        super(species);
    }

    @Override
    public void beEaten() throws Exception {
        System.out.println("\nChrup, chrup");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {

    }
}
