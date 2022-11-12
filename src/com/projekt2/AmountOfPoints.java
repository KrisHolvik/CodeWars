package com.projekt2;

public class AmountOfPoints {
    public static int points(String[] games){
        int numberOfPoints = 0;
        for (String word : games) { //String s : games
            char firstChar = word.charAt(0), //zmienne tego samego typu można definiowac po przecinku
            /*char*/ thirdChar = word.charAt(2);
            if ((int) firstChar > (int) thirdChar) { //zamiast zmieniać typ można dać w nawiasie
                numberOfPoints += 3;                //"int"
            } else if ((int) firstChar == (int) thirdChar) {
                numberOfPoints += 1;
            }
            // numberOfPoints += x>y ? 3 : x==y ? 1 ; 0
        } return numberOfPoints;
    }
}
