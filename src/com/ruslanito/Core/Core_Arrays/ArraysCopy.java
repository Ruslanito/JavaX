package com.ruslanito.Core.Core_Arrays;

/**
 * Created by user on 21.01.2017.
 */
public class ArraysCopy {
    public static void main(String[] args) {
        int i;
        int nums1[] = new int[10];
        int nums2[] = new int[10];
        //инициализация массива nums1
        for (i = 0; i < nums1.length; i++)
            nums1[i] = i;
        //	System.out.println(nums1[i]+" ");
        //копирование массива в массив
        if (nums2.length>=nums1.length)
            for (i=0;i<nums2.length;i++)
                nums2[i]= nums1[i];
        //вывод массива-копии
        for (i=0;i<nums2.length; i++)
            System.out.print(nums2[i]+" ");
    }
}




