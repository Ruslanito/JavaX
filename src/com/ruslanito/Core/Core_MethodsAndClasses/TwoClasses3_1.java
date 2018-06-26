package com.ruslanito.Core.Core_MethodsAndClasses;

public class TwoClasses3_1 {
    public static void main(String[] args) {
        Person person1 = new Person ();
        person1.name = "Donald";
        person1.age = 50;
        System.out.println( "my name is "+person1.name+", and I am "+person1.age+" years old");
        Person person2 = new Person();
        person2.name = "Barak";
        person2.age = 57;
        System.out.println("my name is "+person2.name+", and I am "+person2.age+" years old");
    }
}

class Person{
    String name;
    int age;
}
