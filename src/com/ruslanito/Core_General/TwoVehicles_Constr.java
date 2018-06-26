package com.ruslanito.Core_General;

/**
 * Created by user on 15.01.2017.
 */
class Vehicle5{
    int passengers;
    int fuelcap;
    int mpg;

    Vehicle5 (int p, int f, int m){ // конструктор
        passengers = p;
        fuelcap = f;
        mpg = m;
    }

    int range(){ //дальность поездки ТС
      return mpg*fuelcap;
    }

    double fuelneeded (int miles){
        return  (double) miles/mpg;
    }
}

public class TwoVehicles_Constr {
    public static void main(String[]  args) {
        Vehicle5 minivan = new Vehicle5(7,16,21);
        Vehicle5 sportcar = new Vehicle5(2,14,12);
        double gallons;
        int dist = 225;

        gallons = minivan.fuelneeded(dist);
        System.out.println("Для преодоления "+dist+" миль минивену требуется "+gallons+" галлонов топлива");

        gallons = sportcar.fuelneeded(dist);
        System.out.println("Для преодоления "+dist+" миль спорткару требуется "+gallons+" галлонов топлива");
    }
}
