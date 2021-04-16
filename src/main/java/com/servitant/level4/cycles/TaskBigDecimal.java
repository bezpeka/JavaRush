package com.servitant.level4.cycles;

import java.math.BigDecimal;

/*
В отличие от double и float, при использовании BigDecimal сложение,
вычитание и прочие математические операции выполняются не с помощью операторов (+- и т.д.),
а с помощью методов.
Вот как это будет выглядеть в нашем случае:
 */
public class TaskBigDecimal {
    public static void main (String[] args) {
        /*Создаем два объекта BigDecimal - ноль и 0.1.
       Делаем то же самое что и раньше - прибавляем 0.1 к нулю 11 раз подряд
       В классе BigDecimal сложение осуществляется с помощью метода add()*/
        java.math.BigDecimal f1 = new java.math.BigDecimal (0.0);
        java.math.BigDecimal pointOne = new java.math.BigDecimal (0.1);
        for (int i = 1; i <= 11; i++){
            f1 = f1.add (pointOne);
        }
        /*Здесь тоже ничего не изменилось: создаем два объекта BigDecimal
       и умножаем 0.1 на 11
       В классе BigDecimal умножение осуществляется с помощью метода multiply()*/
        java.math.BigDecimal f2 = new java.math.BigDecimal (0.1);
        java.math.BigDecimal eleven = new java.math.BigDecimal (11);
        f2 = f2.multiply (eleven);
        System.out.println ("f1 = " + f1);
        System.out.println ("f2 = " + f2);
        /*Еще одна особенность BigDecimal - объекты чисел нужно сравнивать между
       собой с помощью специального метода compareTo()*/
        if (f1.compareTo (f2) == 0)
            System.out.println ("f1 и f2 равны");
        else
            System.out.println ("f1 и f2 не равны");
    }
}
/*
Мы получили ровно тот результат, на который рассчитывали.
И обрати внимание, насколько точными получились наши числа,
и сколько знаков после запятой в них уместилось!
Гораздо больше, чем во float и даже в double!

Запомни класс BigDecimal на будущее, он тебе обязательно пригодится :)
 */