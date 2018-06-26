package com.ruslanito.Core.Core_Arrays;

import javax.xml.bind.SchemaOutputResolver;

/**
 * Created by user on 25.12.2016.
 */
public class Multidimensional_Arrays1 {
    public static void main (String[] args){
        int[][] matrice = {{1,2,3,4,5},
                            {4},
                            {7,8,9}};
        System.out.println( matrice [2][2]);
        String  [][] strings = new String [2][3];// строковый массив
        strings [0][2] = "Hi!";
        System.out.println( strings[0][2]);

        System.out.println();// вывод 2-х мерного массива
        int [][] matrice2= {{1,2,3,4},{5,6,7,8},{9,10,11,12}};

            for (int i=0; i<matrice2.length; i++) {
                for (int j=0; j<matrice2[i].length; j++){
                    System.out.println(matrice2[i][j]); // вывод массива в столбик
                }
                System.out.println();

            }
             for (int i=0; i<matrice2.length; i++) {
                  for (int j=0; j<matrice2[i].length; j++){
                System.out.print(matrice2[i][j]+" "); // вывод массива в своих строках
            }
                 System.out.println();


        }
    }
}
