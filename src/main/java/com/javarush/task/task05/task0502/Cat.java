package com.javarush.task.task05.task0502;

/*
Реализовать метод fight

Реализуй метод boolean fight(Cat anotherCat):
продумай механизм драки котов в зависимости от их веса, возраста и силы.
Сравни каждый критерий по отдельности, чтобы победителем был тот,
у кого были лучшие показатели по большинству критериев.
Метод должен определять, выиграли ли мы (this) бой или нет,
т.е. возвращать true, если выиграли и false - если проиграли.
Если ничья и никто не выиграл, возвращаем false.
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat () {
    }

    public boolean fight (Cat anotherCat) {
        //напишите тут ваш код
        int a = Integer.compare (this.age, anotherCat.age);
        int b = Integer.compare (this.weight, anotherCat.weight);
        int c = Integer.compare (this.strength, anotherCat.strength);
        int f = a + b + c;
        return f > 0;
    }

    public static void main (String[] args) {

    }
}