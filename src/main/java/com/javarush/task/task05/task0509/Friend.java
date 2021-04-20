package com.javarush.task.task05.task0509;

/*
Создать класс Friend

Создать класс Friend (друг) с тремя инициализаторами (тремя методами initialize):
- Имя
- Имя, возраст
- Имя, возраст, пол

Примечание:
Имя(String), возраст(int), пол(char).
*/

public class Friend {
    //напишите тут ваш код
    private String name = null;
    private int age = 0;
    private char sex = 0;

    public void initialize (String name) {
        this.name = name;
    }

    public void initialize (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void initialize (String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public static void main (String[] args) {

    }
}
