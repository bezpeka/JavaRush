package com.javarush.task.task07.task0709;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList < String > strings = new ArrayList <>();
        Scanner sc = new Scanner(System.in);
        int str_min_len = 1000000;
        String tmp;
        int tmp_len;
        for (int i = 0; i < 5; i++){
            tmp = sc.nextLine();
            tmp_len = tmp.length();
            if (tmp_len < str_min_len)
                str_min_len = tmp_len;
            strings.add(tmp);
        }
        for (int i = 0; i < strings.size(); i++){
            if (strings.get(i).length() == str_min_len)
                System.out.println(strings.get(i));
        }
    }
}

