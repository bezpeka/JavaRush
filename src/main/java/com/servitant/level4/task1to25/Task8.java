package com.servitant.level4.task1to25;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Положительное и отрицательное число
package com.javarush.task.task04.task0413;
Ввести с клавиатуры номер дня недели, в зависимости от номера вывести название
"понедельник", "вторник", "среда", "четверг", "пятница", "суббота", "воскресенье",
если введен номер больше 7 или меньше 1 - вывести "такого дня недели не существует".
*/
public class Task8 {
    public static void main (String[] args) throws Exception {
        //напишите тут ваш код
        System.out.println ("Введите с клавиатуры номер дня недели");
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        String name = reader.readLine ();
        int n = Integer.parseInt (name);
        if (n == 1){
            System.out.println ("понедельник");
        }
        else if (n == 2){
            System.out.println ("вторник");
        }
        else if (n == 3){
            System.out.println ("среда");
        }
        else if (n == 4){
            System.out.println ("четверг");
        }
        else if (n == 5){
            System.out.println ("пятница");
        }
        else if (n == 6){
            System.out.println ("суббота");
        }
        else if (n == 7){
            System.out.println ("воскресенье");
        }
        else {
            System.out.println ("такого дня недели не существует");
        }
    }
}