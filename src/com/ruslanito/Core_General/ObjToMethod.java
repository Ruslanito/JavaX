package com.ruslanito.Core_General;

//import com.sun.deploy.security.ruleset.BlockRule;

/**
 * Передача объекта методам
 * Created by Ruslanito on 12.02.2017.
 */
public class ObjToMethod {
    public static void main(String[] args) {
        Block obj1=new Block(10,2,5);
        Block obj2=new Block(10,2,5);
        Block obj3=new Block(4,5,5);
        System.out.println("obj1 равен по размерам obj2:"+obj1.sameBlock(obj2));
        System.out.println("obj1 равен по размерам obj3:"+obj1.sameBlock(obj3));
        System.out.println("obj1 равен по объёму obj3:"+obj1.sameVolume(obj3));
    }

}

class Block {
    int a, b, c;
    int volume;

    Block(int i, int j, int k) {
        a = i;
        j = b;
        k = c;
        volume = a*b*c;
    }

    boolean sameBlock(Block obj){
        if ((obj.a==a)&(obj.b==b)&(obj.c==c))return  true;
        else return false;
    }

    boolean sameVolume(Block obj){
        if (obj.volume==volume)return true;
        else return false;
    }
}