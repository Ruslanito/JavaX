package com.ruslanito.Core.Swing.SwingCreate;

import javax.swing.*;

public class Swing_CreateConstructor {
    JFrame fr;

    public static void main(String[] args) {
        new Swing_CreateConstructor();
    }

    Swing_CreateConstructor(){
        fr = new JFrame();
        int a=300;
        int b=300;
        fr.setSize(a,b);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setTitle("Frame Constructor");
        fr.setVisible(true);
        fr.setLayout(null);
    }
}
