package com.company.device;

import com.company.creatures.Human;

import java.net.MalformedURLException;
import java.net.URL;

public class Phone extends Device {
    static final String DEFAULT_APP_PROTOCOL = "HTTPS" ;
    static final String DEFAULT_APP_SERVER = "facebook.pl";
    static final int DEFAULT_PORT_NUMBER = 443;
    private final Integer memory;

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

    public void installAnApp(String[] names) throws Exception {
        System.out.println("Zainstalowanie aplikacji na podstawie tablicy nazw");
        if (names.length == 0){
            throw new Exception("Nie podano żadnych aplikacji");
        }
        for(String name: names){
            this.installAnApp(name);
        }
    }

    public void installAnApp(String name) throws Exception {
        System.out.println("Zainstalowanie aplikacji na podstawie nazwy");
        if (name.equals("")){
            throw new Exception("Aplikacja musi posiadać nazwę");
        }
        this.installAnApp(name, "latest");
    }

    public void installAnApp(String name, String version) throws MalformedURLException {
        System.out.println("Instalowanie aplikacji na postawie nazwy i wersji.");
        URL url = new URL(DEFAULT_APP_PROTOCOL,DEFAULT_APP_SERVER,DEFAULT_PORT_NUMBER, name + "-" + version);
        this.installAnApp(url);
    }

    public void installAnApp(URL url){
        System.out.println("Instalowanie aplikacji na podstawie URL");
        System.out.println("Poprawnie zainstalowano aplikacje");
    }


}
