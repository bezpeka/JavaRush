package com.servitant.level4;

/*
Учет котов
Напиши код в методе addNewCat, чтобы при его вызове количество котов увеличивалось на 1.
За количество котов отвечает переменная catsCount.
*/
public class Task4Cat {
    private static int catsCount = 0;

    public static void addNewCat () {
        catsCount++;//напишите тут ваш код
    }

    public static void main (String[] args) {
        addNewCat ();
        System.out.println (catsCount);
    }
}

