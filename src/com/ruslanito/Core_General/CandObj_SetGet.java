package com.ruslanito.Core_General;

/**
 * Created by user on 14.01.2017.
 */
public class CandObj_SetGet {
    public static void main(String[] args) {
        Person1 person1 = new Person1();
        person1.setName("Родион");
        person1.setAge(35);
        person1.getName();
        System.out.println("Выводим значение имени в методе main: "+person1.getName());
        person1.getAge();
        System.out.println("Выводим значение возраста в методе main: "+person1.getAge());
        person1.speak();
    }
}

class Person1{
    private String name;
    private int age;

    public  void setName(String userName){
        if (userName.isEmpty()){
            System.out.println("!!Ты ввёл пустое имя");
        } else{
        name = userName;}
    }

    public String getName() {
        return name;
    }

    public void setAge(int userAge) {
        if (userAge<0){
            System.out.println("!!Возраст должен быть положительным");
        }else{
       age = userAge;}
    }

    public int getAge() {
        return age;
    }

    void  speak(){
        System.out.println("Меня зовут "+name+ ", мне "+age+" лет.");
    }
}