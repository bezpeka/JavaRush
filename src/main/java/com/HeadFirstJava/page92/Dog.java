package com.HeadFirstJava.page92;

public class Dog {
    String name;

    public static void main (String[] args) {
        Dog dog1 = new Dog ();
        dog1.bark ();
        dog1.name = "Барт"; //так как имя присваиваем после вызова метода, собака в консоли вывода, имени не имеет
        Dog[] myDogs = new Dog[3]; //Создаем массив типа Dog
        myDogs[0] = new Dog (); // Помещаем в массив новый объект
        myDogs[1] = new Dog (); // Помещаем в массив новый объект
        myDogs[2] = dog1; // Присваиваем символьной ссылке из третьего элеента массива ссылку на объект из символьной ссылки dog1
        myDogs[0].name = "Фред"; //Получаем доступ к объектам Dog с помощью ссылок из массива
        myDogs[1].name = "Джордж"; //Получаем доступ к объектам Dog с помощью ссылок из массива
        System.out.print ("Имя последней собаки - ");
        System.out.println (myDogs[2].name); //Имя будет Барт
        int x = 0;
        while (x < myDogs.length) { //Теперь перебираем все элементы массива
            myDogs[x].bark ();      //и вызываем для каждого метод bark()
            x = x + 1;
        }
    }

    public void bark () {
        System.out.println (name + " сказал Гав!");
    }
}