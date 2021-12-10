package com.mylab.main.Item;

import com.mylab.main.Interface.InterfaceSmelling;
import com.mylab.main.Person.Person;
import com.mylab.main.Enum.Smell;

public class Soap extends Item implements InterfaceSmelling {
    public Soap(String name) {
        super(name);
    }
    private final Smell TYPE = Smell.STRAWBERRY;
    @Override
    public void smell(Person person) {
        this.belongs(person);
        System.out.println( " пахнет " + TYPE.getSmell());
    }
}
