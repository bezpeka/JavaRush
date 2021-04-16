package com.servitant.level4.cycles;

/*
package com.javarush.task.task04.task0431;

Вывести на экран числа от 10 до 1 включительно, используя цикл while.
Каждое значение с новой строки.
 */
public class Task2 {
    public static void main (String[] args) {
        int i = 10;
        while (i > 0) { // while (i >= 1) - то же самое условие
            System.out.println (i);
            i--;
        }
    }
}
