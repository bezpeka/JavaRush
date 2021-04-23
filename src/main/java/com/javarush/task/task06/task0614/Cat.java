package com.javarush.task.task06.task0614;

import java.util.ArrayList;

/*
Статические коты

1. В классе Cat добавь публичную статическую переменную cats (ArrayList<Cat>).
2. Пусть при каждом создании кота (нового объекта Cat) в переменную cats добавляется этот новый кот. Создать 10 объектов Cat.
3. Метод printCats должен выводить всех котов на экран. Нужно использовать переменную cats.
*/

public class Cat {
    //напишите тут ваш код
    public static ArrayList<Cat> cats = new ArrayList <Cat> ();

    public Cat() {
    }

    public static void main(String[] args) {
        //напишите тут ваш код
        for (int i = 0; i < 10; i++){
            cats.add (new Cat());
        }
        printCats();
    }

    public static void printCats() {
        //напишите тут ваш код
        for (Cat cat : cats){ //WTF - Почитайте о цикле for each.
            System.out.println (cat);
        }
    }
}

