package com.servitant.level4;
/*
Три числа
package com.javarush.task.task04.task0424;

Ввести с клавиатуры три целых числа. Одно из чисел отлично от двух других, равных между собой.
Вывести на экран порядковый номер числа, отличного от остальных.

Пример для чисел 4 6 6:
1

Пример для чисел 6 6 3:
3
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task19 {
    public static void main (String[] args) throws Exception {
        //напишите тут ваш код
        System.out.println ("Введите с клавиатуры три целых числа");
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        int a = Integer.parseInt (reader.readLine ());
        int b = Integer.parseInt (reader.readLine ());
        int c = Integer.parseInt (reader.readLine ());
        if (a != b && a != c && b == c) System.out.println (1);
        else if (b != a && b != c && a == c) System.out.println (2);
        else if (c != b && c != a && a == b) System.out.println (3);
    }
}
