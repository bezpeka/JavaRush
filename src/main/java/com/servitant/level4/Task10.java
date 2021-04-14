package com.servitant.level4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Правило треугольника
package com.javarush.task.task04.task0415;
*/

public class Task10 {
    public static void main (String[] args) throws Exception {
        //напишите тут ваш код
        System.out.println ("Введите с клавиатуры длины сторон треугальника");
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        int a = Integer.parseInt (reader.readLine ());
        int b = Integer.parseInt (reader.readLine ());
        int c = Integer.parseInt (reader.readLine ());

        if ((a + b) > c && (a + c) > b && (c + b) > a){
            System.out.println ("Треугольник существует.");
        }
        else {
            System.out.println ("Треугольник не существует.");
        }
    }
}
