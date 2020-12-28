/**
 * Написать программу, определяющую, является ли введённое
 * целое число простым, т.е. делится без остатка только на 1 и само
 * на себя.
 */
package com.servitant.TestExample;

public class PrimeNumber {

    public static void main ( String[] args ) {
        int value = 22;
        boolean result = isSimple ( value );
        System.out.println ( result );
    }

    public static boolean isSimple ( int value ) {
        boolean result = true;
        for (int i = 2; i < value; i++) {
            if ( value % i == 0 ) {
                result = false;
                break;
            }
        }
        return result;
    }
}
