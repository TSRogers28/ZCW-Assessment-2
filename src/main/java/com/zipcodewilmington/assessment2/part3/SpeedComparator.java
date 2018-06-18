package com.zipcodewilmington.assessment2.part3;

import java.util.Comparator;



public class SpeedComparator implements Comparator<Animal>{

    public int compare(Animal o1, Animal o2) {
        int animal1 = o1.getSpeed();
        int animal2 = o2.getSpeed();

        if(animal1 == animal2)
        return 0;

        else if(animal1 > animal2)
        return 1;

        else
            return -1;
    }


}
