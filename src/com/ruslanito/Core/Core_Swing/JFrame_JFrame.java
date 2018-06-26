package com.ruslanito.Core.Core_Swing;

import javax.swing.*;

/**
 * Created by Ruslanito on 25.02.2017.
 */
public class JFrame_JFrame extends JFrame{
    public static void main(String[] args) {
        JFrame_JFrame f = new JFrame_JFrame();
    }
        // создаём конструктор с параметрами окна
    public JFrame_JFrame(){
        int a=300;
        int b=300;
        setSize(a,b);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Учи swing )");
        setVisible(true);
    }
}
