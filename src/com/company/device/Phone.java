package com.company.device;

import com.company.creatures.Human;

public class Phone extends Device {
    private Integer memory;

    public Phone(String producer, String model, int yearOfProduction, int memory) {
        super(producer, model, yearOfProduction);
        this.memory = memory;
    }


    @Override
    public void turnOn() {
        System.out.println("Bzzz, Bzzz");

    }

    @Override
    public String toString() {
        return this.model + " " + this.producer + " " + " " + this.yearOfProduction + "" + this.memory;
    }
    public void sell(Human buyer, Human seller, double price) {
        if (seller.phone != null && buyer.cash >= price) {
            buyer.cash = buyer.cash - price;
            seller.cash = seller.cash + price;
            seller.phone = null;
            buyer.phone = this;
            System.out.println(seller.firstName + " " + " sprzedał " + buyer.firstName + " " + this.producer + " za kwote " + price);
        } else System.out.println("Nie masz wystarczająco gotówki albo sprzedający nie posiada tego co sprzedaje.");

    }

}
