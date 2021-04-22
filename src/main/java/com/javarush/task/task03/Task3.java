package com.javarush.task.task03;

public class Task3 {

/*
Обмен валют
*/

    public static void main (String[] args) {
        System.out.println (convertEurToUsd (25, 1.2));//напишите тут ваш код
        System.out.println (convertEurToUsd (29, 1.2));
    }

    public static double convertEurToUsd (int eur, double exchangeRate) {
        return eur * exchangeRate;
    }
}

