package com.ruslanito.Tutorials.Javabegin.FastJava.Start;

import com.ruslanito.Tutorials.Javabegin.FastJava.Object.Car;

/**
 * Created by Ruslanito on 26.02.2017.
 */
public class CarMain {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setName("BMW");
        car1.setColour("Black");
        car1.getName();
        car1.getColour();

        System.out.println("car1.getName() = " + car1.getName());
        System.out.println("car1.getColour() = " + car1.getColour());


    }
}
