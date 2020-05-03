package com.company;

import static java.lang.System.*;

public class Human {
    String firstName;
    String lastName;
    Animal pet;
    Car car;
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


}
