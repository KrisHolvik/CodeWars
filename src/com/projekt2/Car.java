package com.projekt2;
public class Car extends Vehicle {

    @Override
    void go() {
        System.out.println("The driver is driving a car");
    }
}
/*public class Car {
    String name;
    static int numberOfCars;
    Car(String name){
        this.name = name;
        numberOfCars++;
    }
    static void displayCars() {
        System.out.println("You have "+numberOfCars+" cars");
    }
}*/
