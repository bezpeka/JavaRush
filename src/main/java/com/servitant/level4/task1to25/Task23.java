package com.servitant.level4.task1to25;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Положительное число
package com.javarush.task.task04.task0428;

Ввести с клавиатуры три целых числа.
Вывести на экран количество положительных чисел среди этих трех.

Примеры:
а) при вводе чисел
-4
6
6
получим вывод
2

б) при вводе чисел
-6
-6
-3
получим вывод
0
в) при вводе чисел
0
1
2
получим вывод
2
 */

public class Task23 {
    public static void main (String[] args) throws Exception {
        //напишите тут ваш код
        System.out.println ("Введите с клавиатуры три целых числа");
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        int a = Integer.parseInt (reader.readLine ());
        int b = Integer.parseInt (reader.readLine ());
        int c = Integer.parseInt (reader.readLine ());
        int n = 0;
        if (a > 0 && b > 0 && c > 0) n = 3;
        else if ((a > 0 && b > 0 && c <= 0) || (a > 0 && b <= 0 && c > 0) || (a <= 0 && b > 0 && c > 0)) n = 2;
        else if ((a > 0 && b <= 0 && c <= 0) || (a <= 0 && b > 0 && c <= 0) || (a <= 0 && b <= 0 && c > 0)) n = 1;
        else n = 0;
        System.out.println (n);
    }
}
