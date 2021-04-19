package com.javarush.task.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
Если числа равны между собой, необходимо вывести любое.
Если максимальных чисел несколько, необходимо вывести любое из них.
 */
public class Task14 {
    public static void main (String[] args) throws Exception {
        //напишите тут ваш код
        System.out.println ("Введите с клавиатуры 4 целых числа");
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        int a = Integer.parseInt (reader.readLine ());
        int b = Integer.parseInt (reader.readLine ());
        int c = Integer.parseInt (reader.readLine ());
        int d = Integer.parseInt (reader.readLine ());
        if (a >= b && a >= c && a >= d){
            System.out.println (+a);
        }
        else if (b >= a && b >= c && b >= d){
            System.out.println (+b);
        }
        else if (c >= b && c >= a && c >= d){
            System.out.println (+c);
        }
        else {
            System.out.println (+d);
        }

    }
}
