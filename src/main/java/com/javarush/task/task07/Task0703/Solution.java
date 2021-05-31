package com.javarush.task.task07.Task0703;

import java.util.Scanner;

/*
Общение одиноких массивов
*/

public class Solution {
    public static void main (String[] args) throws Exception {
        //напишите тут ваш код
        String[] strs = new String[10];
        int[] vect = new int[10];

        Scanner sc = new Scanner (System.in);

        for (int i = 0; i < strs.length; i++){
            strs[i] = sc.nextLine ();
        }

        for (int i = 0; i < strs.length; i++){
            vect[i] = strs[i].length ();
        }

        for (int i = 0; i < vect.length; i++){
            System.out.println (vect[i]);
        }
    }
}
