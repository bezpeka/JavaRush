package com.servitant.TestExample;

public class cycle {
    public static void main ( String[] args ) {
        CycleWhile ();
    }

    private static void CycleWhile () {
        int value = 10;
        while (value >= 0) {
            System.out.println ( value );
            value--;
        }
    }
}
