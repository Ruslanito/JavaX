package com.ruslanito.Core.Core_Arrays;

/**
 * Created by ДОМ on 16.01.2017.
 */
public class Arrays2 {
    public static void main (String [] args){
        int n=10;
        int [] mass = new int[n];
        for (int i=0; i<mass.length; i++){
            mass [i]=i*i;
            System.out.print(mass[i]+" ");
        }
        System.out.println();//случайный массив
        for (int i=0; i<mass.length; i++){
            mass[i]=(int)Math.round(Math.random()*100);
            System.out.println(mass[i]);
        }
        int min=0;//поиск минимального элемента массива
        for (int i=0; i<mass.length; i++){
            min=mass[i];
            for (int j=0; j<mass.length; j++ ){
                if(min>mass[j]){
                    min=mass[j];
                }
            }
        }
        System.out.println("Минимальный элемент массива min - "+min);

        int max=0;//поиск максимального элемента массива
        for (int i=0; i<mass.length; i++){
            max=mass[i];
            for (int j=0; j<mass.length; j++ ){
                if(max<mass[j]){
                    max=mass[j];
                }
            }
        }
        System.out.println("Максимальный элемент массива max - "+max);

        int summ = 0;// сумма элементов массива
        for (int i =0; i<mass.length; i++){
            summ=summ+mass[i];
        }
        System.out.println("Сумма элементов массива summ - "+summ);
    }
}
