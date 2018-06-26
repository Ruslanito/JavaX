package com.ruslanito.Core_General;

/**
 * Created by user on 31.12.2016.
 */
public class ClassesAndObjects2 {
    public static void main(String[] args) {
        PersonA person1 = new PersonA ();
        person1.name = "Donald";
        person1.age = 50;
            person1.speak(); // вызов метода другого класса
            person1.sayHello();// вызов метода другого класса
            person1.calculateToRetirement();
            int year1 = person1.calculateToRetirement2();
            System.out.println( year1);
        PersonA person2 = new PersonA();
        person2.name = "Barak";
        person2.age = 57;
            person2.speak(); // вызов метода другого класса
            person2.sayHello();// вызов метода другого класса
            person2.calculateToRetirement();
            int year2 = person2.calculateToRetirement2();
            System.out.println( year2);
    }
}
class PersonA{
    String name;
    int age;
    void speak (){
        System.out.println("My name is "+name+", and I am "+age+" years old");
    }
    void sayHello(){
        System.out.println("Hi,I am "+name);
    }
    void calculateToRetirement(){
        int years =60-age;
        System.out.println("I need "+years+" years to retirement");
    }
    // возврат значения
    int calculateToRetirement2(){
        int years1 = 60-age;
        return years1;

    }
}

