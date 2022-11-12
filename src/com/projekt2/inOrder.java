package com.projekt2;

import java.util.Arrays;

public class inOrder {
    public static boolean isAscOrder(int[] arr) {
        int x;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j <= arr.length; j++) {
                arr[i] = i;
                arr[j] = j;
                x = j - i;
                while (x == 1) {
                    return true;
                }
            }
        }
        return false;
    } //https://www.codewars.com/kata/56b7f2f3f18876033f000307/solutions/java
    }