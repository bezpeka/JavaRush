/**
 * Написать программу, которая проходит циклом по английскому
 * алфавиту, начиная с буквы ‘b’, и выводит каждую букву до тех пор,
 * пока не встретит гласную (т.е. вывести согласные на консоль).
 */
package com.javarush.TestExample;

public class Alphabet {

    public static void main ( String[] args ) {
        printLetters ();
    }

    public static void printLetters () {
        for (char letter = 'b'; !isVowel ( letter ); letter++) {
            System.out.println ( letter );
        }
    }

    public static boolean isVowel ( char value ) {
        return value == 'a' || value == 'e' || value == 'i' || value == 'o' || value == 'u' || value == 'y';
    }
}
