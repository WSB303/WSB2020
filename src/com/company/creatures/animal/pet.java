package com.company.creatures.animal;

import com.company.creatures.Human;
import com.company.creatures.animal.Animal;

public class pet extends Animal {
    public pet(String species) {
        super(species);
    }

    @Override
    public void beEaten() {
        System.out.println("Chrup, chrup");

    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {

    }
}
