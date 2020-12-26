/**
 * Вводим целое число,
 * программа определяет,
 * является ли последняя цифра этого числа - цифрой 3
 */

import java.util.Scanner;

public class Test3 {
    public static void main ( String[] args ) {
        Scanner scan  = new Scanner ( System.in );
        int     value = 0;
        System.out.println ( "Input random value, please" );
        value = scan.nextInt ( );
        if ( value % 10 == 3 ) {
            System.out.println ( "The last digit of the entered variable is 3" );
        }
        else {
            System.out.println ( "The last digit of the entered variable is not 3" );
        }
        scan.close ( );
    }

}

