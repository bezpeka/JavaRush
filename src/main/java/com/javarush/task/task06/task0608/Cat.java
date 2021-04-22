package com.javarush.task.task06.task0608;

/*
Статические методы для кошек

Добавить к классу Cat два статических метода: int getCatCount() и setCatCount(int),
с помощью которых можно получить/изменить количество котов (переменную catCount).
*/

public class Cat {
    private static int catCount = 0;

    public Cat () {
        catCount++;
    }

    public static int getCatCount () {              //этот метод возвращает int
        //напишите тут ваш код                      //и возвращает значение переменной catCount
        return catCount;
    }

    public static void setCatCount (int catCount) { //этот метод void - ничего не возвращает
        //напишите тут ваш код                      //этот метод принимает int
        Cat.catCount = catCount;                    //присваивает переменной catCount переданное значение
    }

    public static void main (String[] args) {

    }
}

