package com.javarush.task.task05.task0507;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main (String[] args) throws Exception {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        float sum = 0;
        int repeat = 0;
        float res = 0;
        while (true) {
            int number = Integer.parseInt (reader.readLine ());
            repeat++;
            if (number == -1) break;
            sum += number;
            res = sum / repeat;
        }
        System.out.println (res);
    }
}

