package com.javarush.task.task04.cycles;

public class Task8v1 {
    public static void main (String[] args) {
        for (int i = 1; i <= 10; i++){
            for (int j = 0; j < i; j++){
                System.out.print ("8");
            }
            System.out.println ();
        }
    }
}
