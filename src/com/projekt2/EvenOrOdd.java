package com.projekt2;

public class EvenOrOdd {
    public static String even_or_odd(int number) {
        //parzyste czy nieparzyste
    if((number%2)==0){
        return "even";
    } else {
        return "odd";
    }
    }
}
/*
return (number%2 ==0) ? "Even" : "Odd";
*/