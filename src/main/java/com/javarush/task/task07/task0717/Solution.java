package com.javarush.task.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удваиваем слова
1. Введи с клавиатуры 10 слов в список строк.

2. Метод doubleValues должен удваивать слова по принципу:
"альфа", "бета", "гамма" -> "альфа", "альфа", "бета", "бета", "гамма", "гамма"

3. Выведи результат на экран, каждое значение с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // Считать строки с консоли и объявить ArrayList list тут
        ArrayList <String> list = new ArrayList <>();
        BufferedReader inputsWord = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i < 10; i++) {
            list.add(inputsWord.readLine());
        }
        ArrayList <String> result = doubleValues(list);
        // Вывести на экран result
        for(String items: result) {
            System.out.println(items);
        }
    }

    public static ArrayList <String> doubleValues(ArrayList <String> list) {
        //напишите тут ваш код
        for(int item = 0; item < list.size(); item += 2) {
            list.add(item + 1, list.get(item));
        }
        return list;
    }
}
