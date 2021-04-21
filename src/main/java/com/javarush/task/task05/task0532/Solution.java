package com.javarush.task.task05.task0532;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Задача по алгоритмам

Написать программу, которая:
1. считывает с консоли число N, которое должно быть больше 0
2. потом считывает N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution {
    public static void main (String[] args) throws Exception {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        int maximum;

        //напишите тут ваш код
        int N = Integer.parseInt (reader.readLine ());  //Считываем количество чисел
        if (N <= 0) return;                             //Если количество отрицательное или 0 - выход из программы

        int a;                                          //Создали переменную а
        maximum = Integer.parseInt (reader.readLine ());//переменной максимум - присвоили введенное значение
        for (int i = 0; i < N - 1; i++){                //если шаг меьше количества чисел - 1, наращиваем шаг
            a = Integer.parseInt (reader.readLine ());  //в переменную а парсим введенные значения
            if (a > maximum){                           //если а больше максимума
                maximum = a;                            //максимум = а
            }
        }

        System.out.println (maximum);
    }
}