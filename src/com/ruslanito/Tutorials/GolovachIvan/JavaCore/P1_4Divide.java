package com.ruslanito.Tutorials.GolovachIvan.JavaCore;

/**
 * Created by Ruslanito on 08.02.2017.
 */
public class P1_4Divide {
    public static void main(String[] args) {
        for (int k= 0; k <= 10; k++){
            System.out.println(k+"%2 ="+(k%2));
            System.out.println(k+"/2 ="+(k/2));
            System.out.println(k+"/2.0 ="+(k/2.0));
            System.out.println();
        }
          //System.out.println(1/0); Делить на 0 int нельзя!!!!
            System.out.println(1.0/0); //Ответ "Infinity" (бесконечность)
            System.out.println(-1.0/0);//Ответ "-Infinity" (минус бесконечность)
            System.out.println(0.0/0); //Ответ "NaN" (not a number)
            System.out.println(-0.0/0); //Ответ "NaN" (not a number)

        System.out.println();
        String str = "123.5";
        double d = Double.valueOf(str);
        System.out.println("d="+d+"  d*2="+d*2);

        System.out.println();
        String str1 = "NaN";
        double d1 = Double.valueOf(str1);
        System.out.println("d1="+d1+"  d1*2="+d1*2);


    }
}
