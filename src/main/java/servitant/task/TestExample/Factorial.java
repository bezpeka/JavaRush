/**
 * На циклах
 * Написать программу высчитывающую факториал введённого целого числа.
 * Пример 1*2*3*4*5*6=6!
 */
package servitant.task.TestExample;

public class Factorial {
    public static void main ( String[] args ) {
        int value = 15;
        int result = factorial ( value );
        System.out.println ( result );
        int result2 = factorialWhile ( value );
        System.out.println ( result2 );
    }

    public static int factorialWhile ( int value ) {
        int result = 1;
        int i = 1;
        while (i <= value) {
            result *= i;
            i++;
        }

        return result;
    }

    /**
     * Делаем факториал на цикле for,
     * он отличается от while, тем что условие пишется
     * в одной строке и віглядит более лаконичным
     */

    public static int factorial ( int value ) {
        int result = 1;
        for (int i = 1; i <= value; i++) {
            result *= i;
        }

        return result;
    }
}
