package com.ruslanito.Tutorials.GolovachIvan.JavaCore;
import java.util.Arrays;
/**
 * Created by Ruslanito on 08.02.2017.
 */
public class P1_1Arrays {
    public static void main(String[] args) {
        int [] array1D = {0,1,2,3};
        int [][] array2D = {{0,1},{2,3}};

        System.out.println(array1D); //вывод хэша 1-го массива
        System.out.println(array2D);//вывод хэша 2-го массива
        System.out.println("***");
        System.out.println(Arrays.toString(array1D));
        System.out.println(Arrays.toString(array2D));
        System.out.println("***");
        System.out.println(Arrays.toString(array1D));
        System.out.println(Arrays.deepToString(array2D));
    }
}
