/**
 * Имеется число. Посчитать сумму цифр данного числа.
 * Так же делаем на двух циклах и FOR и WHILE
 */

package com.servitant.TestExample;

public class DigitSumm {
    public static void main ( String[] args ) {
        int value = 12345634;

        int result = sum ( value );
        System.out.println ( result );

        int result1 = sum ( value );
        System.out.println ( result1 );
    }

    public static int sum ( int value ) {
        int result = 0;
        int currentValue = value;
        while (currentValue != 0) {
            result += currentValue % 10;
            currentValue /= 10;
        }
        return result;
    }

    public static int sumFor ( int value ) {
        int result = 0;
        for (int currentValue = value; currentValue != 0; currentValue /= 10) {
            result += currentValue % 10;
        }
        return result;
    }

}
