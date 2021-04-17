package com.servitant.level4.cycles;

import java.util.Arrays;
import java.util.Scanner;

public class Task12v2 {
    public static void main ( String[] args ) {
        Scanner in = new Scanner ( System.in );
        int x = in.nextInt (), y = in.nextInt (), z = in.nextInt ();
        int[] median = new int[]{x,y,z};
        Arrays.sort ( median );
        System.out.println ( median[1] );
    }
}
