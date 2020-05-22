package com.company.creatures;

import com.company.creatures.animal.Animal;
import com.company.device.Car;
import com.company.device.Phone;

import static java.lang.System.*;

public class Human {
    public String firstName;
    public String lastName;
    public Animal pet;
    public Car car;
    public Boolean contract;
    public Phone phone;
    public Double salary;
    public Double cash;
    public Double getSalary() {
        return this.salary;
    }
    public String toString() {
        return firstName + " " + lastName + " " + pet  + " " + getCar() + " " + cash;
    }

    public void setSalary(Double salary,Boolean contract) {
        if(salary>0 && contract)
        {
            out.println("Twoja wypłata została zmieniona. Nowe dane zostały wysłane do systemu księgowego. ZUS i US wiedzą o zmianie wpłaty");
            this.salary = salary;
        } else out.println("Musisz odebrać aneks do umowy od Pani Hani!");
}
    public Car getCar(){
        return this.car;
    }

    public void setCar(Car car) {
        if(car.price<this.salary){
            out.println("Kupiłeś auto.");
            this.car = car;
        }else if (car.price*1/12<=this.salary){
            out.println("Kupiłeś auto, ale musiałeś wziąć kredyt.");
            this.car = car;
        } else out.println("Nie stać Cię. Weź podwyżkę.");
    }
    public void sell(Human buyer, Human seller, double price) throws Exception {
        System.out.print("Nie można kupić ani sprzedać człowieka.");
    }

}
