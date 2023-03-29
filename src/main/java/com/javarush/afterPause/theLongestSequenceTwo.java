package com.javarush.afterPause;

/*JAVA. Давайте создадим список чисел и добавим в него 10 чисел с клавиатуры.
Наша задача состоит в том, чтобы вывести на экран длину самой длинной последовательности \
повторяющихся чисел в списке.*/

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class theLongestSequenceTwo {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(); // создаем список чисел
        Scanner sc = new Scanner(System.in); // создаем объект класса Scanner для считывания данных с клавиатуры
        System.out.println("Введите 10 чисел: "); // выводим приглашение для пользователя
        for (int i = 0; i < 10; i++) { // перебираем 10 раз
            int num = sc.nextInt(); // считываем число с клавиатуры
            list.add(num); // добавляем число в список
        }
        sc.close(); // закрываем объект класса Scanner
        System.out.println("Список чисел: " + list); // выводим список на экран
        int maxLength = 0; // максимальная длина последовательности
        int currLength = 1; // текущая длина последовательности
        int value = 0; // значение элемента в последовательности
        for (int i = 1; i < list.size(); i++) { // перебираем все элементы списка, начиная со второго
            if (list.get(i) == list.get(i - 1)) { // если текущий элемент равен предыдущему
                currLength++; // увеличиваем текущую длину на 1
                if (currLength > maxLength) { // если текущая длина больше максимальной
                    maxLength = currLength; // обновляем максимальную длину
                    value = list.get(i); // запоминаем значение элемента
                }
            } else { // если текущий элемент не равен предыдущему
                currLength = 1; // сбрасываем текущую длину на 1
            }
        }
        System.out.println("Длина самой длинной последовательности повторяющихся чисел: " + maxLength); // выводим максимальную длину на экран
        System.out.println("Значение элемента в последовательности: " + value); // выводим значение элемента на экран
    }
}

