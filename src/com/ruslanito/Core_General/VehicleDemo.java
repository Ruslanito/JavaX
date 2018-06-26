package com.ruslanito.Core_General;

/**
 * Created by user on 01.01.2017.
 */
class Vehicle{
    int passengers; // количество пасажиров
    int fuelcap; // ёмкость топливного бака
    int mpg; // расход топлива в милях на галлон
}
public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle() ;
        int range;

        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;
        // дальность поездки с полным баком
        range = minivan.fuelcap*minivan.mpg;
        System.out.println("Минивэн может перевезти "+ minivan.passengers+ " человек, на расстоние "+range+ " миль.");
    }
}
