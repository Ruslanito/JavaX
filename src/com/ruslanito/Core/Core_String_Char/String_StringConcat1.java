package com.ruslanito.Core.Core_String_Char;

//Вычисление времени работы String concatination +=

public class String_StringConcat1
{
    private static long time;

    public static void main(String[] args)
    {

        saveTime();
        String s = "Привет";
        for(int i = 0; i < 10000; ++i)
        {
            s+=i;
        }
        printDiff();

    }
    private static void saveTime()
    {
        time = System.currentTimeMillis();
    }

    private static void printDiff()
    {
        System.out.println((System.currentTimeMillis() - time) + "ms");
    }
}