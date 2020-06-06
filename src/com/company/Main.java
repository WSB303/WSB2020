package com.company;

import com.company.creatures.animal.Animal;
import com.company.creatures.Human;
import com.company.creatures.animal.farmAnimal;
import com.company.creatures.animal.pet;
import com.company.device.Car;
import com.company.device.Device;
import com.company.device.Phone;
import com.company.device.type.Disel;
import com.company.device.type.Electric;
import com.company.device.type.LPG;

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

        Animal dog = new pet("dog");

        dog.name = "Kaja";
        LPG passat = new LPG("Volkswagen", "Passat", "red", 1997, 2000.0);
        Electric rac = new Electric("Corolla","Toyota","Blue",2000,5000.0);
        me.pet = dog;
        System.out.println(dog);
        System.out.println(rac);
        Disel car1 = new Disel("Corolla","Toyota","Red",2001,2000.0);
        Phone ph1 = new Phone("Iphone","6+",2015,64);
        me.setSalary(1800.0, true);
        me.phone = ph1;
        me.setCar(passat);


        ph1.turnOn();
        car1.turnOn();
        ph1.sell(some,me,200.0);

        System.out.println(some.phone);
        System.out.println(some.cash);

        me.sell(some,me,2300.0);
        farmAnimal pig = new farmAnimal("pig");

        pig.beEaten();
        me.pet.beEaten();

        me.phone = new Phone("samsung","s10",2019,64);

        me.phone.installAnApp("Something");
        me.phone.installAnApp("GoogleMaps","1.22v");
        me.phone.installAnApp("Uber","4v");

        passat.refuel();
    }
}
