package com.company;

import com.company.device.Car;
import com.company.device.Device;
import com.company.device.Phone;
import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;

public class Main {
    public static void main(String[] args) {
        Human me = new Human();
        me.firstName = "George";
        me.lastName = "Flinston";

        Animal dog = new Animal("dog");
        dog.name = "Kaja";

        Car rac = new Car("Corolla","Toyota","Blue",2000,5000.0);
        me.pet = dog;
        System.out.println(dog);
        System.out.println(rac);
        Device car1 = new Car("Corolla","Toyota","Red",2001,2000.0);
        Device ph1 = new Phone("Iphone","6+",2015,64);
        me.setSalary(1800.0, true);

        ph1.turnOn();
        car1.turnOn();


    }
}
