package com.company.device;

public class Phone extends Device {
    private Integer memory;
    public Phone(String producer, String model, int yearOfProduction,int memory) {
        super(producer, model, yearOfProduction);
        this.memory = memory;
    }


    @Override
    public void turnOn() {
        System.out.println("Bzzz, Bzzz");;
    }
    @Override
    public String toString() {
        return this.model + " " + this.producer + " " + " " + this.yearOfProduction + "" + this.memory ;
    }


}
