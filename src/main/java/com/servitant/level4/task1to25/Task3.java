package com.servitant.level4.task1to25;

/*
Хорошо или плохо?
*/
public class Task3 {
    public static void main (String[] args) {
        compare (3);
        compare (6);
        compare (5);
    }

    public static void compare (int number) {
        //напишите тут ваш код
        if (number < 5){
            System.out.println ("Число меньше 5");
        }
        else if (number > 5){
            System.out.println ("Число больше 5");
        }
        else if (number == 5){
            System.out.println ("Число равно 5");
        }
    }
}


