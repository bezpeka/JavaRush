package com.javarush.afterPause;

/*JAVA. Давайте создадим список чисел и добавим в него 10 чисел с клавиатуры.
Наша задача состоит в том, чтобы вывести на экран длину самой длинной последовательности \
повторяющихся чисел в списке.*/

import java.util.*;

public class theLongestSequenceOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Создаем новый список ArrayList для хранения чисел
        List<Integer> numbers = new ArrayList<Integer>();

        // Запрашиваем у пользователя ввод 10 чисел и добавляем их в список
        System.out.println("Введите 10 чисел:");
        for (int i = 0; i < 10; i++) {
            int num = scanner.nextInt();
            numbers.add(num);
        }

        // Создаем переменные maxLength и currentLength для отслеживания длин последовательностей
        int maxLength = 1;      // длина самой длинной последовательности повторяющихся чисел
        int currentLength = 1;  // длина текущей последовательности повторяющихся чисел

        // Перебираем список чисел и проверяем, равны ли пары соседних чисел
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i).equals(numbers.get(i - 1))) {   // если числа равны
                currentLength++;     // увеличиваем текущую длину последовательности
                if (currentLength > maxLength) {  // если текущая длина больше максимальной
                    maxLength = currentLength;   // обновляем максимальную длину
                }
            } else {  // если числа не равны
                currentLength = 1;  // сбрасываем текущую длину в 1
            }
        }

        // Выводим длину самой длинной последовательности повторяющихся чисел на экран
        System.out.println("Длина самой длинной последовательности повторяющихся чисел: " + maxLength);
    }
}

