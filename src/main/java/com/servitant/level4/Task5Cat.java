package com.servitant.level4;

public class Task5Cat {
    private static int catsCount = 0;

    public static void setCatsCount (int catsCount) {
        Task5Cat.catsCount = catsCount;//напишите тут ваш код
    }

    public static void main (String[] args) {
        //Ниже просто проверка работоспособности
        setCatsCount (5);
        System.out.println (catsCount);
        setCatsCount (6);
        System.out.println (catsCount);
    }
}
