package com.javarush.task.task01.task0140;

import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        System.out.println(square(a));
    }

    public static int square(int a) {
        return a * a;
    }
}

