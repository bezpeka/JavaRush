package com.servitant.level4.cycles;
/*
package com.javarush.task.task04.task0432;

Ввести с клавиатуры строку и число N больше 0.
Вывести на экран строку N раз используя цикл while. Каждое значение с новой строки.

Пример ввода:
абв
2

Пример вывода:
абв
абв
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task3 {
    public static void main (String[] args) throws Exception {
        //напишите тут ваш код
        System.out.println ("Введите с клавиатуры строку и число");
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        String name = reader.readLine ();
        int a = Integer.parseInt (reader.readLine ());
        while (a > 0) { // while (i >= 1) - то же самое условие
            System.out.println (name);
            a--;
        }
    }
}
