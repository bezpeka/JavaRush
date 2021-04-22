package com.javarush.task.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task19 {

/*
Предсказание на будущее

Ввести с клавиатуры отдельно Имя, число1, число2.
Вывести надпись:
"Имя" получает "число1" через "число2" лет.

Пример:
Коля получает 3000 через 5 лет.
*/

    public static void main (String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        String name = reader.readLine ();
        String num1 = reader.readLine ();
        String num2 = reader.readLine ();
        int n1 = Integer.parseInt (num1);
        int n2 = Integer.parseInt (num2);
        System.out.println (name + " получает " + n1 + " через " + n2 + " лет.");
    }
}


