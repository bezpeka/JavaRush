package com.javarush.task.task07.task0707;

/*
Что за список такой?
1. Создай список строк.
2. Добавь в него 5 различных строк.
3. Выведи его размер на экран.
4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.
*/

import java.util.ArrayList;

public class Solution {
    public static void main (String[] args) {
        //напишите тут ваш код
        ArrayList < String > list = new ArrayList <> (); //create ArrayList
        String s = new String ("test string");   //create variable s
        for (int i = 0; i < 5; i++){ // add var s to ArrayList
            list.add (s);
        }
        System.out.println (list.size ());
        for (int i = 0; i < list.size (); i++){
            System.out.println (list.get (i));
        }
    }
}