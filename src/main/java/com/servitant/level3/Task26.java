package com.servitant.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Ввести с клавиатуры число n.
Вывести на экран надпись "Я буду зарабатывать $n в час".

Пример:
Я буду зарабатывать $50 в час
 */
public class Task26 {
    public static void main (String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader (System.in));
        String name = reader.readLine();
        int n = Integer.parseInt(name);
        System.out.println ("Я буду зарабатывать $" + n + " в час");
    }
}
