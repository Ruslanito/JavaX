package com.ruslanito.Core.Core_Swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Ruslanito on 25.02.2017.
 */
public class JFrame_JButton implements ActionListener {
    public static void main(String[] args) {
        new JFrame_JButton();
    }

    JFrame_JButton() {
        JFrame f = new JFrame("Окно");
        JButton b = new JButton("Кнопка");

        f.add(b);
        b.addActionListener(this);

        f.setSize(300,300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        JOptionPane.showConfirmDialog(null, "Ты нажал кнопку", "Окно ответа", JOptionPane.PLAIN_MESSAGE);
    }
}
