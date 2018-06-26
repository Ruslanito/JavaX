package com.ruslanito.Core_General;

/** Параметризированный метод
 * Created by user on 14.01.2017.
 */
class Vehicles4 {
    int passengers;
    int fuelcap;
    int mpg;

    int range () { //дальность поездки
        return mpg*fuelcap;
    }

    double fuelneeded (int miles){ //необходмимый объём топлива
        return (double) miles/mpg;
    }
}

public class TwoVehicles4 {
    public static void main(String[] args) {
        Vehicles4 minivan = new Vehicles4();
        Vehicles4 sportcar = new Vehicles4();
        double gallons;
        int dist = 252;

        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        sportcar.passengers = 2;
        sportcar.fuelcap = 14;
        sportcar.mpg = 12;

        gallons= minivan.fuelneeded(dist);

        System.out.println("Для преодоления "+dist+" миль микроавтобусу потребуется "+gallons+" галлонов топлива.");
        System.out.println("Для преодоления "+dist+" миль спорткару потребуется "+gallons+" галлонов топлива.");

    }
}
