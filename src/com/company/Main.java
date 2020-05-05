package com.company;

import com.company.device.Car;

public class Main {
    public static void main(String[] args) {
        Human me = new Human();
        me.firstName = "George";
        me.lastName = "Flinston";

        Animal dog = new Animal("dog");
        dog.name = "Kaja";

        Car car = new Car("Corolla","Toyota","Blue",2000,5000.0);
        Car rac = new Car("Corolla","Toyota","Blue",2000,5000.0);
        me.pet = dog;
        System.out.println(car.equals(rac));
        System.out.println(dog);
        System.out.println(rac);
        System.out.println(car);

        me.setSalary(1800.0, true);
        System.out.println(me.getSalary());
        me.setCar(car);
        System.out.println(me);






    }
}
