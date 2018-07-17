package com.ruslanito.Core.Core_IF;

import javax.swing.*;

public class IF_InputOutput {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Input numbers");

        String str1 = JOptionPane.showInputDialog("Input Number #1");
        String str2 = JOptionPane.showInputDialog("Input Number #2");
        System.out.println("str1=" + str1+ "; str2=" +str2);

        if (str1 != null && str1 != ("") && str2 !=null && str2 !=("")) {

        } else {
            System.out.println("Enter numbers");
        }

    }
}
