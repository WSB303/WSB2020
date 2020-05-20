package com.company.device;


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
    public abstract void turnOn();{
}

    @Override
    public String toString() {
        return model + " " + producer + " " + " " + yearOfProduction ;
    }



}