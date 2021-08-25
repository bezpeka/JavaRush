package com.javarush.task.task08.task0812;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);

        List <Integer> List = new ArrayList <>();

        for(int i = 0; i < 10; i++) {
            List.add(sc.nextInt());
        }

        int count = 1;
        int max_count = 1;

        for(int i = 1; i < 10; i++) {
            //if (List.get(i-1).compareTo(List.get(i)) != 0)
            if(List.get(i - 1) != List.get(i))
                count = 1;
            else {
                count++;
                if(count > max_count)
                    max_count = count;
            }
        }

        System.out.println(max_count);
    }
}