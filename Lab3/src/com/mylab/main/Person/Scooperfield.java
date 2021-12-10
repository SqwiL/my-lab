package com.mylab.main.Person;

import com.mylab.main.Enum.BodyParts;
import com.mylab.main.Item.Item;
import com.mylab.main.Person.Person;

import java.util.*;

public class Scooperfield extends Person {
    public Scooperfield(String name, Boolean happy, Map<BodyParts,String> mapBodyParts, ArrayList<Item> list) {
        super(name,happy,mapBodyParts,list);
    }
}
