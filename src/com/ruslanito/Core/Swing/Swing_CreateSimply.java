package com.ruslanito.Core.Swing;

import javax.swing.*;

public class Swing_CreateSimply {
    public static void main(String[] args) {
        //creating Frame
        JFrame fr = new JFrame();
        //frame's options
        fr.setSize(400,500);//dimensions of frame
        fr.setTitle("Swing");//Title of Frame
        fr.setLayout(null);//using no layout
        fr.setVisible(true);//making the frame visible
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit on close
        //add button
        JButton bt = new JButton("click here");
        //button's options
        bt.setBounds(100,150,100,50);
        //adding JButton in JFrame
        fr.add(bt);
    }
}
