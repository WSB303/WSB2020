package com.company.creatures;

import com.company.creatures.animal.Animal;
import com.company.device.Car;
import com.company.device.Phone;

import java.util.Arrays;

import static java.lang.System.*;

public class Human {
    public String firstName;
    public String lastName;
    public Animal pet;
    public Car[] garage;
    public Boolean contract;
    public Phone phone;
    public Double salary;
    public Double cash;
    Integer index;
    public Double getSalary() {
        return this.salary;
    }


    public final static Integer DEFAULT_GARAGE_SIZE = 4;
    public Human(Integer garageSize){
        this.garage = new Car[garageSize];

    }
    public void setSalary(Double salary,Boolean contract) {
        if(salary>0 && contract)
        {
            out.println("Twoja wypłata została zmieniona. Nowe dane zostały wysłane do systemu księgowego. ZUS i US wiedzą o zmianie wpłaty");
            this.salary = salary;
        } else out.println("Musisz odebrać aneks do umowy od Pani Hani!");
}
    public Car getCar(Integer index){
        return this.garage[index];
    }
    public Car[] getGarage(){
        return this.garage;
    }
     public Double sumCarsValue() {
        double sum = 0.0;
        for(Car car : garage){
            if(car != null){
                sum+= car.price;
            }
        }
        return sum;
     }

    public void sortCarsByYear() { Arrays.sort(garage); }

    public boolean hasCar(Car newCar) {
        for (Car car : garage) { if (car == newCar) {return true;}
        }
        return false;
    }

    public boolean hasFreeSpace() {
        for (Car car : garage) { if (car == null) {return true;}
        }
        return false;
    }

    public void removeCar(Car newCar) {
        for (int i = 0; i < this.garage.length; i++) { if (this.garage[i] == newCar) {this.garage[i] = null;}
        }
    }

    public void addCar(Car newCar) throws Exception {
        if (!this.hasFreeSpace()) {
            throw new Exception("No spaces");
        }
        for (int i = 0; i < this.garage.length; i++) {
            if (this.garage[i] == null) {
                this.garage[i] = newCar;
                break;
            }
        }
    }

    public void setCar(Car car,Integer index) {
        if(car.price<this.salary){
            out.println("Kupiłeś auto.");
            this.garage[index] = car;
        }else if (car.price*1/12<=this.salary){
            out.println("Kupiłeś auto, ale musiałeś wziąć kredyt.");
            this.garage[index] = car;
        } else out.println("Nie stać Cię. Weź podwyżkę.");
    }
    public void sell(Human buyer, Human seller, double price) {
        System.out.print("Nie można kupić ani sprzedać człowieka.");
    }

    public String toString() {
        return firstName + " " + lastName + " " + pet  + " " + " " + cash;
    }
}
