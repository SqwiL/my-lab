package com.mylab.main.Person;

import com.mylab.main.Enum.BodyParts;
import com.mylab.main.Item.Item;

import java.util.ArrayList;
import java.util.Map;

public class Krabs extends Person {
    public Krabs(String name, Boolean happy, Map<BodyParts,String> mapBodyParts, ArrayList<Item> list) {
        super(name,happy,mapBodyParts,list);
    }
}
