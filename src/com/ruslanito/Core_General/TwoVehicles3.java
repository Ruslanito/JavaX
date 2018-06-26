package com.ruslanito.Core_General;

/**
 * Created by user on 02.01.2017.
 */
class Vehicle3{
    int passengers; // количество пасажиров
    int fuelcap; // ёмкость топливного бака
    int mpg; // расход топлива в милях на галлон
    int range(){
        return mpg*fuelcap;
    }
}
public class TwoVehicles3 {
    public static void main(String[] args) {
        Vehicle3 minivan = new Vehicle3();
        Vehicle3 sportcar = new Vehicle3();
        int range1, range2;

        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;
        range1 = minivan.range();

        sportcar.passengers = 2;
        sportcar.fuelcap = 14;
        sportcar.mpg = 12;
        range2 = sportcar.range();

        System.out.println("Минивэн может перевезти " + minivan.passengers + " человек на расстояние "+range1+" миль.");

        System.out.println("Спорткар может перевезти " + sportcar.passengers + " человек на расстояние "+range2+" миль.");

    }
}