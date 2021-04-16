package com.servitant.level4.task1to25;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Положительное и отрицательное число
package com.javarush.task.task04.task0412;
Ввести с клавиатуры число.
Если число положительное, то увеличить его в два раза.
Если число отрицательное, то прибавить единицу.
Если введенное число равно нулю, необходимо вывести ноль.
Вывести результат на экран.
*/
public class Task7 {
    public static void main (String[] args) throws Exception {
        //напишите тут ваш код
        System.out.println ("Введите число с клавиатуры, оно может быть любое");
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        String name = reader.readLine ();
        int n = Integer.parseInt (name);
        if (n < 0){
            n = n + 1;
            System.out.println (n);
        }
        else if (n == 0){
            System.out.println (n);
        }
        else {
            n = n * 2;
            System.out.println (n);
        }
    }
}
