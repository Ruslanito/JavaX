package com.ruslanito.Core_General;

/**
 * Created by user on 02.01.2017.
 */
class Vehicle2{
    int passengers; // количество пасажиров
    int fuelcap; // ёмкость топливного бака
    int mpg; // расход топлива в милях на галлон
    void range(){
        System.out.println("Расстояие составит "+fuelcap*mpg+"миль.");
    }
}
public class TwoVehicles2 {
    public static void main(String[] args) {
        Vehicle2 minivan = new Vehicle2();
        Vehicle2 sportcar = new Vehicle2();
        int range1, range2;

        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;
        sportcar.passengers = 2;
        sportcar.fuelcap = 14;
        sportcar.mpg = 12;

        System.out.print("Минивэн может перевезти "+ minivan.passengers+ " человек.");
        minivan.range();

        System.out.print("Спорткар может перевезти "+ sportcar.passengers+ " человек.");
        sportcar.range();
    }
}
