package com.javarush.task.task07.task0719;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Вывести числа в обратном порядке
Ввести с клавиатуры 10 чисел и заполнить ими список.
Вывести их в обратном порядке. Каждый элемент - с новой строки.
Использовать только цикл for.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //напишите тут ваш код
        ArrayList <Integer> list = new ArrayList <>(); //Объявили переменную типа список целых чисел и сразу ее проинициализировали
        for(int itemInput = 0; itemInput < 10; itemInput++) {
            list.add(Integer.parseInt(reader.readLine())); //Считали 10 целых чисел с клавиатуры и добавили их в список
        }
        for(int itemOutput = list.size() - 1; itemOutput >= 0; itemOutput--) {
            System.out.println(list.get(itemOutput)); //вывели числа на экран в обратном порядке
        }
    }
}
