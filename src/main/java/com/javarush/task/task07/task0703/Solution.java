package com.javarush.task.task07.task0703;

import java.util.Scanner;

/*
Общение одиноких массивов
*/

public class Solution {
    public static void main (String[] args) throws Exception {
        //напишите тут ваш код
        String[] ArrStr = new String[10];
        int[] ArrInt = new int[10];

        Scanner sc = new Scanner (System.in);

        for (int i = 0; i < ArrStr.length; i++){
            ArrStr[i] = sc.nextLine ();
        }

        for (int i = 0; i < ArrStr.length; i++){
            ArrInt[i] = ArrStr[i].length ();
        }

        for (int i = 0; i < ArrInt.length; i++){
            System.out.println (ArrInt[i]);
        }
    }
}
