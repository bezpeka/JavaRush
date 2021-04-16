package com.servitant.level4.task1to25;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Минимум двух чисел Ӏ Java Syntax: 4 уровень, 6 лекция
package com.javarush.task.task04.task0418;

Ввести с клавиатуры два целых числа, и вывести на экран минимальное из них.
Если два числа равны между собой, необходимо вывести любое.
 */
public class Task13 {
    public static void main (String[] args) throws Exception {
        //напишите тут ваш код
        System.out.println ("Введите с клавиатуры два сравниваемых целых числа");
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        int a = Integer.parseInt (reader.readLine ());
        int b = Integer.parseInt (reader.readLine ());
        if (a == b){
            System.out.println (+a);
        }
        else if (a < b){
            System.out.println (+a);
        }
        else {
            System.out.println (+b);
        }
    }
}
