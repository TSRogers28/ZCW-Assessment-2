package com.zipcodewilmington.assessment2.part3;

public class Horse implements Animal {
    String move;
    String color;
    int getSpeed;


    public String move(){
        return "gallop";
    }
    public int getSpeed(){
        return 40;
    }
    public String color(){
        return "brown";
    }
}
