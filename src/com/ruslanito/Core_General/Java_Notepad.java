package com.ruslanito.Core_General;

import java.io.IOException;

/**
 * Created by Ruslanito on 25.02.2017.
 */
public class Java_Notepad {
    public static void main(String[] args) {
        try {
            Runtime.getRuntime().exec("notepad.exe");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
