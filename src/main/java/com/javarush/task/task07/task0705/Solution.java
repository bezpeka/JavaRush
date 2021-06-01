package com.javarush.task.task07.task0705;

/*
Один большой массив и два маленьких
*/

import java.util.Scanner;

public class Solution {
    public static void main (String[] args) throws Exception {
        //напишите тут ваш код
        int[] ArrNum = new int[20]; //создали массив на 20 ячеек
        Scanner sc = new Scanner (System.in);
        for (int i = 0; i < ArrNum.length; i++){
            ArrNum[i] = Integer.parseInt (sc.nextLine ());
        }
        int[] first = new int[10]; //создали первый массив на 10 ячеек
        int[] second = new int[10]; //создали второй массив на 10 ячеек
        for (int i = 0; i < first.length; i++){
            first[i] = ArrNum[i]; // занесли в первый массив для каждого элеммента, значения из большого массива
        }
        for (int i = 0; i < second.length; i++){
            second[i] = ArrNum[i + 10]; //занесли вторую часть значений из большого массива second [1] = ArrNum [11]
        }
        for (int i = 0; i < second.length; i++){
            System.out.println (second[i]); //вывели значения второго малого массива на экран
        }
    }
}