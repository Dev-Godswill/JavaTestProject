package com.codewithdaudu;

public abstract class Vehicle {

    Integer NumberOfWheels;
    long ModelName;
    long Brand;

    public static void main(String[] args) {
	// write your code here
        System.out.println("Move in Car Class");
    }

    public abstract void move();
}
