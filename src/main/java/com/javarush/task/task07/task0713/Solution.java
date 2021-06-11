package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Играем в Jолушку
1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
Число нацело делится на 3 (x%3==0), нацело делится на 2 (x%2==0) и все остальные.
Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
Порядок объявления списков очень важен.
2. Метод printList должен выводить на экран все элементы списка с новой строки.
3. Используя метод printList выведи эти три списка на экран. Сначала тот, который для x%3,
потом тот, который для x%2, потом последний.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList < Integer > numbers = new ArrayList <>();
        for(int i = 0; i < 20; i++){
            int number = Integer.parseInt(reader.readLine());
            numbers.add(number);
        }

        ArrayList < Integer > list3 = new ArrayList <>();
        ArrayList < Integer > list2 = new ArrayList <>();
        ArrayList < Integer > listothers = new ArrayList <>();

        for(int i = 0; i < 20; i++){
            int number = numbers.get(i);

            if((number % 3 == 0) || (number % 2 == 0)){
                if(number % 3 == 0){
                    list3.add(number);
                }
                if(number % 2 == 0){
                    list2.add(number);
                }
            } else {
                listothers.add(number);
            }
        }

        printList(list3);
        printList(list2);
        printList(listothers);
    }

    public static void printList(ArrayList < Integer > list) {
        for(Integer number: list){
            System.out.println(number);
        }
    }
}