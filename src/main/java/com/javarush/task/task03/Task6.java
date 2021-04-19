package com.javarush.task.task03;

public class Task6{

/*
Головоломка со скобками
расставить скобки так, чтобы результат был 382.
Исходный вариант = 68.
System.out.println((2 * 3) + 4 * 5 + (6 * 7));
*/

    public static void main(String[] args){
        System.out.println(2 * (3 + 4 * (5 + 6 * 7)));
    }
}

