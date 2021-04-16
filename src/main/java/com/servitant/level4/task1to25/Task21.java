package com.servitant.level4.task1to25;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Ярлыки и числа
package com.javarush.task.task04.task0426;

Ввести с клавиатуры целое число. Вывести на экран его строку-описание следующего вида:
"отрицательное четное число" - если число отрицательное и четное,
"отрицательное нечетное число" - если число отрицательное и нечетное,
"ноль" - если число равно 0,
"положительное четное число" - если число положительное и четное,
"положительное нечетное число" - если число положительное и нечетное.

Пример для числа 100:
положительное четное число

Пример для числа -51:
отрицательное нечетное число
 */


public class Task21 {
    public static void main (String[] args) throws Exception {
        //напишите тут ваш код
        System.out.println ("Введите с клавиатуры целое число");
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        int a = Integer.parseInt (reader.readLine ());
        if (a == 0) System.out.println ("ноль");
        else if (a > 0 && a % 2 == 0) System.out.println ("положительное четное число");
        else if (a > 0 && a % 2 != 0) System.out.println ("положительное нечетное число");
        else if (a < 0 && a % 2 == 0) System.out.println ("отрицательное четное число");
        else  System.out.println ("отрицательное нечетное число");
    }
}


