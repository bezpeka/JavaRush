package com.javarush.task.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Положительные и отрицательные числа
package com.javarush.task.task04.task0429;

Ввести с клавиатуры три целых числа. Вывести на экран количество положительных и количество отрицательных чисел в исходном наборе, в следующем виде:
"количество отрицательных чисел: а", "количество положительных чисел: б",
где а, б - искомые значения.

Пример:
а) при вводе чисел
2
5
6
получим вывод
количество отрицательных чисел: 0
количество положительных чисел: 3

Пример:
б) при вводе чисел
-2
-5
6
получим вывод
количество отрицательных чисел: 2
количество положительных чисел: 1
 */
public class Task24 {
    public static void main (String[] args) throws Exception {
        //напишите тут ваш код
        System.out.println ("Введите с клавиатуры шесть целых чисел");
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        int a = Integer.parseInt (reader.readLine ());
        int b = Integer.parseInt (reader.readLine ());
        int c = Integer.parseInt (reader.readLine ());
        int d = Integer.parseInt (reader.readLine ());
        int e = Integer.parseInt (reader.readLine ());
        int f = Integer.parseInt (reader.readLine ());
        int count = 0;
        int count1 = 0;
        int[] mass = new int[]{a, b, c, d, e, f};
        for (int i = 0; i < mass.length; i++){
            if (mass[i] > 0){
                count++;
            }
            if (mass[i] < 0){
                count1++;
            }
        }
        System.out.println ("количество положительных чисел:" + count);
        System.out.println ("количество отрицательных чисел:" + count1);
    }
}
