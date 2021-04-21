package com.javarush.task.task04.cycles;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/*Суммирование
package com.javarush.task.task04.task0442;

Вводить с клавиатуры числа.
Если пользователь ввел -1, вывести на экран сумму всех введенных чисел и завершить программу.
-1 должно учитываться в сумме.

Подсказка: один из вариантов решения этой задачи, использовать конструкцию:

while (true) {
    int number = считываем число;
    if (проверяем, что number -1)
        break;
}
*/
public class Task13 {
    public static void main ( String[] args ) throws Exception {
        BufferedReader reader = new BufferedReader ( new InputStreamReader ( System.in ) );
        int sum = 0;
        while (true) {
            int number = Integer.parseInt ( reader.readLine () );
            if ( number == -1 ) break;
            sum += number;
        }
        System.out.println ( sum - 1 );
    }
}
