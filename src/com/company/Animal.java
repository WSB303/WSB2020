package com.company;

public class Animal {
    final String species;
    String name;
    private Double weight;

    public static final Double DEFAULT_DOG_WEIGHT = 5.0;
    public static final Double DEFAULT_MOUSE_WEIGHT = 0.1;
    public static final Double DEFAULT_LION_WEIGHT = 123.0;
    public Animal(String species)
    {
        this.species = species;
        switch(species) {
            case "dog":
                this.weight = DEFAULT_DOG_WEIGHT;
                break;
            case "mouse":
                this.weight = DEFAULT_MOUSE_WEIGHT;
                break;
            case "lion":
                this.weight = DEFAULT_LION_WEIGHT;
                break;
        }
    }
    public void feed() {
        if(weight>0.0){
            weight++;
            System.out.println("Thanks for food! Actual weight:" +weight+"kg");
        }else System.out.println("You can't feed dead animal.");
    }
    public void walk(){
        if(weight>0.0){
            weight--;
            System.out.println("Thanks for walk! Actual weight:"+weight+"kg");
        }else System.out.println("You walking with dead animal...");
    }
}
