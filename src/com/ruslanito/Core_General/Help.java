package com.ruslanito.Core_General;

/**
 * Created by user on 31.12.2016.
 */
public class Help {

    public static void main(String[] args)
            throws java.io.IOException 	{
        char choice;

        System.out.println("Справка готова:");
        System.out.println(" 1. if");
        System.out.println(" 2. switch");
        System.out.println("Выбери что-то одно");
        choice=(char) System.in.read();

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
            default:
                System.out.print("Сделай верный ввод");
        }

    }

}
