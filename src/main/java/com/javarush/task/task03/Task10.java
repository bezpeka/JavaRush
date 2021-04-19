package com.javarush.task.task03;

public class Task10{

/*
Печатаем строки

Реализуй метод public static void writeToConsole(String s),
который добавляет к началу строки выражение "printing: "
и выводит измененную строку на экран.

Пример вывода для "Hello world!":
printing: Hello world!
*/


    public static void main(String[] args){
        writeToConsole("Hello world!");
    }

    public static void writeToConsole(String s){
        System.out.println("printing: " + s);//напишите тут ваш код

    }
}
