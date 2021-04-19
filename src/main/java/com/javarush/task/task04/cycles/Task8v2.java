package com.javarush.task.task04.cycles;

public class Task8v2 {
    public static void main (String[] args) throws Exception {
        for (int i = 1; i <= 10; i++){
            for (int j = i; j > 0; j--){
                System.out.print ("8");
            }
            System.out.println ();
        }
    }
}
