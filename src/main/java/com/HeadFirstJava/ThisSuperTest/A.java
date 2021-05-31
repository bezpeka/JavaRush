package com.HeadFirstJava.ThisSuperTest;
// https://javarush.ru/groups/posts/1187-raznica-mezhdu-kljuchevihmi-slovami-this-i-super-v-java
public class A {
    A () {
        System.out.println ("Конструктор без аргументов класса A");
    }

    A (String args) {
        System.out.println ("Конструктор с одним аргументом класса A");
    }
}
