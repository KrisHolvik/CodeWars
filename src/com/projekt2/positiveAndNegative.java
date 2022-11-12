package com.projekt2;

public class positiveAndNegative {
    public static int[] countPositivesSumNegatives(int[] input) {

        if (input.length==0 || input==null){
            int[] emptyArray = {};
            return emptyArray;
        }

        int numberOfPositive = 0;
        int sumOfNegative = 0;
        for (int i=0; i< input.length; i++){
            if (input[i]>0){
                numberOfPositive++;
            } else if (input[i]<0){
                sumOfNegative += input[i];
            }
        } int[] countPositivesSumNegatives = {numberOfPositive, sumOfNegative};
        return countPositivesSumNegatives; //return an array with count of positives and sum of negatives
    }
}
