package com.javarush.task.task07.task0718;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Проверка на упорядоченность
1. Введи с клавиатуры 10 слов в список строк.
2. Определить, является ли список упорядоченным по возрастанию длины строки.
3. В случае отрицательного ответа вывести на экран индекс первого элемента, нарушающего такую упорядоченность.
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList <String> list = new ArrayList <>();
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 10; i++) {
            list.add(sc.nextLine());
        }
        for(int item = 0; item < list.size() - 1; item++) {
            if(list.get(item).length() > list.get(item + 1).length()){
                System.out.println(item + 1);
                break;
            }
        }
    }
}

