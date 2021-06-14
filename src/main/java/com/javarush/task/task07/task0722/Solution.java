package com.javarush.task.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Это конец
Создать список строк.
Ввести строки с клавиатуры и добавить их в список.
Вводить с клавиатуры строки, пока пользователь не введет строку "end". Саму строку "end" не учитывать.
Вывести строки на экран, каждую с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList <String> list = new ArrayList <>();

        String userInput = "";
        while (true) {
            userInput = reader.readLine();
            if(userInput.equals("end"))
                break;
            list.add(userInput);
        }
        for(String itemUserInput: list) {
            System.out.println(itemUserInput);
        }
        //напишите тут ваш код
    }
}