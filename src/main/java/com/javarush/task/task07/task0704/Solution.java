package com.javarush.task.task07.task0704;

/*
Переверни массив
*/

import java.util.Scanner;

public class Solution {
    public static void main (String[] args) throws Exception {
        //напишите тут ваш код
        int[] ArrNum = new int[10];
        Scanner sc = new Scanner (System.in);
        for (int i = 0; i < ArrNum.length; i++){
            ArrNum[i] = Integer.parseInt (sc.nextLine ());
        }
        for (int i = ArrNum.length - 1; i > -1; i--){
            System.out.println (ArrNum[i]);
        }
    }
}