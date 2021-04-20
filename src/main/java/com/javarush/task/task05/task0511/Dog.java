package com.javarush.task.task05.task0511;

/*
Создать класс Dog (собака) с тремя инициализаторами:
- Имя
- Имя, рост
- Имя, рост, цвет
 */
public class Dog {
    String name;
    int height;
    String color;

    public void initialize (String name) {
        this.name = name; //Имя
    }

    public void initialize (String name, int height) {
        this.name = name; //Имя, рост
        this.height = height;
    }

    public void initialize (String name, int height, String color) {
        this.name = name; //Имя, рост, цвет
        this.height = height;
        this.color = color;
    }

    public static void main (String[] args) {

    }
}
