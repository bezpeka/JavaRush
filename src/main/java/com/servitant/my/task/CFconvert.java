package com.servitant.my.task;

public class CFconvert{
    /*
Наш первый конвертер!
*/
        public static void main(String[] args) {
            System.out.println(convertCelsiusToFahrenheit(41));
        }

        public static double convertCelsiusToFahrenheit(int celsius) {
            //напишите тут ваш код
            double TC = celsius;
            double TF = (TC*9)/5 + 32;
            return TF;
        }
}
