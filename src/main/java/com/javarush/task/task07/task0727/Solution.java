package com.javarush.task.task07.task0727;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Меняем функциональность

Задача: Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter).
Потом она конвертирует строки в верхний регистр (Мама превращается в МАМА) и выводит их на экран.

Новая задача: Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter).
Потом программа строит новый список. Если в строке чётное число букв, строка удваивается, если нечётное – утраивается.
Программа выводит содержимое нового списка на экран.

Пример ввода:
Кот
Коты
Я

Пример вывода:
Кот Кот Кот
Коты Коты
Я Я Я
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList <String> list = new ArrayList <String>();
        while (true) {
            String inputWord = reader.readLine();
            if(inputWord == null || inputWord.isEmpty()) break;
            list.add(inputWord);
        }
        ArrayList <String> list2 = new ArrayList <String>();
        for(String elements: list) {
            if(elements.length() % 2 == 0)
                list2.add(elements + " " + elements);
            else
                list2.add(elements + " " + elements + " " + elements);
        }
        for(String s: list2) {
            System.out.println(s);
        }
    }
}