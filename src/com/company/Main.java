package com.company;

import com.company.animal.Animal;
import com.company.animal.Human;
import com.company.device.Car;
import com.company.device.Device;
import com.company.device.Phone;

public class Main {
    public static void main(String[] args) throws Exception {
        Human me = new Human();
        me.firstName = "George";
        me.lastName = "Flinston";
        me.cash = 1200.0;
        Human some = new Human();
        some.firstName = "Zbychu";
        some.lastName = "Rakieta";
        some.cash = 2000.0;


        Animal dog = new Animal("dog");
        dog.name = "Kaja";
        Car passat = new Car("Volkswagen", "Passat", "red", 1997, 2000.0);
        Car rac = new Car("Corolla","Toyota","Blue",2000,5000.0);
        me.pet = dog;
        System.out.println(dog);
        System.out.println(rac);
        Device car1 = new Car("Corolla","Toyota","Red",2001,2000.0);
        Phone ph1 = new Phone("Iphone","6+",2015,64);
        me.setSalary(1800.0, true);
        me.phone = ph1;

        me.setCar(passat);
        ph1.turnOn();
        car1.turnOn();
        dog.sell(some,me,200.0);
        ph1.sell(some,me,200.0);

        System.out.println(some.phone);
        System.out.println(some.cash);

        me.sell(some,me,2300.0);

    }
}
