package com.javarush.task.task05.task0510;

/*
Кошкоинициация

Создать класс Cat (кот) с пятью инициализаторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет (имя, адрес и возраст неизвестны, это бездомный кот)
- вес, цвет, адрес (чужой домашний кот)

Задача инициализатора - сделать объект валидным.
Например, если вес неизвестен, то нужно указать какой-нибудь средний вес.
Кот не может ничего не весить.
То же касается возраста и цвета.
А вот имени может и не быть (null).
То же касается адреса: null.
*/

public class Cat {
    //напишите тут ваш код
    String name = null;
    int age = 2;
    int weight = 5;
    String address = null;
    String color = "black";

    public void initialize (String name) {
        this.name = name; //Имя
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    public void initialize (String name, int weight, int age) {
        this.name = name; //Имя, вес, возраст
        this.weight = weight;
        this.age = age;
        this.color = color;
    }

    public void initialize (String name, int age) {
        this.name = name; //Имя, возраст (вес стандартный)
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    public void initialize (int weight, String color) {
        this.color = color; //вес, цвет (имя, адрес и возраст неизвестны, это бездомный кот)
        this.weight = weight;
        this.age = age;
    }
    public void initialize ( int weight, String color, String address){
        this.weight = weight; //вес, цвет, адрес (чужой домашний кот)
        this.color = color;
        this.address = address;
        this.age = age;
    }
}
