package com.HeadFirstJava.page200to299.page285;

public class Hippo extends Animal {
    public Hippo (String name) {    //Конструктор Hippo принимает имя
        super (name);               //он передает его вверх по стеку в конструктор Animal
        System.out.println ("Create hippo");
    }
}
