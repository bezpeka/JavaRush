/**
 * Написать программу которая печатает массив сначала в обычном порядке, затем в обратном.
 */
package com.javarush.array.task;

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
