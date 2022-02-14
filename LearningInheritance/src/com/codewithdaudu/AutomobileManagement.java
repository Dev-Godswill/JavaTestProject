package com.codewithdaudu;

public class AutomobileManagement {

    public static void main(String[] args) {
        Car Mercedes = new Car();
        Car bmw = new Car();
        Mercedes.NumberOfWheels=1;

        Bike Spitfire = new Bike();
        Bike venom = new Bike();
        venom.NumberOfWheels=2;
        Spitfire.NumberOfWheels=2;

        bmw.move();

    }
}
