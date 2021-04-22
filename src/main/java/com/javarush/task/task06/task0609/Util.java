package com.javarush.task.task06.task0609;

/*
Расстояние между двумя точками
Реализовать статический метод double getDistance(x1, y1, x2, y2). Он должен вычислять расстояние между точками.
Используй метод double Math.sqrt(double a), который вычисляет квадратный корень переданного параметра.
*/

public class Util {
    public static double getDistance (int x1, int y1, int x2, int y2) {
        //напишите тут ваш код
        double result = Math.sqrt (Math.pow (x2 - x1, 2) + Math.pow (y2 - y1, 2));
        return result; //кроме метода вычисляющего квадратный корень, пришлось заюзать метод возведения в квадрат
    }

    public static void main (String[] args) {

    }
}