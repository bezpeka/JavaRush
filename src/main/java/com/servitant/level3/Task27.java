package com.servitant.level3;

/*
Напиши код метода sumDigitsInNumber(int number).
Метод на вход принимает целое трехзначное число.
Нужно посчитать сумму цифр этого числа, и вернуть эту сумму.

Пример:
Метод sumDigitsInNumber вызывается с параметром 546.

Пример вывода:
15
 */
public class Task27 {
    public static void main (String[] args) {
        System.out.println (sumDigitsInNumber (546));
    }

    public static int sumDigitsInNumber (int number) {
        int result = 0;
        int currentValue = number;
        while (currentValue != 0) {
            result += currentValue % 10;
            currentValue /= 10;
        }
        return result;
    }
}
