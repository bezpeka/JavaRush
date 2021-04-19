package com.javarush.task.task04.cycles;
/*
Задаем строковую переменную и присваиваем ей значеие S.
Создаем переменную типа инт counter = 1.
Пока counter<=100, печатаем S,
но если counter без остатка делится на 10,
печатаем перевод строки.
Счетчик наращиваем.
 */

public class Task4v1 {
    public static void main (String[] args) {
        String s = "S";
        int counter = 1;
        while (counter <= 100) {
            System.out.print (s);
            if (counter % 10 == 0){
                System.out.println ();
            }
            counter++;
        }
    }
}
