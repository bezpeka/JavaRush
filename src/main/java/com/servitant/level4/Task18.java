package com.servitant.level4;


import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Фейс-контроль
package com.javarush.task.task04.task0423;

Ввести с клавиатуры имя и возраст.
Если возраст больше 20 вывести надпись "И 18-ти достаточно".
*/
public class Task18 {
    public static void main (String[] args) throws Exception {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        String name = reader.readLine ();
        int age = Integer.parseInt (reader.readLine ());
        if (age > 20) System.out.println ("И 18-ти достаточно");
    }
}