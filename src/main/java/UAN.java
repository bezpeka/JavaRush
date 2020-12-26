/**
 * Считываем вводимое в консоли число. Это число сумма денег в гривнах.
 * Вывести это число добавив к нему слово "гривна" в правильном падеже ("гривна", "гривен")
 */

import java.util.Scanner;

public class UAN {
    public static void main ( String[] args ) {
        Scanner scan = new Scanner ( System.in );
        int     UAN  = 0;
        System.out.println ( "Input random value, please" );
        UAN = scan.nextInt ( );
        /** 1,21,31,41,51,61,71,81,91,101... - гривна
         * (число заканчивается на 1, но не заканчивается на 11)
         */
        /** 2,3,4;22,23,24;32,33,34;... - гривны
         *число заканчивается на 2,3,4 но нужно исключить 12,13,14 гривен
         */
        /**5...20;25...30;35...40;... - гривен
         *Тут просто иначе все остальное, не описываем
         */
        if ( UAN % 10 == 1 && UAN % 100 != 11 ) {
            System.out.println ( UAN + " гривна" );
        }
        else if ( (UAN % 10 == 2 || UAN % 10 == 3 || UAN % 10 == 4)
                  && !(UAN % 100 == 12 || UAN % 100 == 13 || UAN % 100 == 14) ) {
            System.out.println ( UAN + " гривны" );
        }
        else {
            System.out.println ( UAN + " гривен" );
        }
        scan.close ( );
    }
}
