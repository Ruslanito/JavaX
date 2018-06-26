package com.ruslanito.Core_General;

import java.util.Scanner;

/**
 * Created by Ruslanito on 04.02.2017.
 */
public class ORCodingEncoding {
    public static void main(String[] args) {
        String msg = "This is a test message";
        String encmsg = "";
        String decmsg = "";
        int key;

        System.out.print("Исходное сообщение:");
        System.out.println(msg);

        System.out.println("Введи ключ шифрвания:");
        Scanner sc = new Scanner(System.in);
        key = sc.nextInt();
        System.out.println("Ключ шифрования равен "+key);

        //Шифруем сообщение
        System.out.println();
        for (int i = 0; i < msg.length(); i++)
            encmsg = encmsg + (char) (msg.charAt(i) ^ key);
        System.out.print("Зашифрованное сообщение:");
        System.out.println(encmsg);

        //Дешифруем сообщение
        System.out.println();
        for (int i = 0; i<msg.length();i++)
            decmsg = decmsg+(char) (encmsg.charAt(i)^key);
        System.out.print("Дешифруемое сообщение:");
        System.out.println(decmsg);
    }
}
