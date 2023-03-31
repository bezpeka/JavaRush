package com.javarush.task.task01.task0107;

/* 
Комментарии излишни
*/

public class Solution {
    public static void main(String[] args) {
        int x = 2;
        int y = 12;

        x = x * 3; // x = 2 * 3 = 6
        y = x + y; // y = 6 + 12 = 18
        x = y - x; // x = 18 - 6 = 12
        y = y - x; // y = 18 - 12 = 6

        System.out.println(x); // x = 12
        System.out.println(y); // y = 6
    }
}
