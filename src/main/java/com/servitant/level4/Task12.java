package com.servitant.level4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Существует ли пара?
package com.javarush.task.task04.task0417;
Ввести с клавиатуры три целых числа. Определить, имеется ли среди них хотя бы одна пара равных между собой чисел.
Если такая пара существует, вывести на экран числа через пробел.
Если все три числа равны между собой, то вывести все три.

Примеры:
а) при вводе чисел
1
2
2
получим вывод
2 2

б) при вводе чисел
2
2
2
получим вывод
2 2 2
*/

public class Task12 {
    public static void main (String[] args) throws Exception {
        //напишите тут ваш код
        System.out.println ("Введите с клавиатуры три целых числа");
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        int a = Integer.parseInt (reader.readLine ());
        int b = Integer.parseInt (reader.readLine ());
        int c = Integer.parseInt (reader.readLine ());

        if (a == b & b == c){
            System.out.println (a + " " + b + " " + c);
        }
        else if (a == b & b != c){
            System.out.println (a + " " + b);
        }
        else if (a == c & b != c){
            System.out.println (a + " " + c);
        }
        else if (b == c & a != b){
            System.out.println (b + " " + c);
        }
    }
}