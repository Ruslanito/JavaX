package com.ruslanito.Core_General;

/**
 * Created by user on 14.01.2017.
 */
public class CandObj_Constr {
    public static void main(String[] args) {
        Human2 human = new Human2("Jack");
    }
}

class Human2 {
    private String name;
    private int age;

    public Human2(){ //конструктор по умолчанию
        System.out.println("Первый конструктор");
        this.name = "Имя по умолчанию";
        this.age = 0;
    }

    public Human2 (String name){ //конструктор со String
        System.out.println("Второй конструктор");
        this.name = name;
    }

    public Human2 (String name, int age){
        System.out.println("Третий конструктор");
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
}