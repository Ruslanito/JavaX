package com.ruslanito.Core_General;

/** сборка мусора
 * Created by user on 15.01.2017.
 */
class FDemo{
    int x;
    FDemo (int i){
        x=i;
    }
  
	protected void finalize (){
        System.out.println("Финализация"+x);
    }

    void generator (int i){
        FDemo obj = new FDemo(i);
    }
}

public class Finalize {
    public static void main(String[] args) {
        int count;

        FDemo ob = new FDemo(0);
        for (count=1; count <100000000; count++)
            ob.generator(count);
    }
}
