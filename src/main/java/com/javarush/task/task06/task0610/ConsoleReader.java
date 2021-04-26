package com.javarush.task.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
Класс ConsoleReader
Сделать класс ConsoleReader, у которого будут 4 статических метода:
String readString() - читает с клавиатуры строку
int readInt() - читает с клавиатуры число
double readDouble() - читает с клавиатуры дробное число
boolean readBoolean() - читает с клавиатуры строку "true" или "false"
и возвращает соответствующую логическую переменную true или false

Внимание: создавайте переменную для чтения данных с консоли (BufferedReader или Scanner)
внутри каждого метода.
*/

public class ConsoleReader {
    public static String readString() throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner (System.in);
        return sc.nextLine ();
    }

    public static int readInt() throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner (System.in);
        return sc.nextInt ();
    }

    public static double readDouble() throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner (System.in);
        return sc.nextDouble ();
    }

    public static boolean readBoolean() throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner (System.in);
        return sc.nextBoolean ();
    }

    public static void main(String[] args) throws Exception {

    }
}