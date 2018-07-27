package com.ruslanito.Core.Swing.SwingCreate;

import javax.swing.*;
import java.awt.*;

public class Swing_CreateSimplyExtendsCenter {

    public static void main(String[] args) {
        JFrame frame = new JFrame("JFrameAllwaysCentered"){};

//        frame.setSize(500,500);//dimensions of frame
//        frame.setLocation(150,300);//start points of frame's left top corner
        frame.setVisible(true);//using no layout
        frame.setLayout(null);//making the frame visible
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit on close
//        frame.setBounds(150,300,500,500);//replace setSize & setLocation

//   use resolution of monitor
        Toolkit toolkit = Toolkit.getDefaultToolkit();// 1-st stage to get resolution of monitor
        Dimension dimension = toolkit.getScreenSize();// 2-nd stage to get resolution of monitor
        frame.setBounds(dimension.width/2-250,dimension.height/2-250,500,500);//replace setSize & setLocation



    }

}
