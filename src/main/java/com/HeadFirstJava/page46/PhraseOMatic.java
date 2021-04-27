package com.HeadFirstJava.page46;

public class PhraseOMatic {
    public static void main (String[] args) { // Создаем три набора слов (строковые контейнеры, массивы) для выбора, можно добавить свои
        String[] wordListOne = {"24/7", "multi-Tier", "30,000 foot", "B-to-B", "win-win", "front-end", "web-based", "pervasive", "smart", "six-sigma", "critical-path", "dynamic"};
        String[] wordListTwo = {"empowered", "sticky", "value-added", "oriented", "centric", "distributed", "clustered", "branded", "outside-the-box", "positioned", "networked", "focused", "leveraged", "aligned", "targeted", "shared", "cooperative", "accelerated"};
        String[] wordListThree = {"process", "tipping-point", "solution", "architecture", "core competency", "strategy", "mindshare", "portal", "space", "vision", "paradigm", "mission"};
        int oneLength = wordListOne.length; // Вычисляем сколько слов в каждом списке
        int twoLength = wordListTwo.length; // Присваиваем значения переменным
        int threeLength = wordListThree.length;
        int rand1 = ( int ) (Math.random () * oneLength); // Генерируем три случайных числа
        int rand2 = ( int ) (Math.random () * twoLength); // тут используется привидение типов, для получения целого значения из числа с плавающей запятой
        int rand3 = ( int ) (Math.random () * threeLength);
        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3]; //строим фразу
        System.out.println ("What we need is a " + phrase); // Выводим фразу на экран
    }
}
