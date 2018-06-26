package com.ruslanito.Core_General;

/**
 * Created by user on 22.01.2017.
 */
class FailSoftArray {
    private int a[];
    private int errval; // ошибка по методу get()
    public int length;

    public FailSoftArray(int size, int errv) {
        a = new int[size];
        errval = errv;
        length = size;
    }

    public int get(int index) {
        if (ok(index)) return a[index];
        return errval;
    }

    public boolean put(int index, int val) {
        if (ok(index)) {
            a[index] = val;
            return true;
        }
        return false;
    }

    private boolean ok(int index) {
        if (index >= 0 & index < length) return true;
        return false;
    }
}

public class ClassAcces2 {
    public static void main(String[] args) {
        FailSoftArray fs = new FailSoftArray(5, -1);
        int x;
        System.out.println(" Обработка ошибок без вывода отчёта");
        for (int i = 0; i < (fs.length * 2); i++)
            fs.put(i, i * 10);
        for (int i = 0; i < (fs.length * 2); i++) {
            x = fs.get(i);
            if (x != -1) System.out.print(x + " ");
        }
        System.out.println("");

        System.out.println("\n Обработка ошибок с выводом отчёта");
        for (int i = 0; i < (fs.length * 2); i++)
            if (!fs.put(i, i * 10))
        System.out.println("Индекс " + i + "вне допустимого диапазона");

        for (int i = 0; i < (fs.length * 2); i++) {
            x = fs.get(i);
            if (x != -1) System.out.print(x + " ");
            else
                System.out.println("Индекс " + i + " вне допустимого диапазона");
        }
    }
}


