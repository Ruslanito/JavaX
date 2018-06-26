package com.ruslanito.Core_General;

/**
 * Created by user on 01.01.2017.
 */
class Vehicle1{
    int passengers; // количество пасажиров
    int fuelcap; // ёмкость топливного бака
    int mpg; // расход топлива в милях на галлон
}
public class TwoVehicles {
    public static void main(String[] args) {
      Vehicle minivan = new Vehicle();
      Vehicle sportcar = new Vehicle();
      int range1, range2;

      minivan.passengers = 7;
      minivan.fuelcap = 16;
      minivan.mpg = 21;
      sportcar.passengers = 2;
      sportcar.fuelcap = 14;
      sportcar.mpg = 12;

      range1 = minivan.fuelcap*minivan.mpg;
      range2 = sportcar.fuelcap*sportcar.mpg;

        System.out.println("Минивэн может перевезти "+ minivan.passengers+ " человек, на расстоние "+range1+ " миль.");
        System.out.println("Спорткар может перевезти "+ sportcar.passengers+ " человек, на расстоние "+range2+ " миль.");
    }
}
