package com.javarush.task.task04.cycles;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
Письмо счастья
package com.javarush.task.task04.task0439;

Ввести с клавиатуры имя и используя цикл for 10 раз вывести: <имя> любит меня.
 */
public class Task10 {
    public static void main (String[] args) throws Exception {
        //напишите тут ваш код
        System.out.println ("Введите с клавиатуры имя");
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        String name = reader.readLine ();
        for (int i = 0; i < 10; i++){
            System.out.println (name + " любит меня.");
        }
    }
}