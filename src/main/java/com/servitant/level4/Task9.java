package com.servitant.level4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Количество дней в году
package com.javarush.task.task04.task0414
 */

public class Task9 {
    public static void main (String[] args) throws Exception {
        //напишите тут ваш код
        System.out.println ("Введите с клавиатуры любой год, для проверки на високосность");
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        String name = reader.readLine ();
        int year = Integer.parseInt (name);
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
            System.out.println ("количество дней в году: 366");
        }
        else {
            System.out.println ("количество дней в году: 365");
        }
    }
}
