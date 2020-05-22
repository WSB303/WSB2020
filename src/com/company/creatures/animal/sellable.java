package com.company.creatures.animal;

import com.company.creatures.Human;

public interface sellable {
     void sell(Human seller, Human buyer, Double price) throws Exception;
}
