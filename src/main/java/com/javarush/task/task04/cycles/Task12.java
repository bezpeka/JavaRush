package com.javarush.task.task04.cycles;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*Как-то средненько
package com.javarush.task.task04.task0441;

Ввести с клавиатуры три числа, вывести на экран среднее из них.
Т.е. не самое большое и не самое маленькое.
Если все числа равны, вывести любое из них.
 */
public class Task12 {
    public static void main (String[] args) throws Exception {
        System.out.println ("Введите с клавиатуры три целых числа");
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        int a = Integer.parseInt (reader.readLine ());
        int b = Integer.parseInt (reader.readLine ());
        int c = Integer.parseInt (reader.readLine ());
        System.out.println (median (a, b, c));
    }

    public static int median (int a, int b, int c) {
        if ((a > b && b > c) || (b < c && b > a))
            return b;
        if ((a < b && a > c) || (a > b && a < c))
            return a;
        if ((c > a && c < b) || (c < a && c > b))
            return c;
        else if (a == b & a == c)
            return a;
        else if (b == c)
            return b;
        return a;
    }

}
