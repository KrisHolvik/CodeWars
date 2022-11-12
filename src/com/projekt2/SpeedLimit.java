package com.projekt2;

public class SpeedLimit {
    public static int speedLimit(final int speed, final int[] signals){
        //100, 120,140, 150
        int amount = 0;
        for (int i=0; i<signals.length; i++){
            int signal = signals[i];
            int exceeding = speed-signal;
            if (exceeding<9){
                amount = 0;
            } else if (10>=exceeding||19<=exceeding){
                amount += 100;
            } else if (exceeding>=20||exceeding<=29){
                amount += 250;
            } else {
                amount += 500;
            }
        } return amount;
    }
}
