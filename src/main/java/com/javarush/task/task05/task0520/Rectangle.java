package com.javarush.task.task05.task0520;
/*
Собираем прямоугольник

Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height
(верхняя координата, левая, ширина и высота).
Создать для него как можно больше конструкторов.

Примеры:
- заданы 4 параметра: left, top, width, height
- ширина/высота не задана (оба равны 0)
- высота не задана (равно ширине) создаём квадрат
- создаём копию другого прямоугольника (он и передаётся в параметрах)
*/

public class Rectangle {
    //напишите тут ваш код
    int top;
    int left;
    int width = 0;
    int height = 0;

    public Rectangle (int top, int left, int width, int height) {
        this.top = top; //заданы 4 параметра: left, top, width, height
        this.left = left;
        this.width = width;
        this.height = height;
    }

    public Rectangle (int top, int left) {
        this.top = top; //ширина/высота не задана (оба равны 0)
        this.left = left;
        this.width = width;
        this.height = height;
    }

    public Rectangle (int top, int left, int width) {
        this.top = top; //высота не задана (равно ширине) создаём квадрат
        this.left = left;
        this.width = width;
        this.height = width;
    }

    public Rectangle () {
        this.top = top; //создаём копию другого прямоугольника (он и передаётся в параметрах)
        this.left = left;
        this.width = 10;
        this.height = 5;
    }

    public static void main (String[] args) {

    }
}