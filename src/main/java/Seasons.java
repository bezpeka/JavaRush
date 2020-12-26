import java.util.Scanner;
//Проверяем по номеру месяца, время года
public
class Seasons {
    public static
    void main ( String[] args ) {
        Scanner scan = new Scanner ( System.in );
        // Эта строка импортирует класс Scanner и все его функции из основного пакета утилит Java.
        int month = 0;
        System.out.println ( "Input number of month, please" );
        month = scan.nextInt ( );
        // winter = 12, 1, 2
        // spring = 3, 4, 5
        // summer = 6, 7, 8
        // autumn = 9, 10, 11
        if ( month == 12 || month == 1 || month == 2 ) {
            System.out.println ( "Winter" );
        }
        else if ( month >= 3 && month <= 5 ) {
            System.out.println ( "Spring" );
        }
        else if ( month >= 6 && month <= 8 ) {
            System.out.println ( "Summer" );
        }
        else if ( month >= 9 && month <= 11 ) {
            System.out.println ( "Autumn" );
        }
        else {
            System.out.println ( "Wrong data" );
        }
        scan.close ( );
    }

}

