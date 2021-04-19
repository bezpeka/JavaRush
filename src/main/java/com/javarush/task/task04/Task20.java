package com.javarush.task.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Цель установлена!
package com.javarush.task.task04.task0425;

Ввести с клавиатуры два целых числа, которые будут координатами точки, не лежащей на координатных осях OX и OY.
Вывести на экран номер координатной четверти, в которой находится данная точка.
Подсказка:
Принадлежность точки с координатами (a,b) к одной из четвертей определяется следующим образом:
для первой четверти a>0 и b>0;
для второй четверти a<0 и b>0;
для третьей четверти a<0 и b<0;
для четвертой четверти a>0 и b<0.

Пример для чисел 4 6:
1

Пример для чисел -6 -6:
3
 */
public class Task20 {
    public static void main (String[] args) throws Exception {
        //напишите тут ваш код
        System.out.println ("Введите с клавиатуры 2 целых числа");
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        int a = Integer.parseInt (reader.readLine ());
        int b = Integer.parseInt (reader.readLine ());
        if (a > 0 && b > 0) System.out.println ("1");
        if (a < 0 && b > 0) System.out.println ("2");
        if (a < 0 && b < 0) System.out.println ("3");
        if (a > 0 && b < 0) System.out.println ("4");
    }
}
