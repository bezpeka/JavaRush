package com.HeadFirstJava.ThisSuperTest;

public class Test {
    public static void main (String args[]) {
        B b = new B ();
    }
}
/*
    В примере мы сначала передаем вызов из конструктора без аргументов класса B
    в конструктор этого же класса B, принимающий один параметр типа String,
    из которого, в свою очередь, с помощью super("") вызывается конструктор с одним аргументом из суперкласса.*/
