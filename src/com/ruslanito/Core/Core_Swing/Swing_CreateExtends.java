package com.ruslanito.Core.Core_Swing;

import javax.swing.*;

/**
 * Created by Ruslanito on 25.02.2017.
 */
public class Swing_CreateExtends extends JFrame{
    public static void main(String[] args) {

        Swing_CreateExtends f = new Swing_CreateExtends();
    }
        // создаём конструктор с параметрами окна
    public Swing_CreateExtends(){
        int a=300;
        int b=300;
        setSize(a,b);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Учи swing )");
        setVisible(true);
    }
}
