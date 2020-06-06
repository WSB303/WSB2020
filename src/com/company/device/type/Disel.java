package com.company.device.type;

import com.company.creatures.Human;
import com.company.device.Car;

public class Disel extends Car {

    public Disel(String model, String producer, String color, Integer yearOfProduction, Double price) {
        super(model, producer, color, yearOfProduction, price);
    }

    @Override
    public void refuel() {
        System.out.println("Pomyślnie zataknowałeś auto");
    }
}
