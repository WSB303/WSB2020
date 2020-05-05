package com.company;

import org.w3c.dom.ls.LSOutput;

import static java.lang.System.*;

public class Human {
    String firstName;
    String lastName;
    Animal pet;
    private Car car;
    Boolean contract;
    Phone phone;
    private Double salary;
    Double getSalary() {
        return this.salary;
    }

    void setSalary(Double salary,Boolean contract) {
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
        } else out.println("Nie stać Cię. Weź podwyżkę.");
    }
}
