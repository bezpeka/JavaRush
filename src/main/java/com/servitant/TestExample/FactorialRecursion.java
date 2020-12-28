/**
 * Рекурсия
 * Написать программу высчитывающую факториал введённого целого числа.
 * Пример 1*2*3*4*5*6=6!
 * https://www.youtube.com/watch?v=VLAe_qy5seU&list=PLnh8EajVFTl6KGYdCWTlHdYPvpuqaBCTf&index=13
 * Автор рекомендует не использовать рекурсию, но понимать что это такое, на случай встречи ее в коде.
 */
package com.servitant.TestExample;

public class FactorialRecursion {
    public static void main ( String[] args ) {
        int factorial = factorial ( 15 );
        System.out.println ( factorial );
    }

    public static int factorial ( int value ) {
        if ( value == 1 ) {
            return 1;
        }

        return value * factorial ( value - 1 );
    }
}
