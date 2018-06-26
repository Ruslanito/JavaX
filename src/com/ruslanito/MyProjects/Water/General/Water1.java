package com.ruslanito.MyProjects.Water.General; /**
 * Created by user on 03.01.2017.
 */
import java.util.Scanner;

public class Water1 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Расчёт потребления воды.");
        System.out.println("Введите исходные данные:");
        //System.out.println("Количество птичников:");
        int a=1;
        //int a=sc.nextInt();//ввод количество птичников (a)
        if(a>9||a<1){
            System.out.println("Такого птичника пока нет!");
        }
        //	System.out.println("Количество птицы в птичнике "+a);
        int n=23000;
        //int n=sc.nextInt();//  ввод количества птицы (n) в птичнике (а)
        if(n>45000||n<15000){
            System.out.println("Такое количество птицы в одном птичнике пока не может быть!");
        }
        //	System.out.println("Введите значение кривой наклона");
        int k=113;
        //int k=sc.nextInt();//  экспериментальное значение кривой наклона k=113
        if(k>120||k<105){
            System.out.println("Такое значения не может быть!");
        }
        System.out.println("Введите день посадки m");
        int m=sc.nextInt();//ввод дня посадки (m)
        sc.close();
        if(m>45||m<2){
            System.out.println("Такого дня посадки пока нет!");
        }
        int v=k*m*n/10000;
        System.out.println("Объём потреблёной воды за "+m+"-й день в птичнике "+a+" в литрах "+v);

        int vs=0;//объём с 0-го дня
        int x;
        int vsum;//объём воды за день m
        for (x=1; x<=m; x++){
            System.out.println(m+"-"+x);
            vs=vs+(k*x*n/10000);
            vsum=(k*x*n/10000);
            System.out.println("Общий объём потреблёной воды c 0-го дня по день "+(x-1)+" равен в литрах "+vs+" в т.ч. за последний день "+vsum);
        }
    }
}
