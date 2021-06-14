package com.javarush.task.task07.task0719;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Вывести числа в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //напишите тут ваш код
        ArrayList <Integer> list = new ArrayList <>();
        for(int itemInput = 0; itemInput < 10; itemInput++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
        for(int itemOutput = list.size() - 1; itemOutput >= 0; itemOutput--) {
            System.out.println(list.get(itemOutput));
        }
    }
}
