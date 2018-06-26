package com.ruslanito.Core_General;

/**
 * Created by user on 31.12.2016.
 */
public class Help2 {

    public static void main(String[] args)
            throws java.io.IOException 	{
        char choice, ignore;

        do {
            System.out.println("Справка готова:");
            System.out.println(" 1. if");
            System.out.println(" 2. switch");
            System.out.println(" 3. for");
            System.out.println(" 4. while");
            System.out.println(" 5. do-while");
            System.out.print("Выбери что-то одно");

            choice = (char) System.in.read();

            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');
        } while( choice < '1' | choice > '5');
        System.out.println ("\n");

        switch(choice){
            case '1':
                System.out.println("Оператор if:\n");
                System.out.println(" if (условие) выражение;");
                System.out.println(" else выражение;");
                break;
            case '2':
                System.out.println("Оператор switch:\n");
                System.out.println("switch (выражение) {");
                System.out.println("case переменная:");
                System.out.println("оператор:");
                System.out.println("break;");
                System.out.println("//  ...");
                System.out.println("}");
                break;
            case '3':
                System.out.println(" for :\n");
                System.out.println(" for (инициализация; условие; итерация переменной)");
                System.out.println(" оператор; ");
                break;
            case '4':
                System.out.println(" while :\n");
                System.out.println(" while (условие) оператор;");
                break;
            case '5':
                System.out.println("do-while:\n");
                System.out.println(" do {");
                System.out.println(" оператор;");
                System.out.println("} while (условие)");
                break;
           }
    }
}
