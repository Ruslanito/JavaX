package com.ruslanito.Core.Core_Swing;

import javax.swing.*;

/**
 * Created by Ruslanito on 25.02.2017.
 */
public class Swing_CreateExtends extends JFrame{
    JFrame fr;
    public static void main(String[] args) {
        new Swing_CreateExtends();

    }
        // создаём конструктор с параметрами окна
    Swing_CreateExtends(){
        int a=300;
        int b=300;
        setSize(a,b);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Frame inhetitance");
        setVisible(true);
        setLayout(null);
    }
}
