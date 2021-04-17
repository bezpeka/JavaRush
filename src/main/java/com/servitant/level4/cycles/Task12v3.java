package com.servitant.level4.cycles;

import java.util.Scanner;

public class Task12v3 {
    public static void main ( String[] args ) {
        Scanner in = new Scanner ( System.in );
        int x = in.nextInt (), y = in.nextInt (), z = in.nextInt ();
        int max = Math.max ( Math.max ( x,y ),z );
        int min = Math.min ( Math.min ( x,y ),z );
        System.out.println ( x + y + z - max - min );
    }
}
