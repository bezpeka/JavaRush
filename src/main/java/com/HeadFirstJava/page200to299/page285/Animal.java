package com.HeadFirstJava.page200to299.page285;

public abstract class Animal {
    private String name; //Все потомки Animal(), включая дочерние классы будут иметь имя.

    public String getName () {
        return name;
    }

    public Animal (String theName) { //Конструктор, принимающий в параметрах имя,
        name = theName;             // присваивает его переменной экземпляра name
        System.out.println ("Create Animal");
    }
}
