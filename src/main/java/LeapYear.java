/**
 * Написать программу которая считывает введенный год и проверяет високосный он или нет.
 * Год считается високосным если он делится без остатка на 4.
 * Однако если этот же год так же делится на 100, то этот год не високосный,
 * за исключением годов делящихся на 400.
 * Например:
 * 1992 - високосный
 * 1900 - не високосный
 * 2000 - високосный
 */

import java.util.Scanner;

public class LeapYear {
    public static void main ( String[] args ) {
        Scanner scan = new Scanner ( System.in );
        int year = 0;
        System.out.println ( "Введите произвольный год, для проверки его на вискосоность" );
        year = scan.nextInt ();
        isLeapYear ( year );
        scan.close ();
        //Две строчки ниже - віводят результат true или false в консоль
        boolean result = isLeapYear ( year );
        System.out.println ( result );
    }

    public static boolean isLeapYear ( int year ) {

        if ( year % 400 == 0 || (year % 4 == 0 && year % 100 != 0) ) {
            return true;
        }
        else {
            return false;
        }

    }

}
