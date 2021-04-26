package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Числа по возрастанию

Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.

Пример ввода:
3
2
15
6
17

Пример вывода:
2
3
6
15
17
*/

public class Solution {
    public static void main (String[] args) throws Exception {
        System.out.println ("Введите с клавиатуры пять целых чисел");
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        //напишите тут ваш код
        int[] vct = new int[5];
        for (int i = 0; i < vct.length; i++){
            vct[i] = Integer.parseInt (reader.readLine ());
        }
        int tmp;
        for (int i = 0; i < vct.length; i++)
            for (int j = i + 1; j < vct.length; j++)
                if (vct[i] > vct[j]){
                    tmp = vct[i];
                    vct[i] = vct[j];
                    vct[j] = tmp;
                }
        for (int i = 0; i < vct.length; i++){
            System.out.println (vct[i]);
        }
    }
}
//todo не разобрался с задачей на сортировку