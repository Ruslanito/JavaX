package com.ruslanito.Core.Swing;

import javax.swing.*;
import java.awt.*;

public class JComponent {
    public static void main(String[] args) {
        JFrame jframe = getFrame();
    }


    static JFrame getFrame(){
        JFrame jframe = new JFrame("Window");
        jframe.setVisible(true);
        jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jframe.setBounds(dimension.width/2-250, dimension.height/2-250, 500,500);
        return jframe;
    }
}
