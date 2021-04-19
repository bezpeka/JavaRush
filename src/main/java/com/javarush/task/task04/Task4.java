package com.javarush.task.task04;

/*
Ближайшее к 10
по нумерации JR - com.javarush.task.task04.task0409;
*/
public class Task4 {
    public static void main (String[] args) {
        displayClosestToTen (8, 11);
        displayClosestToTen (7, 14);
    }

    public static void displayClosestToTen (int a, int b) {
        // напишите тут ваш код
        int n = 0;
        int c = 0;
        if (a > 10){
            n = a - 10;
        }
        else if (a < 10){
            n = 10 - a;
        }
        if (b > 10){
            c = b - 10;
        }
        else if (b < 10){
            c = 10 - b;
        }
        if (abs (n) < abs (c)){
            System.out.println (a);
        }
        else if (abs (c) < abs (n)){
            System.out.println (b);
        }
        if (abs (n) == abs (c)){
            System.out.println (a);
        }
    }

    public static int abs (int a) {
        if (a < 0){
            return -a;
        }
        else {
            return a;
        }
    }
}
