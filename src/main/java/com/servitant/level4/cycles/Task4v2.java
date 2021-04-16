package com.servitant.level4.cycles;

/*
Вложенный цикл
 */
public class Task4v2 {
    public static void main (String[] args) {
        int x = 0;
        int y = 0;
        while (y < 10) {
            while (x < 10) {
                System.out.print ("S");
                x++;
            }
            System.out.println ();
            x = 0;
            y++;
        }
    }
}
