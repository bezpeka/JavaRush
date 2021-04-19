package com.javarush.task.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Работа светофора для пешеходов запрограммирована следующим образом:
в начале каждого часа в течение трех минут горит зелёный сигнал,
затем в течение одной минуты - жёлтый,
а потом в течение одной минуты - красный,
затем опять зелёный горит три минуты и т. д.
Ввести с клавиатуры вещественное число t, означающее время в минутах, прошедшее с начала очередного часа.
Определить, сигнал какого цвета горит для пешеходов в этот момент.
Результат вывести на экран в следующем виде:
"зелёный" - если горит зелёный цвет,
"жёлтый" - если горит жёлтый цвет,
"красный" - если горит красный цвет.

package com.javarush.task.task04.task0414
 */

public class Task9 {
    public static void main (String[] args) throws Exception {
        //напишите тут ваш код
        System.out.println ("Введите с клавиатуры число t");
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        double t = Double.parseDouble (reader.readLine ());
        double a = t % 5;
        if (a >= 0 && a < 3 | a == 5){
            System.out.println ("зелёный");
        }
        else if (a >= 3 && a < 4){
            System.out.println ("жёлтый");
        }
        else if (a >= 3 && a < 5){
            System.out.println ("красный");
        }
    }
}
