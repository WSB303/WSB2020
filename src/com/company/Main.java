package com.company;

public class Main {
    public static void main(String[] args) {
        Human me = new Human();
        me.firstName = "George";
        me.lastName = "Flinston";

        Animal dog = new Animal("dog");
        dog.name = "Kaja";

        Car car = new Car("Corolla","Toyota","Blue",2001);
        me.pet = dog;
        me.car = car;
        System.out.println(me.car);
        me.setSalary(1800.0, true);
        System.out.println(me.getSalary());






    }
}
