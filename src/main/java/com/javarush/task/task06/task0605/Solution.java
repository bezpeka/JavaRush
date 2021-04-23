package com.javarush.task.task06.task0605;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Контролируем массу тела

Программа должна считывать введенные пользователем вес в килограммах и рост в метрах
и выводить на экран сообщение об индексе массы тела.Реализуй статический метод класса Body.
Метод должен определить индекс массы тела, и вывести на экран сообщение:
"Недовес: меньше чем 18.5" - если индекс массы тела меньше 18.5 (не включая),
"Нормальный: между 18.5 и 25" - если индекс массы тела между 18.5 и 25 (не включая),
"Избыточный вес: между 25 и 30" - если индекс массы тела между 25 и 30 (не включая),
"Ожирение: 30 или больше" - если индекс массы тела 30 или больше.

Подсказка:
Индекс массы тела = вес в кг / (рост в метрах * рост в метрах)

Пример вывода для 68.4 и 1.77:
Нормальный: между 18.5 и 25
*/

public class Solution {

    public static void main (String[] args) throws IOException {
        BufferedReader bis = new BufferedReader (new InputStreamReader (System.in));
        double weight = Double.parseDouble (bis.readLine ());
        double height = Double.parseDouble (bis.readLine ());

        Body.calculateMassIndex (weight, height);
    }

    public static class Body {
        public static void calculateMassIndex (double weight, double height) {
            // напишите тут ваш код
            double massIndex = weight / Math.pow (height, 2); //Индекс массы тела = вес в кг / (рост в метрах * рост в метрах)
            if (massIndex < 18.5){
                System.out.println ("Недовес: меньше чем 18.5");
            }
            else if (massIndex > 18.5 && massIndex < 25){
                System.out.println ("Нормальный: между 18.5 и 25");
            }
            else if (massIndex > 25 && massIndex < 30){
                System.out.println ("Избыточный вес: между 25 и 30");
            }
            else if (massIndex > 30){
                System.out.println ("Ожирение: 30 или больше");
            }
        }
    }
}
