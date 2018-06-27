package com.ruslanito.Core.Core_String_Char;

//вычисление времени работы StringBuilder

public class String_StringConcat2
{
    private static long time;

    public static void main(String[] args)
    {

        saveTime();
        StringBuilder sb = new StringBuilder("Привет");
        for(int i = 0; i < 10000; ++i)
        {
            sb.append(i);
        }
        String s = sb.toString();
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