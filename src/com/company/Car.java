package com.company;

public class Car {
     public final String model;
     public final String producent;
     public  String color;
     public  Integer year;

    public Car(String model, String producent,String color, Integer year) {
        this.model = model;
        this.producent = producent;
        this.color = color;
        this.year = year;
    }
}