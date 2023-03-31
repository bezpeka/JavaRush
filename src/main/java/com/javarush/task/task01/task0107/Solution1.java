package com.javarush.task.task01.task0107;
/* Попередня задача вирышена за допомогою окремого методу */
public class Solution1 {
    public static void main(String[] args) {
        int x = 2;
        int y = 12;

        // виклик методу calculate
        calculate(x, y);

    }

    // метод calculate
    public static void calculate(int x, int y) {
        x = x * 3; // x = 2 * 3 = 6
        y = x + y; // y = 6 + 12 = 18
        x = y - x; // x = 18 - 6 = 12
        y = y - x; // y = 18 - 12 = 6

        // виведення результатів
        System.out.println("x = " + x + ", y = " + y); // x = 12, y = 6
    }
}


