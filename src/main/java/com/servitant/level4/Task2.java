package com.servitant.level4;

// TODO: 28.01.21 разобраться с переменными классов, тут вот вообще не понял задание 
/*
Подсчитать суммарную стоимость яблок.
За суммарную стоимость яблок отвечает переменная public static int applesPrice.
 */
public class Task2 {
    public static void main (String[] args) {
        Apple apple = new Apple ();
        apple.addPrice (50);
        Apple apple2 = new Apple ();
        apple2.addPrice (100);
        System.out.println ("Стоимость яблок " + Apple.applesPrice);
    }

    public static class Apple {
        public static int applesPrice = 0;

        public static void addPrice (int applesPrice) {
            //Apple.applesPrice+=applesPrice;
/*
Этот вариант так же работает, как и следующий

В этом месте кода, очевидно, активны две переменные с одинаковым названием
applesPrice - одна статическая, которая принадлежит классу Apple, 
а вторая - локальная, которая объявлена в этом методе. 
Что бы их не путать, к статической переменной добавляют название класса, 
которому она принадлежит. А локальная переменная остаётся как есть. 
В этом конкретном примере к статической переменной добавляют значение локальной.
*/
            Apple.applesPrice = Apple.applesPrice + applesPrice;
/*
В классе Apple есть статическое поле applesPrice.
Доступ к этому полю можно получить через имя объемлющего класса: Apple.applesPrice.
Такой способ доступа необходим, поскольку аргумент метода addPrice()
также имеет имя applesPrice.
Чтобы различить эти две переменные внутри тела метода,
к переменной метода обращение производится непосредственно по имени (applesPrice),
а к полю класса - через имя этого класса (Apple.applesPrice).
 */
        }
    }
}
