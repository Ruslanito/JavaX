package com.ruslanito.MyProjects.Water.General;

/** Потребление воды **
 * Created by user on 03.01.2017.
 */
public class Water2 {
    public static void main(String[] args)
        throws java.io.IOException{
        char choice, ignore;
        WaterCounter x = new WaterCounter();
        StartMenu y = new StartMenu();
        RunOrQuit z = new RunOrQuit();

        for (;;) { //бесконечный цикл работы программы
            do {
                y.StartMenu();
                choice = (char) System.in.read ();
                do {
                    ignore = (char)System.in.read();
                } while (ignore != '\n');
            }   while ( !z.isvalid(choice));
            if (choice == 'q')break;

            System.out.println("* * * * * * *");
            x.m = 10;
            x.n = 23000;
            int v = x.countV();
            int vs = x.countVS();
            System.out.println(x.m + "-" + x.n + "-" + v + "-" + vs);
        }
    }
}

class WaterCounter {        //x
    int v;//Объём воды за 1 день
    int vs = 0;//Объём воды за m дней
    int k = 113;//Коэффициент наклона кривой
    int m;//День расчёта
    int n;//Количесвто птицы в птичнике

    int countV() { // Объём воды за 1 день
        v = k * m * n / 10000;
        return v;
    }

    int countVS() { // Объём воды за m дней
        for (int i = 1; i <= m; i++) {
            vs = vs + (k * i * n) / 10000;
        }
        return vs;
    }
}

class   StartMenu{      //y
    void StartMenu () {
        System.out.println("*************************************************");
        System.out.println("Начальное меню программы");
        System.out.println("Введи (1) для начала работы или (q) для выхода");
        System.out.println("*************************************************");
    }
}

class RunOrQuit{        //z
    boolean isvalid (int ch){
        if (ch !='1' & ch !='q') return false;
        else return true;
    }
}



