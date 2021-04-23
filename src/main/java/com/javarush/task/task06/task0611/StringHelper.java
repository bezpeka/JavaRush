package com.javarush.task.task06.task0611;

/*
Класс StringHelper

Сделать класс StringHelper, у которого будут 2 статических метода:
String multiply(String s, int count) - возвращает строку повторенную count раз.
String multiply(String s) - возвращает строку повторенную 5 раз.

Пример:
Амиго -> АмигоАмигоАмигоАмигоАмиго
*/

public class StringHelper {
    public static String multiply (String text) {
        String result = "";
        //напишите тут ваш код
        for (int i = 0; i < 5; i++){
            result += text;
        }
        return result;
    }

    public static String multiply (String text, int count) {
        String result = "";
        //напишите тут ваш код
        for (int i = 0; i < count; i++){
            result += text;
        }
        return result;
    }

    public static void main (String[] args) {

    }
}
