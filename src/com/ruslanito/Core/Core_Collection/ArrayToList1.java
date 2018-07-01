package com.ruslanito.Core.Core_Collection;


import java.util.Arrays;
import java.util.List;

public class ArrayToList1 {
    public static void main(String[] args) {
        String[] cars = {"BMW","AUDI", "VW"};
        List<String> carList = Arrays.asList(cars);

        for (String car: carList){
            System.out.println(car);
        }

    }
}
