package com.javarush.task.task05.task0503;

/*
Геттеры и сеттеры для класса Dog

Создать class Dog. У собаки должна быть кличка String name и возраст int age.
Создай геттеры и сеттеры для всех переменных класса Dog.
*/
public class Dog {
    //напишите тут ваш код

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public int getAge () {
        return age;
    }

    public void setAge (int age) {
        this.age = age;
    }

    private String name; //get-еры и set-еры создались автоматически
    private int age; // создал две переменных и нажал alt+insert

    public static void main (String[] args) {
    }
}
