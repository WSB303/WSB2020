package com.company;

public class Main {
    public static void main(String[] args) {
        Human me = new Human();
        me.firstName = "George";
        me.lastName = "Flinston";


        Animal dog = new Animal("dog");
        dog.name = "Kaja";

        me.pet = dog;


        dog.feed();
        dog.walk();
        dog.feed();
        dog.walk();
        dog.walk();
        dog.walk();
        dog.walk();
        dog.walk();
        dog.walk();
        dog.walk();
        dog.feed();

    }
}
