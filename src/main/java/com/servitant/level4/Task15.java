package com.servitant.level4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

/*
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
Выведенные числа должны быть разделены пробелом.

Эту задачу не смог решить и решение спиздил с гитхаба
package com.javarush.task.task04.task0420;
 */
public class Task15 {
    public static void main (String[] args) throws Exception {
        //напишите тут ваш код
        System.out.println ("Введите с клавиатуры три целых числа");
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        Integer[] arr = new Integer[3];
        arr[0] = Integer.parseInt (reader.readLine ());
        arr[1] = Integer.parseInt (reader.readLine ());
        arr[2] = Integer.parseInt (reader.readLine ());
        Arrays.sort (arr, Collections.reverseOrder ());
        for (Integer integer : arr){
            System.out.print (integer + " ");
        }
    }
}