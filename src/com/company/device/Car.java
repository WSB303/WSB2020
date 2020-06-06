package com.company.device;

import com.company.creatures.Human;

public abstract class Car extends Device   {
     public final String model;
     public final String producer;
     public  String color;
     public  Integer yearOfProduction;
     public  Double price;

    public Car(String model, String producer,String color, Integer yearOfProduction,Double price) {
        super(producer,model,yearOfProduction);
        this.model = model;
        this.producer = producer;
        this.color = color;
        this.yearOfProduction = yearOfProduction;
        this.price = price;
    }
    public abstract void refuel();{
        System.out.println("You refuel you'r car.");
    }

    @Override
    public void turnOn() {
        System.out.println("Brrr, brrr");
    }
    @Override
    public String toString() {
        return this.model + " " + this.producer + " " + " " + this.yearOfProduction;
    }
    public void sell(Human buyer, Human seller, double price) {
        if (seller.car != null && buyer.cash >= price) {
            buyer.cash = buyer.cash - price;
            seller.cash = seller.cash + price;
            seller.car = null;
            buyer.car = this;

            System.out.println(seller.firstName + " " + " sprzedał " + buyer.firstName + " " + this.producer + " za kwote " + price);
        } else System.out.println("Nie masz wystarczająco gotówki albo sprzedający nie posiada tego co sprzedaje.");

    }

}
