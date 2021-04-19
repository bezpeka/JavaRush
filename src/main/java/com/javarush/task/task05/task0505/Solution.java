package com.javarush.task.task05.task0505;

/*
Создать три кота используя класс Cat.
Провести три боя попарно между котами.
Класс Cat создавать не надо. Для боя использовать метод boolean fight(Cat anotherCat).
Результат каждого боя вывести на экран c новой строки.
 */
public class Solution {
    public static void main (String[] args) {
        //напишите тут ваш код
        Cat cat1 = new Cat ("Vaska", 12, 5, 10);
        Cat cat2 = new Cat ("Petka", 11, 6, 12);
        Cat cat3 = new Cat ("Mishka", 10, 4, 13);

        System.out.println (cat1.fight (cat2));
        System.out.println (cat2.fight (cat3));
        System.out.println (cat3.fight (cat1));
    }

    public static class Cat {

        protected String name;
        protected int age;
        protected int weight;
        protected int strength;

        public Cat (String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight (Cat anotherCat) {
            int ageScore = Integer.compare (this.age, anotherCat.age);
            int weightScore = Integer.compare (this.weight, anotherCat.weight);
            int strengthScore = Integer.compare (this.strength, anotherCat.strength);

            int score = ageScore + weightScore + strengthScore;
            return score > 0; // return score > 0 ? true : false;
        }
    }
}
