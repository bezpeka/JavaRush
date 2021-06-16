package com.javarush.task.task08.task0802;

/* 
HashMap из 10 пар

Создать коллекцию Map<String, String> (реализация HashMap), занести туда 10 пар строк:
арбуз - ягода,
банан - трава,
вишня - ягода,
груша - фрукт,
дыня - овощ,
ежевика - куст,
жень-шень - корень,
земляника - ягода,
ирис - цветок,
картофель - клубень.
Вывести содержимое коллекции на экран, каждый элемент с новой строки.

Пример вывода (тут показана только одна строка):
картофель - клубень
*/

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Map <String, String> hm = new HashMap <>();

        hm.put("арбуз", "ягода");
        hm.put("банан", "трава");
        hm.put("вишня", "ягода");
        hm.put("груша", "фрукт");
        hm.put("дыня", "овощ");
        hm.put("ежевика", "куст");
        hm.put("жень-шень", "корень");
        hm.put("земляника", "ягода");
        hm.put("ирис", "цветок");
        hm.put("картофель", "клубень");

        for(Map.Entry entry: hm.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
