package com.javarush.task.task06.task0612;

/*
Калькулятор
Сделать класс Calculator, у которого будут 5 статических методов:
int plus(int a, int b) - возвращает сумму чисел a и b
int minus(int a, int b) - возвращает результат вычитания из числа a числа b
int multiply(int a, int b) - возвращает результат умножения числа a на число b
double division(int a, int b) - возвращает результат деления числа a на число b
double percent(int a, int b) - возвращает b процентов от числа a (например, percent(4, 50) должен вернуть 50% от 4)
*/

public class Calculator {
    public static int plus (int a, int b) {
        //напишите тут ваш код
        return (a + b);
    }

    public static int minus (int a, int b) {
        //напишите тут ваш код
        return (a - b);
    }

    public static int multiply (int a, int b) {
        //напишите тут ваш код
        return (a * b);
    }

    public static double division (int a, int b) {
        //напишите тут ваш код
        double x = a;
        double y = b;
        return (x / y);
    }

    public static double percent (int a, int b) {
        //напишите тут ваш код
        double prc = a / 100.0; //результатом от деления на 100 будет int, поэтому делим на 100,0 чтобы получить double
        return prc * b;         // Для нахождения b процентов от числа а нужно найти 1% от числа а и результат умножить на b:
    }                           // т.е. можно и так решить (a/100.0)*b

    public static void main (String[] args) {

    }
}



