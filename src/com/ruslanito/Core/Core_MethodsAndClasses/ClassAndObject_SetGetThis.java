package com.ruslanito.Core.Core_MethodsAndClasses;

public class ClassAndObject_SetGetThis {
    public static void main(String[] args) {
        Human1 human1 = new Human1();
        human1.setAge(18);
        human1.setName("Иполит");
        human1.getInfo();
    }
}

class Human1 {
    String name;
    int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void getInfo() {
        System.out.println(name + ", " + age);
    }
}
