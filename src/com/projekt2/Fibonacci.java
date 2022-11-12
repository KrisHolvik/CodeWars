package com.projekt2;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    public static long fib (int n){
        if (n == 0){
            return 0;
        } else if (n == 1){
            return 1;
        } else {
           return fib(n);
            }
    }
}
