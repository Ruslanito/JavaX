package com.ruslanito.Core.Core_Exception;

public class ErrorMsg1 {
    public static void main(String[] args) {
        ErrorMessages2 err = new ErrorMessages2();

        System.out.println(err.getErrorMessages2(2));
        System.out.println(err.getErrorMessages2(10));
    }
}

class ErrorMessages2 {
    String msgs[] = {
            "Ошибка ввода",
            "Ошибка вывода",
            "Нет места на диске",
            "Выход за границы диапазона"
    };

    String getErrorMessages2(int i) {
        if (i >= 0 & i < msgs.length)
            return msgs[i];
        else
            return "Несуществующий код ошибки";
    }

}