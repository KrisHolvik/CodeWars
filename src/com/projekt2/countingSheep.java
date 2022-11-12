package com.projekt2;

public class countingSheep {
    public int countSheep(Boolean[] arrayOfSheeps) {
        //przyjmuje tablicę jednowymiarową Booleanów
        int numberOfSheep = 0;
        for (int i = 0; i < arrayOfSheeps.length; i++) {
            if (arrayOfSheeps[i]) {          //arrayOfSheeps[i] == true;
                numberOfSheep += 1;
            } else if (!arrayOfSheeps[i]) {  //arrayOfSheeps[i] != true;
                continue;
            }
        }
        return numberOfSheep;
    }
}