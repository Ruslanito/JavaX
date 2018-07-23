package com.ruslanito.Core.Core_Swing;

import javax.swing.*;

/**
 * Created by Ruslanito on 25.02.2017.
 */
public class JFrame_CreateExtends extends JFrame{
    public static void main(String[] args) {
        JFrame_CreateExtends f = new JFrame_CreateExtends();
    }
        // создаём конструктор с параметрами окна
    public JFrame_CreateExtends(){
        int a=300;
        int b=300;
        setSize(a,b);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Учи swing )");
        setVisible(true);
    }
}
