package com.servitant.level4.task1to25;

/*
Время года
*/
public class Task6 {
    public static void main (String[] args) {
        checkSeason (12);
        checkSeason (4);
        checkSeason (7);
        checkSeason (10);
    }

    public static void checkSeason (int month) {
        //напишите тут ваш код
        if (month >= 3 && month <= 5){
            System.out.println ("весна");
        }
        else if (month >= 6 && month <= 8){
            System.out.println ("лето");
        }
        else if (month >= 9 && month <= 11){
            System.out.println ("осень");
        }
        else {
            System.out.println ("зима");
        }
    }
}