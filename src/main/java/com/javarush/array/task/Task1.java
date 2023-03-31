/**
 * Написать программу которая печатает массив сначала в обычном порядке, затем в обратном.
 */
package com.javarush.array.task;
/*Даний код представляє клас Task1 з методами main,
printArrayReverse, printArray та printArrayForeach.
У методі main ми створюємо масив values з п'яти елементів,
викликаємо три методи для виведення масиву на екран.

Метод printArrayReverse виводить масив у зворотньому порядку,
починаючи з останнього елементу. Для цього використовується цикл for
з ініціалізацією лічильника i рівним довжині масиву values мінус один
(так як індекси масиву починаються з нуля), і кроком -1.
У тілі циклу використовується метод System.out.print
для виведення на екран поточного елементу масиву, що відповідає значенню values[i].

Метод printArray виводить масив у звичайному порядку, починаючи з першого елементу.
Він також використовує цикл for, але з ініціалізацією лічильника i рівним нулю,
кроком +1 та умовою виходу з циклу, яка залежить від довжини масиву values.

Метод printArrayForeach також виводить масив у звичайному порядку,
але використовує спеціальний цикл foreach. Цикл foreach дає можливість
перебирати елементи масиву без необхідності створювати лічильник.
У тілі цього циклу змінна value приймає значення поточного елементу
масиву values, і це значення виводиться на екран.*/
public class Task1 {
    public static void main(String[] args) {
        int[] values = {1, 5, 7, 9, 11};
        printArray(values);
        printArrayForeach(values);
        printArrayReverse(values);
    }

    public static void printArrayReverse(int[] values) {
        for(int i = values.length - 1; i >= 0; i--) {
            System.out.print(values[i] + " ");
        }
        System.out.println();
    }

    //выводим массив обычным циклом For
    public static void printArray(int[] values) {
        for(int i = 0; i < values.length; i++) {
            System.out.print(values[i] + " ");
        }
        System.out.println();
    }

    //Делаем то же самое специальным циклом Foreach (используется для чтения) сокращение iter+Tab
    public static void printArrayForeach(int[] values) {
        for(int value: values) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
