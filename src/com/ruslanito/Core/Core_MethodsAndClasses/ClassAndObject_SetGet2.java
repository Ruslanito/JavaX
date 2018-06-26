package com.ruslanito.Core.Core_MethodsAndClasses;

class ClassAcces1 {
    private int alpha;  //закрытый доступ
    public int beta;   //открытый доступ
    int gamma;  //открытый доступ по умолчанию

    void setAlpha(int a) {
        alpha = a;
    }

    int getAlpha() {
        return alpha;
    }
}

class ClassAndObject_SetGet2 {
    public static void main(String[] args) {
        ClassAcces1 obj = new ClassAcces1();

        obj.setAlpha(100);//доступ в закрытой переменной alpha только через set-get
        System.out.println("obj.alpha = " + obj.getAlpha());

        obj.beta = 195;
        obj.gamma = 23;
        System.out.println("obj.beta = " + obj.beta);
        System.out.println("obj.gamma = " + obj.gamma);
    }
}
