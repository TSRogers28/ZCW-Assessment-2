package com.zipcodewilmington.assessment2.part1;

public class WuTangConcatenator {

    int input;

    public WuTangConcatenator(int input){
      this.input = input;
    }

    public Boolean isTang(){
        return (input%5 == 0);
    }

    public Boolean isWu(){
        return(input%3 == 0);

    }

    public Boolean isWuTang(){
        return(input%15 == 0);
    }
}
