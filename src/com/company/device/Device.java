package com.company.device;


import com.company.creatures.Human;

public abstract class Device
{
    public final String producer;
    public final String model;
    public final int yearOfProduction;

    public Device(String producer, String model, int yearOfProduction)
    {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }
    public abstract void turnOn();

    @Override
    public String toString() {
        return model + " " + producer + " " + " " + yearOfProduction ;
    }
    public void sell(Human buyer, Human seller, double price){
        if (seller.phone != null && seller.car != null && buyer.cash >= price) {
            buyer.cash = buyer.cash - price;
            seller.cash = seller.cash + price;

            System.out.println(seller.firstName + " " + " sprzedał " + buyer.firstName + " " + this.producer + " za kwote " + price);
        } else System.out.println("Nie masz wystarczająco gotówki albo sprzedający nie posiada tego co sprzedaje.");

    }


}