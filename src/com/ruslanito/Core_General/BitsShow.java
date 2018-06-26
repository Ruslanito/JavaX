package com.ruslanito.Core_General;

/**
 * Created by Ruslanito on 04.02.2017.
 */
class ShowBits {
    int numbits;

    ShowBits(int n) {
        numbits = n;
    }

    void show(long value) {
        long mask = 1;

        mask <<= numbits - 1;//сдвинуть значение 1 влево на нужную позицию

        int spacer = 0;
        for (; mask != 0; mask >>>= 1) {
            if ((value & mask) != 0)
                System.out.print("1");
            else System.out.print("0");
            spacer++;
            if ((spacer % 8) == 0) {
                System.out.print(" ");
                spacer = 0;
            }

        }
        System.out.println();

    }
}

class BitsShow {
    public static void main(String[] args) {
        ShowBits b = new ShowBits(8);
        ShowBits k = new ShowBits(16);
        ShowBits i = new ShowBits(32);
        ShowBits l = new ShowBits(64);

        System.out.println("123 в двоичном представлении: ");
        b.show(123);

        System.out.println("\n12876 в двоичном представлении: ");
        k.show(12876);

        System.out.println("\n87987 в двоичном представлении: ");
        i.show(89987);

        System.out.println("\n237658768 в двоичном представлении: ");
        l.show(237658768);

        System.out.println("\nМладшие 8 разрядов  числа 87987 в двоичной СС:");
        b.show(87987);

    }

}
