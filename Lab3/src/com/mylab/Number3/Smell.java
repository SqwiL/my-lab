package com.mylab.Number3;

public enum Smell  {
    STRAWBERRY("Земляника"),
    TIDE("Тайд"),
    DRAGS("\"Что то запрещенное\"");
    private String name;
    Smell(String name){
        this.name = name;
    }
    public String getSmell() {
        return name;
    }
}
