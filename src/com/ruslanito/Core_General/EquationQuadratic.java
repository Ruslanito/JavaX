package com.ruslanito.Core_General;

/**решение биквадратного уравнения
 * Created by Ruslanito on 30.01.2017.
 */
public class EquationQuadratic {
    public static void main(String[] args) {
        double [] mas  = EquationQuadratic.equation(1, 2, -3);
        for (double ma : mas) {
            if (ma < 0) {
                continue;
            }
            if (ma == 0) {
                System.out.println("x=0");
                continue;
            }
            System.out.println("x=" + (-Math.sqrt(ma)));
            System.out.println("x=" + (Math.sqrt(ma)));
        }
    }


    public static double[] equation(double a, double b, double c) {
        double d = b * b - 4 * a * c;// дискиминанат
        double mas[] = null;

        if (d > 0) {//конда дискиминант больше 0 - 2 корня
            mas = new double[2];
            mas[0] = (-b + Math.sqrt(d)) / (2 * a);
            mas[1] = (-b - Math.sqrt(d)) / (2 * a);
        }

        if (d == 0) {//конда дискиминант равен 0 - 1 корень
            mas = new double[1];
            mas[0] = -b / (2 * a);
        }

        if (d < 0) {//конда дискиминант меньше 0 - 0 корней
            mas = new double[0];
            System.out.println("Нет корней уравнения");
        }
        return mas;
    }
}
